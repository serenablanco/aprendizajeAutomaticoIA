/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import weka.classifiers.Classifier;
import weka.classifiers.trees.J48;
import weka.classifiers.trees.RandomForest;
import weka.classifiers.functions.MultilayerPerceptron;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

/**
 *
 * @author mariano
 */
public class Modelo {

    private Instances leerInstancias(String ficherArff){
        try{
            Instances inst = new Instances(new BufferedReader(new FileReader("./training_data/heart_failure.arff")));
            inst.setClassIndex(inst.numAttributes() - 1);

            return inst;    
        }catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void aprenderModelo()
    {
        try {
            // create Random Forest
            Classifier cls = new RandomForest();

            // train
            Instances inst = leerInstancias("./training_data/heart_failure.arff");
            cls.buildClassifier(inst);

            // serialize model
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./models/objetoRandomForest.model"));
            oos.writeObject(cls);
            oos.flush();
            oos.close();
        } catch (Exception ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String aplicarModelo() {
        try{
            String[] valoresAtributos = {"sano", "insuficiencia cardiaca"};
            Classifier clasificador  = (Classifier) weka.core.SerializationHelper.read("./models/objetoRandomForest.model");
            //Instances data = leerInstancias("./test_data/test.arff");
            Instances data = leerInstancias("./training_data/heart_failure.arff");

            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 10; i++) sb.append(valoresAtributos[(int) clasificador.classifyInstance(data.instance(i))] + "\n");
            //return valoresAtributos[(int) clasificador.classifyInstance(data.instance(1))];
            return sb.toString();
        }catch (Exception ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            return "Error al intentar leer el modelo";
        }
    }
}

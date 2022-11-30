# PRÁCTICA 3: APRENDIZAJE AUTOMÁTICO

### 1. ELEGIR EL DATASET 
Para elegir el dataset que voy a utilizar en esta práctica, he buscado en la página web Kaggle distintos datasets y he encontrado uno para la predicción de insuficiencia cardiaca.

https://www.kaggle.com/datasets/fedesoriano/heart-failure-prediction

Este dataset cuenta con 12 atributos. Me han parecido un buen número de atributos y todos ellos contribuyen a la predicción (son características relevantes), por lo que he decidido no eliminar ningún atributo.

Después, he convertido el archivo original en un archivo .arff para poder examinarlo en WEKA y evaluar los distintos algoritmos de aprendizaje automático para elegir la mejor opción para este caso.

### 2. EVALUAR LOS DISTINTOS ALGORITMOS DE APRENDIZAJE AUTOMÁTICO CON WEKA
Para poder elegir el mejor algoritmo de aprendizaje automático para esta práctica, he cargado mi archivo .arff a WEKA y he observado los diferentes resultados de varios algoritmos:

* **J48**

  ![J48](https://github.com/serenablanco/aprendizajeAutomaticoIA/blob/main/img/j48.png)

* **Random Forest**

  ![Random Forest](https://github.com/serenablanco/aprendizajeAutomaticoIA/blob/main/img/randomForest.png)

* **Naive Bayes**

  ![Naive Bayes](https://github.com/serenablanco/aprendizajeAutomaticoIA/blob/main/img/naivebayes.png)

* **Multilayer Perceptron**

  ![Multilayer Perceptron](https://github.com/serenablanco/aprendizajeAutomaticoIA/blob/main/img/multilayerperceptron.png)

* **Hoeffding Tree**

  ![Hoeffding Tree](https://github.com/serenablanco/aprendizajeAutomaticoIA/blob/main/img/hoeffdingTree.png)

* **Decision Stump**

  ![Decision Stump](https://github.com/serenablanco/aprendizajeAutomaticoIA/blob/main/img/decisionStump.png)


Para elegir el mejor algoritmo me voy a fijar en el área ROC de cada uno. Cuanto mayor sea esta área, mejor será el algoritmo ya que significa que pueden aumentar mucho los verdaderos positivos con muy pocos falsos positivos.

Por ello, el mejor algoritmo en este caso es el **Random Forest**.




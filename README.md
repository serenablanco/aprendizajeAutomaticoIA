# PRÁCTICA 3: APRENDIZAJE AUTOMÁTICO

### 1. ELEGIR EL DATASET 
Para elegir el dataset que voy a utilizar en esta práctica, he buscado en la página web Kaggle distintos datasets y he encontrado uno para la predicción de insuficiencia cardiaca.

https://www.kaggle.com/datasets/fedesoriano/heart-failure-prediction

Este dataset cuenta con 12 atributos. Me han parecido un buen número de atributos y todos ellos contribuyen a la predicción (son características relevantes), por lo que he decidido no eliminar ningún atributo.

  ![Dataset](https://github.com/serenablanco/aprendizajeAutomaticoIA/blob/main/img/atributosDataset.png)
  
El atributo para el que nosotros vamos a implemnetar el algoritmo es el atributo 'heartDisease', el cual indica si la persona tiene una enfermedad de corazón (se indica con un 1) o si su corazón está sano (se indica con un 0).

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

### 3. IMPLEMENTAR EL ALGORITMO ELEGIDO EN JAVA

Tras modificar parte del código para que evalúe el fihcero .arff con el dataset que hemos descargado antes, ejecutamos el código y comprobamos que las consultas que lanzamos tienen buenos reseultados.

* **CONSULTA 1**
Para esta primera consulta he cogido los 10 primeros registros del dataset y he reemplazado el último atributo ('heartDisease') por una interrogación '?' para consultar cuál sería el resultado.

  ![consulta1](https://github.com/serenablanco/aprendizajeAutomaticoIA/blob/main/img/consulta1.png)
  
Comparamos el resultado que nos aporta el algoritmo Random Forest con los datos iniciales verdaderos que tenemos en el fichero .arff:

  ![resultadoConsulta1](https://github.com/serenablanco/aprendizajeAutomaticoIA/blob/main/img/resultadoConsulta1.png) ![datosVerdaderosCons1](https://github.com/serenablanco/aprendizajeAutomaticoIA/blob/main/img/datosVerdaderosConsulta1.png)
  
Vemos que el algoritmo nos devuelve los mismos resultados (nos acordamos que '0' representa a un corazón sano y que '1' representa la insuficiencia cardiaca).

* **CONSULTA 2**
Para esta segunda consulta he cogido otros 10 registros del dataset, reemplazando de nuevo el último atributo por una interrogación, para comprobar que el algoritmo funciona para distintas consultas y que el resultado cambia. La consulta es la siguiente:

  ![consulta2](https://github.com/serenablanco/aprendizajeAutomaticoIA/blob/main/img/consulta2.png)
  
Comparamos el resultado de esta consulta con los datos verdaderos en nuestro fichero .arff:

  ![resultadoconsulta2](https://github.com/serenablanco/aprendizajeAutomaticoIA/blob/main/img/resultadoConsulta2.png)  ![datosVerdaderosconsulta2](https://github.com/serenablanco/aprendizajeAutomaticoIA/blob/main/img/datosVerdaderosConsulta2.png)
  
Vemos que, de nuevo, el algoritmo nos devuelve los datos correctos y que no se vuelve a repetir el resultado de la primera consulta.








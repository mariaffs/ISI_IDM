**1. Identificar el Software Under Test**

Programa de java esBisiestos con la siguiente especificación

    //  @param  Año que queremos comprobar
    //  @return True si año es bisiesto, false en caso contrario
    //  @throws InvalidParameter si año no es un parámetro válido

**2. Identificar los parámetros del SUT**

El único parámetro con el que tenemos que trabajar es con Año, que es un número entero. Si es mayor a 0, entonces es un año válido. Su dominio por tanto es todos los valores posibles de un integer

**3. Utilizando la técnica de la modelización de las entradas, crear caracterizaciones basadas en la funcionalidad, y sus particiones en bloques.**

* C1 -> ¿Es un año bisiesto?
  * c1.b1 -> True
  * c1.b2 -> False

(Incluiremos también un test basado en la interfaz para probar si el parámetro que te introducen es válido o no)

**4. Elegir valores adecuados de cada bloque que satisfagan alguno de los criterios de cobertura “razonables” vistos en clase, prestando atención a los casos frontera que pueda haber en cada caso a la hora de elegir valores concretos para los tests.**

* c1.b1 -> año = 4 / 400
* c1.b2 -> año = 100

(Para probar mejor la aplicación lo haremos con varios valores límites problemáticos)

**5. 6. 7. Realizadas con BisiestosTests.java**

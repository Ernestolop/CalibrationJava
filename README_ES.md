## Para la solución del problema he seguido los siguientes pasos:

1. En el metodo main solo se mide el tiempo de ejecución, se lee el archivo calibration_doc.txt, el resultado se guarda en un string de arrays y se ejecuta el metodo de calibración. En el main se usa el bloque try-catch para manejar todas las posibles excepciones que puedan ocurrir en el programa, siendo la principal el manejo de archivos.

2. En el metodo de calibración se recorre el string de arrays y por cada string se llama al metodo parseNumber, este retorna el valor del string segun lo solicitado, y el metodo de calibracion los va sumando para retornar al metodo main.

3. En el metodo parseNumber, con ayuda de expresiones regulares, cuyo patron es una constante definida en la clase, se analiza cada el string recibido como parametro para obtener el valor numerico segun lo solicitado y retorna dicho valor. Si no se encuentra el valor solicitado, se retorna 0. 

OBS: el atributo final NUMBER_PATTERN tiene en cuenta las palabras de los digitos en ingles del 0 al 9, es decir no tendra en cuenta palabras que representen numeros de más de un digito.  

- Link del repositorio:


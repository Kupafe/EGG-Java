/*
String
 */
package Principal;

public class String {
    
    /*
    CLASE STRING
    
    Método                                      Descripción.
    
    charAt(int index)                           Retorna el carácter especificado en la
                                                posición index
    
    equals(String str)                          Sirve para comparar si dos cadenas son
                                                iguales. Devuelve true si son iguales y false
                                                si no.
    
    equalsIgnoreCase(String str)                Sirve para comparar si dos cadenas son
                                                iguales, ignorando la grafía de la palabra.
                                                Devuelve true si son iguales y false si no.
    
    compareTo(String otraCadena)                Compara dos cadenas de caracteres
                                                alfabéticamente. Retorna 0 si son iguales,
                                                entero negativo si la primera es menor
                                                o entero positivo si la primera es mayor.
    
    concat(String str)                          Concatena la cadena del parámetro al final
                                                de la primera cadena.

    contains(CharSequence s)                    Retorna true si la cadena contiene la
                                                secuencia tipo char del parámetro.

    endsWith(String suffix)                     Retorna verdadero si la cadena es igual al
                                                objeto del parámetro.
    
    indexOf(String str)                         Retorna el índice de la primera ocurrencia de
                                                la cadena del parámetro

    isEmpty()                                   Retorna verdadero si la longitud de la
                                                cadena es 0
    
    length()                                    Retorna la longitud de la cadena

    replace(char oldChar, char newChar)         Retorna una nueva cadena reemplazando
                                                los caracteres del primer parámetro con el
                                                carácter del segundo parámetro
    
    split(String regex)                         Retorna un arreglo de cadenas separadas
                                                por la cadena del parámetro

    startsWith(String prefix)                   Retorna verdadero si el comienzo de la
                                                cadena es igual al prefijo del parámetro.

    substring(int beginIndex)                   Retorna la sub cadena desde el carácter del
                                                parámetro

    substring(int beginIndex, int endIndex)     Retorna la sub cadena desde el carácter del
                                                primer parámetro hasta el carácter del
                                                segundo parámetro
    
    toCharArray()                               Retorna el conjunto de caracteres de la
                                                cadena

    toLowerCase()                               Retorna la cadena en minúsculas

    toUpperCase()                               Retorna la cadena en mayúsculas

    Java al ser un lenguaje de tipado estático, requiere que para pasar una variable de un tipo de dato
    a otro necesitemos usar un conversor. Por lo que, para convertir cualquier tipo de dato a un String,
    utilicemos la función valueOf(n).

    Ejemplo:

        int numEntero = 4;
        String numCadena = String.valueOf(numEntero);

    Si quisiéramos hacerlo al revés, de String a int se usa el método de la clase Integer, parseInt().

    Ejemplo:

        String numCadena = "1";
        int numEntero = Integer.parseInt(numCadena);
    */
}

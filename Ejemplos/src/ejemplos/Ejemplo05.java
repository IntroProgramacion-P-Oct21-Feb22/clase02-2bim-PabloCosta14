/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java

        // arreglo de tipo entero
        String[] marcas = new String[5];
        // Se asigna valores al arreglo
        marcas[0] = "Dell";
        marcas[1] = "Toshiba";
        marcas[2] = "HP";
        marcas[3] = "Asus";
        marcas[4] = "thinkcentre";
        // Se hace uso del ciclo repetitivo for para recorrer el arreglo
        for (int i = 0; i < marcas.length; i++) {
            System.out.printf("Subíndice o Índice %d, con valor %s\n",
                    i, marcas[i]);
        }
        
    }

}

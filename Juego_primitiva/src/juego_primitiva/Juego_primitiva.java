/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_primitiva;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Juego_primitiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int numero = 0;
        boolean comprobador_num = false;
        int tries = 0;
        int contador = 0;
        int[] secuencia_num = new int[9];
        String[] cruces = {"X", "X", "X", "X", "X", "X", "X", "X", "X"};

        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < secuencia_num.length; i++) {

            //Se genera una secuencia de números menores que 100 y mayores que 10            
            int aleatorio = (int) (Math.random() * 90 + 10);
            //Los números aleatorios se introducen en el array hasta que este esté completo           
            secuencia_num[i] = aleatorio;
        }

        //Mediante la utilización de bucles anidados conseguimos que ninún número
        //se repita
        for (int i = 0; i < secuencia_num.length; i++) {
            for (int j = 0; j < secuencia_num.length;) {
                if (secuencia_num[i] == secuencia_num[j] && i != j) {
                    secuencia_num[j] = (int) (Math.random() * 90 + 10);
                } else {
                    j++;
                }
            }
        }

        //Muestro la secuencia de números aleatoria que se ha generado y almacenado
        //en el array, esto solo para que yo como programador pueda poner a prueba
        //el programa más comodamente
        //Con este do while consigo que me pida números tantas veces como posiciones 
        //tiene el array
        do {
            //Ahora solicito al usuario que introduzca un número 
            System.out.println(" ");
            System.out.println("Introduce un número mayor que 10 y menor que 100");
            numero = reader.nextInt();

            contador++;

            for (int j = 0; j < secuencia_num.length; j++) {

                if (secuencia_num[j] == numero) {
                    comprobador_num = true;

                    //Con esto lo que hago es convertir ese número a String para
                    //poder añadirlo al array de cruces que es de tipo String
                    cruces[j] = String.valueOf(numero);

                }

            }

            if (comprobador_num == true) {

                System.out.println("El número " + numero + " es correcto");

            } else {

                System.out.println("El número " + numero + " no es correcto");
                for (int j = 0; j < secuencia_num.length; j++) {

                    System.out.print(cruces[j] + " ");
                }
            }
        } while (contador < secuencia_num.length);

    }

}

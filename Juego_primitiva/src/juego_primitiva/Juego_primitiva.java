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

        System.out.println();
//Con este do while consigo que el 
        do {
//Ahora solicito al usuario que introduzca un número utilizando un panel de lectura
//emergente
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número menor"
                    + " que 100 y mayor que 10"));
            contador++;

            for (int j = 0; j < secuencia_num.length; j++) {

                if (secuencia_num[j] == numero) {
                    comprobador_num = true;
                    cruces[j] = String.valueOf(secuencia_num[j]);

                }

            }

            if (comprobador_num == true) {
                System.out.println("El número " + numero + " es correcto");
                
                

            } else {

                System.out.println("El número " + numero + " no es correcto");

            }
        } while (contador < secuencia_num.length);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_primitiva;

import java.util.Scanner;

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

        //Aquí estoy defiiendo las variables
      
        boolean repeated_number = false;
        int numero = 0;
        boolean comprobador_num = false;
        int tries = 15;
        int contador = 0;
        int random_num = 0;
        //Aquí estoy definiendo los arrays
        int[] secuencia_num = new int[9];
        String[] cruces = {"X", "X", "X", "X", "X", "X", "X", "X", "X"};

        Scanner reader = new Scanner(System.in);

        //Recorremos el array
        for (int i = 0; i < secuencia_num.length; i++) {

            //mientras el número esté repetido este proceso vuelve a empezar
            do {
                repeated_number = false;
                //Se genera un número menor que 100 y mayores que 10            
                random_num = (int) (Math.random() * 90 + 10);

                //Una vez generado ese número aleatorio lo que hacemos aún sin incluirlo en el
                //array es recorrer el array entero para comprobar si ese número
                //está repetido
                for (int j = 0; j < secuencia_num.length; j++) {

                    if (random_num == secuencia_num[j]) {

                        repeated_number = true;

                    }

                }

            } while (repeated_number);

            secuencia_num[i] = random_num;

        }
        for (int i = 0; i < secuencia_num.length; i++) {

            System.out.println(secuencia_num[i]);
        }
        do {
            
            comprobador_num = false;

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

            }

            for (int j = 0; j < secuencia_num.length; j++) {

                System.out.print(cruces[j] + " ");
            }
            
            

        } while (contador < secuencia_num.length && tries>0);
        
        

    }
}

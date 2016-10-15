/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema13;
import java.util.*;
/**
 *
 * @author PC
 */
public class PP2Problema13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int[]numero = new int[30];
        double promedio;
        //Metodos
        promedio=promedio(llenarVector(numero));
        sobrePromedio(promedio,numero);
        bajoPromedio(promedio,numero);
    }
    public static int [] llenarVector(int []n){//Metodo de llenar el vector, recibe un arreglo de enteros, regresa un arreglo de enteros
        Scanner entradaEscaner = new Scanner(System.in);       
        for (int i = 0; i<n.length; i++){//Mientras que el valor de i sea menor que el tamaño del arreglo(30), i se aumentara en 1
            System.out.print("Introduce un número para la posición [" + i + "]"); //i indica la posición
            n[i]=entradaEscaner.nextInt();//En la pocision i se asigna el valor
                                          //Y regresa hasta que la posicion i se vuelva 30
                                          //En ese momento regresa el arreglo
        }
        return n;
       }
    public static double promedio(int []n){ //El arreglo entra en el metodo
        //Declaración de variables
        double promedio;
        int numerospromedio;
        numerospromedio=0;
            for(int i=0; i<n.length; i++){ //Mientras que i sea menor que el tamaño del arreglo(30), i aumentara 1  
                numerospromedio=numerospromedio+n[i];//Se guardara en numerospromedio = 0+(n[i]) i siendo la posicion
                                        //i regresa al for y como es menor se le suma 1 y baja de nuevo
                                        //, el valor de la posicion se suma a promedio
            }
        promedio=numerospromedio/n.length; //Se divide los numerospromedio (numeros sumados del arreglo) entre el tamaño del arreglo(30)
                                           //Se guarda en la variable promedio
        System.out.print("El promedio es: " + promedio); //Se imprime el promedio
        return promedio;
        }
    public static void sobrePromedio(double promedio, int[]n){
       //Declaración de variables
        int numerossobrepromedio;
        numerossobrepromedio=0;
        for(int i=0;i<n.length;i++){ //Mientras que i sea menor que el tamaño del arreglo(30), i aumentara 1
            if(n[i]>promedio){       //Si el valor de la posicion del arreglo es mayor al promedio
                numerossobrepromedio++;//La variable numerossobrepromedio aumentara 1
                                       //El contador continua hasta que alcanza 30
            }
        }
        //Se imprime la cantidad de veces que se aumento numerossobrepromedio
        System.out.print("\n" + "La cantidad de elementos que estan por encima del promedio son: " + numerossobrepromedio);
    }
    public static void bajoPromedio(double promedio, int[]n){
        //Declaración de variables
        int numerosbajopromedio;
        numerosbajopromedio=0;
        for(int i=0;i<n.length;i++){ //Mientras que i sea menor que el tamaño del arreglo(30), i aumentara 1
            if(n[i]<promedio){       //Si el valor de la posicion del arreglo es menor al promedio
                numerosbajopromedio++;//La variable numerosbajopromedio aumentara 1
                                      //El contador continua hasta que alcanza 30
            }
        }
        //Se imprime la cantidad de veces que se aumento numerosbajopromedio
        System.out.print("\n" + "La cantidad de elementos que estan por debajo del promedio son: " + numerosbajopromedio);
    }
}

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
        int[]numero = new int[30];
        double promedio;
        promedio=mostrarVector(llenarVector(numero));
        sobrePromedio(promedio,numero);
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
    public static double mostrarVector(int []n){ //El arreglo entra en el metodo
        double promedio;
        int numerospromedio;
        int numerosquehay;
        numerospromedio=0;
        numerosquehay=0;
            for(int i=0; i<n.length; i++){ //Mientras que
                numerospromedio=numerospromedio+n[i];
                numerosquehay++;
            }
        promedio=numerospromedio/numerosquehay;
        System.out.print("El promedio es: " + promedio + "\n");
        return promedio;
        }
    public static void sobrePromedio(double promedio, int[]n){
        int numerossobrepromedio;
        numerossobrepromedio=0;
        for(int i=0;i<n.length;i++){
            if(n[i]>promedio){
                numerossobrepromedio++;
            }
        }
        System.out.print("La cantidad de elementos que estan por encima del promedio son: " + numerossobrepromedio);
    }
    public static void bajoPromedio(double promedio, int[]n){
        int numerosbajopromedio;
        numerosbajopromedio=0;
        for(int i=0;i<n.length;i++){
            if(n[i]<promedio){
                numerosbajopromedio++;
            }
        }
        System.out.print("La cantidad de elementos que estan por encima del promedio son: " + numerosbajopromedio);
    }
}

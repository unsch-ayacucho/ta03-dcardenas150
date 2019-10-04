
package Ejercicios;

import java.util.Random;

public class Ejercicio01 {

    public static void main(String[] args) {
        
        //importamos una clase random
        Random aleatorio = new Random(System.currentTimeMillis());
        
        //creamos la matriz
        int matriz[][];
        
        matriz = new int[6][10];
        
        //contadores del for
        int i,j;
        
        //llenamos la matriz
        for(i=0; i<matriz.length; i++){ //se encargara de las filas
            
            for(j=0; j<matriz[i].length; j++){ //se encargara de las columnas
                
                matriz[i][j]= aleatorio.nextInt(1000); //ponemos numeros de manera aleatoria
                
            }
            
        }
        
        //imprimimos la matriz
       for(i=0; i<matriz.length; i++) {
           
            for( j=0; j<matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            
            System.out.println();
        }     
       
       
       //verificacion del mayor de todos los numeros en la matriz
       int max = matriz[0][0];
       
       for(i=1; i<matriz.length; i++){
           
           for(j=1; j<matriz[i].length; j++){
               
               if(max < matriz[i][j]){
                   
                   max = matriz[i][j];
               }

           }
           
       }
       
       
       //verificacion del menor de todos los numeros en la matriz
        int min = matriz[0][0];
        
        for(i=1; i<matriz.length; i++){
           
           for(j=1; j<matriz[i].length; j++){
               
               if(min > matriz[i][j]){
                   
                   min = matriz[i][j];
               }

           }
           
       }
        
        //imprimimos los resultados por pantalla
        System.out.println("\nEL mayor es: " + max + "\nEl menor es: " + min);

    }
    
}

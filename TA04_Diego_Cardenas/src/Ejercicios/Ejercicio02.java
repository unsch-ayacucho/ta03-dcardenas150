
package Ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        
        //pedimos al usuario q ingrese numeros
        Scanner leer = new Scanner(System.in);
        
        //creamos una matriz de 4x5
        int matriz[][];
        
        matriz = new int[4][5];
        
        //aqui alamcenaremos la suma de filas y columnas
        int sufila;
        int sucolum;
        
        //servira para la suma total de filas y columnas
        int sufilat = 0;
        int sucolumt = 0;
        
        //llenamos la matriz
        for(int i=0; i < 4; i++){
            for(int j=0; j<5; j++){
                System.out.print("Ingrese numero en la posicion ["+i+"]"+" ["+j+"] :" );
                matriz[i][j] = leer.nextInt();
            }
        }
        
        // imprimimos la matriz
        for(int i = 0; i < 4; i++){
            for(int j = 0; j<5; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        } 
        
        //suma de las filas
        for(int i=0; i<4; i++){
            sufila = 0;
            for(int j=0; j<5; j++){
                sufila += matriz[i][j]; 
            }
            sufilat += sufila;
            System.out.print("\nla suma de la fila " + i + " es: " + sufila + "\n");
 
        }
        
        System.out.print("\nla suma total es: " + sufilat+"\n");
        
        
        // suma de columnas
        for(int j=0; j<5; j++){
            sucolum = 0;
            for(int i=0; i<4; i++){
                sucolum += matriz[i][j]; 
            }
            sucolumt += sucolum;
            System.out.print("\nla suma de la columna" + j + " es: " + sucolum + "\n");

        }
        System.out.print("\nla suma total es: " + sucolumt + "\n");
        
        
        
    
    }
}

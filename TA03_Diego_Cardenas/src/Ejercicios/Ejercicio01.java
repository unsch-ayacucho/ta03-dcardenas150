
package Ejercicios;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class Ejercicio01 {

    public static void main(String[] args) {
        
        //importamos la clase random
        Random aleatorio = new Random(System.currentTimeMillis());
        
        //creamos una lista
        String numeros[];
        
        //Ponemos un rango de valores a la lista
        numeros = new String[100];
        
        //contador del for
        int i;
        
        //agregamos valores a las posiciones
        for(i=0; i<numeros.length; i++){
            
            numeros[i] =Integer.toString(aleatorio.nextInt(20));
        }
        
        //mostramos la lista
        JOptionPane.showMessageDialog(null, Arrays.toString(numeros));// utilizamos Arrays.toString(numeros) para que nos salga en pantalla el arreglo
        
        //ponemos a buscar un numero que esta dentro de la lista
        String num1 = JOptionPane.showInputDialog("Ingrese un numero que esta en la lista: ");
        
        //ponemos el reemplazo del numero buscado por uno nuevo
        String num2 = JOptionPane.showInputDialog("Ingrese con que numero vas a reemplazar: ");
        
        //comparacion de cada elemento y reemplaza el elemnto encontrado con el que pusimos por teclado
        for(i=0; i<numeros.length; i++){
            
            if(numeros[i].equals(num1)){
                
                numeros[i] = "'" + num2 + "'" ; 
            }         
        }
        //imprime la lista
        JOptionPane.showMessageDialog(null, Arrays.toString(numeros));
    }
    
}

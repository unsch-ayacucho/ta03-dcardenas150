
package Ejercicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Ejercicio02 {

    public static void main(String[] args) {
        
        //creamos dos listas
        
        ArrayList<Integer> numeros;
        
        numeros = new ArrayList();
        
        
        ArrayList<Integer> numerosf;
        
        numerosf = new ArrayList();
        
        //variable que nos ayudara a llenar los valores a la otra lista
        int a=0;
         
        //contador de los divisores
        int c;
        
        //contadores del for
        int i,j;
        
        //llenamos el array
        for(i=0; i<4; i++){
            
           numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero en la posicion " + i + " : ")));
           
        }
        //muestra en pantalla
        JOptionPane.showMessageDialog(null, numeros);
        
        //verificacion de quienes son primos y quienes no
        for(i = 0; i<4; i++){
            
            c = 0;
            
            for(j=1; j <= numeros.get(i); j++){
                
                if(numeros.get(i) % j == 0){
                    
                    c++;
                    
                }
                
            }
            // segun si fueron primos o no se coloca en la posicion respectiva
            if(c <= 2){
                
                numerosf.add(a, numeros.get(i)); //aqui se coloca en los primeros lugares lo primos
                
                a++;
  
            }else{
                numerosf.add(numeros.get(i));// aqui se coloca en los ultimos lugares los no primos
            }
                    
            
        }
        //muestra en pantalla
        JOptionPane.showMessageDialog(null, numerosf);

    }
    
}

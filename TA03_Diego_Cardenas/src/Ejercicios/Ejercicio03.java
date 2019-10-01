
package Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class Ejercicio03 {

    public static void main(String[] args) {
        //importamos la clase random
        Random aleatorio = new Random(System.currentTimeMillis());
        
        //creamos un array
        ArrayList<String> numeros;
        
        numeros = new ArrayList();
        
        //contador del for
        int i;
        
        //se llena el array con numeros aleatorios
        for(i=0; i<100; i++){
            
            numeros.add(Integer.toString(aleatorio.nextInt(500)));
            
        }
        //se muestra en pantall
        JOptionPane.showMessageDialog(null, numeros);
        
        
        //ponemos para que ingrese que quiere buscar, el menor o mayor
        String rpt = JOptionPane.showInputDialog("Desea buscar el minimo o el maximo numero");
        
        //segun la respuesta buscamos el menor  o el mayor
        if(rpt.equals("max")){
            
            //aqui es para el mayor
            int ma = Integer.parseInt(numeros.get(0));
            
            for(i=1; i<numeros.size(); i++){
              
                if(ma < Integer.parseInt(numeros.get(i))){
                
                    ma = Integer.parseInt(numeros.get(i));
                }
            }
            // para reemplazar el valor y agragarle asteriscos
            for(i=0; i<100; i++){
            
                if(numeros.get(i).equals(Integer.toString(ma))){
                        
                    numeros.set(i, "*" + Integer.toString(ma) + "*");
                        
                }
                    
            }
            //mostramos en pantalla
            JOptionPane.showMessageDialog(null,numeros);
            
            
            }else{
             //aqui es para el menor
            int mi = Integer.parseInt(numeros.get(0));
            
            for(i=1; i<numeros.size(); i++){
              
                if(mi > Integer.parseInt(numeros.get(i))){
                
                    mi = Integer.parseInt(numeros.get(i));
                }
            }
            // para reemplazar el valor y agragarle asteriscos
             for(i=0; i<100; i++){
            
                if(numeros.get(i).equals(Integer.toString(mi))){
                        
                    numeros.set(i, "*" + Integer.toString(mi) + "*");
                }
             }
             //mostramos en pantalla
             JOptionPane.showMessageDialog(null,numeros);
        }

    }
    
}

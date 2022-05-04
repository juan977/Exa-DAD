package ProduyConsu;

import java.util.Random;

public class Productor implements Runnable{
    Cola colaCompartida;
    public Productor(Cola cola){
            this.colaCompartida=cola;
    }
    
    Random a = new Random();
    
    public void run() {
       while (true){
               int num= a.nextInt(10);
               while (colaCompartida.encolar(num)==false){
            	   try {
            		   Thread.sleep(a.nextInt(3000));
            	   } catch ( Exception e){
            		   System.out.println("falló");
            	   }
               } /*Fin del while*/

               System.out.println("Productor encoló el numero:"+num);
       } /*Fin del while externo*/
    } /*Fin de run()*/
} /*Fin de la clase*/
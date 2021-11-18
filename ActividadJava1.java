package actividadjava1;

import java.util.Scanner;

public class ActividadJava1 {

    
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        String nombre;
        nombre=null;
                
       System.out.println("introduce tu nombre:");
        
        nombre=teclado.next();
        
       System.out.println("su nombre es:" +nombre);
       
       String apellido;
       apellido=null;
       
       System.out.println("introduce tu apellido:");
       
       apellido=teclado.next();
       
       System.out.println("su apellido es:" +apellido);
        
        int a;
        a=0;
        
        System.out.println("introduce tu edad:");
        
        a=teclado.nextInt();
        
        System.out.println("su edad es:" +a);
        
        String hobbie;
        hobbie=null;
        
        System.out.println("introduce tu hobbie:");
        
        hobbie=teclado.next();
        
        System.out.println("su hobbie es:" +hobbie);
        
        String editor;
        editor=null;
        
        System.out.println("introduce tu editor de codigo:");
        
        editor=teclado.next();
        
        System.out.println("su editor de codigo preferido es:" +editor);
        
        String sistema;
        sistema=null;
        
        System.out.println("introduce tu sistema operativo:");
        
        sistema=teclado.next();
        
        System.out.println("su sistema operativo es:" +sistema);
      
        }
    
}
   

package cr.go.ucr;

import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Multiplicacion;
import cr.go.ucr.operaciones.Resta;
import cr.go.ucr.operaciones.Sumar;

public class Main {

	public static void main(String[] args) {
	   OperacionAritmetica context;
       context = new OperacionAritmetica( new Sumar() );
       int suma = context.procesar(5,10);
       context = new OperacionAritmetica( new Resta() );
       int resta = context.procesar(20,21);
       context = new OperacionAritmetica( new Multiplicacion() );
       int multip = context.procesar(5,4);
	   context = new OperacionAritmetica( new Division() );
       int divis = context.procesar(5,0);
       
       
       System.out.println("Suma: " + suma );
       System.out.println("Resta: " + resta );
       System.out.println("Multiplicación: " + multip );
	   System.out.println("División: " + divis );
   
     System.out.println("Fin del proceso " );  


      System.out.println("\nPrueba de los datos resta");
       context = new OperacionAritmetica( new Resta() );
       int resta1 = context.procesar(4,20);
       context = new OperacionAritmetica( new Resta() );
       int resta2 = context.procesar(-5,10);
       context = new OperacionAritmetica( new Resta() );
       int resta3 = context.procesar(10,10);
       context = new OperacionAritmetica( new Resta() );
       int resta4 = context.procesar(10,4);
       System.out.println("Resta1: " + resta1 );
       System.out.println("Resta2: " + resta2 );
       System.out.println("Resta3: " + resta3 );
       System.out.println("Resta4: " + resta4 );
       
       
       System.out.println("\nPrueba de los datos division");
       context = new OperacionAritmetica( new Division() );
       int divis1 = context.procesar(-10,-2);
       context = new OperacionAritmetica( new Division() );
       int divis2 = context.procesar(8,0);
       context = new OperacionAritmetica( new Division() );
       int divis3 = context.procesar(7,1);
       context = new OperacionAritmetica( new Division() );
       int divis4 = context.procesar(10,4);
       context = new OperacionAritmetica( new Division() );
       int divis5 = context.procesar(1000000,2);
       context = new OperacionAritmetica( new Division() );
       int divis6 = context.procesar(0,0);
       System.out.println("División1: " + divis1 );
       System.out.println("División2: " + divis2 );
       System.out.println("División3: " + divis3 );
       System.out.println("División4: " + divis4 );
       System.out.println("División5: " + divis5 );
       System.out.println("División6: " + divis6 );
	}

}

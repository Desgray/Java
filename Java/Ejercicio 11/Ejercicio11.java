import java.util.Scanner;
public class Ejercicio11 {
		public static void main(String[] args) {
 			Scanner valor = new Scanner(System.in);
       		int opcion,num1,num2;
       		char caracter;
       		boolean bandera;
       		bandera=false;

        	System.out.println("Ingrese numero 1: ");
        	num1=valor.nextInt();
        	System.out.println("Ingrese numero 2: ");
        	num2=valor.nextInt();

        	while(!bandera){       
        		System.out.println("MENU");
        		System.out.println(" 1.Sumar");
        		System.out.println(" 2.Restar");
        		System.out.println(" 3.Multiplicar");
		        System.out.println(" 4.Dividir");
		        System.out.println(" 5.Salir");        
	       		System.out.println("Ingrese opcion");
    		   	opcion=valor.nextInt();       
        		switch(opcion){
           			case 1:  
                    		int sum=num1+num2;
                    		System.out.println("suma: "+sum);
                    		break;
           			case 2:
                    		int resta=num1-num2;
                    		System.out.println("resta: "+resta);
                    		break;
           			case 3:
                    		int mult=num1*num2;
                    		System.out.println("multiplicacion: "+mult);
                    		break;
           			case 4: 
                    		double div= (double) num1/num2;
                    		System.out.println("division: "+div);
                    		break;
           			case 5:
                    		System.out.println("Seguro quieres salir s para si n para no");
                    		caracter=valor.next().charAt(0);                    
                    		if(Character.compare(caracter,'s') == 0 ){
                        		bandera=true;
                    		}else{ 
			                    bandera=false;
                  			  }
                   			 break;
           			default:
                   			System.out.println("Opcion no valida");
                   			bandera=true;
        }

            
        
  }
		}
}
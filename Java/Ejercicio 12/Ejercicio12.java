import java.util.Scanner;
public class Ejercicio12{
		public static void main(String[] args) {
			Scanner valor = new Scanner(System.in);
        	String cadena;
            int longitud;
         	int contCorrecta=0;
      		int contIncorrecto=0;
         	String fin="&&&&&"; 
           	do {
       			System.out.println("ingrese cadena");
         		cadena=valor.next();
        	  	longitud=cadena.length();   
                if(cadena.equals(fin)){        
                    break;
                }else{
                    if(longitud>5 || longitud<2 ){            
                        contIncorrecto =contIncorrecto+1;        
                    }else if(cadena.charAt(0)=='X' && cadena.charAt(longitud-1)=='O'){
                        contCorrecta=contCorrecta+1;                 
                        }else{
                                contIncorrecto =contIncorrecto+1;                        
                              }
                    }
                }while(cadena!=fin);       
                System.out.println("Cadenas incorrectas fueron: "+contIncorrecto);
                System.out.println("Cadenas correctas: "+contCorrecta); 
		}
}
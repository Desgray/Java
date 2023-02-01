import java.util.Scanner;
public class Ejercicio9 {
		public static void main(String[] args) {
			Scanner valor = new Scanner(System.in);
        	System.out.println("Ingrese una frase");
        	String palabra=valor.nextLine();
        	char aux=palabra.charAt(0);        
        	if(aux=='A'){
            	System.out.println("Correcto");
        	}else{
            	System.out.println("Incorrecto");
       		}
		}
}
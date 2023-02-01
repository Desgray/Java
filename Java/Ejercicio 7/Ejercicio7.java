import java.util.Scanner;
public class Ejercicio7{
		public static void main(String[] args) {
			Scanner valor = new Scanner(System.in);
        	System.out.println("Ingrese una frase");
        	String palabra=valor.nextLine();
        	boolean bandera=palabra.equals("eureka");
        	if(bandera==true){
            	System.out.println("Frase correcta");
        	}else{
            	System.out.println("Frase incorrecta");
        	}
		}
}
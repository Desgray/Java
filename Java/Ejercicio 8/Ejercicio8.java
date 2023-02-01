import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.length;
public class Ejercicio8 {
		public static void main(String[] args) {
			Scanner valor = new Scanner(System.in);
        	System.out.println("Ingrese una frase");
        	String palabra=valor.nextLine();
        	int longitud=(int) length(palabra);
        	if(longitud==8){
            	System.out.println("Frase correcta");
        	}else{
            	System.out.println("Frase incorrecta");
        	}
		}
}
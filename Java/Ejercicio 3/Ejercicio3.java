import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
public class Ejercicio3 {		
		public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);
        String frase;
        System.out.println("ingrese una frase: ");
        frase=valor.nextLine();
        System.out.println("La frase en minuscula "+toLowerCase(frase));
        System.out.println("La frase en mayuscula: "+toUpperCase(frase));

		}
}
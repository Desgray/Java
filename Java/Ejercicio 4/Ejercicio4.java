import java.util.Scanner;
public class Ejercicio4 {
		
		public static void main(String[] args) {
		Scanner valor=new Scanner(System.in);
       	System.out.println("Ingrese los grados centrigrados");
       	float centigrados=valor.nextInt();
       	float faren=32+(9*centigrados/5);
       	System.out.println("Los grados farenhei son: "+faren);

		}
}
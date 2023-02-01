import java.util.Scanner;
public class Ejercicio6 {
		public static void main(String[] args) {
			Scanner valor = new Scanner(System.in);
       		System.out.println("Ingrese un numero ");
       		int num=valor.nextInt();
       		if(num%2==0){
           		System.out.println("numero par");
       		}else{
           		System.out.println("numero impar");
       		}
		}
}
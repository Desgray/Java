import java.util.Scanner;

public class Ejercicio1 {
		public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("Ingrese dos numeros");
        num1=valor.nextInt();
        num2=valor.nextInt();
        sum=num1+num2;
        System.out.println("La suma de los numeros es "+ sum);

		}
}
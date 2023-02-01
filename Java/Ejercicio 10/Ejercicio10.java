import java.util.Scanner;
public class Ejercicio10 {
		public static void main(String[] args) {
 			Scanner valor = new Scanner(System.in);
       		int limit,sum,num2;
      		sum=0;
       		num2=0;
       		System.out.println("Ingrese valor limite ");
       		limit=valor.nextInt();
       		System.out.println("ingrese valor");
       		num2=valor.nextInt();
       		sum=sum+num2;       
       		while(sum<limit){
           		System.out.println("Ingrese valor");
           		num2=valor.nextInt();
           		sum=sum+num2;
       		}

		}
}
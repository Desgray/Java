import java.util.Scanner;
public class Ejercicio5 {
		public static void main(String[] args) {
 		System.out.println("Ingrese un numero");
        Scanner valor =new Scanner(System.in);
       	int num=valor.nextInt();
        int triple =3*num;
        int doble=2*num;
        double raiz=Math.sqrt(num);
        System.out.println("El doble es: "+doble+" el triple es: "+triple+" la raiz es: "+raiz);
		}
}
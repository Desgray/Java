import java.util.Scanner;
public class Ejercicio13 {
		public static void main(String[] args) {
 			Scanner valor = new Scanner(System.in);
     		int fila=0;
      		System.out.println("Dimension ");
      		fila=valor.nextInt();  
      		for(int i=1;i<=fila;i++){     
          		for(int j=1;j<=fila;j++){
              		if(j==1 || j== fila || i==1 || i == fila){
                 		 System.out.print("*");
             		}else{
                  		System.out.print(" ");}
          		}
          		System.out.println();
      		}

		}
}
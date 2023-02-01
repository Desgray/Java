import java.util.Scanner;
public class Ejercicio18 {
		public static void main(String[] args) {
 			int[][] Matrix = new int[4][4];
            int cantidad=Matrix.length;
            cargar(Matrix,cantidad);
            mostrar(Matrix,cantidad);
		}

public static void cargar(int[][] matrix,int aux ){
      Scanner valor = new Scanner(System.in);
        for (int i=0;i<aux;i++){
            for (int j=0;j<aux;j++){
                 matrix[i][j]=(int) (Math.random() * 10);
            }
          }
  
  }
public static void  mostrar(int[][] matrix,int aux){
      for ( int i=0;i<aux ; i++) {
          for ( int j=0;j<aux ;j++ ) {
            	System.out.print(" "+matrix[i][j]);
          }
          System.out.println();
        }  
        System.out.println("Traspuesta es ");
      	for ( int i=0;i<aux ; i++) {
          	for ( int j=0;j<aux ;j++ ) {
            	System.out.print(" "+matrix[j][i]);
          	}
          	System.out.println();
        }  
      }

}
import java.util.Scanner;
public class Ejercicio14 {
		public static void main(String[] args) {
 			Scanner valor = new Scanner(System.in);
            double[] moneda= new double[4];
            System.out.println("Ingrese la moneda en euros");
            moneda[0]=valor.nextDouble();
             for (int i = 1; i <=3; i++) {
                     moneda[i]=0;
            }
            for (int i=0;i<=3 ;i++ ){
                if(i==0){                    
                    System.out.println("En euros es: "+moneda[i]);
                }else if(i==1){
                    moneda[i]=moneda[0]*1.28611;
                    System.out.println("En dollar es: "+moneda[i]);
                }else if(i==2){
                    moneda[i]=moneda[0]*129.852;
                    System.out.println("En yens es: "+moneda[i]);
                }else if(i==3){
                    moneda[i]=moneda[0]*0.86;
                    System.out.println("En libra  es: "+moneda[i]);
                }
            }
		}
}
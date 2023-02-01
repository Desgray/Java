import java.util.Scanner;
/**
 *
 * @author Samuel
 */
public class Extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner valor=new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1=valor.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2=valor.nextInt();
        int aux;
        int aux2=0;
        aux=num1;
        while (aux>=num2) {
            aux=aux-num2;
            aux2++;
        }
        System.out.println("El cociente es "+aux2);
        System.out.println("El resto es "+aux);
    }
    
}

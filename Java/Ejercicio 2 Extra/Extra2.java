import java.util.Scanner;
public class Extra2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A,B,C,D,aux;
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese valor de A");
        A=valor.nextInt();
         System.out.println("Ingrese valor de B");
        B=valor.nextInt();
         System.out.println("Ingrese valor de C");
        C=valor.nextInt();
         System.out.println("Ingrese valor de D");
        D=valor.nextInt();
        
        aux=B;
        B=C;  
        C=A;
        A=A-A+D;
        D=aux;  
        System.out.println("A= "+A);
        System.out.println("B= "+B);
        System.out.println("C= "+C);
        System.out.println("D= "+D);
    }
    
}
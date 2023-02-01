import java.util.Scanner;

public class Extra4 {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int numero;
        numero = valor.nextInt();
        while (numero < 1 || numero > 10) {
            System.out.println("Ingrese numero");
            numero = valor.nextInt();
        }
        switch (numero) {
            case 1:
                System.out.println("Numero ingresado es I en Romano");
                break;
            case 2:
                System.out.println("Numero ingresado es II en Romano");
                break;
            case 3:
                System.out.println("Numero ingresado es III en Romano");
                break;
            case 4:
                System.out.println("Numero ingresado es IV en Romano");
                break;
            case 5:
                System.out.println("Numero ingresado es V en Romano");
                break;
            case 6:
                System.out.println("Numero ingresado es VI en Romano");
                break;
            case 7:
                System.out.println("Numero ingresado es VII en Romano");
                break;
            case 8:
                System.out.println("Numero ingresado es VIII en Romano");
                break;
            case 9:
                System.out.println("Numero ingresado es IX en Romano");
                break;
            case 10:
                System.out.println("Numero ingresado es X en Romano ");
                break;
            default:
                throw new AssertionError();
        }

    }

}
import java.util.Scanner;
public class Extra5 {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        double descuentos;
        System.out.println("Ingrese la clase del socio");
        char caracter = valor.next().charAt(0);
        System.out.println("Ingrese el monto");
        double numero;
        numero = valor.nextInt();
        switch (caracter) {
            case 'A':
                descuentos = numero * 0.5;
                System.out.println("El Precio total es: "+descuentos);
                break;
            case 'B':
                descuentos = numero * 0.35;
                System.out.println("El Precio total es: "+descuentos);
                break;
            case 3:                   
                System.out.println("Precio total"+numero);
                break;
            default:
                System.out.println("Clase incorrecta");
        }

    }

}
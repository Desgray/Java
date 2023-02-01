import java.util.Scanner;
//import java.util.String;
public class Extra3V2 {
	public static void main(String[] args){
		Scanner valor = new Scanner(System.in);
		Character caracter;
		System.out.println("Ingrese una letra");
		caracter=valor.next().charAt(0);
		caracter=Character.toUpperCase(caracter);
		if(caracter.equals('A') || caracter.equals('E') || caracter.equals('I') || caracter.equals('O') || caracter.equals('U')){
			System.out.print("La letra ingresada es un vocal");
		}else{
			System.out.print("La letra ingresada no es una vocal");
		}
	}
}
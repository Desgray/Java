import java.util.Scanner;
//import java.util.String;
public class Extra3{
	public static void main(String[] args){
		Scanner valor = new Scanner(System.in);
		String caracter;
		System.out.println("Ingrese una letra");
		caracter=valor.next();
		caracter=caracter.toUpperCase();
		if(caracter.equals("A") || caracter.equals("E") || caracter.equals("I") || caracter.equals("O") || caracter.equals("U")){
			System.out.print("La letra ingresada es un vocal");
		}else{
			System.out.print("La letra ingresada no es una vocal");
		}
	}	
}
import java.util.Scanner;
public class Ejercicio16 {
		public static void main(String[] args) {
 			int[] vector = new int[100];
            int num;
            num=0;
            buscar(vector,num);

		}
public static void buscar(int[] vector, int num) {
        Llenar(vector);
        Ordenar(vector);
        int i;   //limite inferior 
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese elemento a buscar");
        num = valor.nextInt();
        i = 0;
        while (i <= vector.length && vector[i] < num) {
            i++;
        }
        if (i <= vector.length) {
            if (vector[i] == num) {
                System.out.println("Numero encontrado");
            } else if (vector[i] != num) {
                System.out.println("Numero no encontradp");
            }
        } else if (i > vector.length) {
            System.out.println("Elemento no encontrado");
        }

    }
public static void swap(int[] array, int a, int b) {
        int value = array[b];
        array[b] = array[a];
        array[a] = value;
	}
public static void Ordenar(int[] vector) {
        for (int i = vector.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (vector[j] > vector[j + 1]) {
                    swap(vector, j, j + 1);

                }
            }
        }
        mostrar(vector);
    }	
 public static void mostrar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%d\t", vector[i]);
        }
        System.out.println();
    }
public static void Llenar(int[] vector) {
        Scanner valor = new Scanner(System.in);
        for (int i = 1; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%d\t", vector[i]);
        }
        System.out.println();
    }        
}
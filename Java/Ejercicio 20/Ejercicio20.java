import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;            
public class  Ejercicio20 {
public static void main(String[] args){    
            Scanner valor = new Scanner(System.in);
            int filas,colum;
            System.out.print  ("Ingrese filas: ");
            filas=valor.nextInt();
            System.out.print("Ingrese columnas ");
            colum=valor.nextInt();
            while(filas!=colum){
                System.out.print("Las columnas tienen que se iguales a las filas: ");
                System.out.print("Ingrese Filas: ");    
                filas=valor.nextInt();
            }
            int [][] mat = new int[filas][colum];
            int [] arrayColumnas= new int[mat.length];
            int [] arrayFilas=new int[mat.length];
            int diagonalPrincipal,diagonalInversa;
            matrix2(mat,filas);
            diagonalPrincipal=0;
            diagonalInversa=0;
            Ver(mat,filas,arrayColumnas,arrayFilas,diagonalPrincipal,diagonalInversa);

    }
public static void Ver(int mat[][],int fila,int[] arry,int[] arry2,int inver,int princi){
            arry=Colunm(mat,fila);    //guardamos cada suma de una filas en un arreglo
            arry2=Filas(mat,fila);    //guardamos cada suma de una columna en un arreglo
            System.out.print("suma de cada filas");
            System.out.print(Arrays.toString(arry));  //mostramos el arreglo de las filas
            System.out.println();
            System.out.print("Suma de cada columnas");
            System.out.println(Arrays.toString(arry2)); //mostramos el arreglo de las columnas
            princi=DiagonalPrincipal(mat,fila);   // se guarda la diagonal principal
            System.out.println("suma diagonal principal: "+princi);   // se muestra
            inver=DiagonalInversa(mat,fila);  // se guarda la diagonal invertida
            System.out.println("suma diagonal inversa: "+inver); // se muestra 
            Set<Integer> distinct1 = Arrays.stream(arry).boxed().collect(Collectors.toSet());  // se compara los elementos del primer arreglo
            boolean bandera=distinct1.size()==1;             // es verdadero si son iguales
            Set<Integer> distinct2 = Arrays.stream(arry2).boxed().collect(Collectors.toSet()); // se compara los elementos del segundo arreglo
            boolean bandera1=distinct2.size()==1;   // verdadero si son iguales
            if(bandera==true && bandera1==true){
                if((Arrays.equals(arry,arry2) && (princi==inver) && (arry2[0]==inver))){}   // compara si son todos los elementos iguales 
                    System.out.print("Matriz magica");
            }else{
                    System.out.print("Matriz no magica");
            }

}

public static int DiagonalInversa(int mat[][],int fila){
    int inversa=0;
    for (int i =0;i<mat.length ;i++ ) {
        for (int j =0;j<mat.length ;j++) {
                if(i+j==mat.length-1){
                    inversa+=mat[i][j];
                }
        }
    }
    return inversa;
}

public static int DiagonalPrincipal(int mat[][],int fila){
    int diagonal;
    diagonal=0;
    for (int i=0;i<mat.length ;i++ ) {
        for (int j=0;j<mat.length ;j++ ) {
            if(i==j){
                diagonal+=mat[i][j];
            }
        }
        
    }
    return diagonal;
}


public static int[] Colunm(int mat[][],int fila){
    int[] sumaCol = new int[mat.length];
    for (int i=0;i<mat.length ;i++ ) {
        for (int j =0 ;j<mat[0].length ;j++ ) {
            //System.out.print(mat[i][j]+" ");
            sumaCol[i]+=mat[j][i];

        }    
    } 
    return sumaCol;     
}

public static int[] Filas(int mat[][], int fila){
    int[] sumaFilas=new int[mat.length];
    for (int i=0;i<mat.length ;i++ ) {
            for (int j=0;j<mat[0].length ;j++ ) {
                System.out.print(mat[i][j]+" ");
                sumaFilas[i]+=mat[i][j];            
        } 
        System.out.println("");
    } 
        return sumaFilas;
}
public static void  matrix2(int[][] mat,int fila){
    Scanner result = new Scanner(System.in);
    for (int i=0;i<fila ;i++ ) {
        for (int j=0;j<fila ;j++ ) {
            System.out.print("Ingrese numero: ");
            mat[i][j]=result.nextInt();
            while(mat[i][j]<0 || mat[i][j]>=10){
                System.out.print("Ingrese numero entre 1 y 9 : ");
                mat[i][j]=result.nextInt();
            }
         }
    }
 }    
}
import java.util.Scanner;
public class  BuscaMinas{
	public static void main(String[] args) {
		Scanner valor=new Scanner(System.in);
		System.out.print("Ingrese la cantidad de filas");
		int filas=valor.nextInt();
		System.out.print("Ingrese la cantidad de columnas");
		int columnas=valor.nextInt();
		int tablero[][]=new int[filas][columnas];
		double w=0;
		double z=0;
		int ntminas=0;
		int intento=75;
		int tminas=10;
		for (int j=0;j<tablero.length ;j++ ) {
			for (int i=0;i<tablero[j].length ;i++ ) {
					tablero[j][i]=0;
				}	
		}
		do{
			w=Math.random()*filas;
			z=Math.random()*columnas;
			w=(int)w;
			z=(int)z;
			if(z!=0 && w!=0 && z!=filas-1 && w!=columnas-1 ){
				tablero[(int)w][(int)z]=1;
				ntminas++;
			}
		}while(ntminas<=10);

		System.out.println("\n-x----------------------------------------------------x-");
       	System.out.println("  Ingresa las coordenas en el rango del 1 al 20");
       	do{
				int x=0,y=0;
       			int nminas = 0;
			do{
       			 System.out.println("\n-x----------------------------------------------------x-");
       			 System.out.println("\n	Intento :"+intento+" , Cual es su coordenada? \n");
       			 System.out.print("		Fila:  ");
       			 x=valor.nextInt();
       			 System.out.println();
       			 System.out.print("		Columna:  ");
       			 y=valor.nextInt();
       			 if(x==0 || y==0 || x>20 || y>20)
       			 	System.out.println("\n	==>Coordenadas incorrectas<== \n");
       		}while (x==0 || y==0 || x>20 || y>20);

			x=x-1;
       		y=y-1;
       		if(tablero [x][y]==0){
       			
       			if (x==0&&y==0){
       				if(x+1>=0 && x+1<20 && y<20)
       					nminas=nminas+tablero [x+1][y];
       				if(x+1>=0 && x+1<20 && y+1<20 && y+1>=0)
       					nminas=nminas+tablero [x+1][y+1];
       				if(x>=0 && x<20 && y+1<20 && y+1>= 0)
       					nminas=nminas+tablero [x][y+1];
       			}
       			else {
       				if(y==0){
       					if(x+1>=0 && x+1<20 && y<20)
       						nminas=nminas+tablero [x+1][y];
       					if(x-1>=0 && x-1<20 && y<20)
       						nminas=nminas+tablero [x-1][y];
       					if(x-1>=0 && x-1<20 && y+1<20 && y+1>=0)
       						nminas=nminas+tablero [x-1][y+1];
       					if(x>=0 && x<20 && y+1<20 && y+1>= 0)
       						nminas=nminas+tablero [x][y+1];
       					if(x+1>=0 && x+1<20 && y+1<20 && y+1>=0)
       						nminas=nminas+tablero [x+1][y+1];
       					
       				}
       				
       				else{      				
       					if(x-1>=0 && x-1<20 && y-1<20)
       						nminas=nminas+tablero [x-1][y-1];
       					if(x>=0 && x<20 && y-1<20)
       						nminas=nminas+tablero [x][y-1];
       					if(x+1>=0 && x+1<20 && y-1<20)
       						nminas=nminas+tablero[x+1][y-1];
       					if(x+1>=0 && x+1<20 && y<20)
       						nminas=nminas+tablero [x+1][y];
       					if(x-1>=0 && x-1<20 && y<20)
       						nminas=nminas+tablero [x-1][y];
       					if(x-1>=0 && x-1<20 && y+1<20 && y+1>=0)
       						nminas=nminas+tablero [x-1][y+1];
       					if(x>=0 && x<20 && y+1<20 && y+1>= 0)
       						nminas=nminas+tablero [x][y+1];
       					if(x+1>=0 && x+1<20 && y+1<20 && y+1>=0)
       						nminas=nminas+tablero [x+1][y+1];
       					}
       			 }
       			 System.out.print("n	No se encontro mina");
       			 
       			 if(intento>tminas)
       			 	 System.out.print("	Alrededor hay: "+ nminas);
       			 System.out.println("\n	Intentos restantes: "+(intento-1));
       		}
       		else
       			{
       				tminas = tminas-1;
       				System.out.println("\n	Acertaste!, Mina Eliminada Restan "+tminas+" tminas");
       				System.out.println("\n	Intentos restantes: "+(intento-1));
       			}
       	
          intento=intento-1;
      }while (intento>=tminas && intento>0 && tminas>0);	
 	   
       	if(tminas==0)
       		System.out.println("		GANASTE!");
       	
       	if(tminas>intento)
       		System.out.println("		PERDISTE!    (Exceso de tminas restantes "+tminas+")\n\n");
       	
       	if(intento==0)
       		System.out.println("		PERDISTE!");
 	   }
}


		

	

	

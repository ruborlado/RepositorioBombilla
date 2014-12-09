package ejemplo_bucle;

import java.util.Arrays;

public class Primitiva {

	public static void main(String[] args) {
		
		int[] quiniela=new int[6];
		int cuantosTengo=0;
		
		//repetir hasta que tenga 6 numeros
		/* for (int i=0;i<6;)*/
		
		
		while(cuantosTengo<6){
			 
			 //generar numero entre 1 -49
			 
			 int aleatorio=(int)(Math.random()*49+1);
			 //mirar si está
			 
			 boolean está=false;// asi asumo que no está
			 
			 for(int j=0;j<cuantosTengo;j++)
				 
				 if (aleatorio==quiniela[j]) está=true;
				 
				 
				 
				 if(!está){
					 
					 quiniela[cuantosTengo]=aleatorio;
					 cuantosTengo++;
					 
					 
				 
			 }
			 
			
			 
		 }
		 System.out.println(Arrays.toString(quiniela));
	}

}

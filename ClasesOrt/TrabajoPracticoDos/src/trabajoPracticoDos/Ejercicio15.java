package trabajoPracticoDos;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int codigoAux=1;
		int contador=0;
		int cliente[];
		int duracionLlamada[];
		float importe[];
		String abono[];
		while(codigoAux!=0)
		{
		do{
		System.out.println("INGRESE EL CODIGO DE CLIENTE");
		codigoAux=input.nextInt();
		}while((codigoAux<1001||codigoAux>9999)&&!(codigoAux==0));
		contador++;
		importe= new float[contador];
		abono= new String [contador];
		duracionLlamada= new int [contador];
		cliente= new int [contador];
		if(codigoAux>0)
		{
			for(int i=0;i<contador;i++)
			{
				cliente[i]=codigoAux;
				do
				{
					System.out.println("ingrese la duracion de la llamada");
					duracionLlamada[i]=input.nextInt();
				}
				while(duracionLlamada[i]<0);
				
				do
					{System.out.println("INGRESE EL TIPO DEL ABONO");
				abono[i]=input.next();
					}while(!abono[i].contentEquals("a")&&!abono[i].contentEquals("b")&&!abono[i].contentEquals("c"));
			
					if(abono[i].contentEquals("a"))
					{
							importe[i]=(float)(2*duracionLlamada[i]);
						
					}
					if(abono[i].contentEquals("b"))
					{
						if(duracionLlamada[i]<=5)
						{
							importe[i]=(float)(2*duracionLlamada[i]);
						}
						else
						{
							importe[i]=(float)(1.5*duracionLlamada[i]);
						}	
					}
					if(abono[i].contentEquals("c"))
					{
							if(duracionLlamada[i]<11)
							{
								importe[i]=(float)(1*duracionLlamada[i]);
							}
							else
							{
								importe[i]=10;
							}
						
					}
			
			}
		}
		}

			
			
			
			System.out.println("aSDASDSA");
			
			
		
		input.close();
	}

}

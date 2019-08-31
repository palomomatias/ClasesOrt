package trabajoPracticoDos;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int corredor[]=new int [100];
		int contador=0;
		int min = 0;
		int auxiliarCorredor=0;
		//int porcentaje[]=new int [100];
		int porcentaje=0;
		int contadorPorcentaje=0;
		int acumulador;
		int horas[]=new int [100];
		int minutos[]=new int [100];
		int segundos[]=new int [100];
		int segundoTodo[]=new int [100];
		int promedio[]=new int [100];
		do
		{
			System.out.println("Ingrese el numero del corredor si es cero se cancela");
			acumulador=input.nextInt();
			if (!(acumulador==0))
			{
				corredor[contador]=acumulador;
				do {
				System.out.println("Ingrese las horas que tardo");
				horas[contador]=input.nextInt();
				System.out.println("Ingrese las minuts que tardo");
				minutos[contador]=input.nextInt();
				System.out.println("Ingrese las segundos que tardo");
				segundos[contador]=input.nextInt();
				}
				while(horas[contador]>25||minutos[contador]>60||segundos[contador]>60);
				contador++;
			
			}
		}
		while (!(acumulador==0));
	
	//	System.out.println("Corredor Horas Minutos Segundos\n");
		for(int i=0;i<contador;i++)
		{
			
			segundoTodo[i]=devolverSeg(horas[i],minutos[i],segundos[i]);
			promedio[i]=segundoTodo[i]/contador;
			min=segundoTodo[0];
			auxiliarCorredor=corredor[0];
			if(segundoTodo[i]<3601)
			{
				contadorPorcentaje++;
				porcentaje=(100*contadorPorcentaje)/contador;
				
			}
			if(min<segundoTodo[i])
			{
				min=segundoTodo[i];
				auxiliarCorredor=corredor[i];
				
				
			}
			
						
			System.out.println(promedio[i]+"          "+corredor[i]+"          "+porcentaje+"          "+min+auxiliarCorredor);
			
			
		}
		System.out.println(min+"       "+auxiliarCorredor);
		input.close();
	}
	
	
	
	 public static int devolverSeg (int horas, int minutos, int segundos) {

		 int suma;
		 suma= (horas*3600)+(minutos*60)+segundos;
		 
	        return suma;
		
	    }
	

}

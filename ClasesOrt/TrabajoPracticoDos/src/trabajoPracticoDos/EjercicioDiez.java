package trabajoPracticoDos;
import java.util.Scanner;
public class EjercicioDiez {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int corredor[]=new int [100];
		int contador=0;
		int min = 0;
		int auxiliarCorredor=0;
		int porcentaje=0;
		int acumulador;
		int horas[]=new int [100];
		int minutos[]=new int [100];
		int segundos[]=new int [100];
		int segundoTodo[]=new int [100];
		double promedio;
		do
		{
			System.out.println("Ingrese el numero del corredor si es cero se cancela ");
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

		for(int i=0;i<contador;i++)
		{
			segundoTodo[i]=devolverSeg(horas[i],minutos[i],segundos[i]);
			porcentaje=calcularPorcentaje(segundoTodo[i],contador);
			auxiliarCorredor=nombreDelGanador(segundoTodo[i],corredor[i],min);
			min=ganador(segundoTodo[i],corredor[i]);
					
		}
		
		promedio=calcularPromedio(segundoTodo,contador);

		System.out.println("El GANADOR DE LA CARRERA ES");
		System.out.println("Corredor nro: "+auxiliarCorredor+"\nCon un tiempo de: "+min+" segundos\n");
		System.out.println("PROMEDIOS DE LOS CORREDORES:");
		System.out.println(promedio+" segundos \n");
		System.out.println("PORCENTAJE DE CORREDORES QUE TERMINARON EN MENOS DE UNA HORA");
		System.out.println(porcentaje);
	
		input.close();
	}
	
	
	
	 public static int devolverSeg (int horas, int minutos, int segundos)
	 {
		 int suma;
		 suma= (horas*3600)+(minutos*60)+segundos;
		 
	        return suma;
	 }
	 
	 public static double calcularPromedio (int dato[],int contador)
	 {
		 int suma=0;
		 double promedio=0;
		 for (int i=0;i<dato.length;i++)
		 {
			suma=suma+dato[i]; 
		 }
		 promedio=suma/contador;
		 return promedio;
		 
	 }
	 
	 public static int calcularPorcentaje (int totalDeSeg,int contador)
	 {
		 int contadorPorcentaje=0;
		 int porcentaje = 0;
		 
			if(totalDeSeg<3601)
			{
				contadorPorcentaje++;
				porcentaje=(100*contadorPorcentaje)/contador;
			} 
			return porcentaje;
	 }
	 
	 public static int ganador (int segundoTodo,int corredor)
	 {
		 int min=0;
			if(min<segundoTodo)
			{
				min=segundoTodo;
			}
			return min;
	 }
	 
	 public static int nombreDelGanador(int segundoTodo,int corredor,int min)
	 {
		 
		 min=0;
		 int aux=0;
					if(min<segundoTodo)
					{	
						aux=corredor;			
					}
					return aux;
	 }
}

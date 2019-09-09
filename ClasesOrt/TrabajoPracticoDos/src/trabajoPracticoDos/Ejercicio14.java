package trabajoPracticoDos;

import java.util.Scanner;

public class Ejercicio14 {
final static int precioBase=8500;
	public static void main(String[] args) {
		
		final int precioDeViajeAdicional=100;
		int cantidadPedida=2;
		float acum=0;
		float mayor=0;
		float promedio=0;
		float bonificacion[]=new float [cantidadPedida];
		float total[]=new float [cantidadPedida];
		Scanner input= new Scanner (System.in);
		String nombreEmpresa[]=new String[cantidadPedida];
		int viajes[]=new int [cantidadPedida];
		float viajesAdicional[]=new float [cantidadPedida];
	
	for(int i=0;i<cantidadPedida;i++)
	{
		System.out.println("ingrese el nombre de su impresa");
		nombreEmpresa[i]=input.next();
		do {
		System.out.println("ingrese los viajes adicionales");
		viajes[i]=input.nextInt();
		}
		while(viajes[i]<=0||viajes[i]>=1000);
		viajesAdicional[i]=viajes[i]*precioDeViajeAdicional;
		bonificacion[i]=calcularBonificacion(viajes[i],viajesAdicional[i]);
		total[i]=viajesAdicional[i]-bonificacion[i]+precioBase;
		acum=total[i]+acum;
		
	}
	mayor=total[0];
	
	promedio=acum/cantidadPedida;
	
		
		for(int i=0;i<cantidadPedida;i++)
		{
			if(total[i]>mayor)
			{
				mayor=total[i];
				
			}
			System.out.println("La empresa "+nombreEmpresa[i]+" Debe abonar: "+total[i]);
			
		}
		System.out.println("el promedio pagado por empresa es de "+promedio+" la mayor factura es un total de "+mayor);
		
			input.close();
		
	}

	public static float calcularBonificacion(int viajes,float viajesAdicional) {
		float bonificacion;
		if(viajes>30)
		{
			bonificacion=(float) ((viajesAdicional+precioBase)*0.10);
			
		}
		else
		{
			bonificacion=0;
		}
		return bonificacion;
	}

}



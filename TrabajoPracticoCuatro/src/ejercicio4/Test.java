package ejercicio4;
import java.util.ArrayList;
import java.util.Scanner;

import ejercicio3.Producto;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		ArrayList <Auto> li_auto=new ArrayList<Auto>();
	

		String matricula;
		System.out.println("ingrese matricula, F para finalizar");
		matricula=input.next();
		int km;
		String marca;
		String modelo;
		while(!matricula.contentEquals("F"))
		{
			System.out.println("ingrese marca");
			marca=input.next();
			System.out.println("ingrese modelo");
			modelo=input.next();
			System.out.println("ingrese km");
			km=input.nextInt();
			li_auto.add(new Auto (matricula,marca,modelo,km));
			System.out.println("ingrese matricula, F para finalizar");
			matricula=input.next();
		}
		System.out.println(li_auto.toString());
		/*System.out.println("iingrese la marca que quiere comparar");
		String marcaComparar;
		marcaComparar=input.next();
		//listarAutosPorMarca(li_auto,marcaComparar);
		System.out.println("ingrese el tope de km ");
	int compararKm;
		compararKm=input.nextInt();
			listarAutosPorKm(li_auto,compararKm);
	*/
		listarMayorKm(li_auto);
	
	}
		public static void listarAutosPorMarca(ArrayList<Auto>test,String marca)
		{
			
			for(int i=0;i<test.size();i++)
			{
				if(test.get(i).getMarca().contentEquals(marca))
				{
					
					System.out.println(test.get(i).toString());
				}
				
			}
			
		}
		public static void listarAutosPorKm(ArrayList<Auto>test,int km)
		{
			
			for(int i=0;i<test.size();i++)
			{
				if(test.get(i).getKm()<km)
				{
					
					System.out.println(test.get(i).toString());
				}
				
			}
			
		}
		public static void listarMayorKm(ArrayList<Auto>test)
		{
			int max=0;
			int indice=0 ;
			for(int i=0;i<test.size();i++)
			{
				if(test.get(i).getKm()>max)
				{
					
					max=test.get(i).getKm();
					indice=i;
				}
				
			}
			System.out.println(test.get(indice).toString());
		}		
}

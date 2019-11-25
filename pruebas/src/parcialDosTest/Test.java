package parcialDosTest;

import java.util.Scanner;
import java.util.ArrayList;
public class Test {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Pedido>li_pedidos=new ArrayList<Pedido>();
		int numero;
		System.out.println("ingrese numero de pedido, 0 para salir");
		numero=input.nextInt();
		while(numero!=0)
		{
			
			
			
			
		}
		
		

	}
	
	
	public Pedido buscarPedido(ArrayList<Pedido> lista,int pedido)
	{
		Pedido obj=null;
		int size=lista.size();
		int i=0;
		while(size<i&&obj==null)
		{
			if(lista.get(i).getNroPedido()==pedido)
			{
				
				obj=lista.get(i);
			}
			i++;
		}
		return obj;
	}
	
	public int agregarCodigo()
	{
		int result;
		do 
			{
				
				System.out.println("el codigo de articulo debe ser entree 1 y 10");
				result=input.nextInt();
			}
		
		while(result<0||result>11);
		return result;		
	}

}

package test3;
import java.util.ArrayList;
public class Test_persona_cines {
	 public static void main(String[] args) {
	ArrayList<Persona> li_cine=new ArrayList<Persona>();
	generar(li_cine);
	 System.out.println(li_cine.toString());
	 
	 int acum=0;
	 int acumTotal=0;
	 
	 for(int i=0;i<li_cine.size();i++)
	 {
		 if(li_cine.get(i).getEdad()>=5 &&li_cine.get(i).getEdad()<=10)
		 {
			 acum=100;
			 
		 }
		 else if(li_cine.get(i).getEdad()>=11 &&li_cine.get(i).getEdad()<=17)
		 {
			 acum=200;
		 }
		 else {
			 acum=300;
		 }
		 acumTotal=acum+acumTotal;
		 
	 }
	 System.out.println(acumTotal);
	 
	 
	 
	 
	 
	 
	 
	 }
	 
	 
	 
	 
	 
	 
	 public static void generar(ArrayList <Persona>n)
	 {
		 int personas=generaNumeroAleatorio(1,45);
		 
		 for(int i=0;i<personas;i++)
		 {
			 
			 n.add(new Persona(generaNumeroAleatorio(5, 60),i));
		 }
		 
	 }
	
	 public static int generaNumeroAleatorio(int minimo, int maximo){
         
	        int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
	        return num;
	    }
	
	

}

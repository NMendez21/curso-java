package estructuras_principales;


import java.util.*;

public class Uso_Tallas {
		
	/*enum Talla{
		MINI,
		MEDIANO,
		GRANDE,
		MUY_GRANDE
	};*/
	
	
	enum Talla{
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		
		private Talla(String abreviatura) {
			this.abreviatura=abreviatura;
			
		}
		
		//metodo getter para devolver abreviatura
		public String dameAbreviatura() {
				
			return abreviatura;
			
		}
		
		private String abreviatura;
		
	}
	
	public static void main(String[] args)
	{
		/*String talla;
		talla = "pequeña";
		talla = "mediana";
		talla = "grande";
		talla = "azul";*/
		
		
		/*Talla s = Talla.MINI;
		Talla m = Talla.MEDIANO;
		Talla l = Talla.GRANDE;
		Talla xl = Talla.MUY_GRANDE;*/
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce una talla(MINI,MEDIANO,GRANDE O MUY_GRANDE): ");
		
		String entrada_datos = scan.next().toUpperCase(); //solicitamos datos a usuario y pasamos a mayusc
		
		
		
		Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("Talla="+la_talla);
		System.out.println("Abreviatura="+la_talla.dameAbreviatura());
		
		
		
		
		
	}
}

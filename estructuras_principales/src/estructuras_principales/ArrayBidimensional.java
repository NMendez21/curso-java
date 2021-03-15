package estructuras_principales;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		int[][] matriz= {
				{10,11},
				{12,121}
		};
			
		//[columnas][filas]
		/*matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[1][0] = 3;
		matriz[1][1] = 4;*/
		
		//System.out.println(matriz[0][0]);
		
		
		/*for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++) {
				
				System.out.print(matriz[i][j]+" , ");
			}
			
			System.out.println("");
		}*/
		
		for(int[] fila:matriz)
		{
			for(int z:fila) {
				System.out.print(z + " ");
			}
			
			System.out.print("");
		}

	}

}

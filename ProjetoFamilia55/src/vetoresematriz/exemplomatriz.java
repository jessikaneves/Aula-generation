package vetoresematriz;

public class exemplomatriz {

	public static void main(String[] args) {
	   int matriz[][]  = new int[3][4];
	   int matriz1[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

	   matriz[1][3]=28;
	   
	   for(int linha=0;linha<3;linha++)
	   {
		   for(int coluna=0;coluna<4;coluna++)
		   {
			   System.out.print(matriz1[linha][coluna]+"\t");
		   }
		   System.out.println();
		   
	   }
	}

}

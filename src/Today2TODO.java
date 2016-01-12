import java.util.Scanner;

public class Today2TODO {

	public static void main(String[] args) {

		int[][] matrix = { { 4, 6, 2, 5 }, { 7, 9, 4, 8 }, { 6, 9, 3, 7 },

		};
		int br=0;
		int rows=matrix.length;
		int colons=matrix[0].length;
		
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < colons; j++) {
				
			br++;
			
			br=(rows)*(colons);
			
			
				}
				
			}
		int[] array= new int[br];System.out.println(br);
			
			for (int i = 0; i < array.length; i++) {
				for (int j = array.length-1; j >0; j--) {
					if(array[j]<array[j-1]){
						int  temp=array[j];
						array[j]=array[j-1];
						array[j-1]=temp;
					}
					System.out.println(array[j]);
					
				}
			}
		} 
}




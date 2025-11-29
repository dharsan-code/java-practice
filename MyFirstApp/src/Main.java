public class Main{
	public static void main(String[] args) {
		
	//2D Array
		int[][] rollno = new int[5][2];
		rollno[0][0] = 10;
		rollno[1][1] = 101;
		
		
       for(int i=0; i<5; i++) {
    	   for(int j=0; j<2; j++) {
    	      System.out.print(rollno[i][j]);	   
    	   }
    	   System.out.println();
       }

	}
}

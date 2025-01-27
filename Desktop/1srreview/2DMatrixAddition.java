public class MatrixAddition{
	public static void main(String []args){
		int[][] matrix1={{1,2,3},{4,5,6},{7,8,9}};
		int row=3;
		int col=3;
		int[][] matrix2={{1,2,3},{4,5,6},{7,8,9}};
		int[][] matrix3=new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(matrix3[i][j]);
			}
			System.out.println();
		}
	}
}
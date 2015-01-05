package com.bnsantos.chapter1;

public class Question6 {
	public static int[][] rotate90(int[][] matrix){
		for (int layer = 0; layer < matrix.length / 2; ++layer) {
			int first = layer;
			int last = matrix.length - 1 - layer;
			for(int i = first; i < last; ++i) {
				int offset = i - first;
				int top = matrix[first][i]; // save top

				// left -> top
				matrix[first][i] = matrix[last-offset][first]; 			

				// bottom -> left
				matrix[last-offset][first] = matrix[last][last - offset]; 

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last]; 

				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
		return matrix;
	}
	
	public static String print(int[][] matrix){
		StringBuffer output = new StringBuffer();
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				output.append(matrix[i][j]);
				output.append(" ");
			}
		}
		return output.toString();
	}
}

package com.bnsantos.chapter1;

import java.util.ArrayList;
import java.util.List;

public class Question7 {
	public static void zeroes(int[][] matrix){
		for(Index index:zeroesIndexes(matrix)){
			for(int j=0;j<matrix[index.i].length;j++){
				matrix[index.i][j] = 0;
			}
			
			for(int i=0;i<matrix.length;i++){
				matrix[i][index.j] = 0;
			}
		}
	}
	
	private static List<Index> zeroesIndexes(int[][] matrix){
		List<Index> indexList = new ArrayList<Question7.Index>();
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				if(matrix[i][j]==0){
					indexList.add(new Index(i,j));
				}
			}
		}
		return indexList;
	}
	
	public static class Index{
		public int i, j;
		public Index(int i, int j){
			this.i = i;
			this.j = j;
		}
	}

}

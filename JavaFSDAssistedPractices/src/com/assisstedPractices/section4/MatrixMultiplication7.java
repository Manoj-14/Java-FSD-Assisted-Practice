package com.assisstedPractices.section4;

public class MatrixMultiplication7 {
	public static void matrixMultiply(int[][] matrix1, int r1, int c1, int[][] matrix2, int r2, int c2) {
		if (c1 != r2)
			System.out.println("Row count of matrix 1 should equal to column countt");
		else {
			int[][] res = new int[r1][c2];

			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c2; j++) {
					for (int k = 0; k < c1; k++) {
						res[i][j] += matrix1[i][k] * matrix2[k][j];
					}
				}
			}
			System.out.println("Matrix multiplication:");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c2; j++) {
					System.out.print(res[i][j] + " ");
				}
				System.out.println();
			}

		}
	}

	public static void main(String[] args) {
		int r1 = 2, c1 = 3;
		int r2 = 3, c2 = 2;
		int[][] firstMatrix = { { 3, -2, 5 }, { 3, 0, 4 } };
		int[][] secondMatrix = { { 2, 3 }, { -9, 0 }, { 0, 4 } };
		matrixMultiply(firstMatrix, r1, c1, secondMatrix, r2, c2);
	}
}

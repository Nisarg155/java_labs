import java.util.Scanner;

class MatrixOperations {
	public static void displayMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

	public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
		int rows = matrix1.length;
		int columns = matrix1[0].length;
		int[][] resultMatrix = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		return resultMatrix;
	}

	public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
		int rowsA = matrix1.length;
		int columnsA = matrix1[0].length;
		int columnsB = matrix2[0].length;
		int[][] resultMatrix = new int[rowsA][columnsB];

		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < columnsB; j++) {
				int elementSum = 0;
				for (int k = 0; k < columnsA; k++) {
					elementSum += matrix1[i][k] * matrix2[k][j];
				}
				resultMatrix[i][j] = elementSum;
			}
		}

		return resultMatrix;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of rows for matrices: ");
		int rows = scanner.nextInt();
		System.out.print("Enter the number of columns for matrices: ");
		int columns = scanner.nextInt();

		// Input for the first matrix
		System.out.println("Enter elements for the first matrix:");
		int[][] matrixA = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
				matrixA[i][j] = scanner.nextInt();
			}
		}

		// Input for the second matrix
		System.out.println("Enter elements for the second matrix:");
		int[][] matrixB = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
				matrixB[i][j] = scanner.nextInt();
			}
		}

		// Matrix addition
		int[][] sumMatrix = addMatrices(matrixA, matrixB);
		System.out.println("Matrix Addition:");
		displayMatrix(sumMatrix);

		// Matrix multiplication
		int[][] productMatrix = multiplyMatrices(matrixA, matrixB);
		System.out.println("Matrix Multiplication:");
		displayMatrix(productMatrix);

		scanner.close();
	}
}

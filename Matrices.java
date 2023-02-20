package Package1;

import java.util.Arrays;

public class Matrices {
	int rows = 3;
	int columns = 3;
	int[][] m = new int[rows][columns];
	
	public Matrices() {
		this.x();
	}
	
	public void x() {
		for(int i=0; i<this.m.length; i++) {
			for(int j=0; j<this.m[0].length; j++) {	
				this.m[i][j] = 0;
			}
		}
	}
	
	public Matrices(int[][] matriz) {
		this.m = matriz;
		this.rows = matriz.length;
		this.columns = matriz[0].length;
	}
	
	public int[][] multiplicar(int[][] matrizA, int[][] matrizB) {
		if(matrizA[0].length == matrizB.length) {
			int[][] matriz = new int[matrizA.length][matrizB[0].length];
			for(int i=0; i<matrizA.length; i++) {
	            for (int j=0; j<matrizB[0].length; j++) {
	                for (int k = 0; k < matrizB.length; k++)
	                    matriz[i][j] += matrizA[i][k] * matrizB[k][j];
	            }
	        }
			this.m = matriz;
		} else {
			System.out.println("Multiplicación no ejecutable");
			this.x();
		}
	
		return this.m;
	}
	
	public int[][] transponer(int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {	
				this.m[j][i] = matriz[i][j];
			}
		}
		return this.m;

	}
	
	public int diagonal(int[][] matriz) {
		int diagonal = 0;
		if(matriz.length == matriz[0].length) {
			for(int i=0; i<matriz.length; i++) {
				diagonal += matriz[i][i];
			}
		} else {
			System.out.println("Suma de diagonal no valida por R numeros");
		}
		return diagonal;
	}
	
	public int maximo(int[][] matriz) {
		int max = matriz[0][0];
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {	
				if (matriz[i][j] > max) {
					max = matriz[i][j];
				}
			}
		}
		return max;
	}
	
	public int[][] suma(int[][] matrizA, int[][] matrizB) {
		if(matrizA.length == matrizB.length && matrizA[0].length == matrizB[0].length) {
			for(int i=0; i<matrizA.length; i++) {
				for(int j=0; j<matrizA[0].length; j++) {	
					this.m[i][j] = matrizA[i][j] + matrizB[i][j];
				}
			}
		} else {
			System.out.println("Suma no aplicable");
			this.x();
		}
		
		return this.m;
	}
	
	public int[][] escalar(int[][] matriz,int escalar) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {	
				this.m[i][j] = escalar*matriz[i][j];
			}
		}
		return this.m;
	}
	
	public void print() {
		System.out.println(Arrays.deepToString(this.m));
	}

}
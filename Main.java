package Package1;

public class Main {

	public static void main(String[] args) {
		
		int[][] m1 = {{1,1,1}, {1,1,1}, {1,1,1}};
		int[][] m2 = {{2,2,2}, {2, 2, 2}, {2, 2, 2}};
		int[][] m3 = {{3,3,3}, {3, 3, 3}};
		
		Matrices m = new Matrices();

		m.escalar(m1, 2);
		m.print();
		
		m.suma(m1, m2);
		m.print();
		
		m.suma(m1, m3);
		m.print();
		
		System.out.println(m.maximo(m1));
		
		System.out.println(m.diagonal(m1));
		System.out.println(m.diagonal(m3));
		
		m.transponer(m1);
		m.print();
		
		m.multiplicar(m1, m2);
		m.print();
		
		m.multiplicar(m3, m2);
		m.print();
		
		m.multiplicar(m2, m3);
		m.print();
	}

}
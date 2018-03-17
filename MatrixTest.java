public class MatrixTest{

	public static void main(String[] args){
		//TODO think of criteria
		boolean passes = true;

		Matrix add_a = new Matrix(3,3);
		add_a.randomize();
		Matrix add_b = new Matrix(3,3);
		add_b.add(10);
		add_a.add(b);


		Matrix a = new Matrix(3,2);
		a.add(4);
		a.print();

		Matrix b = new Matrix(2,3);
		b.add(10);

		Matrix c = Matrix.mult(a,b);

		System.out.println(passes);
	}
}
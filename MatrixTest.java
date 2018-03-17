public class MatrixTest{

	public static void main(String[] args){
		Matrix a = new Matrix(3,2);
		a.print();
		a.randomize();
		a.add(10);
		a.print();

		Matrix b = new Matrix(3,2);
		b.randomize();
		b.add(40);
		b.print();
		b.add(a);
		b.print();

	}
}
// Class for creating and manipulate matrices
public class Matrix {

	private double[][] data;
	private int rows;
	private int cols;

	public Matrix(int rows, int cols){
		this.rows = rows;
		this.cols = cols;

		data = new double[rows][cols];
	}

	public int getRows(){
		return this.rows;
	}

	public int getCols(){
		return this.cols;
	}

	public double getData(int row, int col){
		return this.data[row][col];
	}

	public void print(){
		System.out.println("---------------------------");
		for(int i=0; i<this.rows; i++){
			for(int j=0; j<this.cols; j++){
				System.out.print(data[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
	}

	// gives all the values a value between -1 and 1
	public void randomize(){
		for(int i=0; i<this.rows; i++){
			for(int j=0; j<this.cols; j++){
				data[i][j] = Math.random()*2 - 1;
			}
		}
	}

	public void add(double n){
		for(int i=0; i<this.rows; i++){
			for(int j=0; j<this.cols; j++){
				data[i][j] += n;
			}
		}
	}

	public void add(Matrix m){
		for(int i=0; i<this.rows; i++){
			for(int j=0; j<this.cols; j++){
				data[i][j] += m.getData(i,j);
			}
		}
	}

	public void mult(double n){
		for(int i=0; i<this.rows; i++){
			for(int j=0; j<this.cols; j++){
				data[i][j] *= n;
			}
		}
	}

	public static Matrix mult(Matrix a, Matrix b){
		//TODO
		return new Matrix(1,1);
	}



}
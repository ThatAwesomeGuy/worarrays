import java.util.ArrayList;


public class TextLab03st
{
	public static void main(String args[])
	{
		System.out.println("\nTextLab08 STUDENT VERSION\n");

		Matrix m1 = new Matrix();
		m1.displayMatrix("Matrix m1 Default Display");
		System.out.println();

		Matrix m2 = new Matrix(3,5);
		m2.displayMatrix("Matrix m2 3 X 5 Display");
		System.out.println();
		int count = 100;
		for (int r = 0; r < m2.getRows(); r++)
		{
			for (int c = 0; c < m2.getCols(); c++)
			{
				m2.setValue(r,c,count);
				count++;
			}
		}
		m2.displayMatrix("Matrix m2 3 X 5 Consecutive Integers Display");
		System.out.println();

		Matrix m3 = new Matrix(3,3,100);
		m3.displayMatrix("Matrix m3 3 X 3 Initialized to 100 Display");
		System.out.println();
	}

	/****** MAIN METHOD FOR TESTING THE 100-POINT VERSION *************************************
	public static void main(String args[])
	{
		System.out.println("\nLAB13 100-POINT VERSION\n");

		Matrix m1 = new Matrix();
		m1.displayMatrix("Matrix m1 Default Display");
		System.out.println();

		Matrix m2 = new Matrix(3,5);
		int count = 10;
		for (int r = 0; r < m2.getRows(); r++)
		{
			for (int c = 0; c < m2.getCols(); c++)
			{
				m2.setValue(r,c,new Integer(count));
				count++;
			}
		}
		m2.displayMatrix("Matrix m2 3 X 5 Consecutive Integers Display");
		System.out.println();

		m2.resize(4,4);
		m2.displayMatrix("Matrix m2 After 4 X 4 Resizing Display");
		System.out.println();

		Matrix m3 = new Matrix(3,3,new Integer(100));
		m3.displayMatrix("Matrix m3 3 X 3 Initialized to 100 Display");
		System.out.println();
	}
	*******************************************************************************************/

}



class Matrix
{

	private ArrayList<Integer> list;	// one-dimensional array stores matrix values
	private int listSize;	// total number of elements in the matrix
	private int numRows;	// number of rows in the matrix
	private int numCols;	// number of cols in the matrix

	/**  Constructs empty ArrayList object and sets all values to 0  **/
	public Matrix(){
		numRows = 0;
		numCols = 0;
		listSize = numRows * numCols;
		list = new ArrayList<Integer>(listSize);
	}
	
	/**  Constructs r X c matrix with all elements initialized to 0  **/
	public Matrix(int r, int c){
		numRows = r;
		numCols = c;
		listSize = numRows * numCols;
		list = new ArrayList<Integer>(listSize);
		for (int x = 0; x < listSize; x++)
			list.add(0);
	}
	
	/** Constructs r X c matrix will all elements initialized to value  **/
	public Matrix(int r, int c, int value){
		numRows = r;
		numCols = c;
		listSize = numRows * numCols;
		list = new ArrayList<Integer>(listSize);
		
		for (int x = 0; x < listSize; x++){
			list.add(value);
		}
	}
	
	/**  Returns numRows value  **/
	public int getRows(){
		return numRows;		
	}
	
	/**  Returns numCols value  **/
	public int getCols(){
		return numCols;
	}
	
	/**  Returns listSize value  **/
	public int getSize(){
		return listSize;	
	}
	
	/**  Returns Matrix object value at (r,c) location  **/	     
	public int getValue(int r, int c){
		int position = ((numCols * r) + c);
		int listvalue = list.get(position);
		return (Integer)(listvalue);	
	}
	
	/**  Alters Matrix object value at (r,c) to value  **/
	public void setValue(int r, int c, int value){
		int position = (numCols * r) + c;
		list.set(position, value);
	}
	
	/**  Displays Matrix object in two-dimensional matrix format  **/
	public void displayMatrix(String str){
		
		System.out.println(str);
		
		if(getSize() == 0){
			System.out.println("Matrix has no elements");
		}
		
		for(int rows = 0; rows < numRows; rows++){
			for(int cols = 0; cols < numCols; cols++){
				System.out.print(getValue(rows,cols) + " ");
			}
			System.out.println();
		}
	}
								
	/**  Resizes Matrix object to new rows X cols size, copies all possible
	      previous values and initializes new elements to zero  **/
	public void resize(int rows, int cols){
		

	}

}

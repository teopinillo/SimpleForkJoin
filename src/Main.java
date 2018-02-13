import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Main {

	public static void main(String[] args) {
		Main myApp = new Main();		
		System.out.println("using recursive action to get the square root of an array");
		
		int l = 20;
		double[] numbers = myApp.createArray(l);
		myApp.printArray(numbers);
		MyAction myAction = new MyAction(numbers,0,l-1);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke (myAction);
		myApp.printArray(numbers);
	}
	
	public double[] createArray(int l) {
		Random random = new Random(100);
		double[] numbers = new double [l];
		 for (int i=0;i<l;i++) {
			 numbers[i]= random.nextDouble()*100;			 
		 }
		 return numbers;
	}
	
	public void printArray(double[] a) {
		System.out.println("");
		for (double d:a)
			System.out.format("%2.2f ",d);
	}

}

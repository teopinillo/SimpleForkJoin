import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Main {

	public static void main(String[] args) {
		Main myApp = new Main();		
		System.out.println("using recursive action to get the square root of an array");
		System.out.println("ants discharging a 100 pounds bag of sugar.");
		int l = 20;
		double[] numbers = myApp.createArray(l);
		MyAction myAction = new MyAction(numbers,0,l);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke (myAction);
	}
	
	public double[] createArray(int l) {
		Random random = new Random(100);
		double[] numbers = new double [l];
		 for (int i=0;i<l;i++) {
			 numbers[i]= random.nextDouble();
			 System.out.println(numbers[i]+" ");
		 }
		 return numbers;
	}

}

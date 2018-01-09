import java.util.concurrent.ForkJoinPool;

public class Main {

	public static void main(String[] args) {
		System.out.println("using recursive action to simulate");
		System.out.println("ants discharging a 100 pounds bag of sugar.");
		MyAction myAction = new MyAction(100);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke (myAction);
	}

}

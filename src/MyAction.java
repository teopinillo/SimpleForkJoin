import java.util.concurrent.RecursiveAction;

public class MyAction extends RecursiveAction {

	private int pounds;
	
	@Override
	protected void compute() {
		if (pounds<4) doingMySelf(pounds);
		 else {
			RecursiveAction left = new MyAction(pounds / 2);
			RecursiveAction right = new MyAction(pounds /2);
			//invokeAll(left,right);
			left.fork();
			right.fork();
			left.join();
			right.join();
		}
		
	}
	
	public MyAction (int pounds) {
		this.pounds = pounds;
	}
	
	public void doingMySelf(int pounds) {
		System.out.println("I'm taking " + pounds+ "to the cave");
	}

}

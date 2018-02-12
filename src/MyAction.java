import java.util.concurrent.RecursiveAction;

@SuppressWarnings("serial")
public class MyAction extends RecursiveAction {

	private double[] numbers;
	private int iStart;
	private int iEnd;
	
	
	@Override
	protected void compute() {
		//I will do 4 elements
		if (iEnd-iStart<=4) {
			for (int i =iStart;i<=iEnd;i++) {
				numbers[i]=Math.sqrt(numbers[i]);
			}
		} else {
			int mid = (iEnd-iStart)/2;
			RecursiveAction left = new MyAction (numbers,iStart,iStart+mid-1);
			RecursiveAction rigth = new MyAction (numbers,iStart+mid,iEnd);
			invokeAll(left,rigth);
		}				
	}
	
	public MyAction (double[] numbers, int start, int ends) {
		this.numbers = numbers;
		iStart = start;
		iEnd = ends;
	}
}

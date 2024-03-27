package studio7;

public class Die {

	private int num;
	private int roll;
	int[] sides;
	
	public Die(int n, int r) {
		n = num;
		r = roll;
		sides = new int[n];
		for (int i=0; i<n; i++) {
			sides[i] = i+1;
			
		}
		
		
	}
	
	public int roll() {
		return sides[];
	}
	
}

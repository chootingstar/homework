
public class Sales {
	
	int[][] salesFolk;
	salesFolk = new int[5][5];
	
	public static void main(String[] args) {
		Sales sold;
		sold = new Sales();
		
		//I plan to say a lot of data
		System.out.println(sold.setArray());
		System.out.println();
		System.out.println();
	}
	
	//My plans require an array, but I don't want to hard code all those numbers
	public int setArray() {
		Sales rn = new Sales();
		int rd = 0;
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				rd = rn.randGen();
				//I need the generator to be inside of this loop so that it generates new numbers
				salesFolk [i][j] = rd;
				/*I figured that the reason I couldn't call the random number generator was because I kept
				 * trying to initially set the number, a start you can't do twice. But now the only thing I
				 * think is the problem is that I can't initialize the number setting in an array. Apparently
				 * array constants can only be applied at initialization. I don't how to get this to think of it
				 * as the initial setting.*/
			}
		}
		
	}
	
	public int func2() {
		
	}
	
	int randGen() {
		//taken from my guessing game program
		double num = Math.random();
		
		//I feel so proud of making the random number between 1 and 100!
		//added 1 to num's answer to avoid numbers range to be between 0 and 99
		num = num*100 + 1;
		int randNum = (int) num;
		//Needs to have num type casted into a new variable for the compiler to understand.
		
		return randNum;
	}
	
}

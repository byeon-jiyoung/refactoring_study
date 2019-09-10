package refactoring_study.replace_inheritance_with_delegation2;

import java.util.Random;

public class Dice { // 332p
	private final Random rnd;
	
	public Dice() {
//		super(314159L);
//		rnd = this;
		rnd = new Random(314159L);
	}

	public Dice(long seed) {
//		super(seed);
//		rnd = this;
		rnd = new Random(seed);
	}
	
//	@Override 위임이라서 없애줘야 한다
	public int nextInt() {
		return rnd.nextInt(6) + 1; //rnd.으로위임
	}
	
	public void setSeed(long seed) {
		rnd.setSeed(seed); //위임
	}
}

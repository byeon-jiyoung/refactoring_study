package refactoring_study.replace_inheritance_with_delegation;

import java.util.Random;

public class Dice extends Random { // 326p
	public Dice() {
		super(314159L);
	}

	public Dice(long seed) {
		super(seed);
	}
	
	@Override
	public int nextInt() {
		return nextInt(6) + 1;
	}
	
	@Override
	public void nextBytes(byte[] bytes) {
		throw new UnsupportedOperationException();
	}

	@Override
	public long nextLong() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean nextBoolean() {
		throw new UnsupportedOperationException();
	}

	@Override
	public float nextFloat() {
		throw new UnsupportedOperationException();
	}

	@Override
	public double nextDouble() {
		throw new UnsupportedOperationException();
	}
	
}

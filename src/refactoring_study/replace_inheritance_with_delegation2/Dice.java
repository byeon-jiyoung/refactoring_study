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
	
//	@Override �����̶� ������� �Ѵ�
	public int nextInt() {
		return rnd.nextInt(6) + 1; //rnd.��������
	}
	
	public void setSeed(long seed) {
		rnd.setSeed(seed); //����
	}
}

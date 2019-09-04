package refactoring_study.replace_constructor_with_factoryMethod2;

public abstract class Shape { //276p
	private final int startX;
	private final int startY;
	private final int endX;
	private final int endY;
	
	protected Shape(int startX, int startY, int endX, int endY) {
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
	}
	
//	public abstract int getTypeCode(); 열거형으로 바꿨으니까
	public abstract ShapeType getTypeCode();
	
	public abstract String getName();
	
	public abstract void draw();
	
	@Override
	public String toString() {
		return String.format("[%10s, (%3s, %3s) -(%3s, %3s)]",getName(), startX, startY, endX, endY);
	}
	
	
	//objected class diagram을 만들 때 show stereotype, show package name 체크 해제 & add dependencies 체크 하고 만들어라!!!!!!!!!!!!!!!!!!!!!!!!
}

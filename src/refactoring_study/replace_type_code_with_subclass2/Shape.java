package refactoring_study.replace_type_code_with_subclass2;

public abstract class Shape { //200p
	public static final int TYPECODE_LINE= 0;
	public static final int TYPECODE_RECTANGLE= 1;
	public static final int TYPECODE_OVAL= 2;
	
	private final int startX;
	private final int startY;
	private final int endX;
	private final int endY;
	
	public static Shape createShape(int typeCode, int startX, int startY, int endX, int endY) {
		switch(typeCode) {
		case TYPECODE_LINE:
			return new ShapeLine(startX, startY, endX, endY);
		case TYPECODE_RECTANGLE:
			return new ShapeRectangle(startX, startY, endX, endY);
		case TYPECODE_OVAL:
			return new ShapeOval(startX, startY, endX, endY);
		default:
			throw new IllegalArgumentException("typeCode= "+ typeCode);
		}
	}
	
	protected Shape(int startX, int startY, int endX, int endY) {
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
	}

	public abstract int getTypeCode();
	
	public abstract String getName();

	public abstract void draw();
	
	@Override
	public String toString() {
		return String.format("[%-10s, (%3s, %3s) - (%3s, %3s)]", getName(), startX, startY, endX, endY);
	}
}

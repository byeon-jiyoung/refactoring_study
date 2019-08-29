package refactoring_study.introduce_null_object;

public class Label {
	private final String label;

	public Label(String label) {
		this.label = label;
	}
	
	public void display() {
		System.out.println("display: " + label);
	}
	
	public String toString() {
		return "\"" + label + "\"";
	}
	
	public boolean isNull() {
		return false;
	}
	
	public static Label newNull() {
		return new NullLabel();
	}
	
	private static class NullLabel extends Label {
		private static final NullLabel instance = new NullLabel(); //ΩÃ±€≈Ê
		
		public static NullLabel getInstance() {
			return instance;
		}
		
		private NullLabel() {
			super("(none)");
		}
		
		@Override
		public boolean isNull() {
			return true;
		}
		
		@Override
		public void display() {}
	} //end of NullLabel
}//end of Label

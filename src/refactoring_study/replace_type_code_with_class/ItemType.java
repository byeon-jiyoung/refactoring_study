package refactoring_study.replace_type_code_with_class;

public enum ItemType {
	BOOK(0), DVD(1), SOFTWARE(2);
	
	private final int typecode;

	private ItemType(int typeCode) {
		this.typecode = typeCode;
	}

	public int getTypecode() {
		return typecode;
	}
	
}
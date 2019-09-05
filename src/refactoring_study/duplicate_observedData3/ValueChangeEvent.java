package refactoring_study.duplicate_observedData3;

public class ValueChangeEvent {
	private final Value source;

	public ValueChangeEvent(Value source) {
		this.source = source;
	}

	public Value getSource() {
		return source;
	}
}

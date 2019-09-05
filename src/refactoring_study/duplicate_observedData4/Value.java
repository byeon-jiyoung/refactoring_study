package refactoring_study.duplicate_observedData4;

import java.util.ArrayList;
import java.util.List;

public class Value {
	private final List<ValueListener> listeners; // 이 관점에서만 보기 때문에 IntegerDisplay클래스에서 valueChanger함수만 본다!!!!!!!
	private int value;

	public Value(int value) {
		this.value = value;
		this.listeners = new ArrayList<>();
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		notifyToListener();
	}

	public void addValueListener(ValueListener listener) {
		this.listeners.add(listener);
	}

	private void notifyToListener() {
		for (ValueListener listener : listeners) {
			listener.valueChanger(new ValueChangeEvent(this));
		}
	}
}
package refactoring_study.replace_type_code_with_stateStrategy2;

public class StateStopped extends State {

	@Override
	public int getTypeCode() {
		return Logger.STATE_STOPPED;
	}

}

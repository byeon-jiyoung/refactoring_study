package refactoring_study.replace_type_code_with_stateStrategy3;

public abstract class State {
	public abstract void start(Logger logger);
	public abstract void stop(Logger logger);
	public abstract void log(String info);
}

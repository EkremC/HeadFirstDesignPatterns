package Chapter12_CompoundPatterns.combining;

public interface QuackObservable {
	public void registerObserver(Observer observer);

	public void notifyObservers();
}

package Chapter12_CompoundPatterns;

public interface QuackObservable {
	public void registerObserver(Observer observer);

	public void notifyObservers();
}

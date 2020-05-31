package Chapter06_TheCommandPattern.undo;

public interface Command {
    public void execute();

    public void undo();
}

package normalno;

public interface Command {
    public void apply();
    public int getState();
    public int getType();
}

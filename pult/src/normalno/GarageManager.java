package normalno;

public class GarageManager {
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }

    public void buttonPressedApply(){
        command.apply();
    }

    public int getState(){
        return command.getState();
    }

    public int getType(){
        return command.getType();
    }
}

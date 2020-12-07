package normalno;

public class GarageDoorDown implements Command{
    private GarageDoor door;
    private int type;
    public GarageDoorDown(GarageDoor door){
        this.door = door;
        type =1;
    }
    @Override
    public void apply(){
        door.down();
    }
    @Override
    public int getState(){
        return door.getState();
    }
    @Override
    public int getType(){
        return type;
    }
}


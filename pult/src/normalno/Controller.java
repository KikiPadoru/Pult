package normalno;

public class Controller {
    MyFrame frame;
    MyPanel panel;
    GarageManager gm;
    GarageLight light;
    GarageDoor door;

    //light
    GarageLightOn lightOn;
    GarageLightOff lightOff;

    //door
    GarageDoorUp doorUp;
    GarageDoorDown doorDown;

    public Controller() {
        panel = new MyPanel();
        panel.setController(this);
        frame = new MyFrame();
        frame.setPanel(panel);
        gm = new GarageManager();

        light = new GarageLight();
        light.addObserver(panel);
        lightOn = new GarageLightOn(light);
        lightOff = new GarageLightOff(light);

        door = new GarageDoor();
        door.addObserver(panel);
        doorUp = new GarageDoorUp(door);
        doorDown = new GarageDoorDown(door);


    }

    public void setGarageDoorUp(){
        this.gm.setCommand(doorUp);
    }

    public void setGarageDoorDown(){
        this.gm.setCommand(doorDown);
    }

    public void setGarageLightOn(){
        this.gm.setCommand(lightOn);
    }

    public void setGarageLightOff(){
        this.gm.setCommand(lightOff);
    }

    public void apply(){
        this.gm.buttonPressedApply();
    }

    public int getState(){
        return this.gm.getState();
    }

    public int getType(){
        return gm.getType();
    }
}

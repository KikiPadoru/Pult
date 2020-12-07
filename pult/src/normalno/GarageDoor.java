package normalno;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
public class GarageDoor extends Observable {
    private int state;
    public GarageDoor(){
        state = 0;
    }
    public void up(){
        state =1;
        setChanged();
        notifyObservers();
    }
    public void down(){
        state =0;
        setChanged();
        notifyObservers();
    }
    public int getState() {
        return state;
    }
}

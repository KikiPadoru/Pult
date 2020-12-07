package normalno;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
public class GarageLight extends Observable {
    private int state;
    public GarageLight(){
        state = 0;
    }
    public void on(){
        state =1;
        setChanged();
        notifyObservers();
    }
    public void off(){
        state =0;
        setChanged();
        notifyObservers();
    }
    public int getState() {
        return state;
    }
}

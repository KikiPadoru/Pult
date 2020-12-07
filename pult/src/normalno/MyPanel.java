package normalno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class MyPanel extends JPanel implements Observer {
    Controller controller;
    JButton doorUpButton;
    JButton doorDownButton;
    JButton lightOnButton;
    JButton lightOffButton;

    JButton light;
    JButton door;

    JButton actionButton;

    public MyPanel(){
        doorUpButton = new JButton("Открыть Дверь");
        doorDownButton = new JButton("Закрыть Дверь");

        lightOnButton = new JButton("Вкл лампу");
        lightOffButton = new JButton("Выкл лампу");

        actionButton = new JButton("Apply");

        light = new JButton("Лампа");
        light.setBackground(Color.DARK_GRAY);
        door = new JButton("Дверь");
        door.setBackground(Color.RED);

        doorUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.setGarageDoorUp();
            }
        });
        doorDownButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.setGarageDoorDown();
            }
        });

        lightOnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.setGarageLightOn();
            }
        });

        lightOffButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.setGarageLightOff();
            }
        });

        actionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.apply();
            }
        });

        add(doorUpButton);
        add(doorDownButton);
        add(lightOnButton);
        add(lightOffButton);
        add(actionButton);
        add(light);
        add(door);
    }


    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (controller.getType() == 1){
            if (controller.getState() == 1) {
                door.setBackground(Color.GREEN);
                door.setText("Открыта дверь");
            }
            else {
                door.setBackground(Color.RED);
                door.setText("Закрыта дверь");
            }
        }
        else {
            if (controller.getState() == 1) {
                light.setBackground(Color.YELLOW);
                light.setText("Вкл лампа");
            }
            else {
                light.setBackground(Color.DARK_GRAY);
                light.setText("Выкл лампа");
            }
        }
    }
}


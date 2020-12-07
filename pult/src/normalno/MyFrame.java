package normalno;

import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel panel;
    Toolkit toolkit= Toolkit.getDefaultToolkit();
    Dimension dimension= toolkit.getScreenSize();
    public MyFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(dimension.width/2-500,dimension.height/2-175,1000, 350);
        setTitle("Garage");
        setVisible(true);
    }

    public void setPanel(MyPanel panel) {
        this.panel = panel;
        add(panel);
    }
}


package lesson23_slider;
import java.awt.*;
import javax.swing.*;

public class Lesson23_Krug_Slider extends JPanel {
    private int diametr = 10;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillOval(10,10,diametr,diametr);
    }

    public void setDiametr (int newDiametr){
        diametr = (newDiametr >=0 ? newDiametr : 10);
        repaint();

    }
    public Dimension getPreferredSize(){
        return new Dimension(400, 400);

    }
    public Dimension getMinimumSize(){
        return getPreferredSize();
    }
}

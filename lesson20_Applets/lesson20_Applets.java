package lesson20_Applets;

import java.awt.*;
import javax.swing.*;

public class lesson20_Applets  extends JApplet {
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("Это апплет!!!", 1, 50);
        //задание
        g.setColor(Color.BLUE);
        g.fillRect(0, 100, 200, 100);
    }

}

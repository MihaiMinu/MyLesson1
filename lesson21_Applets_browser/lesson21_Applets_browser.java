package lesson21_Applets_browser;

import javax.swing.*;
import java.awt.*;

public class lesson21_Applets_browser extends JApplet {

    public void paint(Graphics g){
        super.paint(g);
        g.drawString("Это апплет!!!", 1, 50);
        //задание
        g.setColor(Color.BLUE);
        g.fillRect(0, 100, 200, 100);
        g.setColor(Color.BLACK);
        g.fillRect(0, 150, 250, 100);
        g.setColor(Color.CYAN);
        g.fillRect(0, 200, 300, 100);
    }

}

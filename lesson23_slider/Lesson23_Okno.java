package lesson23_slider;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Lesson23_Okno extends JFrame{
    private JSlider slider;
    private Lesson23_Krug_Slider myPanel;

    Lesson23_Okno(){
        super("Slider");
        myPanel = new Lesson23_Krug_Slider();
        myPanel.setBackground(Color.GREEN);
        slider = new JSlider(SwingConstants.HORIZONTAL,0,200,10);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        myPanel.setDiametr(slider.getValue());
                    }
                }
        );
        add(slider,BorderLayout.SOUTH);
        add(myPanel,BorderLayout.CENTER);
    }
}

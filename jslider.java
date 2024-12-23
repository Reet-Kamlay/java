import javax.swing.*;
import java.awt.*;
public class jslider {
    public static void main(String [] args){
        JFrame j=new JFrame("JSlider");
        j.setBounds(100,100,700,500);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        Container c=j.getContentPane();
        c.setLayout(null);
        JSlider s=new JSlider();
        s.setBounds(100,100,500,50);
        c.add(s);
        s.setPaintLabels(true);
        s.setPaintTicks(true);

        s.setMajorTickSpacing(50);
        s.setMinorTickSpacing(5);
        
        j.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;
public class Boxlayout {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("Box Layout");
        f.setBounds(300,200,500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c=f.getContentPane();
        BoxLayout bl=new BoxLayout(c,BoxLayout.Y_AXIS);
        c.setLayout(bl);

        JButton b1=new JButton("Button 1-----");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("Button 3");
        JButton b4=new JButton("Button 4-----");
        JButton b5=new JButton("Button 5");

        b1.setAlignmentX(Component.RIGHT_ALIGNMENT);
        b2.setAlignmentX(Component.RIGHT_ALIGNMENT);
        b3.setAlignmentX(Component.RIGHT_ALIGNMENT);
        b4.setAlignmentX(Component.RIGHT_ALIGNMENT);
        b5.setAlignmentX(Component.RIGHT_ALIGNMENT);
        c.add(b1);
        c.add(Box.createRigidArea(new Dimension(0,20)));
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        f.setVisible(true);
    }
}

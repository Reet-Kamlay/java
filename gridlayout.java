import javax.swing.*;
import java.awt.*;
public class gridlayout {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("Grid Layout");
        f.setBounds(300,200,500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c=f.getContentPane();
        GridLayout gl=new GridLayout(3,2,10,10);
        c.setLayout(gl);

        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("Button 3");
        JButton b4=new JButton("Button 4");
        JButton b5=new JButton("Button 5");
        JButton b6=new JButton("Button 6");

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        f.setVisible(true);
    }
}

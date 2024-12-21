import javax.swing.*;
import java.awt.*;
public class Jpanel {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("JPanel");
        f.setBounds(100,100,500,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c=f.getContentPane();
        c.setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setBounds(0,0,200,200);
        p1.setBackground(Color.RED);
        p1.setLayout(null);
        c.add(p1);
        JPanel p2=new JPanel();
        p2.setBounds(0,0,100,100);
        p2.setBackground(Color.GREEN);
        c.add(p2);
        p1.add(p2);
        JButton b1=new JButton("Button 1");
        p2.add(b1);
        
        
        
        
        f.setVisible(true);
    }
}

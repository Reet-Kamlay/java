import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLayeredPane;

public class JLayeredpaneexample extends JFrame{
    public JLayeredpaneexample(){
        JLayeredPane lp = this.getLayeredPane();
        setBounds(100,100,700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton b1 = new JButton("Button 1");
        b1.setBackground(Color.RED);
        b1.setBounds(50,50,100,100);
        JButton b2 = new JButton("Button 2");
        b2.setBackground(Color.GREEN);
        b2.setBounds(100,100,100,100);
        JButton b3 = new JButton("Button 3");
        b3.setBackground(Color.BLUE);
        b3.setBounds(150,150,100,100);
        lp.add(b1,new Integer(10));
        lp.add(b2,new Integer(20));
        lp.add(b3,new Integer(30));
    }
    public static void main(String[] args) {
        JLayeredpaneexample layer=new JLayeredpaneexample();
        layer.setBounds(100,100,700,500);
        layer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layer.setVisible(true);
    }
}

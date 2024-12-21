import java.awt.*;
import javax.swing.*;

public class borderlayout {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("Border Layout");
        f.setBounds(300,200,500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c=f.getContentPane();
        BorderLayout bl=new BorderLayout();
        bl.setHgap(10);
        bl.setVgap(5);
        c.setLayout(bl);

        JButton b1=new JButton("PAGE_START");
        JButton b2=new JButton("PAGE_END");
        JButton b3=new JButton("LINE_START");
        JButton b4=new JButton("CENTER");
        JButton b5=new JButton("LINE_END");

        c.add(b1,BorderLayout.PAGE_START);
        c.add(b2,BorderLayout.PAGE_END);
        c.add(b3,BorderLayout.LINE_START);
        c.add(b4,BorderLayout.CENTER);
        c.add(b5,BorderLayout.LINE_END);
        f.setVisible(true);
    }
}

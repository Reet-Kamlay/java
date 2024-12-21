import java.awt.*;
import javax.swing.*;

public class borderlayout2 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Border Layout");
        f.setSize(700,500);
        f.setLocation(100,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        Container c=f.getContentPane();
        c.setLayout(null);

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
    }
}

import javax.swing.*;
import java.awt.*;

public class Mytappedpane {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("JTabbedPane");
        f.setBounds(100,100,500,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c=f.getContentPane();
        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(50,50,400,300);
        c.add(tp);
        
        JPanel p1=new JPanel();
        p1.setBackground(Color.RED);
        tp.add("Tab 1",p1);
        JPanel p2=new JPanel();
        p2.setBackground(Color.GREEN);
        tp.add("Tab 2",p2);
        JPanel p3=new JPanel();
        p3.setBackground(Color.BLUE);
        tp.add("Tab 3",p3);
        
        f.setVisible(true);
    }
}

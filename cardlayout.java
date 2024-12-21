import java.awt.*;

import javax.swing.*;

public class cardlayout {
    public static void main(String [] args){
        JFrame frame=new JFrame();
        frame.setTitle("Card Layout");
        frame.setBounds(300,200,500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=frame.getContentPane();
        CardLayout cl=new CardLayout();
        c.setLayout(cl);
        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("Button 3");
        JButton b4=new JButton("Button 4");
        JButton b5=new JButton("Button 5");
        c.add(b1 ,"1");
        c.add(b2 ,"2");
        c.add(b3 ,"3");
        c.add(b4 ,"4");
        c.add(b5 ,"5");
        cl.last(c);
        cl.first(c);
        cl.next(c);
        cl.previous(c);
        cl.show(c, "2");
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;


public class Jscrollpane {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("JScrollPane");
        f.setBounds(100,100,500,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c=f.getContentPane();
        FlowLayout fl=new FlowLayout();
        c.setLayout(fl);

        JTextArea ta=new JTextArea(20,20);
        JScrollPane sp=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        c.add(sp);
        f.setVisible(true);       
        
        
        
        f.setVisible(true);
    }
}

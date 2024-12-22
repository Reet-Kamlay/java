import javax.swing.*;
import java.awt.*;

public class Jseperator {
    public static void main(String[]  args){
        JFrame j=new JFrame("JSeperator");
        j.setBounds(100,100,700,500);
        
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cn=j.getContentPane();
        cn.setLayout(null);
        JPanel c=new JPanel();
        c.setLayout(new GridLayout(0,1));
        c.setBounds(50, 50, 600, 400);
        c.add(new JLabel("My First Label"));
        c.add(new JSeparator());

        c.add(new JLabel("My Second Label"));
        cn.add(c);
        j.setVisible(true);
        }
}

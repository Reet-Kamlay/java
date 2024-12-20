import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ActionDemo3 {
    public static Container c;
    public static void main(String[] args) {
        JFrame frame=new JFrame("Action Demo 3");
        frame.setBounds(100, 100, 700, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c=frame.getContentPane();
        c.setLayout(null);

        JButton red=new JButton("Red");
        JButton Yellow =new JButton("Yellow");
        JButton Green = new JButton("Green");
        
        red.addActionListener(new RedCLass());
        Yellow.addActionListener(new YellowCLass());
        Green.addActionListener(new GreenClass());
        red.setBounds(100, 100, 100, 50);
        Green.setBounds(250, 100, 100, 50);
        Yellow.setBounds(400, 100, 100, 50);
        c.add(Green);
        c.add(red);
        c.add(Yellow);
    }
    
}
class RedCLass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        ActionDemo3.c.setBackground(Color.RED);
    }
}
class YellowCLass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        ActionDemo3.c.setBackground(Color.YELLOW);
    }
}
class GreenClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        ActionDemo3.c.setBackground(Color.GREEN);
    }
}

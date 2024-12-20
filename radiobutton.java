import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class radiobutton {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=frame.getContentPane();
        c.setLayout(null);

        JRadioButton radio1=new JRadioButton("Male");
        radio1.setBounds(100,50,100,20);
        c.add(radio1);
        JRadioButton radio2=new JRadioButton("Female");
        radio1.setBounds(200, 50, 100, 20);
        c.add(radio2);

        Font font=new Font("Arial",Font.BOLD,16);
        radio1.setFont(font);
        radio2.setFont(font);

        ButtonGroup gender = new ButtonGroup();
        gender.add(radio1);
        gender.add(radio2);
    }
}

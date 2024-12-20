import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class mytextarea {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("Text Area");
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=frame.getContentPane();
        c.setLayout(null);

        c.setBackground(Color.YELLOW);

        JTextArea txt=new JTextArea();
        txt.setBounds(100,100,400,200);
        c.add(txt);

        txt.setText("This is a text area");
        txt.setFont(new Font("Arial",Font.PLAIN,30));
        txt.setLineWrap(true);
        frame.setVisible(true);
    }
}

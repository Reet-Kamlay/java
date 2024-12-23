import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class jcolorchooser {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JColorChooser");
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        Container  c = frame.getContentPane();
        c.setLayout(new GridBagLayout());
        JButton b = new JButton("Color Chooser");
        c.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color c = JColorChooser.showDialog(null, "Color Chooser", Color.RED);
                frame.getContentPane().setBackground(c);
            }
        });
    }
}

import java.io.File;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class jfilechooser {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFileChooser");
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel c = new JPanel();
        JButton b1 = new JButton("Open");
        JButton b2 = new JButton("Save");
        c.add(b1);
        c.add(b2);
        frame.add(c);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                int i = fc.showOpenDialog(null);
                if (i == JFileChooser.APPROVE_OPTION) {
                    File f = fc.getSelectedFile();
                    String path = f.getAbsolutePath();
                    System.out.println(path);
                }
            }
        });
        frame.setVisible(true);
    }
}

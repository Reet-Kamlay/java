import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdvanceSwingComponents {
        public static void main(String[] args){
            JFrame f=new JFrame();
            f.setTitle("Advance Swing Components");
            f.setBounds(100,100,500,400);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            Container c=f.getContentPane();
            FlowLayout fl=new FlowLayout();
            c.setLayout(fl);

            JButton b1=new JButton("Button 1");
            c.add(b1);
            b1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(c, "This is a plain message", "Plain", JOptionPane.PLAIN_MESSAGE);

                }
            });
            JButton b2=new JButton("Button 2");
            c.add(b2);
            b2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(c, "This is an information message", "Information", JOptionPane.INFORMATION_MESSAGE);

                }
            });
            JButton b3=new JButton("Button 3");
            c.add(b3);
            b3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(c, "This is a warning message", "Warning", JOptionPane.WARNING_MESSAGE);

                }
            });
            JButton b4=new JButton("Button 4");
            c.add(b4);
            b4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(c, "This is an error message", "Error", JOptionPane.ERROR_MESSAGE);

                }
            });
            JButton b5=new JButton("Button 5");
            c.add(b5);
            b5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(c, "This is a question message", "Question", JOptionPane.QUESTION_MESSAGE);

                }
            });
            f.setVisible(true);
        }
}

import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

public class glasspane {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel p = new JPanel();
        JLabel label=new JLabel("Glasspane Example");
        JButton clickme=new JButton("Click Me");
        JButton showbtn=new JButton("Show");

        p.add(label);
        p.add(clickme);
        p.add(showbtn);
        frame.add(p);
        frame.setVisible(true);
        clickme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                label.setVisible(!label.isVisible());;
            }
        });
        frame.setGlassPane(new JComponent(){
            public void paintComponent(Graphics g){
                g.setColor(Color.RED);
                g.fillRect(0,0,getWidth(),getHeight());
            }
        });
        final  Container glassPane=(Container)frame.getGlassPane();
        glassPane.setLayout(new GridBagLayout());
        JButton hidebtn=new JButton("Hide");

        glassPane.add(hidebtn);
        showbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                glassPane.setVisible(true);
            }
        });
        hidebtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                glassPane.setVisible(false);
            }
        });
    }
}

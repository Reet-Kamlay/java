import javax.swing.*;
import java.awt.*;
public class gridbaglayout {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("Grid Bag Layout");
        f.setBounds(300,200,500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c=f.getContentPane();
        GridBagLayout gbl=new GridBagLayout();
        c.setLayout(gbl);

        GridBagConstraints gbc=new GridBagConstraints();
        gbc.fill=GridBagConstraints.HORIZONTAL;
        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("Button 3");
        JButton b4=new JButton("Button 4");
        JButton b5=new JButton("Button 5");
        JButton b6=new JButton("Button 6");
        // gbc.weightx=0.5;
        gbc.gridx=0;
        gbc.gridy=0;
        c.add(b1,gbc);

        gbc.weightx=0;
        gbc.gridx=1;
        gbc.gridy=0;
        c.add(b2,gbc);

        gbc.gridx=2;
        gbc.gridy=0;
        c.add(b3,gbc);

        gbc.gridwidth=3;
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.ipady=40;
        c.add(b4,gbc);

        gbc.gridwidth=2;
        gbc.ipady=0;
        gbc.gridx=1;
        gbc.gridy=2;
        gbc.anchor=GridBagConstraints.PAGE_END;
        gbc.weighty=1;
        c.add(b5,gbc);

        

        f.pack();
        f.setVisible(true);
    }
}

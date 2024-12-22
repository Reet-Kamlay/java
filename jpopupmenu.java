import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class jpopupmenu {
    public static void main(String[] args){
        JFrame j=new JFrame("JPopup Menu");
        j.setBounds(100,100,700,500);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=j.getContentPane();
        c.setLayout(new FlowLayout());
        JPopupMenu p=new JPopupMenu();
        JMenuItem i1=new JMenuItem("Item 1");
        JMenuItem i2=new JMenuItem("Item 2");
        JMenuItem i3=new JMenuItem("Item 3");
        p.add(i1);
        p.add(i2);
        p.add(i3);
        c.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                if(e.getButton()==MouseEvent.BUTTON3){
                    p.show(c,e.getX(),e.getY());
                }
                
            }
        });
       i1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.RED);
            }
        });

        i2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.YELLOW);
            }
        });

        i3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.GREEN);
            }
        });
    }
}

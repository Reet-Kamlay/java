import java.awt.Point;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

public class jviewport {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JViewport");
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        ImageIcon icon = new ImageIcon("pexels-pixabay-209841.jpg");
        JLabel label = new JLabel(icon);
        JScrollPane sp = new JScrollPane(label);
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        frame.add(sp);
        
        JViewport vp = sp.getViewport();
        JPanel  pane= new JPanel();
        JButton b1 = new JButton("Move up");
        JButton b2 = new JButton("Move down");
        JButton b3 = new JButton("Move left");
        JButton b4 = new JButton("Move right");
        pane.add(b1);
        pane.add(b2);
        pane.add(b3);
        pane.add(b4);
        frame.add(pane,BorderLayout.NORTH);
        sp.setViewportBorder(BorderFactory.createLineBorder(Color.RED));
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Point p = vp.getViewPosition();
                Point newpoint=new Point(p.x,p.y-100);
                vp.setViewPosition(newpoint);
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Point p = vp.getViewPosition();
                Point newpoint=new Point(p.x,p.y+100);
                vp.setViewPosition(newpoint);
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Point p = vp.getViewPosition();
                Point newpoint=new Point(p.x-100,p.y);
                vp.setViewPosition(newpoint);
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Point p = vp.getViewPosition();
                Point newpoint=new Point(p.x+100,p.y);
                vp.setViewPosition(newpoint);
            }
        });
        frame.setVisible(true);
        };
        
    }
    


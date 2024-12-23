import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JWind extends JFrame{
        public JWind(){
            welcomeScreeen();
            setBounds(100,100,700,500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            setSize(300,200);
            JLabel l = new JLabel("Welcome to java swing");
            l.setHorizontalAlignment(SwingConstants.CENTER);
            add(l); 
        }
    public static void main(String[] args) {
        new JWind();
    }

    private void welcomeScreeen(){
        final JWindow w = new JWindow(this);
        w.setBounds(100,100,700,500);
        
        JPanel p = new JPanel();
        p.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        w.add(p);

        JProgressBar pb = new JProgressBar(0,100);
        w.add(BorderLayout.PAGE_END,pb);
        t = new Timer(100,new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int value = pb.getValue();
                if(value == 100){
                    w.dispose();
                    JWind.this.setVisible(true);
                    t.stop();
                }
                pb.setValue(value+1);
            }
            
        });
        w.setVisible(true);
        
        t.start();
    }
    Timer t;
}
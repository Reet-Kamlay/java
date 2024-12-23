import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.*;

public class JListex extends JFrame {
    public JListex(){
        setBounds(100,100,700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        String[] str={"one","two","three","four","five","six","seven","eight","nine","ten"};
        JList l = new JList(str);
        JPanel p = new JPanel();
        p.add(new JScrollPane(l));
        add(p);
        JLabel label = new JLabel();
        add(label,BorderLayout.PAGE_END);
        setVisible(true);
        l.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount() == 2){
                    label.setText(l.getSelectedValue().toString());
                }
            }
        });
    }
    public static void main(String[] args) {
        new JListex();
    }

}

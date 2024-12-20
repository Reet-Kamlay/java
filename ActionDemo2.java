import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ActionDemo2 {
    public static void main(String[] args) {
        JFrame j=new JFrame("Action Demo 2");
        j.setBounds(100,100,700,500);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=j.getContentPane();
        c.setLayout(null);

        JButton btn=new JButton("Click Me");
        btn.setBounds(100,100,100,50);
        c.add(btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                c.setBackground(Color.RED);
            }
        });
    }
}

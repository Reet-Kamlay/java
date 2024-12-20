import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Mycombobox {
    public static void main(String[] args) {
        JFrame  frame=new JFrame();
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c=frame.getContentPane();
        c.setLayout(null);

        String [] values={"A","B","C","D"};
        
        JComboBox c1=new JComboBox(values);
        c1.setBounds(100, 100, 100, 30);
        c.add(c1);

        JButton btn=new JButton("Ok");
        btn.setBounds(100, 300, 100, 30);
        c.add(btn);

        JLabel label=new JLabel("");
        label.setBounds(100, 300, 100, 30);
        c.add(label);
        label.setFont(new Font("Arial",Font.BOLD,30));

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String item=(String)c1.getSelectedItem();
                label.setText(item);
            }            
        });
        frame.setVisible(true);
    }
}

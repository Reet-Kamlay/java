import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mydialog {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("Dialog Box");
        f.setBounds(300,200,500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c=f.getContentPane();
        FlowLayout fl=new FlowLayout();
        c.setLayout(fl);
        JButton b1=new JButton("Click Me");
        c.add(b1);
        
        f.setVisible(true);
        
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String str=JOptionPane.showInputDialog("Enter your name");
                if(str.length()>0){
                    System.out.println("The name of the user "+str);
                }
            }
        });
    }
}

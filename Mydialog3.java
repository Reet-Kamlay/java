
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mydialog3 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("My Dialog");
        f.setBounds(300,200,500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container  c=f.getContentPane();
        FlowLayout fl=new FlowLayout();
        c.setLayout(fl);
        JButton b1=new JButton("Click Me");
        c.add(b1);
        f.setVisible(true);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int str=JOptionPane.showConfirmDialog(f, "Do you want to close the window","Confirm",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(str==JOptionPane.YES_OPTION){
                    System.out.println("Yes is clicked");
                    System.exit(0);
                    
                }
                if(str==JOptionPane.NO_OPTION){
                    System.out.println("No is clicked");
                }
                if(str==JOptionPane.CANCEL_OPTION){
                    System.out.println("Cancel is clicked");
                }
            }
        });
    }
}

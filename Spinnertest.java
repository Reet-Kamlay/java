import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Spinnertest {
    public static void main(String[] args){
        JFrame j=new JFrame();
        j.setBounds(100,100,700,500);
        
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=j.getContentPane();
        c.setLayout(null);
        String str=String.valueOf(java.time.Year.now());
        int y=Integer.parseInt(str);
        SpinnerNumberModel model1=new SpinnerNumberModel(1,1,31,1);
        SpinnerNumberModel model2=new SpinnerNumberModel(y,y-100,y,1);
        SpinnerListModel model3=new SpinnerListModel(new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"});
        JSpinner s1=new JSpinner(model1);
        s1.setBounds(100,100,100,50);
        c.add(s1);
        JSpinner s2=new JSpinner(model3);
        s2.setBounds(250,100,100,50);
        c.add(s2);
        JSpinner s3=new JSpinner(model2);
        s3.setBounds(400,100,100,50);
        c.add(s3);
        JLabel l1=new JLabel();
        l1.setBounds(100,200,100,50);
        c.add(l1);
        ChangeListener listener = new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                l1.setText(s1.getValue() + " " + s2.getValue() + " " + s3.getValue());
            }
        };

        s1.addChangeListener(listener);
        s2.addChangeListener(listener);
        s3.addChangeListener(listener);
        j.setVisible(true);
    }
    
}

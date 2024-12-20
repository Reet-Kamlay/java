import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MyFrame extends JFrame{
    JTextArea ta;
    JRadioButton r1,r2;
    ButtonGroup bg;
    MyFrame(){
        setTitle("Item Listener");
        setBounds(100,100,700,500);
        setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);
        r1=new JRadioButton("male");
        r2=new JRadioButton("Female");
        r1.setBounds(100,100,100,50);
        r2.setBounds(250,100,100,50);
        c.add(r1);
        c.add(r2);
        bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        ta=new JTextArea();
        ta.setBounds(10, 200, 500, 200);
        c.add(ta);
        r1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                ta.setText("Male");
            }
            }) ;
        r2.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                ta.setText("Female");
            }
            }) ;
        setVisible(true);
}
}
public class itemlistener2 {
    public static void main(String[] args) {
        MyFrame frame=new MyFrame();        

    }
}

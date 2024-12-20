import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements FocusListener{
    JTextArea ta;
    JTextField tf;
    MyFrame(){
        setTitle("Focus Listener");
        setBounds(100,100,700,500);
        setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);
        tf=new JTextField();
        tf.setBounds(10, 100, 200, 50);
        c.add(tf);
        tf.addFocusListener(this);
        ta=new JTextArea();
        ta.setBounds(10, 200, 500, 200);
        c.add(ta);
        setVisible(true);
    }
    public void focusGained(FocusEvent e){
        ta.setText(ta.getText()+"\n"+"Focus Gained");
    }
    public void focusLost(FocusEvent e){
        ta.setText(ta.getText()+"\n"+"Focus Lost");
    }
}
public class focuslistener {
    public static void main(String[] args) {
        MyFrame frame=new MyFrame();        

    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
class MyFrame extends JFrame implements CaretListener{
    JTextArea ta;
    JTextField tf;
    MyFrame(){
        setTitle("Caret Listener");
        setBounds(100,100,700,500);
        setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);
        tf=new JTextField();
        tf.setBounds(10, 100, 200, 50);
        c.add(tf);
        tf.addCaretListener(this);
        ta=new JTextArea();
        ta.setBounds(10, 200, 500, 200);
        c.add(ta);
        setVisible(true);
    }
    public void caretUpdate(CaretEvent e){
        ta.setText(ta.getText()+"\n"+"Caret Position: "+e.getDot()+":"+e.getMark());
    }
}
public class caretlistener {
    public static void main(String[] args) {
        MyFrame frame=new MyFrame();        

    }
}

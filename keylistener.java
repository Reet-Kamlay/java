
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements KeyListener{
    JTextArea ta;
    MyFrame(){
        setTitle("Key Listener");
        setBounds(100,100,700,500);
        setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);
        ta=new JTextArea();
        ta.setBounds(10, 200, 500, 200);
        c.add(ta);
        ta.addKeyListener(this);
        setVisible(true);
    }
    public void keyPressed(KeyEvent e){
        ta.setText(ta.getText()+"\n"+"Key Pressed: "+e.getKeyChar());
    }
    public void keyReleased(KeyEvent e){
        ta.setText(ta.getText()+"\n"+"Key Released: "+e.getKeyChar());
    }
    public void keyTyped(KeyEvent e){
        ta.setText(ta.getText()+"\n"+"Key Typed: "+e.getKeyChar());
    }
}

public class keylistener {
    public static void main(String[] args) {
        MyFrame frame=new MyFrame();        

    }
}

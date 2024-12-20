import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements MouseMotionListener{
    JTextArea ta;
    JLabel lb;
    MyFrame(){
        setTitle("Mouse Motion Listener");
        setBounds(100,100,700,500);
        setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);
        lb=new JLabel("My Label");
        lb.setBounds(10, 10, 100, 50);
        c.add(lb);
        lb.addMouseMotionListener(this);
        ta=new JTextArea();
        ta.setBounds(10, 200, 500, 200);
        c.add(ta);
        setVisible(true);
    }
    public void mouseDragged(MouseEvent e){
        ta.setText(ta.getText()+"\n"+"Mouse Dragged at: "+e.getX()+","+e.getY());
    }
    public void mouseMoved(MouseEvent e){
        ta.setText(ta.getText()+"\n"+"Mouse Moved at: "+e.getX()+","+e.getY());
    }
}
public class mousemotionlistener {
    public static void main(String[] args) {
        MyFrame frame=new MyFrame();        

    }
}

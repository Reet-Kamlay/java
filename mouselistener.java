
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements MouseListener{
    JTextArea ta;
    JLabel lb;
    MyFrame(){
        setTitle("Mouse Listener");
        setBounds(100,100,700,500);
        setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);
        lb=new JLabel("My Label");
        lb.setBounds(10, 10, 100, 50);
        c.add(lb);
        ta=new JTextArea();
        ta.setBounds(10, 200, 500, 200);
        c.add(ta);
        lb.addMouseListener(this);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        ta.setText(ta.getText()+"\n"+"Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e){
        ta.setText(ta.getText()+"\n"+"Mouse Entered");
    }
    public void mouseExited(MouseEvent e){
        ta.setText(ta.getText()+"\n"+"Mouse Exited");
    }
    public void mousePressed(MouseEvent e){
        ta.setText(ta.getText()+"\n"+"Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e){
        ta.setText(ta.getText()+"\n"+"Mouse Released");
    }
}
public class mouselistener {
    public static void main(String[] args) {
        MyFrame frame=new MyFrame();        

    }
}

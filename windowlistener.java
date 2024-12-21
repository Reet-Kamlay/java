import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements WindowListener{
    MyFrame(){
        setTitle("Window Listener");
        setBounds(100,100,700,500);
        setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);
        addWindowListener(this);
        setVisible(true);
    }
    public void windowActivated(WindowEvent e){
        System.out.println("Window Activated");
    }
    public void windowClosed(WindowEvent e){
        System.out.println("Window Closed");
    }
    public void windowClosing(WindowEvent e){
        System.out.println("Window Closing");
    }
    public void windowDeactivated(WindowEvent e){
        System.out.println("Window Deactivated");
    }
    public void windowDeiconified(WindowEvent e){
        System.out.println("Window Deiconified");
    }
    public void windowIconified(WindowEvent e){
        System.out.println("Window Iconified");
    }
    public void windowOpened(WindowEvent e){
        System.out.println("Window Opened");
    }
}
public class windowlistener {
    public static void main(String[] args) {
        MyFrame frame=new MyFrame();        

    }
}

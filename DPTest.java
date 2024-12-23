import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.*;
import javax.swing.JDesktopPane;
public class DPTest{
class MyFrame extends JFrame{
    MyFrame(){
        setBounds(100,100,700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JDesktopPane dp =new JDesktopPane();
        display(dp);
        add(dp,BorderLayout.CENTER);
        setVisible(true);
    }
}
    public static void main(String[] args) {
        new DPTest().new MyFrame();
        
    }
    public void display(JDesktopPane dp){
        JInternalFrame f1=new JInternalFrame("Frame 1",true,true,true,true);
        f1.setBounds(50,50,300,200);
        f1.setVisible(true);
        dp.add(f1);
        
        JInternalFrame f2=new JInternalFrame("Frame 2",true,true,true,true);
        f2.setBounds(100,100,300,200);
        f2.setVisible(true);
        dp.add(f2);
        
        JInternalFrame f3=new JInternalFrame("Frame 3",true,true,true,true);
        f3.setBounds(150,150,300,200);
        f3.setVisible(true);
        dp.add(f3);
    }
}
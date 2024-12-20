import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ItemListener{
    JMenu menu;
    JMenuBar menubar;
    JCheckBoxMenuItem c1;
    JTextArea ta;
    MyFrame(){
        setTitle("Menu Bar");
        setBounds(100,100,700,500);
        setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);
        menubar = new JMenuBar();
        menu=new JMenu("File");
        c1=new JCheckBoxMenuItem("Print");
        menu.add(c1);
        menubar.add(menu);
        this.setJMenuBar(menubar);
        ta=new JTextArea();
        ta.setBounds(10, 10, 500, 370);
        c.add(ta);
        c1.addItemListener(this);
        setVisible(true);

}
public void itemStateChanged(ItemEvent e){
    if(c1.getState()){
        ta.setText("Print is on");
    }
    else{
        ta.setText("Print is off");
    }
}
}
public class jboxmenuitem {
    public static void main(String[] args) {
        MyFrame frame=new MyFrame();        

    }
}

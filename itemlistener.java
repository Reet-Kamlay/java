import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame{
    JComboBox combo;
    JTextArea ta;

    MyFrame(){
        setTitle("Item Listener");
        setBounds(100,100,700,500);
        setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);
        String country[]={"India","USA","UK","Canada","Australia"};
        combo=new JComboBox(country);
        combo.setBounds(100,100,100,50);
        c.add(combo);
        ta=new JTextArea();
        ta.setBounds(10, 200, 500, 200);
        c.add(ta);
        combo.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                ta.setText("Selected Item: "+combo.getSelectedItem());
            }
        });
        setVisible(true);
    }
}
public class itemlistener {
    
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
    }
}

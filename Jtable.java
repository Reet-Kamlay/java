
import javax.swing.*;
import java.awt.*;
public class Jtable {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("JTable");
        f.setBounds(100,100,500,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c=f.getContentPane();
        c.setLayout(new FlowLayout());
        
        String data[][]={{"1","A","B","C"},
                         {"2","D","E","F"},
                         {"3","G","H","I"},
                         {"4","J","K","L"}};
        String column[]={"ID","Name","Address","Phone"};
        JTable jt=new JTable(data,column);
        c.add(jt);
        
        f.setVisible(true);
    }
}

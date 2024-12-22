import javax.swing.*;
import java.awt.*;


public class splitpane {
    public static void main(String[] args){
        JFrame f=new JFrame();
        f.setTitle("Split Pane");
        f.setBounds(100,100,500,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=f.getContentPane();
        JSplitPane split=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        split.setTopComponent(b1);
        split.setBottomComponent(b2);
        split.setDividerSize(10);
        split.setDividerLocation(100);
        split.setOneTouchExpandable(true);
        c.add(split);
        f.setVisible(true);
        }
}

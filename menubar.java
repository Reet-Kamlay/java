import java.awt.MenuBar;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class menubar {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Menuber Example");
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menubar=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenuItem m1=new JMenuItem("New");
        JMenuItem m2=new JMenuItem("Open");
        JMenuItem m3=new JMenuItem("Save");
        file.add(m1);
        file.add(m2);
        file.add(m3);
        menubar.add(file);
        frame.setJMenuBar(menubar);
        frame.setVisible(true);
    }
}

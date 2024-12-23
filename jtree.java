import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.*;
import java.awt.*;

public class jtree {
    public static void main(String[] args){
        JFrame frame = new JFrame("JTree");
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode A = new DefaultMutableTreeNode("A");
        DefaultMutableTreeNode B = new DefaultMutableTreeNode("B");
        DefaultMutableTreeNode A1 = new DefaultMutableTreeNode("A1");
        DefaultMutableTreeNode A2 = new DefaultMutableTreeNode("A2");
        DefaultMutableTreeNode B1 = new DefaultMutableTreeNode("B1");
        DefaultMutableTreeNode B2 = new DefaultMutableTreeNode("B2");
        DefaultMutableTreeNode B3 = new DefaultMutableTreeNode("B3");
        JTree  tree = new JTree(root);
        root.add(A);
        root.add(B);
        A.add(A1);
        A.add(A2);
        B.add(B1);
        B.add(B2);
        B.add(B3);
        frame.add(tree);
        frame.setVisible(true);

    }
}

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.*;
import java.awt.*;

public class JTextpan extends JFrame{
    public JTextpan(){
        setBounds(100,100,700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JTextPane tp = new JTextPane();
        tp.setText("Welcome");
        SimpleAttributeSet sas = new SimpleAttributeSet();
        StyleConstants.setBold(sas,true);
        Document doc = tp.getStyledDocument();
        try{
            doc.insertString(doc.getLength(),"to java swing",sas);
        }catch(BadLocationException e){

        }
        add(tp);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JTextpan();
    }
}

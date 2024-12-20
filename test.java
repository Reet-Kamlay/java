import javax.swing.*;
import java.awt.*;
class test{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(700,500);
        // frame.setLocation(100,50);
        frame.setBounds(100, 100, 1000, 500);
        frame.setTitle("My Frame");

        ImageIcon icon=new ImageIcon("pexels-pixabay-209841.jpg");
        frame.setIconImage(icon.getImage());
        Container c = frame.getContentPane();
        // c.setBackground(Color.RED);
        // frame.setResizable(false);
        c.setLayout(null);

        // JLabel label=new JLabel("Username");
        // label.setBounds(100, 50, 200, 30);
        // Font font=new Font("Arial",Font.PLAIN,30);
        // label.setFont(font);
        // c.add(label);

        // ImageIcon icon1 =new ImageIcon("pexels-pixabay-209841.jpg");
        // JLabel label =new JLabel(icon);
        // label.setBounds(100,50,200,200);
        // c.add(label);

        // ImageIcon icon1=new ImageIcon("pexels-pixabay-209841.jpg");
        // JLabel label=new JLabel("Text",icon1,JLabel.RIGHT);
        // label.setBounds(0, 100, 500, 100);
        // c.add(label);
        

        // JTextField t1=new JTextField();
        // t1.setBounds(100,50,120,30);
        // c.add(t1);
        // t1.setText("Reet Kamlay");

        // Font font=new Font("Arial",Font.BOLD,25);
        // t1.setFont(font);
        // t1.setForeground(Color.GREEN);
        // t1.setBackground(Color.YELLOW);
        // t1.setEditable(false);

        JPasswordField pass=new JPasswordField();
        pass.setBounds(100, 50, 120, 30);
        c.add(pass);
        pass.setText("123456");
        pass.setFont(new Font("Arial",Font.BOLD,30));
        frame.setVisible(true);
        pass.setForeground(Color.GREEN);
        pass.setBackground(Color.YELLOW);
        pass.setEchoChar('*');
        pass.setEchoChar((char)0);

        JButton btn=new JButton("Click Me");
        btn.setSize(120,30);
        btn.setLocation(100,100);
        c.add(btn);
        btn.setForeground(Color.RED);
        btn.setBackground(Color.YELLOW);

        Cursor cur=new Cursor(Cursor.WAIT_CURSOR);
        btn.setCursor(cur);
        btn.setEnabled(false);
        btn.setVisible(false);
    }
}
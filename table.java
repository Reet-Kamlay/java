import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

public class table {
    public static void main(String[] args){
        JFrame frame = new JFrame();   
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        frame.setTitle("My Frame");

        Object[] [] data={{101,"Ram",21},{ 102,"Shyam",22},{103,"Seeta",23},{ 104,"Geeta",24},{105,"Reeta",25}};
        Object[] col={"Roll","Name","Age"};

        DefaultTableModel model=new DefaultTableModel(data,col);
        JTable table=new JTable(model);

        Container c=frame.getContentPane();
        c.setLayout(new GridLayout(3,1));
        JPanel panel=new JPanel();
        c.add(new JScrollPane(table));
        c.add(new JPanel());
        c.add(panel);

        JTextField t1=new JTextField();
        JTextField t2=new JTextField();
        JTextField t3=new JTextField();
        JButton btn=new JButton("Add");
        JButton btn1=new JButton("Update");
        JButton btn2=new JButton("Delete");

        panel.setLayout(new GridLayout(3,3));
        panel.add(new JLabel("Roll No"));
        panel.add(t1);
        panel.add(btn); 
        panel.add(new JLabel("Name"));
        panel.add(t2);
        panel.add(btn1);
        panel.add(new JLabel("Age"));
        panel.add(t3);
        panel.add(btn2);
        frame.setVisible(true);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")){
                    JOptionPane.showMessageDialog(frame,"Please fill all the fields","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                int roll=Integer.parseInt(t1.getText().toString());
                String name=t2.getText().toString();
                int age=Integer.parseInt(t3.getText().toString());
                Object[] row={roll,name,age};
                model.addRow(row);
            }
        });
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                int rowindex=table.getSelectedRow();
                int rollno=(int)model.getValueAt(rowindex,0);
                String name=(String)model.getValueAt(rowindex,1);
                int age=(int)model.getValueAt(rowindex,2);

                t1.setText(String.valueOf(rollno));
                t2.setText(name);
                t3.setText(String.valueOf(age));
            }
        });
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int rowindex=table.getSelectedRow();
                if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")){
                    JOptionPane.showMessageDialog(frame,"Please fill all the fields","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                int roll=Integer.parseInt(t1.getText().toString());
                String name=t2.getText().toString();
                int age=Integer.parseInt(t3.getText().toString());
                model.setValueAt(roll,rowindex,0);
                model.setValueAt(name,rowindex,1);
                model.setValueAt(age,rowindex,2);
            }
        });
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int rowindex=table.getSelectedRow();
                if(rowindex==-1){
                    JOptionPane.showMessageDialog(frame,"Please select a row","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                model.removeRow(rowindex);
            }
        });
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}

package GUI_Programm;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnitConverter extends JFrame {
    private JPanel panel;
    private JTextField t1;
    private JTextField t2;
    private JList list1;
    private JList list2;
    private JButton b1;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;

    public void Components(){
        panel.setLayout(null);
        t1.setBounds(50,50,100,30);
        t2.setBounds(300,50,100,30);
        b1.setBounds(230,300,100,40);
        panel.add(t1);
        panel.add(t2);


        t1=new JTextField(10);
        t2=new JTextField(10);

        String[]unit1={"mm","cm","meter","km","feet"};
        comboBox1=new JComboBox(unit1);
        comboBox1.setBounds(160,50,70,30);
        comboBox1.setEditable(true);
        panel.add(comboBox1);

        String[]unit2={"mm","cm","meter","km","feet"};
        comboBox2=new JComboBox(unit2);
        comboBox2.setBounds(410,50,70,30);
        comboBox2.setEditable(true);
        panel.add(comboBox2);

        panel.add(b1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public UnitConverter(){
        Components();
        setContentPane(panel);
        setSize(600,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[]args){
        UnitConverter unit=new UnitConverter();
    }
}
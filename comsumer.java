package com.aliyun.mns.sample.Queue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class comsumer extends JFrame implements ActionListener{
    private JTextField f2;
    private JButton comButton;
    private JPanel buttonPanel;
    public comsumer(){
        this.setTitle("Buttontext");
        this.setSize(200,200);
        this.setBackground(Color.white);
        //this.setVisible(true);

        f2 = new JTextField();
        f2.setBounds(25,50,150,30);

        this.add(f2);

        comButton = new JButton("接收");
        comButton.setBounds(100,250,50,20);
        comButton.addActionListener(this);

        buttonPanel = new JPanel();
        buttonPanel.add(comButton);

        this.add(buttonPanel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if(source==comButton) {
            ComsumerDemo c = new ComsumerDemo();
            f2.setText(c.GetMassageBody().substring(17));
        }
    }

    public static void main(String[] args)
    {
        comsumer p = new comsumer();
        DeleteQueueDemo d = new DeleteQueueDemo();
    }
}


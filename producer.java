package com.aliyun.mns.sample.Queue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class producer extends JFrame implements ActionListener{
    private JTextField f1;
    private JButton sendButton;
    private JPanel buttonPanel;
    public producer(){
        this.setTitle("Buttontext");
        this.setSize(200,200);
        this.setBackground(Color.white);
        //this.setVisible(true);
        f1 = new JTextField();
        f1.setBounds(25,50,150,30);

        this.add(f1);

        sendButton = new JButton("发送");
        sendButton.setBounds(100,300,50,20);
        sendButton.addActionListener(this);

        buttonPanel = new JPanel();
        buttonPanel.add(sendButton);

        this.add(buttonPanel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if(source==sendButton) {
            CreateQueueDemo c = new CreateQueueDemo();
            ListQueueDemo l = new ListQueueDemo();
            String text = f1.getText();
            System.out.println(text);
            ProducerDemo p = new ProducerDemo(text);
        }
    }

    public static void main(String[] args)
    {
        producer p = new producer();
    }
}


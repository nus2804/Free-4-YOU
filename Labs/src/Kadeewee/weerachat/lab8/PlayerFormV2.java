package kadeewee.weerachat.lab8;

/**
 * This program is PlayerFormV2
 * Show a window, titled "Player Form V2"
 * This program displays results similar to PlayerFormV1.
 * This program provides a panel for storing your player type and note.
 * Class PlayerFormV2 which inherited from PlayerFormV1.
 * Author: Weerachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: March 19, 2021
 **/

import javax.swing.*;
import java.awt.*;

public class PlayerFormV2 extends PlayerFormV1 {
    protected String[] txtComboBox;
    protected JComboBox playerBox;
    protected JTextArea noteTxt;
    protected JPanel playerPanel, notePanel, contentsPanel3;
    protected JLabel playerLabel, noteLabel;
    protected JScrollPane scrollPane;
    //ประกาศตัวแปร
    public PlayerFormV2(String title) {
        super(title);
    }//กำหนดชื่อของหน้าต่าง(Title)
    protected void initComponents() {
        super.initComponents(); //เรียกใช้เมธอด initComponents() จากคลาส super หรือก็คือคลาส PlayerFormV1
        txtComboBox = new String[]{"Beginner", "Amateur", "Professional"};
        //เพิ่มค่าในอาเรย์ txtComboBox เพื่อเป็นตัวเลือกใน playerBox
        playerPanel = new JPanel();
        contentsPanel3 = new JPanel();
        notePanel = new JPanel();
        //ประกาศส่วนเริ่มของ Panel
        noteTxt = new JTextArea(3, 35); //กำหนดขนาดของ noteTxt
        playerLabel = new JLabel("Player Type:");
        noteLabel = new JLabel("Note:");
        //กำหนดข้อความ(Label)
        scrollPane = new JScrollPane(noteTxt); //เพิ่ม noteTxt เข้าไปใน scrollPane เพื่อให้มี scroll Pane ใน Text Area
        playerBox = new JComboBox(txtComboBox); //เพิ่ม txtComboBox เข้าไปใน playerBox เพื่อเป็นตัวเลือกใน Combo Box
    }//กำหนดส่วนเริ่มของตัวแปรแต่ละตัว
    protected void addComponents() {
        super.addComponents();//เรียกใช้เมธอด addComponents() จากคลาส super หรือก็คือคลาส PlayerFormV1
        playerBox.setSelectedItem("Amateur");
        playerPanel.setLayout(layout);
        playerPanel.add(playerLabel);
        playerPanel.add(playerBox);
        //เพิ่มองค์ประกอบใน genderPanel
        noteTxt.setLineWrap(true); //เว้นบรรทัด
        noteTxt.setWrapStyleWord(true); //ไม่ตัดกลางคำ
        noteTxt.setText("A game is a structured form of play, usually undertaken for " +
                "entertainment or fun, and sometimes used as an educational tool.");
        //เพิ่มข้อความใน noteTxt ที่เป็น Text Area
        contentsPanel3.setLayout(new BorderLayout());
        contentsPanel3.add(noteLabel, BorderLayout.NORTH);
        contentsPanel3.add(scrollPane, BorderLayout.CENTER);
        contentsPanel3.add(buttonsPanel, BorderLayout.SOUTH);
        //เพิ่มองค์ประกอบใน contentPanel3
        contentsPanel2.setLayout(new BorderLayout());
        contentsPanel2.add(genderPanel, BorderLayout.NORTH);
        contentsPanel2.add(playerPanel, BorderLayout.CENTER);
        //เพิ่มองค์ประกอบใน contentPanel2
        mainPanel.add(contentsPanel, BorderLayout.NORTH);
        mainPanel.add(contentsPanel2, BorderLayout.CENTER);
        mainPanel.add(contentsPanel3, BorderLayout.SOUTH);
        ////เพิ่มองค์ประกอบใน mainPanel
    }//เพิ่มส่วนประกอบต่างๆ

    public static void createAndShowGUI() {
        PlayerFormV2 msw = new PlayerFormV2("Player Form V2");//กำหนดชื่อให้ PlayerFormV2 และส่งค่า title ไปยังเมธอด PlayerFormV2
        msw.addComponents();//เรียกใช้เมธอด addComponents
        msw.setFrameFeatures();//เรียกใช้เมธอด setFrameFeatures() ที่ extends มาจาก superClass
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }//ใช้สำหรับ Run โปรแกรม
}

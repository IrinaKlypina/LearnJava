package converter;

import javax.swing.JFrame;

public class JFrameApp extends JFrame {
    public JFrameApp(){
        setBounds(100, 100, 650, 210);
        setTitle("Converter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JPanelApp());
        setVisible(true);
    }
}

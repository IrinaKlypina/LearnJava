package calculator;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JPanelApp extends JPanel{
    JTextField txt1 = null;
    int res = 0;
    String op = "";
    boolean start = false;
    
    public JPanelApp(){
        try{
            setLayout(null);
            txt1 = new JTextField();
            txt1.setBounds(10, 10, 235, 25);
            
            JButton b0 = new JButton("0");
            b0.setBounds(10, 270, 75, 50);
            
            JButton b1 = new JButton("1");
            b1.setBounds(10, 190, 50, 50);
            
            JButton b2 = new JButton("2");
            b2.setBounds(60, 190, 50, 50);
            
            JButton b3 = new JButton("3");
            b3.setBounds(110, 190, 50, 50);
            
            JButton b4 = new JButton("4");
            b4.setBounds(10, 110, 50, 50);
            
            JButton b5 = new JButton("5");
            b5.setBounds(60, 110, 50, 50);
            
            JButton b6 = new JButton("6");
            b6.setBounds(110, 110, 50, 50);
            
            JButton b7 = new JButton("7");
            b7.setBounds(10, 40, 50, 50);
            
            JButton b8 = new JButton("8");
            b8.setBounds(60, 40, 50, 50);
            
            JButton b9 = new JButton("9");
            b9.setBounds(110, 40, 50, 50);
            
            JButton bRes = new JButton("=");
            bRes.setBounds(85, 270, 75, 50);
            Font bigFont = new Font("serif", Font.BOLD, 22);
            bRes.setFont(bigFont);
            
            JButton bPlus = new JButton("+");
            bPlus.setBounds(170, 40, 75, 50);
            Font bigFontPlus = new Font("serif", Font.BOLD, 22);
            bPlus.setFont(bigFontPlus);
            
            JButton bMinus = new JButton("-");
            bMinus.setBounds(170, 110, 75, 50);
            Font bigFontMinus = new Font("serif", Font.BOLD, 22);
            bMinus.setFont(bigFontMinus);
            
            JButton bMulti = new JButton("*");
            bMulti.setBounds(170, 190, 75, 50);
            Font bigFontMulti = new Font("serif", Font.BOLD, 22);
            bMulti.setFont(bigFontMulti);
            
            JButton bDivision = new JButton("/");
            bDivision.setBounds(170, 270, 75, 50);
            Font bigFontDivision = new Font("serif", Font.BOLD, 22);
            bDivision.setFont(bigFontDivision);
            
            add(txt1);
            add(b0);
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(b9);
            add(bRes);
            add(bPlus);
            add(bMinus);
            add(bMulti);
            add(bDivision);
            
            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    if(start || txt1.getText().equals("0")){
                        txt1.setText("1");
                        start = false;
                    }else{
                     txt1.setText(txt1.getText() + 1);   
                    }             
                }
            });
            
            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    if(start || txt1.getText().equals("0")){
                        txt1.setText("2");
                        start = false;
                    }else{
                     txt1.setText(txt1.getText() + 2);   
                    }
                }
            });
            
            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    if(start || txt1.getText().equals("0")){
                        txt1.setText("3");
                        start = false;
                    }else{
                     txt1.setText(txt1.getText() + 3);   
                    }
                }
            });
            
            b4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    if(start || txt1.getText().equals("0")){
                        txt1.setText("4");
                        start = false;
                    }else{
                     txt1.setText(txt1.getText() + 4);   
                    }
                }
            });
            
            b5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    if(start || txt1.getText().equals("0")){
                        txt1.setText("5");
                        start = false;
                    }else{
                     txt1.setText(txt1.getText() + 5);   
                    }
                }
            });
            
            b6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    if(start || txt1.getText().equals("0")){
                        txt1.setText("6");
                        start = false;
                    }else{
                     txt1.setText(txt1.getText() + 6);   
                    }
                }
            });
            
            b7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    if(start || txt1.getText().equals("0")){
                        txt1.setText("7");
                        start = false;
                    }else{
                     txt1.setText(txt1.getText() + 7);   
                    }
                }
            });
            
            b8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    if(start || txt1.getText().equals("0")){
                        txt1.setText("8");
                        start = false;
                    }else{
                     txt1.setText(txt1.getText() + 8);   
                    }
                }
            });
            
            b9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    if(start || txt1.getText().equals("0")){
                        txt1.setText("9");
                        start = false;
                    }else{
                     txt1.setText(txt1.getText() + 9);   
                    }
                }
            });
            
            b0.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    if(start || txt1.getText().equals("0")){
                        txt1.setText("0");
                        start = false;
                    }else{
                     txt1.setText(txt1.getText() + 0);   
                    }
                }
            });
            
            bPlus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    res = Integer.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "+";
                }
            });
            
            bMinus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    res = Integer.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "-";
                }
            });
            
            bMulti.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    res = Integer.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "*";
                }
            });
            
            bDivision.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    res = Integer.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "/";
                }
            });
            
            bRes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    
                    MetodCalc mc = new MetodCalc();
                    String strRes = String.valueOf(mc.calc(res, op, Integer.valueOf(txt1.getText())));
                    txt1.setText(strRes);
                    start = true;
                }
            });
        }catch(ArithmeticException exception){
            System.out.println(exception.getMessage());
        }
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Calculator {
    private JPanel Calculator;
    private JTextField textDisplay;
    private JButton xButton;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton ACButton;
    private JButton button6;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton button10;
    private JButton button11;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton button16;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button20;
    double num1 =0, num2 = 0, result = 0;
    String opcao ="";

    public Calculator() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText("");
                num1 = 0;
                num2 = 0;
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a3Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a0Button.getText());
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + button10.getText());
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textDisplay.getText().contains(".")){
                    double pm = Double.parseDouble(textDisplay.getText());
                    pm = pm*-1;
                    textDisplay.setText(String.valueOf(pm));

                }else{
                    long PM = Long.parseLong(textDisplay.getText());
                    PM = PM*-1;
                    textDisplay.setText(String.valueOf(PM));
                }
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textDisplay.getText().contains(".")){
                    textDisplay.setText(textDisplay.getText() + button20.getText());
                }
            }
        });

        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textDisplay.getText());
                opcao = "+";
                textDisplay.setText("");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textDisplay.getText());
                opcao = "-";
                textDisplay.setText("");
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textDisplay.getText());
                opcao = "x";
                textDisplay.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textDisplay.getText());
                opcao = "/";
                textDisplay.setText("");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if(textDisplay.getText().length() > 0){
                    StringBuilder strB = new StringBuilder(textDisplay.getText());
                    strB.deleteCharAt(textDisplay.getText().length() - 1);
                    backspace = String.valueOf(strB);
                    textDisplay.setText(backspace);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(textDisplay.getText());
                switch (opcao){
                    case "+":
                        result = num1 + num2;
                        textDisplay.setText(String.valueOf(result));
                        break;
                    case "-":
                        result = num1 - num2;
                        textDisplay.setText(String.valueOf(result));
                        break;
                    case "/":
                        if (num2 == 0){
                            textDisplay.setText("Nao e possivel dividir por 0.");
                        }else {
                            result = num1/num2;
                            textDisplay.setText(String.valueOf(result));
                        }
                        break;
                    case "x":
                        result = num1 * num2;
                        textDisplay.setText(String.valueOf(result));
                        break;
                    default:
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}

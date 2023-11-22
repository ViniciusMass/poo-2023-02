import javax.swing.*;
import java.awt.event.*;

public class Calculadora {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        JLabel labelNum1 = new JLabel("Numero 1:");
        labelNum1.setBounds(20, 20, 80, 25);
        panel.add(labelNum1);

        JTextField textNum1 = new JTextField(10);
        textNum1.setBounds(100, 20, 165, 25);
        panel.add(textNum1);

        JLabel labelNum2 = new JLabel("Numero 2:");
        labelNum2.setBounds(20, 50, 80, 25);
        panel.add(labelNum2);

        JTextField textNum2 = new JTextField(10);
        textNum2.setBounds(100, 50, 165, 25);
        panel.add(textNum2);

        JButton somaButton = new JButton("+");
        somaButton.setBounds(100, 80, 45, 25);
        panel.add(somaButton);
        JButton diferencaButton = new JButton("-");
        diferencaButton.setBounds(160, 80, 45, 25);
        panel.add(diferencaButton);
        JButton multiplicaButton = new JButton("*");
        multiplicaButton.setBounds(220, 80, 45, 25);
        panel.add(multiplicaButton);
        JButton divideButton = new JButton("/");
        divideButton.setBounds(280, 80, 45, 25);
        panel.add(divideButton);

        JLabel resultadoLabel = new JLabel("");
        resultadoLabel.setBounds(20, 110, 250, 25);
        panel.add(resultadoLabel);

        somaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textNum1.getText());
                    double num2 = Double.parseDouble(textNum2.getText());
                    resultadoLabel.setText("A soma é: " + (num1 + num2));
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira números válidos.");
                }
            }
        });
        diferencaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textNum1.getText());
                    double num2 = Double.parseDouble(textNum2.getText());
                    resultadoLabel.setText("A diferença é: " + (num1 - num2));
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira números válidos.");
                }
            }
        });
        multiplicaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textNum1.getText());
                    double num2 = Double.parseDouble(textNum2.getText());
                    resultadoLabel.setText("O produto é: " + (num1 * num2));
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira números válidos.");
                }
            }
        });
        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textNum1.getText());
                    double num2 = Double.parseDouble(textNum2.getText());
                    resultadoLabel.setText("O quociente é: " + (num1 / num2));
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira números válidos.");
                }
            }
        });

        frame.setVisible(true);
    }
}
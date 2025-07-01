import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TransactionPanel extends JPanel {
    public TransactionPanel(Account account) {
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel depositLabel = new JLabel("Deposit Amount:");
        JTextField depositField = new JTextField();

        JLabel withdrawLabel = new JLabel("Withdraw Amount:");
        JTextField withdrawField = new JTextField();

        JButton depositBtn = new JButton("Deposit");
        JButton withdrawBtn = new JButton("Withdraw");

        JLabel balanceLabel = new JLabel("Current Balance: $" + account.getBalance());

        depositBtn.addActionListener(e -> {
            try {
                double amt = Double.parseDouble(depositField.getText());
                account.deposit(amt);
                balanceLabel.setText("Current Balance: $" + account.getBalance());
                JOptionPane.showMessageDialog(this, "Deposited: $" + amt);
                depositField.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input");
            }
        });

        withdrawBtn.addActionListener(e -> {
            try {
                double amt = Double.parseDouble(withdrawField.getText());
                account.withdraw(amt);
                balanceLabel.setText("Current Balance: $" + account.getBalance());
                JOptionPane.showMessageDialog(this, "Attempted Withdraw: $" + amt);
                withdrawField.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input");
            }
        });

        add(depositLabel); add(depositField);
        add(withdrawLabel); add(withdrawField);
        add(depositBtn); add(withdrawBtn);
        add(balanceLabel);
    }
}

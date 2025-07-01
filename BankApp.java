import javax.swing.*;

public class BankApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            String name = JOptionPane.showInputDialog("Enter account holder name:");
            String numStr = JOptionPane.showInputDialog("Enter account number:");
            int number = Integer.parseInt(numStr);

            Account account = new Account(name, number);
            MainFrame frame = new MainFrame(account);
            frame.setVisible(true);
        });
    }
}

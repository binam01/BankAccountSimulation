import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(Account account) {
        setTitle("Bank Account Simulation");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JTabbedPane tabs = new JTabbedPane();
        tabs.add("Transactions", new TransactionPanel(account));
        tabs.add("History", new HistoryPanel(account));

        add(tabs, BorderLayout.CENTER);
    }
}

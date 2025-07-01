import javax.swing.*;
import java.awt.*;

public class HistoryPanel extends JPanel {
    public HistoryPanel(Account account) {
        setLayout(new BorderLayout());
        JTextArea area = new JTextArea();
        area.setEditable(false);

        for (String line : account.getHistory()) {
            area.append(line + "\n");
        }

        add(new JScrollPane(area), BorderLayout.CENTER);
    }
}

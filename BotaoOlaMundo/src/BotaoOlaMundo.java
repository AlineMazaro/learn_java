import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoOlaMundo {
    private JButton cliqueAquiButton;
    private JPanel panel1;

    public BotaoOlaMundo() {
        cliqueAquiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Ola Mundo");

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("OlaMundo");
        frame.setContentPane(new BotaoOlaMundo() .panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

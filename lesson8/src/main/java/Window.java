import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Window extends JFrame {

    public Window(){

        setTitle("Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds( 300, 300, 340, 400);

        JTextField messageField = new JTextField();
        messageField.setBounds(20, 20, 280, 60);

        JButton sendButton = new JButton("Send message");
        sendButton.setBounds(20, 85, 280, 20);

        JTextArea chatField = new JTextArea();
        chatField.setBounds(20, 110, 280, 220);

        sendButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (messageField.getText().length() != 0) {
                    chatField.setText(chatField.getText() + "\n" + messageField.getText());
                    messageField.setText("");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        setLayout(null);
        add(messageField);
        add(sendButton);
        add(chatField);

        setVisible(true);
    }
}

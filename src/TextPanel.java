import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel{
    private JTextArea textPanel;

    public TextPanel(){
        textPanel = new JTextArea();
        setLayout(new BorderLayout());

        add(textPanel);
    }

    public void appendText(String text){
        textPanel.append(text);
    }
}

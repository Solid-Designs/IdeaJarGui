import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class TextPanel extends JPanel{
    private JTextArea textPanel;

    public TextPanel(){
        textPanel = new JTextArea();
        setLayout(new BorderLayout());

        setBackground(Color.darkGray);
        Dimension dim = new Dimension(350, 100);
        setPreferredSize(dim);

        Border outsideBorder = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white),"Output");
        ((TitledBorder) outsideBorder).setTitleColor(Color.white);
        Border insideBorder = BorderFactory.createEmptyBorder(10,10,10,10);
        setBorder(BorderFactory.createCompoundBorder(outsideBorder, insideBorder));

        add(textPanel);
    }

    public void appendText(String text){
        textPanel.append(text);
    }

    public void clearText(){
        textPanel.setText(null);
    }
}

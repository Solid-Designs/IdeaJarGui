import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/*
This program is the idea jar program gui.
---
First, have an add button that will add text fields (Optional).
Then, it will create an array list of text fields (Optional).
Then, you will be able to put text into some text fields. (DONE)
Then, you can press the randomize button. (DONE)
Then, it will take the information and place it into another array list. (DONE)
Then, it will be randomized and you will receive something to do. (DONE)
Finally, you will be prompted asking whether or not you would like to try again. (Optional)
 */

public class MainFrame extends JFrame{
    private InputPanel inputPanel;
    private ControlPanel controlPanel;
    private TextPanel textPanel;

    public MainFrame(){
        super("Chris & Stephanie's Idea Jar - Version 1.0");

        inputPanel = new InputPanel();
        controlPanel = new ControlPanel();
        textPanel = new TextPanel();
        setLayout(new GridBagLayout());
        Container c = getContentPane();
        GridBagConstraints gc = new GridBagConstraints();

        // Layout controls
        // ------------ FIRST ROW ------------
        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 1;
        gc.weighty = 0.1;
        add(inputPanel, gc);
        // ------------ SECOND ROW ------------
        gc.gridx = 0;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 0.3;
        add(controlPanel, gc);
        // ------------ THIRD ROW ------------
        gc.gridx = 0;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.weighty = 1;
        add(textPanel, gc);

        c.setBackground(Color.darkGray);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        /*
        Set the listener here.
        This takes the returned string from the input panel,
        and appends it to the text panel.
         */
        controlPanel.setListener(new Listener() {
            @Override
            public void randomize() {
                textPanel.clearText();
                textPanel.appendText(inputPanel.randomize());
            }
        });
    }
}

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/*
This program is the idea jar program gui.
---
First, have an add button that will add text fields (Optional).
Then, it will create an array list of text fields (Optional).
Then, you will be able to put text into some text fields.
Then, you can press the randomize button.
Then, it will take the information and place it into another array list.
Then, it will be randomized and you will receive something to do.
Finally, you will be prompted asking whether or not you would like to try again. (Optional)
 */

public class MainFrame extends JFrame{
    private InputPanel inputPanel;
    private ControlPanel controlPanel;

    public MainFrame(){
        super("Idea Jar");

        inputPanel = new InputPanel();
        controlPanel = new ControlPanel();
        setLayout(new BorderLayout());

        add(inputPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        // Set the listener here
        controlPanel.setListener(new Listener() {
            @Override
            public void randomize() {
                inputPanel.randomize();
            }
        });
    }
}

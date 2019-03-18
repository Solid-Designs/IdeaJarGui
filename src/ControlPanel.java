import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel implements ActionListener {
    private JButton randomizeButton;
    private Listener listener;
    private String result;

    public ControlPanel(){
        randomizeButton = new JButton("Randomize");
        setLayout(new FlowLayout());

        randomizeButton.addActionListener(this);

        add(randomizeButton);
    }

    // Set Listeners
    public void setListener(Listener listener){
        this.listener = listener;
    }

    public void actionPerformed(ActionEvent e){
        JButton clicked = (JButton)e.getSource();

        if(clicked == randomizeButton){
            if(listener != null){
                listener.randomize();
            }
        }
    }
}

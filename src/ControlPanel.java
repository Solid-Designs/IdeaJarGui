import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
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
        randomizeButton.setFocusPainted(false);
        randomizeButton.setBackground(Color.darkGray);
        randomizeButton.setForeground(Color.white);
        Border outsideBorder = new LineBorder(Color.white, -20);
        Border insideBorder = BorderFactory.createEmptyBorder(30,30,30,30);
        randomizeButton.setBorder(BorderFactory.createCompoundBorder(outsideBorder, insideBorder));

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

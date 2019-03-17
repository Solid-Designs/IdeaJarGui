import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class InputPanel extends JPanel{
    private JTextField itemOne;
    private JTextField itemTwo;
    private JTextField itemThree;
    private ArrayList<String> textFieldList = new ArrayList<>();

    public InputPanel(){
        itemOne = new JTextField(10);
        itemTwo = new JTextField(10);
        itemThree = new JTextField(10);
        setLayout(new FlowLayout(FlowLayout.CENTER));

        add(itemOne);
        add(itemTwo);
        add(itemThree);
    }

    public String randomize(){
        String result = "";

        // Add all the text field information to the array list
        textFieldList.add(itemOne.getText());
        textFieldList.add(itemTwo.getText());
        textFieldList.add(itemThree.getText());
        for(String i : textFieldList){
            System.out.println(i);
        }

        /*
        This method will randomize the text field results,
        then return a string.
        Use this string to print to the text area
         */

        return result;
    }
}

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

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

        Border outsideBorder = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white),"What do you want to do tonight?");
        ((TitledBorder) outsideBorder).setTitleColor(Color.white);
        Border insideBorder = BorderFactory.createEmptyBorder(15,15,15,15);
        setBorder(BorderFactory.createCompoundBorder(outsideBorder, insideBorder));

        setBackground(Color.darkGray);

        add(itemOne);
        add(itemTwo);
        add(itemThree);
    }

    public String randomize(){
        /*
        This method will randomize the text field results,
        then return a string.
        Use this string to print to the text area
         */
        String result = "";
        Random r = new Random();

        if(itemOne.getText().isEmpty() && itemTwo.getText().isEmpty() && itemThree.getText().isEmpty()){
            result = "You did not put anything into the text fields!\n";
        }else if(itemOne.getText().isEmpty()){
            result = "You did not put anything into the first box! \n";
        }else if(itemTwo.getText().isEmpty()){
            result = "You did not put anything into the second box! \n";
        }else if(itemThree.getText().isEmpty()){
            result = "You did not put anything into the third box! \n";
        }else{
            // Add all the text field information to the array list
            textFieldList.add(itemOne.getText());
            textFieldList.add(itemTwo.getText());
            textFieldList.add(itemThree.getText());

            result = "Tonight we are going to: \n" + textFieldList.get(r.nextInt(textFieldList.size())) + "\nHave fun! \n";
        }

        for(String i : textFieldList){
            System.out.println(i);
        }

        return result;
    }
}

import javax.swing.*;

public class snakeframe extends JFrame {
    //constructor
    snakeframe(){
        //initialising the panel
        this.add(new panel());
        this.setTitle("snake game");
        //ensuring that size of the frame can't be changed
        this.setResizable(false);
        this.pack();//sets the frame size depending on the panel
        this.setVisible(true);//it show the frame to the user it acts like this.show() function
        //spawning the frame in the center of the screen
        this.setLocationRelativeTo(null);
    }
}

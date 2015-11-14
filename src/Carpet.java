import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by evis on 15/06/06.
 */
public class Carpet extends JFrame {
    public Carpet(){
        int w=750, h=750;
        setTitle("Sierpinski Carpet");
        setSize(w, h);
        setResizable(true);
        setLocationRelativeTo(null);

        DrawCarpet draw = new DrawCarpet(w, h);
        add(draw);
        setVisible(true);
    }
    public static void main(String[] args){
        new Carpet();
    }
}
import javax.swing.*;
import java.awt.*;

/**
 * Created by evis on 15/06/06.
 */
public class DrawCarpet extends JPanel {
    int w, h;

    public DrawCarpet(int w, int h){
        this.w = w;
        this.h = h;
    }
    void recursiveDrawing(Graphics g, int x, int y, int r, int cnt){
        if(cnt > 5)
            return;
        g.setColor(Color.BLACK);
        g.fillRect(x, y, r, r);

        g.setColor(Color.WHITE);
        g.fillRect(x+r/3, y+r/3, r/3, r/3);

        recursiveDrawing(g, x, y, r/3, cnt+1);
        recursiveDrawing(g, x+r/3, y, r/3, cnt+1);
        recursiveDrawing(g, x+2*r/3, y, r/3, cnt+1);
        recursiveDrawing(g, x, y+r/3, r/3, cnt+1);
        recursiveDrawing(g, x, y+2*r/3, r/3, cnt+1);
        recursiveDrawing(g, x+2*r/3, y+r/3, r/3, cnt+1);
        recursiveDrawing(g, x+r/3, y+2*r/3, r/3, cnt+1);
        recursiveDrawing(g, x+2*r/3, y+2*r/3, r/3, cnt+1);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        recursiveDrawing(g, 0, 0, 729, 0);   //3^6
    }
}

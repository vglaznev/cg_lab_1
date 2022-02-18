import java.awt.*;

public class Scene2D extends Camera2D {

    public Scene2D() {
    }

    public void plot(Graphics g) {
        //drawGrid(g);
        drawAxes(g);
        lineTo(g,10,10);
        lineTo(g,10,0);
        lineTo(g, 0,0);
    }
}
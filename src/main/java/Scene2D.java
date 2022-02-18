import java.awt.*;

import static java.lang.Math.sin;
import static java.lang.Math.cos;

public class Scene2D extends Camera2D {

    public Scene2D() {
    }

    public static FunctionBehaviour example1() {
        return t -> new Point(20 * (Math.cos(t) + Math.cos(5 * t) / 5), 20 * (sin(t) - sin(5 * t) / 5));
    }

    public void plot(Graphics g) {
        //drawGrid(g);
        drawAxes(g);
        /*lineTo(g,10,10);
        lineTo(g,10,0);
        lineTo(g, 0,0);*/
        FunctionPlotter functionPlotter = new ParametricPlotter(Scene2D.example1(), 0, 2 * Math.PI);
        functionPlotter.plot(this, g);
    }
}
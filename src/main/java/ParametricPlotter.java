import java.awt.*;


public class ParametricPlotter extends FunctionPlotter{
    private double tLeft, tRight;

    public ParametricPlotter(FunctionBehaviour function, double tLeft, double tRight) {
        super(function);
        this.tLeft = tLeft;
        this.tRight = tRight;
    }

    @Override
    public void plot(Scene2D scene2D, Graphics g) {
        Point startPoint = function.getPoint(tLeft);
        Point currentPoint;
        scene2D.moveTo(startPoint.getX(), startPoint.getY());
        for(double t = tLeft; t < tRight; t += (tRight - tLeft) / scene2D.width){
            currentPoint = function.getPoint(t);
            scene2D.lineTo(g,currentPoint.getX(), currentPoint.getY());
        }
    }
}

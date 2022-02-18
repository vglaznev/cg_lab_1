import java.awt.*;

public abstract class FunctionPlotter {
    protected FunctionBehaviour function;

    public FunctionPlotter(FunctionBehaviour function) {
        this.function = function;
    }

    public abstract void plot(Scene2D scene2D, Graphics g);
}

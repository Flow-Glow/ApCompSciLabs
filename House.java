import gpdraw.*;

public class TurtleDrawing {
    public static void main(String[] args) {
        DrawingTool pen = new DrawingTool(new SketchPad(400, 400)); // Adjust the size as needed

        pen.turnRight(90);
        pen.forward(180);
        pen.turnLeft(90);
        pen.forward(180);
        pen.turnLeft(90);
        pen.forward(180);
        pen.turnLeft(90);
        pen.forward(180);

        pen.turnRight(135);
        pen.forward(120);
        pen.turnRight(85);
        pen.forward(130);
    }
}

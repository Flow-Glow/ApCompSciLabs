import gpdraw.*;

public class HouseDrawing {
    public static void main(String[] args) {
        // Create a GPDraw window
        SketchPad pad = new SketchPad(400, 400);
        DrawingTool pen = new DrawingTool(pad);

        // Draw the base of the house
        pen.drawRect(100, 200, 200, 150);

        // Draw the roof
        pen.drawLine(100, 200, 200, 100);
        pen.drawLine(200, 100, 300, 200);

        // Draw the door
        pen.drawRect(175, 250, 50, 100);

        // Draw windows
        pen.drawRect(125, 125, 50, 50);
        pen.drawRect(225, 125, 50, 50);

        // Close the GPDraw window when done
        pad.close();
    }
}


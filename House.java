import gpdraw.*;

public class House {
    private DrawingTool pen = new DrawingTool(new SketchPad(400, 400));
    private int sideLength = 100;

    public static void main(String[] args) {
        House house = new House();
        house.draw();
    }

    public void draw() {
        drawSquare();
        drawTriangle();
        drawDoor();
    }

    private void drawSquare() {
        pen.up();
        pen.move(-sideLength / 2, -sideLength / 2);
        pen.down();
        for (int i = 0; i < 4; i++) {
            pen.forward(sideLength);
            pen.turnRight(90);
        }
    }

    private void drawTriangle() {
        pen.up();
        pen.move(-sideLength / 2, sideLength / 2);
        pen.down();
        pen.turnRight(45);
        pen.forward(sideLength * Math.sqrt(2));
        pen.turnRight(90);
        pen.forward(sideLength * Math.sqrt(2));
        pen.turnRight(135);
    }

    private void drawDoor() {
        pen.up();
        pen.move(-sideLength / 4, -sideLength / 2);
        pen.down();
        pen.forward(sideLength / 2);
        pen.turnRight(90);
        pen.forward(sideLength * 0.6);
        pen.turnRight(90);
        pen.forward(sideLength / 2);
    }
}

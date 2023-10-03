import gpdraw.*;

public class House {
    private DrawingTool pen = new DrawingTool(new SketchPad(400, 400));
    private int length = 100;

    public static void main(String[] args) {
        House house = new House();
        house.draw();
    }

    public void draw() {
        drawBase();
        drawRoof();
        drawDoor();
        drawWindows();
    }

    private void drawBase() {
        pen.up();
        pen.move(0, 0);
        pen.down();
        pen.forward(length * 2); // Adjust the length to set the base width
        pen.turnRight(90);
        pen.forward(length * 1.5); // Adjust the length to set the base height
        pen.turnRight(90);
        pen.forward(length * 2);
        pen.turnRight(90);
        pen.forward(length * 1.5);
    }

    private void drawRoof() {
        pen.up();
        pen.move(0, length * 1.5);
        pen.down();
        pen.turnLeft(45);
        pen.forward(length * 2.12); // Adjust the length to set the roof diagonal
        pen.turnLeft(90);
        pen.forward(length * 2.12);
        pen.turnLeft(135);
    }

    private void drawDoor() {
        pen.up();
        pen.move(length * 0.75, 0);
        pen.down();
        pen.forward(length * 0.5); // Adjust the length to set the door width
        pen.turnRight(90);
        pen.forward(length);
        pen.turnRight(90);
        pen.forward(length * 0.5);
    }

    private void drawWindows() {
        // Draw windows on the sides of the house
        for (int i = 0; i < 2; i++) {
            pen.up();
            pen.move(length * 0.2 + i * length * 1.6, length * 0.5);
            pen.down();
            pen.drawRect(length * 0.6, length * 0.6); // Adjust the size of the windows
        }

        // Draw a window on the roof
        pen.up();
        pen.move(length * 0.75, length * 1.5);
        pen.down();
        pen.drawRect(length * 0.5, length * 0.5); // Adjust the size of the window
    }
}

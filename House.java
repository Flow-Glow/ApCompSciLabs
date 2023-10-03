import gpdraw.SketchPad;
import gpdraw.DrawingTool;

public class DrawHouse {
    public static void main(String[] args) {
        // Create a SketchPad object with a 500x500 drawing area
        SketchPad paper = new SketchPad(500, 500);

        // Create a DrawingTool object to draw on the SketchPad
        DrawingTool pen = new DrawingTool(paper);

        // Set the pen's initial position
        pen.up();
        pen.move(-50, -50); // Adjust the values to center the house horizontally
        pen.down();

        // Draw the house's body
        pen.drawRect(200, 200); // Adjust the values to control the size of the house

        // Draw the sloped roof
        pen.up();
        pen.move(0, 200); // Move to the top-left corner of the house
        pen.down();
        pen.drawLine(100, 100); // Draw the left side of the roof
        pen.drawLine(100, -100); // Draw the right side of the roof

        // Draw the door
        pen.up();
        pen.move(75, 0); // Move to the center of the house
        pen.down();
        pen.drawRect(50, 100); // Adjust the values to control the door's size

        // Draw windows (you can add more if needed)
        // Window 1
        pen.up();
        pen.move(25, 125); // Adjust the coordinates as needed
        pen.down();
        pen.drawRect(50, 50); // Adjust the size of the window

        // Window 2
        pen.up();
        pen.move(125, 125); // Adjust the coordinates as needed
        pen.down();
        pen.drawRect(50, 50); // Adjust the size of the window

        // Close the drawing window when done (optional)
        paper.close();
    }
}

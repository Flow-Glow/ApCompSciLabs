import gpdraw.*;

public class BenzeneRing {
    public static void main(String[] args) {
        DrawingTool pencil = new DrawingTool(new SketchPad(400, 400));
        
        // Define the radius of the circle and side length of the hexagon
        double circleRadius = 100;
        double hexagonSideLength = 200;
        
        // Calculate the distance from the center of the hexagon to a vertex
        double hexagonApothem = circleRadius * 2 / Math.sqrt(3);
        
        // Move to the starting position (top vertex of the hexagon)
        pencil.up();
        pencil.move(hexagonSideLength / 2, 0);
        pencil.down();
        pencil.turnLeft(30);
        pencil.move(hexagonApothem);
        pencil.turnLeft(60);
        
        // Draw the hexagon
        for (int i = 0; i < 6; i++) {
            pencil.forward(hexagonSideLength);
            pencil.turnLeft(60);
        }
        
        // Move to the center of the hexagon
        pencil.up();
        pencil.move(circleRadius, 0);
        pencil.down();
        
        // Draw the circle
        pencil.drawCircle(circleRadius);
        
        // Close the drawing window when done
        pencil.up();
        pencil.move(-200, -200); // Move to a position off-screen
    }
}


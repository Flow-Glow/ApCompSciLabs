/*
Ziv Landau
*/
import gpdraw.*;
public class Benzene{
    private DrawingTool pen = new DrawingTool(new SketchPad(400,400));
    private int length = 100;
   
    public static void main(String[] args){
        Benzene benzene = new Benzene();
        benzene.draw();
    }

    public void draw(){
        drawHexagon();
        drawCircle();
    }
    private void drawHexagon(){
        pen.up();
        pen.move(0, 100);
        pen.down();
        pen.turnRight(120);
        pen.forward(length);
        drawEdge();
        drawEdge();
        drawEdge();
        drawEdge();
        drawEdge();
    }
    
    private void drawCircle(){
        pen.up();
        pen.home();
        pen.down();
        pen.drawCircle(70);
    }
    
    private void drawEdge(){
        pen.turnRight(60);
        pen.forward(length);
    }
}

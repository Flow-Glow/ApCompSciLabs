import gpdraw.*;
public class house {
    public static void main(String[] args) {
        DrawingTool marker;
        SketchPad poster;
       
        poster = new SketchPad(500,500);
        marker = new DrawingTool(poster);
        marker.up();
        marker.move(-200,-200);
        marker.down();
        marker.move(-200,50);
        marker.move(0,200);
        marker.move(200,50);
        marker.move(200,-200);
        marker.move(-200,-200);
        marker.up();
        marker.move(-200,50);
        marker.down();
        marker.move(200,50);
        marker.up();
        marker.move(-50,-200);
        marker.down();
        marker.move(-50,-25);
        marker.move(50,-25);
        marker.move(50,-200);
        marker.move(-50,-200);
        marker.up();
        marker.move(43,-122);
        marker.down();
        marker.move(35,-122);
        marker.up();
        marker.move(-132,-50);
        marker.down();
        marker.move(-152,-50);
        marker.move(-152,-30);
        marker.move(-132,-30);
        marker.move(-132,-50);
        marker.move(-132,-70);
        marker.move(-152,-70);
        marker.move(-152,-50);
        marker.move(-112,-50);
        marker.move(-112,-30);
        marker.move(-132,-30);
        marker.move(-132,-70);
        marker.move(-112,-70);
        marker.move(-112,-50);
        marker.up();
        marker.move(132,-50);
        marker.down();
        marker.move(152,-50);
        marker.move(152,-30);
        marker.move(132,-30);
        marker.move(132,-50);
        marker.move(132,-70);
        marker.move(152,-70);
        marker.move(152,-50);
        marker.move(112,-50);
        marker.move(112,-30);
        marker.move(132,-30);
        marker.move(132,-70);
        marker.move(112,-70);
        marker.move(112,-50);
        marker.up();
       
    }
   
}

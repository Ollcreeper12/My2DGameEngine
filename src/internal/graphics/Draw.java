package internal.graphics;

import internal.mathX.vectors.Vector2;

import java.awt.*;

public class Draw {

    public static void rectangle(
            Vector2 position,
            Vector2 size,
            Color color,
            Graphics2D g
    ) {
        g.setColor(color);
        g.fillRect(
                (int) position.x,
                (int) position.y,
                (int) size.x,
                (int) size.y
        );
    }
    public static void circle(
            Vector2 position,
            int radius,
            Color color,
            Graphics2D g
    ) {
        g.setColor(color);
        g.fillOval(
                (int) position.x - radius,
                (int) position.y - radius,
                radius * 2,
                radius * 2
        );
    }
//    public static void text(
//            Vector2 position,
//            Vector2 size,
//            Color color,
//            Graphics2D g
//    ) {
//        g.setColor(color);
//    }
    public static void line(
            Vector2 positionA,
            Vector2 positionB,
            Color color,
            Graphics2D g
    ) {
        g.setColor(color);
        g.drawLine(
                (int) positionA.x,
                (int) positionA.y,
                (int) positionB.x,
                (int) positionB.y
        );
    }


}

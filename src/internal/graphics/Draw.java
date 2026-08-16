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

}

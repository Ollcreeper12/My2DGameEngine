package internal.ui.types;

import internal.editor.GamePanel;
import internal.graphics.Draw;
import internal.mathX.vectors.Vector2;
import internal.ui.UI_SuperItem;

import java.awt.*;

public class UI_Panel extends UI_SuperItem {

    public Color color;
    public Graphics2D gp;

    public UI_Panel(
            Vector2 position,
            Vector2 size,
            Color color,
            Graphics2D gp
    ){
        this.size = size;
        this.position = position;
        this.color = color;
        this.gp = gp;

        draw(gp);
    }

    public void draw(Graphics2D g) {
        Draw.rectangle(position, size, color, g);
    }
}

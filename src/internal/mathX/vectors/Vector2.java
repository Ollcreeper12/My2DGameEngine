package internal.mathX.vectors;

import java.awt.*;

public class Vector2 {
    public float x = 0.0f;
    public float y = 0.0f;

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2 half(){
        return new Vector2(this.x /2, this.y /2);
    }

    public static Vector2 minus(Vector2 a, Vector2 b) {
        return new Vector2(a.x - b.x, a.y - b.y);
    }

    public static Vector2 multiplay(Vector2 a, Vector2 b) {
        return new Vector2(a.x * b.x, a.y * b.y);
    }

    public static Vector2 add(Vector2 a, Vector2 b) {
        return new Vector2(a.x + b.x, a.y + b.y);
    }

    public static boolean graterThen(Vector2 a, Vector2 b) {
        boolean tf;
        return tf = (a.x > b.x) && (a.y > b.y);
    }

    public static boolean lessThen(Vector2 a, Vector2 b) {
        boolean tf;
        return tf = (a.x < b.x) && (a.y < b.y);
    }

    public static Vector2 zero() {
        return new Vector2(0, 0);
    }

    public static Dimension toDimension(Vector2 input) {
        return new Dimension((int)input.x, (int)input.y);
    }

}

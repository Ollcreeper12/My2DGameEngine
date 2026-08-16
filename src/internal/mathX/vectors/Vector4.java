package internal.mathX.vectors;

public class Vector4 {
    public float x = 0.0f;
    public float y = 0.0f;
    public float z = 0.0f;
    public float w = 0.0f;

    public Vector4(float x, float y, float z, float w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public Vector4 half(){
        return new Vector4(
                this.x /2,
                this.y /2,
                this.z /2,
                this.w /2
        );
    }

    public static Vector4 minus(Vector4 a, Vector4 b) {
        return new Vector4(
                a.x - b.x,
                a.y - b.y,
                a.z - b.z,
                a.w - b.w
        );
    }

    public static Vector4 multiplay(Vector4 a, Vector4 b) {
        return new Vector4(
                a.x * b.x,
                a.y * b.y,
                a.z * b.z,
                a.w * b.w
        );
    }

    public static Vector2 add(Vector2 a, Vector2 b) {
        return new Vector2(a.x + b.x, a.y + b.y);
    }

    public static boolean graterThen(Vector4 a, Vector4 b) {
        boolean tf;
        return tf =
                (a.x > b.x) &&
                (a.y > b.y) &&
                (a.z > b.z) &&
                (a.w > b.w);

    }

    public static boolean lessThen(Vector4 a, Vector4 b) {
        boolean tf;
        return tf =
                (a.x < b.x) &&
                (a.y < b.y) &&
                (a.z < b.z) &&
                (a.w < b.w);
    }

    public static Vector4 zero() {
        return new Vector4(0, 0, 0, 0);
    }

}

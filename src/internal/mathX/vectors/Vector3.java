package internal.mathX.vectors;

public class Vector3 {
    public float x = 0.0f;
    public float y = 0.0f;
    public float z = 0.0f;

    public Vector3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector3 half(){
        return new Vector3(
                this.x /2,
                this.y /2,
                this.z /2
        );
    }

    public static Vector3 minus(Vector3 a, Vector3 b) {
        return new Vector3(
                a.x - b.x,
                a.y - b.y,
                a.z - b.z
        );
    }

    public static Vector2 multiplay(Vector2 a, Vector2 b) {
        return new Vector2(a.x * b.x, a.y * b.y);
    }
//
//    public static Vector2 add(Vector2 a, Vector2 b) {
//        return new Vector2(a.x + b.x, a.y + b.y);
//    }
//
//    public static boolean graterThen(Vector2 a, Vector2 b) {
//        boolean tf;
//        return tf = (a.x > b.x) && (a.y > b.y);
//    }
//
//    public static boolean lessThen(Vector2 a, Vector2 b) {
//        boolean tf;
//        return tf = (a.x < b.x) && (a.y < b.y);
//    }

    public static Vector3 zero() {
        return new Vector3(0, 0, 0);
    }

}

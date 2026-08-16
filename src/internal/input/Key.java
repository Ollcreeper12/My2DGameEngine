package internal.input;

import java.awt.event.KeyEvent;

public class Key {
    public boolean keyDown = false;
    public boolean keyUp = true;
    private final int keyCode;

    public Key(int keyCode) {
        this.keyCode = keyCode;
    }

    public void pressed(KeyEvent e) {
        if (e.getKeyCode() == keyCode) {
            keyDown = true;
            keyUp = false;
        }
    }

    public void released(KeyEvent e) {
        if (e.getKeyCode() == keyCode) {
            keyDown = false;
            keyUp = true;
        }
    }

}
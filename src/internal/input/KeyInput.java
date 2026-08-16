package internal.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener {

    // QWERTY LAYOUT
    public Key q = new Key(KeyEvent.VK_Q);
    public Key w = new Key(KeyEvent.VK_W);
    public Key e = new Key(KeyEvent.VK_E);
    public Key r = new Key(KeyEvent.VK_R);
    public Key t = new Key(KeyEvent.VK_T);
    public Key y = new Key(KeyEvent.VK_Y);
    public Key u = new Key(KeyEvent.VK_U);
    public Key i = new Key(KeyEvent.VK_I);
    public Key o = new Key(KeyEvent.VK_O);
    public Key p = new Key(KeyEvent.VK_P);
    public Key a = new Key(KeyEvent.VK_A);
    public Key s = new Key(KeyEvent.VK_S);
    public Key d = new Key(KeyEvent.VK_D);
    public Key f = new Key(KeyEvent.VK_F);
    public Key g = new Key(KeyEvent.VK_G);
    public Key h = new Key(KeyEvent.VK_H);
    public Key j = new Key(KeyEvent.VK_J);
    public Key k = new Key(KeyEvent.VK_K);
    public Key l = new Key(KeyEvent.VK_L);
    public Key z = new Key(KeyEvent.VK_L);
    public Key x = new Key(KeyEvent.VK_L);
    public Key c = new Key(KeyEvent.VK_L);
    public Key v = new Key(KeyEvent.VK_L);
    public Key b = new Key(KeyEvent.VK_L);
    public Key n = new Key(KeyEvent.VK_L);
    public Key m = new Key(KeyEvent.VK_L);

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent event) {
        q.pressed(event);
        w.pressed(event);
        e.pressed(event);
        r.pressed(event);
        t.pressed(event);
        y.pressed(event);
        u.pressed(event);
        i.pressed(event);
        o.pressed(event);
        p.pressed(event);
        a.pressed(event);
        s.pressed(event);
        d.pressed(event);
        f.pressed(event);
        g.pressed(event);
        h.pressed(event);
        j.pressed(event);
        k.pressed(event);
        l.pressed(event);
        z.pressed(event);
        x.pressed(event);
        c.pressed(event);
        v.pressed(event);
        b.pressed(event);
        n.pressed(event);
        m.pressed(event);

    }

    @Override
    public void keyReleased(KeyEvent event) {
        q.released(event);
        w.released(event);
        e.released(event);
        r.released(event);
        t.released(event);
        y.released(event);
        u.released(event);
        i.released(event);
        o.released(event);
        p.released(event);
        a.released(event);
        s.released(event);
        d.released(event);
        f.released(event);
        g.released(event);
        h.released(event);
        j.released(event);
        k.released(event);
        l.released(event);
        z.released(event);
        x.released(event);
        c.released(event);
        v.released(event);
        b.released(event);
        n.released(event);
        m.released(event);
    }
}

package internal.editor;

import internal.mathX.vectors.Vector2;

import javax.swing.*;

public class Window {

    GamePanel gp = new GamePanel();

    public void create(
        String title,
        Vector2 size,
        boolean resizable,
        GamePanel gamePanel
    ) {
        JFrame windowPanel = new JFrame(title);
        windowPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowPanel.setSize(
                (int) size.x,
                (int) size.y
        );
        windowPanel.setResizable(resizable);
        windowPanel.setLocationRelativeTo(null);

        windowPanel.add(gamePanel);
        windowPanel.pack();

        windowPanel.setVisible(true);


    }

    public void create(
            String title,
            boolean resizable,
            GamePanel gamePanel
    ) {
        JFrame windowPanel = new JFrame(title);
        windowPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowPanel.setResizable(resizable);
        windowPanel.setLocationRelativeTo(null);

        windowPanel.add(gamePanel);
        windowPanel.pack();

        windowPanel.setVisible(true);
    }

}

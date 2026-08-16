package main;

import internal.editor.*;

public class Main {
    static void main(String[] args) {

        GamePanel gamePanel = new GamePanel();
        gamePanel.startGameThread();
        gamePanel.start();

        Window window = new Window();
        window.create(
                "Prism Engine - V0.0.1",
                gamePanel.ORIGINAL_SCREEN_SIZE,
                true,
                gamePanel
        );


    }
}
package internal.custom;

public class Time {

    private double drawIntervalS;
    private double nextDrawTimeS;

    private double drawIntervalA;
    private double delta = 0;
    private long lastTime = System.nanoTime();
    private long currantTime;
    private long timer;
    private long drawCount;

    public void deltaTimeSleep(int FPS, Thread thread) {
        // Need Before The While Loop!!!!!!
        drawIntervalS = 1000000000 / FPS;
        nextDrawTimeS = System.nanoTime() + drawIntervalS;

        // Need In The While Loop At The Bottom Of Update!!!!!
        try {
            double remainingTime = nextDrawTimeS - System.nanoTime();
            remainingTime /= 1000000;

            if (remainingTime < 0) { remainingTime = 0; }

            thread.sleep((long) remainingTime);

            nextDrawTimeS += drawIntervalS;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public boolean deltaTimeAccumulator(int FPS, boolean showFPS) {
        drawIntervalA = 1000000000 / FPS;

        currantTime = System.nanoTime();
        delta += (currantTime - lastTime) / drawIntervalA;
        timer += (currantTime - lastTime);

        lastTime = currantTime;

        if (delta >= 1 && showFPS == true) {
            delta--;
            drawCount++;

            if (timer >= 1000000000) {
                System.out.println("FPS: " + drawCount);
                drawCount = 0;
                timer = 0;
            }

            return true;
        } else if (delta >= 1 && showFPS == false) {
            delta--;
            return true;
        }



        return false;

    }

}

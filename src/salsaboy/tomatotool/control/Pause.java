package salsaboy.tomatotool.control;

import javax.swing.*;

/**
 * A class used to pause for a certain amount of time. It will stop then continue, running onEnd() when it
 * finishes.
 */
public class Pause {
    /**
     * This is intended to be overridden.
     * It runs when the timer is over.
     */
    protected void onEnd() {}
    private Timer timer;
    
    public Pause(int seconds) {
        timer = new Timer(seconds, e -> onEnd());
        timer.setRepeats(false);
        timer.start();
        
        while (timer.isRunning()) {}
    }
}

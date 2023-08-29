package chapter09;

import java.util.Date;

public class Stopwatch {

    private Date startTime;
    private Date endTime;

    public Stopwatch(){
        this.startTime = new Date();
    }

    public void start(){
        this.startTime = new Date();
    }

    public void stop(){
        this.endTime = new Date();
    }

    public long getElapsedTime(){
        return this.endTime.getTime() - this.startTime.getTime();
    }
}

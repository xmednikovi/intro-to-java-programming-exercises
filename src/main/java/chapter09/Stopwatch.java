package chapter09;

import java.util.Date;

class Stopwatch {

    private Date startTime;
    private Date endTime;

    Stopwatch(){
        this.startTime = new Date();
    }

    void start(){
        this.startTime = new Date();
    }

    void stop(){
        this.endTime = new Date();
    }

    long getElapsedTime(){
        return this.endTime.getTime() - this.startTime.getTime();
    }
}

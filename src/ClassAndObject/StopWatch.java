package ClassAndObject;
import java.util.Date;
public class StopWatch {
    long startTime,endTime;


    public StopWatch(){
        this.startTime = System.currentTimeMillis();
        this.endTime = System.currentTimeMillis();
    }
    public long getStartTime(){
        return  System.currentTimeMillis();

    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return System.currentTimeMillis();
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.getStartTime();
        watch.start();
        for (int i=0 ; i<922100;i++){
            System.out.println(i);
        }
        watch.getEndTime();
        watch.stop();
        System.out.println(" Time : "+watch.getElapsedTime());
    }

}


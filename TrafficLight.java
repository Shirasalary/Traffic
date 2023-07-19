import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TrafficLight {

    private int color;
    private Map<Integer, Integer> durationMap;
    private int distanceFromStart;

    private static int distance = 0;

    public TrafficLight() {
        Random random = new Random();
        this.color = 1;
        int redSeconds = random.nextInt(4000, 7000);
        int greenSeconds = random.nextInt(5000, 8000);
        this.durationMap = new HashMap<>();
        this.durationMap.put(1, redSeconds);
        this.durationMap.put(2, 1000);
        this.durationMap.put(3, greenSeconds);
        this.distanceFromStart = distance * 2000;
        distance++;
    }

    public void changeColor() {
        new Thread(() -> {
            while (true) {
                try {
                    if (this.color ==1)
                    {
                        Thread.sleep(this.durationMap.get(1));
                        this.color = 2;
                        System.out.println("yellow");
                    } else if (this.color == 2) {
                        Thread.sleep(this.durationMap.get(2));
                        this.color = 3;
                        System.out.println("green");
                    }else {
                        Thread.sleep(this.durationMap.get(3));
                        this.color = 1;
                        System.out.println("red");
                    }
                }catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }).start();

    }

    public void  removeDistanceFromStart(int remove)
    {
        this.distanceFromStart-=remove;
    }
}

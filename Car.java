import java.util.Random;

public class Car extends Thread {

    int x;
    int y ;
    int width;
    int height;
    private int speed;

    private boolean isDriving;

    public Car(int x, int y, int width, int height)
    {
        Random random = new Random();
        this.speed = random.nextInt(50,81);
        this.isDriving = false;

    }

    public void run()
    {
        while (true)
        {
            this.x++;
            Main.sleep(1000);
        }
    }
}

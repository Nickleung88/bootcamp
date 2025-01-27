
import java.util.Arrays;
import java.util.List;

public class DemoStream {

    public class Ball{
        private int size;
        private Color color;

        public Ball (int size, Color color){
            this.size =size;
            this.color=color;
        }

        

        public static enum Color{
            BLACK, WHITE,;
        }


    }
    public static void main(String[] args)  {
        List<Ball> balls = Arrays.asList(new Ball(10,Color.BLACK),
        new Ball (7, Color.WHITE), new Ball (20, Color.BLACK));
    }
}

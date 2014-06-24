import java.io.IOException;

/**
 * Created by dmitry.kalmetyev on 23/06/2014.
 */
public class Exercise46 {
    static float x;
    static float y;


    public static void main(String[] args) {
        set();
        process();
        print();
    }

    private static void set(){
        x=3.5f;
        y=5f;
    }

    private static void process() {
        if (x<0 && y<0){
            x=Math.abs(x);
            y=Math.abs(y);
        }
        else if (x>=0 && y>=0){
            if ((x<0.5 || x>2) && (y<0.5 || y>2)){
                x=x/10f;
                y=y/10f;
            }
        }
        else {
            x+=0.5f;
            y+=0.5f;
        }
    }

    private static void print(){
        System.out.println(x);
        System.out.println(y);
    }
}

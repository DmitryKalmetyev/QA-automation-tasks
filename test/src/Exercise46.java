import java.io.IOException;

/**
 * Created by dmitry.kalmetyev on 23/06/2014.
 */
public class Exercise46 {

    public static void main(String[] args) {
        process(3.4f, 11f);
    }

    private static void process(float x, float y) {
        if (x<0 && y<0){
            System.out.println(-x);
            System.out.println(-y);
        }
        else if (x>=0 && y>=0){
            if ((x<0.5 || x>2) && (y<0.5 || y>2)){
                System.out.println(x/10f);
                System.out.println(y/10f);
            }
            else {
                System.out.println(x);
                System.out.println(y);
            }

        }
        else {
            System.out.println(x+0.5f);
            System.out.println(y+0.5f);
        }


    }

}

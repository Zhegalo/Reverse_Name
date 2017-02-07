/**
 * Created by Hanna_Zhahala on 07.02.2017.
 */
import java.util.Scanner;

public class ReverseName {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String result = in.nextLine();


        StringBuffer buffer = new StringBuffer(result);
        System.out.println(buffer.reverse());
    }
}

package hexlet.code.games;
import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;
import java.util.Scanner;
public class Calc {
    public static void itsCalc() {
        System.out.println("What is the result of the expression?");
        Scanner scan = new Scanner(System.in);
        for (var x = 3; x > 0; x--) {
            var fstVar = RandomUtils.nextInt(1, 50);
            var secVar = RandomUtils.nextInt(1, 50);
            String[] examples = new String[3];
            examples[0] = fstVar + " + " + secVar;
            examples[1] = fstVar + " - " + secVar;
            examples[2] = fstVar + " * " + secVar;
            int rdmIndex = RandomUtils.nextInt(0, 2);
            int[] intExample = new int[3];
            intExample[0] = fstVar + secVar;
            intExample[1] = fstVar - secVar;
            intExample[2] = fstVar * secVar;
            System.out.println("Question: " + String.join(" ",examples[rdmIndex]));
            var ans = scan.next();
            System.out.println("Your answer: " + ans);
            if (ans.equals(Integer.toString(intExample[rdmIndex]))) {
                System.out.println("Correct!");
                if (x == 1) {
                    System.out.println("Congratulations, " + Engine.userName + "!");
                }
            } else {
                System.out.println(ans + " is wrong answer ;(. Correct answer was " + intExample[rdmIndex]
                        + "." + "\nLet's try again, " + Engine.userName + "!");

                break;

            }
        }
    }
}

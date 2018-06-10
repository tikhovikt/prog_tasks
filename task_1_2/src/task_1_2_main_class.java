import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class task_1_2_main_class {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //ToDo: need add precis selection, how much number I want to see
        System.out.println("Input epsilon");
        BigDecimal epsilon = new BigDecimal(br.readLine());

        Series series = new Series(epsilon);

        series.solveSeries();

        System.out.println("Answer: An = " + series.getAnswerAN().toString());
        System.out.println("n = " + series.getN());


    }

}

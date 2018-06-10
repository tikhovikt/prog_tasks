import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class task_1_3_main_class {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Reading a:");
        BigDecimal a = new BigDecimal(br.readLine());

        System.out.print("\nReading b:");
        BigDecimal b = new BigDecimal(br.readLine());

        System.out.println("\nReading h:");
        BigDecimal h = new BigDecimal(br.readLine());

        System.out.println();


    }
}

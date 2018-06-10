import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class task_1_3_main_class {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Reading a:");
        double a = Double.parseDouble(br.readLine());

        System.out.print("Reading b:");
        double b = Double.parseDouble(br.readLine());

        System.out.print("Reading h:");
        double h = Double.parseDouble(br.readLine());

        FunctionTg functionTg = new FunctionTg(a,b,h);

        functionTg.initialize();
        functionTg.printTable();


    }
}

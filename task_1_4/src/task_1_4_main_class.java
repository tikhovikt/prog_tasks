import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class task_1_4_main_class {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Double> series = new ArrayList<>();
        String line;

        System.out.println("Input series of number. Press double Enter for end the series.");
        while (true) {
            line = br.readLine();
            if (!line.isEmpty())
                series.add(Double.parseDouble(line));
            else
                break;
        }

        System.out.print("Max value: ");
        System.out.println(Collections.max(series));

    }
}

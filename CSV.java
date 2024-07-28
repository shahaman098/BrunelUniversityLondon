import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSV {
    public static void main(String[] args) {
        String file = "src\\hospital-info.csv";
        
        BufferedReader reader = null;
        String line = "";
        
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                for (String index : row) {
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

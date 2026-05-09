import java.io.File;
import java.util.Scanner;

class IdSum {
    public static void main(String[] args) {
        File f1 = new File("F:\CS-351 Programing Fundamentals\sale.txt");
        Scanner inp;
        String dr;
        String[] Pnames = new String[300];  
        double[] amounts = new double[300];
        int count = 0;

        try {
            inp = new Scanner(f1);
            dr = inp.nextLine();
            String[] parts;
            String id;                   
            double amt, uPrice, qty;

            while (inp.hasNextLine()) {
                dr = inp.nextLine();
                if (dr.trim().length() == 0) continue;

                parts    = dr.split("\t");
                id = parts[5];                        
                uPrice   = Double.parseDouble(parts[2]);    
                qty      = Double.parseDouble(parts[3]);   
                amt      = uPrice * qty;

                boolean found = false;
                for (int i = 0; i < count; i++) {
                    if (id[i].equals(id)) {
                        amounts[i] += amt;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    id[count] = id;
                    amounts[count]   = amt;
                    count++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("===== REP ID-WISE TOTAL SALES =====");
            for (int i = 0; i < count; i++) {
                System.out.println(id[i] + " ---> " + amounts[i]);
            }
        }
    }
}

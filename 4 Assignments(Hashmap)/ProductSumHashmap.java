import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class ProductSumHashmap {
    public static void main(String[] args) {
        File f1 = new File("F:\CS-351 Programing Fundamentals\sale.txt");
        Scanner inp;
        String dr;
        HashMap<String, Double> salesMap = new HashMap<String, Double>();
        try {
            inp = new Scanner(f1);
            dr = inp.nextLine(); 
            String[] parts;
            String Pname;
            double amt, uPrice, qty;

            while (inp.hasNextLine()) {
                dr = inp.nextLine();
                if (dr.trim().length() == 0) continue;

                parts    = dr.split("\t");
                Pname = parts[1];                      
                uPrice   = Double.parseDouble(parts[2]);  
                qty      = Double.parseDouble(parts[3]);  
                amt      = uPrice * qty;

                if (salesMap.containsKey(Pname)) {
                    salesMap.put(Pname, salesMap.get(Pname) + amt);
                } else {
                    salesMap.put(Pname, amt);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("===== PRODUCT-WISE TOTAL SALES (HASHMAP) =====");
            for (Map.Entry<String, Double> entry : salesMap.entrySet()) {
                System.out.println(entry.getKey() + " ---> " + entry.getValue());
            }
        }
    }
}

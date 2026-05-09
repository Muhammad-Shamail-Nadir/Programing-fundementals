import java.io.File;
import java.util.Scanner;

class ProductSum{
    public static void main(String[] args) {
        File f1 = new File("c:/temp/sale.txt");
        Scanner inp;
        String dr;
        String[] Pnames = new String[300];
        double[] amounts = new double[300];
        int cot = 0;
        try {
            inp = new Scanner(f1);
            dr=inp.nextLine();
            dr = inp.nextLine(); 
            String[] parts;
            String Pnames;
            double amt, uPrice, qty;

            while (dr.length()>0) {
                dr = inp.nextLine();

                parts  = dr.split("\t");
                prodName = parts[1];                        
                uPrice   = Double.parseDouble(parts[2]);    
                qty      = Double.parseDouble(parts[3]);   
                amt      = uPrice * qty;

                boolean found = false;
                for (int i = 0; i < cot; i++) {
                    if (Pnames[i].equals(prodName)) {
                        amounts[i] += amt;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                   Pnames[cot] = Pnames;
                    amounts[cot]   = amt;
                    cot++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            System.out.println("===== PRODUCT-WISE TOTAL SALES =====");
            for (int i = 0; i < cot; i++) {
                System.out.println(Pnames[i] + " ---> " + amounts[i]);
            }
        }
    }
}

//supermarket billing system with GST discount and free item offer
//task is to calcualate the final payable bill after applying - free item offer , discount , GST(tax)
//if qty >= 3 -> free item 
// if qty = 3 customer pays for 2 , qty = 4 - pay 3 , qty 6 -> customer pays for 4 --> //paybale qty = quantiy -(quantiy/3)
// bill> 5000 15% discount , 2000 -> 10 % discount , otherwise no discount 
//gst = after apply the discount - add 5% gst to bill 
//input N - number of item , price , qty 
// 2 100 3 200 2 
//paybale qty = 3-1 = 2
//cost = 100 * 2 = 2000

import java.util.*;
class solution2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int[] total_bill = new int[N];
        double result = 0;  
        
     
        for(int i = 0; i < N; i++) {
            int price = in.nextInt();
            int quantity = in.nextInt();
            
            if(quantity >= 3) {
                quantity = quantity - (quantity / 3);
            }
            total_bill[i] = price * quantity;
            result += total_bill[i];
        }
        
        System.out.println((int)result);  
        
        // Calculate discount
        double to_pay;
        if(result > 5000) {
            double discount = 0.15 * result;
            to_pay = result - discount;
        } 
        else if(result > 2000 && result <= 5000) {  // Fixed <= 5000
            double discount = 0.10 * result;
            to_pay = result - discount;
        }
        else {
            to_pay = result;
        }
        
       
        double GST = 0.05 * to_pay;
        to_pay = to_pay + GST;
        
        System.out.println((int)Math.round(to_pay));  
        
        in.close();
    }
}

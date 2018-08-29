package javase.oop.adv.Lab10.lambda_04;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.stream.DoubleStream;

/**
 *
 * @author oracle
 */
public class CalcTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        
        // Print out Transaction Totals
        System.out.println("=== Transactions Totals ===");
        // Replace with stream
        double t1 = 0;
        double t2 = 0;
        double t3 = 0;
        t1 += tList.stream()
            .filter(t -> t.getBuyerName().equals("Radio Hut"))
            .mapToDouble(t-> t.getTransactionTotal())
            .sum();
            
        t2 += tList.stream()
            .filter(t -> t.getBuyerName().equals("PriceCo"))
            .mapToDouble(t->t.getTransactionTotal())
            .sum();
        
        t3 += tList.stream()
            .filter(t -> t.getBuyerName().equals("Best Deals"))
            .mapToDouble(t->t.getTransactionTotal())
            .sum();
        
        System.out.printf("Radio Hut Total: $%,9.2f%n", t1);
        
        // Replace with Stream
        
        
        System.out.printf("PriceCo Total: $%,9.2f%n", t2);
        // Replace with stream
        
        
        System.out.printf("Best Deals Total: $%,9.2f%n", t3);
        
        // Print out Average Unit Count
        System.out.println("=== Average Unit Count ===");
        // Replace with Stream
        OptionalDouble a1 = OptionalDouble.of(0);
        
  
        a1 = tList.stream()
            .filter(t-> t.getProduct().equals("Widget"))
            .mapToDouble(t-> t.getUnitCount())
            .average();
        
        if (a1.isPresent()){
            System.out.printf("Widget Pro Avg: %,9.0f%n", a1.getAsDouble());
        }
        
        // Replace with stream
        OptionalDouble a2 = OptionalDouble.of(0);
        
        a2 =  tList.stream()
            .filter(t-> t.getProduct().equals("Widget Pro"))
            .mapToDouble(t-> t.getUnitCount())
            .average();
        if (a2.isPresent()){
            System.out.printf("Widget Avg: %,9.0f%n", a2.getAsDouble());        
        }
                 
        
    }
}

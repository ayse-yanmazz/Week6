package week6;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        
        ArrayList<Ride> list=new ArrayList<>();
        Ride ride1 = new Ride("Ays", "Kızılay", "Tunalı", 5.0, 15, 10.0);
        EconomyRide ride2 = new EconomyRide("Ayse", "Talas", "Erü", 12.0, 25, 8.0, 2.0);
        PremiumRide ride3 = new PremiumRide("Sümeyye", "Meydan", "Hacılar", 15.0, 30, 15.0, 50.0, 1.5);
        SharedRide ride4 = new SharedRide("Sila", "Gesi", "Meydan", 8.0, 20, 7.0, 1.5, 3);
        
        PremiumRide invalidRide = new PremiumRide("Eve", "A", "B", -5.0, 10, 5.0, 20.0, 5.0);
        
        list.add(ride1);
        list.add(ride2);
        list.add(ride3);
        list.add(ride4);
        
        for(Ride r : list){
            System.out.println(r.toString());
            System.out.println(r.calculateFare());
            
        }
        System.out.println("Passenger Count: "+ list.size());

    }
    
}

import java.util.List;
import java.util.ArrayList;

class Inventory{
    public static void main(String[]args){
        System.out.println("3R STORE");
        List<Item> alyssa = new ArrayList();
        float total = 0.0f;

        Item s1 = new Item("Alaska", "Powdered Milk", 7.00f);
        Item s2 = new Item("Colgate", "Toothpaste", 8.00f);
        Item a3 = new Item("Rolex", "Wrist Watch", 3200.00f);
        Item j4 = new Item("Modess", "Napkin", 6.00f);
        Item a5 = new Item("Pampers", "Diapers", 12.00f);
        Item n6 = new Item("Brown Sugar", "Sugar", 12.00f);
        Item i7 = new Item("Oishi", "Junk Food", 7.00f);
        Item e8 = new Item("XO", "Candy", 1.00f);
        Item l9 = new Item("VFresh", "Chewing Gum", 1.00f);
        Item l10 = new Item("MAXX", "Candy", 1.00f);

        alyssa.add(s1);
        alyssa.add(s2);
        alyssa.add(a3);
        alyssa.add(j4);
        alyssa.add(a5);
        alyssa.add(n6);
        alyssa.add(i7);
        alyssa.add(e8);
        alyssa.add(l9);
        alyssa.add(l10);
        for(Item e: alyssa){
            if(e.Getname()=="Rolex"){
                System.out.println("Nakita na!");
            }else{
                System.out.println("Dili ni mao");
            }
            total = total + e.Getprice();
        }
        System.out.println(total);
    }
}
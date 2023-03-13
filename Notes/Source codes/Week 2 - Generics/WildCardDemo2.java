import java.util.ArrayList;

public class WildCardDemo2
{
   public static void main(String[] args) {
      ArrayList<Integer> list1 = new ArrayList<>();
      list1.add(3); 
      list1.add(6); 
      list1.add(9); 
      display(list1);   // call method
      System.out.println();
            
      ArrayList<Double> list2 = new ArrayList<>();
      list2.add(3.0);
      list2.add(6.0);
      list2.add(9.0);
      display(list2);   // call method
      System.out.println();
   }
   public static void display(ArrayList<?> list)   {
      for (int i=0; i<=2; i++)
         if ( list.get(i).equals(6.0) )
            System.out.println("yes");
         else
            System.out.println("no");
   }
}



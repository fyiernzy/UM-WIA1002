public class BoundedGeneric2<T extends Number> {
   T data;
   public BoundedGeneric2(T t) {
      data = t;
   }
    
   void display(){
      System.out.println("Value is : " + data );
      System.out.println("   and type is " + data.getClass().getName() );
   }
 
   public static void main(String[] args) {
      BoundedGeneric2<Integer> b1 = new BoundedGeneric2<Integer>(3);
      b1.display(); 
      
      BoundedGeneric2<Double> b2 = new BoundedGeneric2<Double>(3.14);
      b2.display();
        
      //BoundedGeneric2<String> b3 = new BoundedGeneric2<String>("Hello World");
      // This line is commented because compilation error
      // error: type argument String is not within bounds of type-variable T
      
    }
}

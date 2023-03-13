
 public class TestWeightedGraph {
   public static void main(String[] args) {
      WeightedGraph<String, Integer> graph1 = new WeightedGraph<>();
      String[] cities = {"Alor Setar", "Kuching", "Langkawi", "Melaka", "Penang", "Tawau"};
      for (String i : cities)
         graph1.addVertex(i);

      System.out.println("The number of vertices in graph1: " + graph1.getSize());

      System.out.println("Cities and their vertices ");
      for (int i = 0; i<=graph1.getSize()-1; i++)
         System.out.print( i + ": " + graph1.getVertex(i) + "\t");
      System.out.println();

      System.out.println("Is Melaka in the Graph? " + graph1.hasVertex("Melaka"));
      System.out.println("Is Ipoh in the Graph? " + graph1.hasVertex("Ipoh"));
      System.out.println();
    
      System.out.println("Kuching at index:  " + graph1.getIndex("Kuching"));
      System.out.println("Ipoh at index:  " + graph1.getIndex("Ipoh"));
      System.out.println();

      System.out.println("add edge Kuching - Melaka: " + graph1.addEdge("Kuching", "Melaka", 800) );
      System.out.println("add edge Langkawi - Penang : " + graph1.addEdge("Langkawi", "Penang", 100) ); 
      System.out.println("add edge Melaka - Penang : " + graph1.addEdge("Melaka", "Penang", 400) );
      System.out.println("add edge Alor Setar - Kuching : " + graph1.addEdge("Alor Setar", "Kuching", 1200) );
      System.out.println("add edge Tawau - Alor Setar : " + graph1.addEdge("Tawau", "Alor Setar", 1900) );
      System.out.println("add edge Kuching - Tawau : " + graph1.addEdge("Kuching", "Tawau", 900) );
      System.out.println("add edge Langkawi - Ipoh : " + graph1.addEdge("Langkawi", "Ipoh", 200) );
      System.out.println();
    
      System.out.println("has edge from Kuching to Melaka?  " + graph1.hasEdge("Kuching", "Melaka") );
      System.out.println("has edge from Melaka to Langkawi?  " + graph1.hasEdge("Melaka", "Kuching") );
      System.out.println("has edge from Ipoh to Langkawi?  " + graph1.hasEdge("Ipoh", "Langkawi") );
      System.out.println();
    
      System.out.println("weight of edge from Kuching to Melaka?  " + graph1.getEdgeWeight("Kuching", "Melaka") );
      System.out.println("weight of edge from Tawau to Alor Setar?  " + graph1.getEdgeWeight("Tawau", "Alor Setar") );
      System.out.println("weight of edge from Semporna to Ipoh?  " + graph1.getEdgeWeight("Semporna", "Ipoh") );
      System.out.println();

      System.out.println("In and out degree for Kuching is " + graph1.getIndeg("Kuching") + " and " + graph1.getOutdeg("Kuching") );
      System.out.println("In and out degree for Penang is " + graph1.getIndeg("Penang") + " and " + graph1.getOutdeg("Penang") );
      System.out.println("In and out degree for Ipoh is " + graph1.getIndeg("Ipoh") + " and " + graph1.getOutdeg("Ipoh") );
      System.out.println();
    
      System.out.println("Neighbours of Kuching : " + graph1.getNeighbours("Kuching"));
      System.out.println("\nPrint Edges : " );
      graph1.printEdges();
      
   }
 }

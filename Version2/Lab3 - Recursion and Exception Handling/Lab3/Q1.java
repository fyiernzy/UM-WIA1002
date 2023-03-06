package Lab3;

public class Q1 {
	public static void main(String[] args) {
		System.out.println("Mesh Topology");
		int N;
		
		N = 4;
		System.out.printf("There are %d switches in the campus.\n", N);
		System.out.printf("The total number of connections required is %d\n", numOfConnections(N));
		
		N = 7;
		System.out.printf("There are %d switches in the campus.\n", N);
		System.out.printf("The total number of connections required is %d\n", numOfConnections(N));
	}
	
	public static int numOfConnections(int n) {
		if(n <= 2) return 1;
		return (n - 1) + numOfConnections(n - 1);
	}
	
}

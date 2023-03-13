package Lab1.Q3;

public class Q3 {
	public static void main(String[] args) {
		SimpleNetwork network1 = new SimpleNetwork("Host 1", "10.1.1.1", "255.255.255.224", SimpleNetwork.UP); 
		SimpleNetwork network2 = new SimpleNetwork("Host 2", "10.1.1.2", "255.255.255.224", SimpleNetwork.DOWN); 
		SimpleNetwork network3 = new SimpleNetwork("Host 3", "10.1.1.70", "255.255.255.224", SimpleNetwork.UP); 
		SimpleNetwork network4 = new SimpleNetwork("Host 4", "10.1.1.15", "255.255.255.224", SimpleNetwork.UP); 
		System.out.println(network1);
		System.out.println(network2);
		System.out.println(network3);
		System.out.println(network4);
		network1.ping(network2);
		network1.ping(network3);
		network1.ping(network4);
	}
}

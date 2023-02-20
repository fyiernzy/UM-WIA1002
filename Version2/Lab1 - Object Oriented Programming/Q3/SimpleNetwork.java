package Lab1.Q3;

public class SimpleNetwork {
	public static final String UP = "UP";
	public static final String DOWN = "DOWN";
	
	private String hostName;
	private String ip;
	private String subnet;
	private String status;
	
	SimpleNetwork(String hostName, String ip, String subnet, String status) {
		this.hostName = hostName;
		this.ip = ip;
		this.subnet = subnet;
		this.status = status;
	}
	
	private String getNetworkAddress() {
		String[] ipOctets = ip.split("\\.");
		String[] subnetOctets = subnet.split("\\.");
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 4; i++) // 32bits / 8octets = 4sections
			sb.append(Integer.parseInt(ipOctets[i]) & Integer.parseInt(subnetOctets[i])).append('.');
		
		// Eliminate the last '.'
		sb.setLength(sb.length() - 1);
		return sb.toString();
	}
	
	private boolean isSameNetwork(SimpleNetwork host) {
		return subnet.equals(host.subnet) && getNetworkAddress().equals(host.getNetworkAddress());
	}
	
	private boolean isUp() {
		return status.equals(UP);
	}
	
	private boolean canPing(SimpleNetwork host) {
		return isSameNetwork(host) && host.isUp() && isUp();
	}
	
	public void ping(SimpleNetwork host) {
		if(!canPing(host)) {
			System.out.printf("%s cannot ping %s because ", hostName, host.hostName);
			if(!isSameNetwork(host)) 
				System.out.printf("the destination %s is located in different network.\n", host.hostName);
			else if(!isUp())
				System.out.printf("the source %s is down.\n", hostName);
			else 
				System.out.printf("the destination %s is down.\n", host.hostName);
		} else {
			System.out.printf("%s can ping %s\n", hostName, host.hostName);
		}
	}
	
	@Override
	public String toString() {
		return String.format("Host Name: %s IP: %s Subnet Mask: %s Status: %s", this.hostName, this.ip, this.subnet, this.status);
	}
	
}

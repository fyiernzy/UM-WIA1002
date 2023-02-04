package Lab4.L4Q2;

public class MyGeneric<E> {
	private E object;
	
	public MyGeneric() {
		
	}
	
	public MyGeneric(E object) {
		this.object = object;
	}
	
	public void setObject(E object) {
		this.object = object;
	}
	
	public E getObject() {
		return this.object;
	}
}

package ch02;

public class GenericPrinter<T extends Material>{
	
	private T  material;
	
	public void serMaterial(T material) {
		this.material = material;
		
	}
	
	public T getMatrial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void doPrinting() {
		material.doPrinting();
	}

}

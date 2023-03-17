package ch01;

public class GenericPrinterTest {

	public static void main(String[] args) {

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.serMaterial(new Powder());
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plsticPrinter = new GenericPrinter<>();
		plsticPrinter.serMaterial(new Plastic());
		System.out.println(plsticPrinter);
		
		GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
		
		
	}

}

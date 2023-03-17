package ch02;


public class GenericPrinterTest {

	public static void main(String[] args) {

		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.serMaterial(new Powder());
		powderPrinter.doPrinting();
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plsticPrinter = new GenericPrinter<>();
		plsticPrinter.serMaterial(new Plastic());
		plsticPrinter.doPrinting();
		System.out.println(plsticPrinter);
		
		
	}

}

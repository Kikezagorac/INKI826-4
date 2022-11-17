package vezbi.br4;

public class MainClass {
	
	public static void main(String[] args) {
		Avtomobil avtomobil = new Avtomobil("Opel", "Astra", 19600, "Siva");
	
		System.out.println("Marka: " + avtomobil.getMarka());
		System.out.println("Model: " + avtomobil.getModel());
		System.out.println("Kilometri pred mnozhenje: " + avtomobil.getPominatiKm());
		System.out.println("Kilometri posle mnozhenje: " + avtomobil.mnozenjeKm(5));
		System.out.println("Boja: " + avtomobil.getBoja());
		}
}
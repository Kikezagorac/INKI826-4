package vezbi.br2;

public class MainClass {
	public static void main(String[] args) {
		Restoran rest = new Restoran();
		rest.setIme("Vavilon");
		rest.setLokacija("Bitola");
		rest.setTelefon("070-207-268");
		rest.setBrSedishta(250);
		
		System.out.println("Kontakt telefon na restoran " + rest.getIme() + " koj se naogja vo gradot " + rest.getLokacija() + " e: " + rest.getTelefon());
		System.out.println("Restoranot ima kapacitet od: " + rest.getBrSedishta() + " sedishta.");
	}
}

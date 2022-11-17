package vezbi.br1;

public class MainClass {
	public static void main(String[] args) {
		Covek c = new Covek ();
		c.setIme("Kristina");
		c.setPrezime("Zagorac");
		c.setEmbg("0112002445006");
		
		System.out.println("Ime: " + c.getIme());
		System.out.println("Prezime: " + c.getPrezime());
		System.out.println("EMBG: " + c.getEmbg());
	}
}

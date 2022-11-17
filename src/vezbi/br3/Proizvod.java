package vezbi.br3;

public class Proizvod {
	private String ime;
	private double cena;
	private String proizvoditel;
	private double tezhina;
	
	public Proizvod () {
		this.ime = "Milka Oreo";
		this.cena = 75;
		this.proizvoditel = "Mondelez International";
		this.tezhina = 100;
	}

	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public String getProizvoditel() {
		return proizvoditel;
	}
	public void setProizvoditel(String proizvoditel) {
		this.proizvoditel = proizvoditel;
	}
	public double getTezhina() {
		return tezhina;
	}
	public void setTezhina(double tezhina) {
		this.tezhina = tezhina;
	}
}

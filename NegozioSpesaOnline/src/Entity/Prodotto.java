package Entity;

public class Prodotto {
	
	private String codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private int quantità_disponibile;
	
	
	
	public Prodotto(String codice, String nome, String descrizione, double prezzo, int quantità_disponibile) {
		this.codice = codice;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.quantità_disponibile = quantità_disponibile;
	}
	
	//CODICE
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	
	//NOME
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//DESCRIZIONE
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	//PREZZO
	public Double getPrezzo() {
		return this.prezzo;
	}
	public void setPrezzo(double newPrezzo) {
		this.prezzo = newPrezzo;
	}
	
	//QUANTITA'DISPONIBILE
	public int getQuantità_disponibile() {
		return quantità_disponibile;
	}
	public void setQuantità_disponibile(int quantità_disponibile) {
		this.quantità_disponibile = quantità_disponibile;
	}
	public int addQuantità() {
		this.quantità_disponibile = quantità_disponibile + 1;
		return quantità_disponibile;
	}
	
	public int removeQuantità(int quantità_acquistata) {
		this.quantità_disponibile = quantità_disponibile - quantità_acquistata;
		return quantità_disponibile;
	}
}

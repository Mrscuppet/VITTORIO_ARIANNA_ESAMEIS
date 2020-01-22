package Entity;

public class Prodotto {
	
	private String codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private int quantit�_disponibile;
	
	
	
	public Prodotto(String codice, String nome, String descrizione, double prezzo, int quantit�_disponibile) {
		this.codice = codice;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.quantit�_disponibile = quantit�_disponibile;
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
	public int getQuantit�_disponibile() {
		return quantit�_disponibile;
	}
	public void setQuantit�_disponibile(int quantit�_disponibile) {
		this.quantit�_disponibile = quantit�_disponibile;
	}
	public int addQuantit�() {
		this.quantit�_disponibile = quantit�_disponibile + 1;
		return quantit�_disponibile;
	}
	
	public int removeQuantit�(int quantit�_acquistata) {
		this.quantit�_disponibile = quantit�_disponibile - quantit�_acquistata;
		return quantit�_disponibile;
	}
}

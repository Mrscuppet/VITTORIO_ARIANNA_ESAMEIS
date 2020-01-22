package Entity;

public class DettaglioProdotto {
	
	private  int quantit‡_acquistate;
	private  Prodotto prodotto;
	
	
	public DettaglioProdotto(int quantit‡_acquistate, Prodotto prodotto) {

		this.quantit‡_acquistate = quantit‡_acquistate;
		this.prodotto = prodotto;
		
	}


	//QUANTITA' ACQUISTATE
	
	public int getQuantit‡_acquistate() {
		return quantit‡_acquistate;
	}


	public void setQuantit‡_acquistate(int quantit‡_acquistate) {
		this.quantit‡_acquistate = quantit‡_acquistate;
	}
	
	
	
	//PRODOTTO
	
	public Prodotto getProdotto() {
		return prodotto;
	}


	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
	
	public int quantit‡Disponibile() {
		return this.prodotto.getQuantit‡_disponibile();
	}
	
	public void rimuoviQuantit‡() {
		this.prodotto.removeQuantit‡(quantit‡_acquistate);
			
	}

	//CALCOLA PRESSO PRODTTO*QUANTITA ACQUISTATE
	public double getPrezzoTotale() {
		
		double costoTotale = 0.0;
		
		costoTotale = this.prodotto.getPrezzo()*this.quantit‡_acquistate;
		
		return costoTotale;
	}
	
	
	
	
	

}

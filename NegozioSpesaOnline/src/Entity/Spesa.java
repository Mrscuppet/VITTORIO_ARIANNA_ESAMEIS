package Entity;
import java.time.LocalDate;
import java.util.ArrayList;

import Enumeration.StatoSpesa;


public class Spesa {

	private String ID;
	private LocalDate data;
	private double costo;
	private StatoSpesa statoSpesa;
	private ArrayList<DettaglioProdotto> dettaglio_prodotti;
	
	
	
	public Spesa(String iD, LocalDate data, double costo, StatoSpesa statoSpesa, ArrayList<DettaglioProdotto> arrayList) {
		this.ID = iD;
		this.data = data;
		this.costo = (double) 0;
		this.statoSpesa = statoSpesa;
		this.dettaglio_prodotti = new ArrayList<DettaglioProdotto>();
	}
	
	//ID
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
	//DATA
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	//COSTO
	
	public Double getCosto() {
		return costo;
	}
	
	public void setCosto( Double newCosto) {
		this.costo = newCosto;
	}
	
	
	//STATOSPESA
	
	public StatoSpesa getStatoSpesa() {
		return statoSpesa;
	}

	public void setStatoSpesaConsegnata() {
		this.statoSpesa = StatoSpesa.CONSEGNATA;
	}
	
	public void setStatoSpesaInEffetuazione() {
		this.statoSpesa = StatoSpesa.IN_EFFETUAZIONE;
	}
	
	public void setStatoSpesaOrdinata() {
		this.statoSpesa = StatoSpesa.ORDINATA;
	}

	
	
	//ARRAYPRODOTTI
	
	public void addQuantit‡Prodotto(DettaglioProdotto newDettaglioProdotto ) {
		this.dettaglio_prodotti.add(newDettaglioProdotto);
		this.costo = this.costo + newDettaglioProdotto.getPrezzoTotale();	
	}
	
	
	
	public ArrayList<DettaglioProdotto> getDettaglioProdotto() {
		return this.dettaglio_prodotti;
	}
	
	
	
	public void removeDettaglioProdotto(DettaglioProdotto newProdotto) {
		this.costo = this.costo - newProdotto.getPrezzoTotale();
		this.dettaglio_prodotti.remove(newProdotto);
	}
	
	
	
	
	
}

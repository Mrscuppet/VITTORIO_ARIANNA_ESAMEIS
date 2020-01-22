package control;
import java.time.LocalDate;
import java.util.ArrayList;

import Entity.*;
import Enumeration.StatoSpesa;



public class GestioneSpeseNegozio {

	//ATTRIBUTES	
		private ArrayList<ClienteRegistrato> clienti;
		
		
	//COSTRUTTORE
		public GestioneSpeseNegozio() {
			this.clienti = new ArrayList<ClienteRegistrato>();
		}
		
	//OPERATIONS
		
		
		//CREA CLIENTE REGISTRATO
		public ClienteRegistrato creaCliente(String nome, String password, String nr_telefono_mobile, String carta_di_credito) {
			
			if( nome == null || password == null ) {return null;}
			if (nome.isEmpty() || password.isEmpty()) { return null;}
			
			ClienteRegistrato clienteRegistrato = new ClienteRegistrato(nome,password, nr_telefono_mobile, carta_di_credito, new ArrayList<Spesa>());
				
				clienti.add(clienteRegistrato);
				
				return clienteRegistrato;
		}
		
		//CREA SPESA (CARRELLO)
		public Spesa creaSpesa(String id,LocalDate data) {
			
			if (id == null || id.isEmpty()) {return null;}
			
			Spesa spesa = new Spesa(id,data,0.0,StatoSpesa.IN_EFFETUAZIONE, new ArrayList<DettaglioProdotto>());
			
			return spesa;
		}
		
		//CONFERMA SPESA (CAMBIA LO STATO)
		public Spesa confermaSpesa(Spesa spesa) {
			
			spesa.setStatoSpesaOrdinata();
			
			return spesa;
			
		}
		
		
		//AGGIUNGI UN DETTALIO PRODO ALLA SPESA, EX: LATTE,3)
		public boolean aggiungiProdottoSpesa(DettaglioProdotto dettaglio_prodotto, Spesa spesa) {
			
			if(dettaglio_prodotto == null || dettaglio_prodotto.getQuantit‡_acquistate() <= 0 || dettaglio_prodotto.getProdotto().getPrezzo()<=0 || dettaglio_prodotto.getProdotto() == null) {
				return false;
			}
			
			if(dettaglio_prodotto.quantit‡Disponibile() >= dettaglio_prodotto.getQuantit‡_acquistate() ) {
				spesa.addQuantit‡Prodotto(dettaglio_prodotto);	
				dettaglio_prodotto.rimuoviQuantit‡();
				return true;
			}
			System.out.println("LE QUANTITA' DEL PRODOTTO  SONO ESAURITE");
			return false;
		}
		
		//CREA DETTAGLIO PRODOTTO (EX: LATTE,3)
		public DettaglioProdotto creaDettaglioProdotto(Prodotto prodotto, int quantit‡) {
				
				if(prodotto == null) {
					return null;
				}
				DettaglioProdotto dettaglio_prodotto = new DettaglioProdotto(quantit‡, prodotto);
				
				return dettaglio_prodotto;
		}
		
		//RIMUOVI DETTAGLIO PRODOTTO DALLA SPESA
		public void rimuoviProdottoSpesa(DettaglioProdotto dettaglio_prodotto, Spesa spesa) {
			
			spesa.removeDettaglioProdotto(dettaglio_prodotto);
			
		}
		
		//QUANDO LA SPESA TERMINA, AGGIUNGI SPESA AL CLIENTE
		public void aggiungiSpesaACliente(Spesa s, ClienteRegistrato c) {
			if(s.getCosto() != 0.0) {
				c.addSpesa(s);
			}
			
		}
		
		
		//GENERA REPORT
		public ArrayList<ClienteRegistrato> generaReport(int N) {
			
			ArrayList<ClienteRegistrato> lista_clienti = new ArrayList<ClienteRegistrato>();
			
			if( N <= 0) {
				return lista_clienti;
			}
			
			StringBuffer buf = new StringBuffer();
			
			buf.append("ELENCO CLIENTI CON ALMENO " + N + " SPESE:\n\n ");
			
			for( ClienteRegistrato c : clienti) {
				
				if(c.getNumeroDiSpese() >= N) {
					
					
					lista_clienti.add(c);
					buf.append("NOME:" + c.getNome() + "  ");
					buf.append("NUMERO SPESE:" + c.getNumeroDiSpese() + "  ");
					buf.append("IMPORTO COMPLESSIVO SPESO:" +c.getCostiTotali() + "Ä\n ");
				}  
				
			}
			System.out.println(buf);
			if (lista_clienti.size() == 0) {
				System.out.println("NESSUN CLIENTE HA EFFETUATO PIU' DI " + N + " SPESE");
			}
			return lista_clienti;
		}
		
		
		
		
	
}

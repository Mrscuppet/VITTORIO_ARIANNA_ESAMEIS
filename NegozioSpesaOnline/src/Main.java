import java.time.LocalDate;
import java.time.Month;

import Entity.ClienteRegistrato;
import Entity.DettaglioProdotto;
import Entity.Prodotto;
import Entity.Spesa;
import control.GestioneSpeseNegozio;


public class Main {
	
	public static void main(String[] args) {
			
	
		
		GestioneSpeseNegozio gestoreSpeseNegozio = new GestioneSpeseNegozio();
		
		
	//CREAZIONE PRODOTTI
	
			
			Prodotto prodotto1 = new Prodotto("A10", "Sapone", "Profumato", 3.60 , 10);
			Prodotto prodotto2 = new Prodotto("A11", "Latte", "Scremato", 1.50 , 10);
			Prodotto prodotto3 = new Prodotto("B10", "Acqua", "Minerale", 1.60 , 10);
			Prodotto prodotto4 = new Prodotto("C10", "Acqua", "Naturale", 1.20 , 20);
			Prodotto prodotto5 = new Prodotto("C11", "CocaCola", "Zero", 2.60 , 10);
			Prodotto prodotto6 = new Prodotto("D11", "Fanta", "Light", 2.30 , 10);
			Prodotto prodotto7 = new Prodotto("E10", "Cioccolata", "Fondente", 4.50 , 10);
			Prodotto prodotto8 = new Prodotto("E11", "Cioccolata", "Latte", 3.50 , 10);
			Prodotto prodotto9 = new Prodotto("F10", "Carne", "Pollo", 5.50 , 10);
			Prodotto prodotto10 = new Prodotto("F11", "Carne", "Chianina", 6.60 , 10);
			
			
			
	//CREAZIONE CLIENTI
			
			
			ClienteRegistrato cliente1 = gestoreSpeseNegozio.creaCliente("Marco","Tammaro","3336177425","3620154115230215");
			ClienteRegistrato cliente2 = gestoreSpeseNegozio.creaCliente("Raffaele","Russo","26236211452","1521120112102563");
			ClienteRegistrato cliente3 = gestoreSpeseNegozio.creaCliente("Giammarco","La Montagna","111222545","12121454125412620");
			ClienteRegistrato cliente4 = gestoreSpeseNegozio.creaCliente("Giulia","Battella","125632141","1214521596685407");
			ClienteRegistrato cliente5 = gestoreSpeseNegozio.creaCliente("Leo","Messi","121212110","1254125469451210");
			
	//CREAZIONE LISTA SPESE, AGGIUNTA PRODOTTI, CONFERMA LISTA SPESE AGGIUNTA LISTE SPESE AI CLIENTI
			
			LocalDate dataSpesa1 = LocalDate.of(2019, Month.APRIL, 10);
			LocalDate dataSpesa2 = LocalDate.of(2019, Month.AUGUST, 11);
			LocalDate dataSpesa3 = LocalDate.of(2019, Month.JULY, 12);
			LocalDate dataSpesa4 = LocalDate.of(2019, Month.MAY, 13);
			LocalDate dataSpesa5 = LocalDate.of(2019, Month.OCTOBER, 14);
			LocalDate dataSpesa6 = LocalDate.of(2019, Month.DECEMBER, 16);
			LocalDate dataSpesa7 = LocalDate.of(2019, Month.AUGUST, 31);
			LocalDate dataSpesa8 = LocalDate.of(2019, Month.AUGUST, 01);
			
			
			Spesa ListaSpesa1 = gestoreSpeseNegozio.creaSpesa("A01", dataSpesa1);
			Spesa ListaSpesa2 = gestoreSpeseNegozio.creaSpesa("A02", dataSpesa2);
			Spesa ListaSpesa3 = gestoreSpeseNegozio.creaSpesa("A03", dataSpesa3);
			Spesa ListaSpesa4 = gestoreSpeseNegozio.creaSpesa("A04", dataSpesa4);
			Spesa ListaSpesa5 = gestoreSpeseNegozio.creaSpesa("A05", dataSpesa5);
			Spesa ListaSpesa6 = gestoreSpeseNegozio.creaSpesa("A06", dataSpesa6);
			Spesa ListaSpesa7 = gestoreSpeseNegozio.creaSpesa("A07", dataSpesa7);
			Spesa ListaSpesa8 = gestoreSpeseNegozio.creaSpesa("A08", dataSpesa8);
			
			
			
			DettaglioProdotto DettaglioProdotto1 = gestoreSpeseNegozio.creaDettaglioProdotto(prodotto1, 1);
			DettaglioProdotto DettaglioProdotto2 = gestoreSpeseNegozio.creaDettaglioProdotto(prodotto2, 6);
			DettaglioProdotto DettaglioProdotto3 = gestoreSpeseNegozio.creaDettaglioProdotto(prodotto3, 1);
			DettaglioProdotto DettaglioProdotto4 = gestoreSpeseNegozio.creaDettaglioProdotto(prodotto4, 4);
			DettaglioProdotto DettaglioProdotto5 = gestoreSpeseNegozio.creaDettaglioProdotto(prodotto5, 3);
			DettaglioProdotto DettaglioProdotto6 = gestoreSpeseNegozio.creaDettaglioProdotto(prodotto6, 2);
			
			
			
			gestoreSpeseNegozio.aggiungiProdottoSpesa(DettaglioProdotto1, ListaSpesa1);
			gestoreSpeseNegozio.aggiungiProdottoSpesa(DettaglioProdotto2, ListaSpesa2);
			gestoreSpeseNegozio.aggiungiProdottoSpesa(DettaglioProdotto3, ListaSpesa3);
			gestoreSpeseNegozio.aggiungiProdottoSpesa(DettaglioProdotto4, ListaSpesa4);
			gestoreSpeseNegozio.aggiungiProdottoSpesa(DettaglioProdotto5, ListaSpesa5);
			gestoreSpeseNegozio.aggiungiProdottoSpesa(DettaglioProdotto6, ListaSpesa6);
			gestoreSpeseNegozio.aggiungiProdottoSpesa(DettaglioProdotto1, ListaSpesa7);
			gestoreSpeseNegozio.aggiungiProdottoSpesa(DettaglioProdotto1, ListaSpesa8);
			
		
			
			
			gestoreSpeseNegozio.confermaSpesa(ListaSpesa1);
			gestoreSpeseNegozio.confermaSpesa(ListaSpesa2);
			gestoreSpeseNegozio.confermaSpesa(ListaSpesa3);
			gestoreSpeseNegozio.confermaSpesa(ListaSpesa4);
			gestoreSpeseNegozio.confermaSpesa(ListaSpesa5);
			gestoreSpeseNegozio.confermaSpesa(ListaSpesa6);
			gestoreSpeseNegozio.confermaSpesa(ListaSpesa7);
			gestoreSpeseNegozio.confermaSpesa(ListaSpesa8);
			
			
			gestoreSpeseNegozio.aggiungiSpesaACliente(ListaSpesa1, cliente2);
			gestoreSpeseNegozio.aggiungiSpesaACliente(ListaSpesa2, cliente2);
			gestoreSpeseNegozio.aggiungiSpesaACliente(ListaSpesa3, cliente3);
			gestoreSpeseNegozio.aggiungiSpesaACliente(ListaSpesa4, cliente4);
			gestoreSpeseNegozio.aggiungiSpesaACliente(ListaSpesa4, cliente4);
			gestoreSpeseNegozio.aggiungiSpesaACliente(ListaSpesa6, cliente5);
			gestoreSpeseNegozio.aggiungiSpesaACliente(ListaSpesa7, cliente5);
			gestoreSpeseNegozio.aggiungiSpesaACliente(ListaSpesa8, cliente1);
			
			
			//GENERA REPORT 
			
			
			int numero_minimo_di_spese = 1;
			
			gestoreSpeseNegozio.generaReport(numero_minimo_di_spese);
			
	
			
			
			
		
		
	}
}

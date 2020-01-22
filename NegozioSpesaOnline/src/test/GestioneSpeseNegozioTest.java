package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Entity.ClienteRegistrato;
import Entity.DettaglioProdotto;
import Entity.Prodotto;
import Entity.Spesa;
import control.GestioneSpeseNegozio;


public class GestioneSpeseNegozioTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.print("SETUP TEST Tests\n");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.print("TERMINA TEST Tests\n");
	}

	@Before
	public void setUp() throws Exception {
		System.out.print("Inizio Test\n");
	}

	@After
	public void tearDown() throws Exception {
		System.out.print("Fine Test\n");
	}

	
	
	@Test //NUMERO MINIMO DI SPESE <0
	public void test1() {
		System.out.println("\nTEST 1\n");
		GestioneSpeseNegozio gestoreSpeseNegozio = new GestioneSpeseNegozio();
		
		
		//CREAZIONE PRODOTTI
				Prodotto prodotto1 = new Prodotto("A10", "Sapone", "Profumato", 3.60 , 10);		
				
		//CREAZIONE CLIENTI			
				ClienteRegistrato cliente1 = gestoreSpeseNegozio.creaCliente("Marco","Tammaro","3336177425","3620154115230215");
						
		//CREAZIONE LISTA SPESE, AGGIUNTA PRODOTTI, CONFERMA LISTA SPESE AGGIUNTA LISTE SPESE AI CLIENTI
				LocalDate dataSpesa1 = LocalDate.of(2019, Month.APRIL, 10);
				
				Spesa ListaSpesa1 = gestoreSpeseNegozio.creaSpesa("A01", dataSpesa1);
				
				DettaglioProdotto DettaglioProdotto1 = gestoreSpeseNegozio.creaDettaglioProdotto(prodotto1, 1);
				
				gestoreSpeseNegozio.aggiungiProdottoSpesa(DettaglioProdotto1, ListaSpesa1);
				
				gestoreSpeseNegozio.confermaSpesa(ListaSpesa1);
				
				gestoreSpeseNegozio.aggiungiSpesaACliente(ListaSpesa1, cliente1);
				
				//GENERA REPORT 
				int numero_minimo_di_spese = -3;
				boolean result = gestoreSpeseNegozio.generaReport(numero_minimo_di_spese).isEmpty();
			
				assertTrue(result);
					
	}
	
	
	@Test //CLIENTI REGISTRATI 0
	public void test2() {
		System.out.println("\nTEST 2\n");
		GestioneSpeseNegozio gestoreSpeseNegozio = new GestioneSpeseNegozio();
		
		//GENERA REPORT 
		
		int numero_minimo_di_spese = 3;
		boolean result = gestoreSpeseNegozio.generaReport(numero_minimo_di_spese).isEmpty();
	
		assertTrue(result);
		
			
	}
	
	
	
	
	@Test //SPESA 0
	public void test3() {
		System.out.println("\nTEST 3\n");
		GestioneSpeseNegozio gestoreSpeseNegozio = new GestioneSpeseNegozio();
		
		Prodotto prodotto1 = new Prodotto("A10", "Sapone", "Profumato", 3.60 , 10);
		Prodotto prodotto2 = new Prodotto("A11", "Latte", "Scremato", 1.50 , 10);
		
		ClienteRegistrato cliente1 = gestoreSpeseNegozio.creaCliente("Marco","Tammaro","3336177425","3620154115230215");
		
		LocalDate dataSpesa1 = LocalDate.of(2019, Month.APRIL, 10);
		LocalDate dataSpesa2 = LocalDate.of(2019, Month.AUGUST, 11);
		
		Spesa ListaSpesa1 = gestoreSpeseNegozio.creaSpesa("A01", dataSpesa1);
		Spesa ListaSpesa2 = gestoreSpeseNegozio.creaSpesa("A02", dataSpesa2);
		
		DettaglioProdotto DettaglioProdotto1 = gestoreSpeseNegozio.creaDettaglioProdotto(prodotto1, 1);
		DettaglioProdotto DettaglioProdotto2 = gestoreSpeseNegozio.creaDettaglioProdotto(prodotto2, 6);
		
		gestoreSpeseNegozio.aggiungiProdottoSpesa(DettaglioProdotto1, ListaSpesa1);
		gestoreSpeseNegozio.aggiungiProdottoSpesa(DettaglioProdotto2, ListaSpesa1);
		
		gestoreSpeseNegozio.confermaSpesa(ListaSpesa1);
		gestoreSpeseNegozio.confermaSpesa(ListaSpesa2);
		
		//GENERA REPORT 
		
		int numero_minimo_di_spese = 3;
		boolean result = gestoreSpeseNegozio.generaReport(numero_minimo_di_spese).isEmpty();
			
				assertTrue(result);
		
	}
	
	@Test //DETTTAGLIO PRODOTTO NULL
	public void test4() {
		System.out.println("\nTEST 4\n");	
	GestioneSpeseNegozio gestoreSpeseNegozio = new GestioneSpeseNegozio();
		
		ClienteRegistrato cliente1 = gestoreSpeseNegozio.creaCliente("Marco","Tammaro","3336177425","3620154115230215");
		
		LocalDate dataSpesa1 = LocalDate.of(2019, Month.APRIL, 10);
		
		Spesa ListaSpesa1 = gestoreSpeseNegozio.creaSpesa("A01", dataSpesa1);
		
		DettaglioProdotto DettaglioProdotto1 = null;
		
		gestoreSpeseNegozio.aggiungiProdottoSpesa(DettaglioProdotto1, ListaSpesa1);
		
		gestoreSpeseNegozio.confermaSpesa(ListaSpesa1);
		
		gestoreSpeseNegozio.aggiungiSpesaACliente(ListaSpesa1, cliente1);
	
		
		//GENERA REPORT 
		
		int numero_minimo_di_spese = 1;
		boolean result = gestoreSpeseNegozio.generaReport(numero_minimo_di_spese).isEmpty();
			
				assertTrue(result);
		
	}
	

	@Test // PRODOTTO in DETTTAGLIO PRODOTTO NULL
	public void test5() {
		System.out.println("\nTEST 5\n");
	GestioneSpeseNegozio gestoreSpeseNegozio = new GestioneSpeseNegozio();
		
	ClienteRegistrato cliente1 = gestoreSpeseNegozio.creaCliente("Marco","Tammaro","3336177425","3620154115230215");
		
		LocalDate dataSpesa1 = LocalDate.of(2019, Month.APRIL, 10);
		
		Spesa ListaSpesa1 = gestoreSpeseNegozio.creaSpesa("A01", dataSpesa1);
		
		DettaglioProdotto DettaglioProdotto1 = gestoreSpeseNegozio.creaDettaglioProdotto(null, 5);
		
		gestoreSpeseNegozio.aggiungiProdottoSpesa(DettaglioProdotto1, ListaSpesa1);
		
		gestoreSpeseNegozio.confermaSpesa(ListaSpesa1);
		
		gestoreSpeseNegozio.aggiungiSpesaACliente(ListaSpesa1, cliente1);
	
		
		//GENERA REPORT 
		
		int numero_minimo_di_spese = 1;
		boolean result = gestoreSpeseNegozio.generaReport(numero_minimo_di_spese).isEmpty();
			
				assertTrue(result);
		
	}


	
	@Test//QUANTITA' ACQUISTATE <0
	public void test6() {
		System.out.println("\nTEST 6\n");
		GestioneSpeseNegozio gestoreSpeseNegozio = new GestioneSpeseNegozio();

		Prodotto prodotto1 = new Prodotto("A10", "Sapone", "Profumato", 3.60 , 10);
		
		ClienteRegistrato cliente1 = gestoreSpeseNegozio.creaCliente("Marco","Tammaro","3336177425","3620154115230215");
		
		LocalDate dataSpesa1 = LocalDate.of(2019, Month.APRIL, 10);
		
		Spesa ListaSpesa1 = gestoreSpeseNegozio.creaSpesa("A01", dataSpesa1);
		
		DettaglioProdotto DettaglioProdotto1 = gestoreSpeseNegozio.creaDettaglioProdotto(prodotto1, -3);
		
		gestoreSpeseNegozio.aggiungiProdottoSpesa(DettaglioProdotto1, ListaSpesa1);
		
		gestoreSpeseNegozio.confermaSpesa(ListaSpesa1);
		
		gestoreSpeseNegozio.aggiungiSpesaACliente(ListaSpesa1, cliente1);
	
		
		//GENERA REPORT 
		
		int numero_minimo_di_spese = 1;
		boolean result = gestoreSpeseNegozio.generaReport(numero_minimo_di_spese).isEmpty();
			
				assertTrue(result);
		
	}
	
	@Test //PREZZO PRODOTTO <=0
	public void test7() {
		System.out.println("\nTEST 7\n");
		GestioneSpeseNegozio gestoreSpeseNegozio = new GestioneSpeseNegozio();

		Prodotto prodotto1 = new Prodotto("A10", "Sapone", "Profumato", -3.60 , 10);
		
		ClienteRegistrato cliente1 = gestoreSpeseNegozio.creaCliente("Marco","Tammaro","3336177425","3620154115230215");
		
		LocalDate dataSpesa1 = LocalDate.of(2019, Month.APRIL, 10);
		
		Spesa ListaSpesa1 = gestoreSpeseNegozio.creaSpesa("A01", dataSpesa1);
		
		DettaglioProdotto DettaglioProdotto1 = gestoreSpeseNegozio.creaDettaglioProdotto(prodotto1, 5);
		
		gestoreSpeseNegozio.aggiungiProdottoSpesa(DettaglioProdotto1, ListaSpesa1);
		
		gestoreSpeseNegozio.confermaSpesa(ListaSpesa1);
		
		gestoreSpeseNegozio.aggiungiSpesaACliente(ListaSpesa1, cliente1);
	
		
		//GENERA REPORT 
		
		int numero_minimo_di_spese = 1;
		boolean result = gestoreSpeseNegozio.generaReport(numero_minimo_di_spese).isEmpty();
			
				assertTrue(result);
		
		
	}
	
	@Test //PREZZO PRODOTTO >0
	public void test8() {
		System.out.println("\nTEST 8\n");
		GestioneSpeseNegozio gestoreSpeseNegozio = new GestioneSpeseNegozio();

		Prodotto prodotto1 = new Prodotto("A10", "Sapone", "Profumato", 3.60 , 10);
		
		ClienteRegistrato cliente1 = gestoreSpeseNegozio.creaCliente("Marco","Tammaro","3336177425","3620154115230215");
		
		LocalDate dataSpesa1 = LocalDate.of(2019, Month.APRIL, 10);
		
		Spesa ListaSpesa1 = gestoreSpeseNegozio.creaSpesa("A01", dataSpesa1);
		
		DettaglioProdotto DettaglioProdotto1 = gestoreSpeseNegozio.creaDettaglioProdotto(prodotto1, 5);
		
		gestoreSpeseNegozio.aggiungiProdottoSpesa(DettaglioProdotto1, ListaSpesa1);
		
		gestoreSpeseNegozio.confermaSpesa(ListaSpesa1);
		
		gestoreSpeseNegozio.aggiungiSpesaACliente(ListaSpesa1, cliente1);
	
		
		//GENERA REPORT 
		
		int numero_minimo_di_spese = 1;
		int result = gestoreSpeseNegozio.generaReport(numero_minimo_di_spese).size();
			
				assertEquals(1,result);
		
		
	}
	
	
	
		
	
	
}

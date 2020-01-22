package Entity;
import java.util.ArrayList;

public class ClienteRegistrato {

	private String nome;
	private String password;
	private String nr_telefono_mobile;
	private String carta_di_credito;
	private ArrayList<Spesa> spese;
	
	
	
	public ClienteRegistrato(String nome, String password, String nr_telefono_mobile, String carta_di_credito, ArrayList<Spesa> spese) {
		this.nome = nome;
		this.password = password;
		this.nr_telefono_mobile = nr_telefono_mobile;
		this.carta_di_credito = carta_di_credito;
		this.spese = new ArrayList<Spesa>();
	}
	
	
	
	//CARTA CREDITO
	
	public String getCarta_di_credito() {
		return carta_di_credito;
	}



	public void setCarta_di_credito(String carta_di_credito) {
		this.carta_di_credito = carta_di_credito;
	}


	//NOME

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//PASSWORD
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;	
	}
	
	//NUMERO DI TELEFONO
	
	
	public String getNr_telefono_mobile() {
		return nr_telefono_mobile;
	}
	public void setNr_telefono_mobile(String nr_telefono_mobile) {
		this.nr_telefono_mobile = nr_telefono_mobile;
	}
	
	//SPESA
	
	public void addSpesa(Spesa spesa) {
		this.spese.add(spesa);
	}
	public ArrayList<Spesa> getProdotti() {
		return this.spese;
	}
	
	
	//CALCOLO DEL NUMERO DELLE SPESE
	public int getNumeroDiSpese() {
		
		return this.spese.size();
		
	}
	
	
	//CALCOLO DEI COSTI TOTALI DELLE SPESE
	public double getCostiTotali() {
		
		double costiTotali = 0.0;

			for(Spesa s : spese) {
			
				costiTotali = costiTotali + s.getCosto();
			}
			
			return costiTotali;
		
	}

	
	
}



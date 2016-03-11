package builder;

import java.util.Calendar;

public class GeradorDeBoleto {
	
	private BoletoBuilder boletoBuilder;
	
	public GeradorDeBoleto(BoletoBuilder boletoBuilder){
		this.boletoBuilder = boletoBuilder;
	}
	
	public Boleto gerarBoleto(){
		
		this.boletoBuilder.buildSacado("Napoleão Kazu Onaya");
		this.boletoBuilder.buildCedente("ASIS Projetos");
		this.boletoBuilder.buildValor(100.54);
		
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);
		this.boletoBuilder.buildVencimento(vencimento);
		
		this.boletoBuilder.buildNossoNumero(1234);
		
		Boleto boleto = boletoBuilder.getBoleto();
		
		return boleto;
	}

}

package br.com.barber.appbarber.config;

public class ErroDeValidacaoFormularioDto {
	private String campo;
	private String mensagem;
	public ErroDeValidacaoFormularioDto(String campo, String mensagem) {
		this.campo = campo;
		this.mensagem = mensagem;
	}
	public String getCampo() {
		return campo;
	}
	public String getMensagem() {
		return mensagem;
	}
	
	
	
}
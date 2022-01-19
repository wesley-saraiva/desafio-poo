package br.com.desafio.dominios;

public abstract class Veiculo {

	private String marca;
	private String modelo;
	private String combustivel;
	private String cor;
	private Boolean licenciamento;
	private Boolean ipva;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Boolean getLicenciamento() {
		return licenciamento;
	}

	public void setLicenciamento(Boolean licenciamento) {
		this.licenciamento = licenciamento;
	}

	public Boolean getIpva() {
		return ipva;
	}

	public void setIpva(Boolean ipva) {
		this.ipva = ipva;
	}

	public String verificarLicenciamentoPago() {
		if (licenciamento == true && licenciamento != null) {
			return "Licenciamento pago";
		} else {
			return "Licenciamento nao pago";
		}

	}

	public String verificarIPvaPago() {
		if (ipva == true && ipva != null) {
			return "IPVA pago";
		} else {
			return "IPVA não pago";
		}

	}

	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", combustivel=" + combustivel + ", cor=" + cor
				+ ", licenciamento=" + licenciamento + ", ipva=" + ipva + "]";
	}

}

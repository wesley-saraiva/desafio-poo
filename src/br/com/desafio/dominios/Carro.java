package br.com.desafio.dominios;

public class Carro extends Veiculo {

	private Boolean arcondicionado;
	private Integer numerosPortas;

	public Boolean getArcondicionado() {
		return arcondicionado;
	}

	public void setArcondicionado(Boolean arcondicionado) {
		this.arcondicionado = arcondicionado;
	}

	public Integer getNumerosPortas() {
		return numerosPortas;
	}

	public void setNumerosPortas(Integer numerosPortas) {
		this.numerosPortas = numerosPortas;
	}

	@Override
	public String toString() {
		return "Carro [arcondicionado=" + arcondicionado + ", numerosPortas=" + numerosPortas + ", getMarca()="
				+ getMarca() + ", getModelo()=" + getModelo() + ", getCombustivel()=" + getCombustivel() + ", getCor()="
				+ getCor() + ", getLicenciamento()=" + getLicenciamento() + ", getIpva()=" + getIpva() +"]";
	}

	

}

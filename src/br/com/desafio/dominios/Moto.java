package br.com.desafio.dominios;

public class Moto extends Veiculo {

	private Boolean carroceria;
	private Boolean capacete;

	public Boolean getCarroceria() {
		return carroceria;
	}

	public void setCarroceria(Boolean carroceria) {
		this.carroceria = carroceria;
	}

	public Boolean getCapacete() {
		return capacete;
	}

	public void setCapacete(Boolean capacete) {
		this.capacete = capacete;
	}

	public String possuirCapacete() {
		if (capacete == true && capacete != null) {
			return "Possui";
		} else {
			return "Não possui";
		}
	}

	public String possuiCarroceria() {
		if (carroceria == true && carroceria != null) {
			return "Possui";
		} else {
			return "Não possui";
		}
	}

	@Override
	public String toString() {
		return "Moto [carroceria=" + carroceria + ", capacete=" + capacete + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getCombustivel()=" + getCombustivel() + ", getCor()=" + getCor()
				+ ", getLicenciamento()=" + getLicenciamento() + ", getIpva()=" + getIpva()
				+ ", verificarLicenciamentoPago()=" + verificarLicenciamentoPago() + ", verificarIPvaPago()="
				+ verificarIPvaPago() + "]";
	}

}

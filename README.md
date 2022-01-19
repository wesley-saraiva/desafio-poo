# Desafio POO 

## Descrição do projeto

### Projeto desafio-poo desenvolvido em java com POO(Programação orientada a objetos) com conceitos de abstração, ensapsulamento, heranca e polimorfismo.
### Classes

- Main (Classe Principal);
- Veículo (Classe com abstração);
- Carro (Herdada com a classe Veiculo);
- Moto (Herdada com a classe Veículo);

### Classe Main

package br.com.desafio.main;

import br.com.desafio.dominios.Carro;
import br.com.desafio.dominios.Moto;

public class Main {

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		carro1.setMarca("Fiat");
		carro1.setModelo("Toro");
		carro1.setArcondicionado(true);
		carro1.setCombustivel("Gasolina");
		carro1.setCor("Preto");
		carro1.setNumerosPortas(2);
		carro1.setIpva(true);
		carro1.setLicenciamento(true);
		System.out.println("Informações do veiculo: " + carro1);
		System.out.println("Situação IPVA: " + carro1.verificarIPvaPago());
		System.out.println("Situação Licenciamento: " + carro1.verificarLicenciamentoPago());

		System.out.println("--------------------------------------------------------------");

		Moto moto1 = new Moto();
		moto1.setMarca("Honda");
		moto1.setModelo("Bros 175CC");
		moto1.setCor("vermelha");
		moto1.setCombustivel("Gasolina");
		moto1.setCapacete(true);
		moto1.setCarroceria(false);
		moto1.setIpva(true);
		moto1.setLicenciamento(false);
		System.out.println("Informações do veiculo: " + moto1);
		System.out.println("IPVA situação: " + moto1.verificarIPvaPago());
		System.out.println("Licenciamento situação: " + moto1.verificarLicenciamentoPago());
		System.out.println("Capacete: " + moto1.possuirCapacete());
		System.out.println("Carroceria: " + moto1.possuiCarroceria());

	}

}

### Classe Veiculo

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

	public String verificarLicenciamentoPago() { // Metodo para verificar se o veículo está com licenciamento pago 
		if (licenciamento == true && licenciamento != null) {
			return "Licenciamento pago";
		} else {
			return "Licenciamento nao pago";
		}

	}

	public String verificarIPvaPago() { // Metodo para verificar se o veículo está com ipva pago 
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

### Classe Carro

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

### Classe Moto

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

	public String possuirCapacete() { // Metodo para verificar se o condutor tem capacete
		if (capacete == true && capacete != null) {
			return "Possui";
		} else {
			return "Não possui";
		}
	}

	public String possuiCarroceria() { // Metodo para verificar se o condutor tem carroceria
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

#### Autor : Wesley Marques Saraiva



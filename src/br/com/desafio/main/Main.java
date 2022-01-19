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

package Atividade;

/**
* 	atividade ADC1 Programação Orientada a Objetos.
 *  autor: Caio Rodrigues da Silva 
 *  data: 22/03/2024
 */

import java.sql.Date;

public class Veiculo {
	
	//atributos
	
	private String modelo, fabricante, placa;
	private int anoFabricacao;
	private float valor;
	private Date dataCompra;

	//construtor
	
	public Veiculo(String modelo, String fabricante, String placa, int anoFabricacao, float valor, Date dataCompra) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
		this.valor = valor;
		this.dataCompra = dataCompra;
	}

	//métodos
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getFabricante() {
		return this.fabricante;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getAnoFabricacao() {
		return this.anoFabricacao;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getValor() {
		return this.valor;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Date getDataCompra() {
		return this.dataCompra;
	}
}
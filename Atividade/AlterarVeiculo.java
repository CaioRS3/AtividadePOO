package Atividade;

/**
 *  atividade ADC1 Programação Orientada a Objetos. 
 *  autor: Caio Rodrigues da Silva.
 *  data: 22/03/2024.
 */

public class AlterarVeiculo {
	public static boolean alterarVeiculoPorPlaca(Veiculo[] veiculos, String placa, Veiculo novoVeiculo) {
		for (int i = 0; i < veiculos.length; i++) {
			if (veiculos[i] != null && veiculos[i].getPlaca().equalsIgnoreCase(placa)) {
				veiculos[i] = novoVeiculo;
				return true;
			}
		}
		return false;
	}
}

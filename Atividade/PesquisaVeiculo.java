package Atividade;

/**
 * 	atividade ADC1 Programação Orientada a Objetos.
 *  autor: Caio Rodrigues da Silva 
 *  data: 22/03/2024
 */
public class PesquisaVeiculo {

    public static Veiculo pesquisarVeiculoPorPlaca(Veiculo[] veiculos, String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo != null && veiculo.getPlaca().equalsIgnoreCase(placa)) {
                return veiculo;
            }
        }
        return null;
    }
}
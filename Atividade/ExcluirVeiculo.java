package Atividade;

/**
 * 	atividade ADC1 Programação Orientada a Objetos.
 *  autor: Caio Rodrigues da Silva 
 *  data: 22/03/2024
 */

public class ExcluirVeiculo {

    public static boolean excluirVeiculoPorPlaca(Veiculo[] veiculos, String placaExcluir) {
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] != null && veiculos[i].getPlaca().equalsIgnoreCase(placaExcluir)) {
                veiculos[i] = null; 
                return true;
            }
        }
        return false;
    }
}
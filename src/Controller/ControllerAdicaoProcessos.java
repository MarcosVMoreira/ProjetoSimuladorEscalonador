package Controller;

import Model.ModelProcesso;
import java.util.LinkedList;
import java.util.Random;

public class ControllerAdicaoProcessos {
    
    private ModelProcesso modelProcesso;

    private LinkedList<ModelProcesso> listaProcessos;
    
        private Random gerador = new Random();


    public ControllerAdicaoProcessos(LinkedList<ModelProcesso> lista) {
        listaProcessos = lista;
    }

    public void adicionaNaListaController(ModelProcesso processo) {
        listaProcessos.add(processo);
    }

    public void geraLista(int contador) {
        for (int j = 0; j < 6; j++) {
            modelProcesso = new ModelProcesso();

            int aux = gerador.nextInt(26) + 1;

            modelProcesso.setNumeroProcesso(contador);
            modelProcesso.setTempoExecucao(aux);

            if (aux % 2 == 0) {
                modelProcesso.setTipoProcesso(false);
            } else {
                modelProcesso.setTipoProcesso(true);
            }

            adicionaNaListaController(modelProcesso);
            contador++;

        }

    }
}

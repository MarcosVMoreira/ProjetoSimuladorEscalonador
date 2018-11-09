package Controller;

import Model.ModelProcesso;
import java.util.LinkedList;

public class ControllerAdicaoProcessos {

    private LinkedList<ModelProcesso> listaProcessos;

    public ControllerAdicaoProcessos(LinkedList<ModelProcesso> lista) {
        listaProcessos = lista;
    }

    public void adicionaNaListaController(ModelProcesso processo) {
        listaProcessos.add(processo);
    }
}

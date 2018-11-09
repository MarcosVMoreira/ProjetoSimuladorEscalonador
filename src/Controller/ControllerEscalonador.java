package Controller;

import Model.ModelProcesso;
import java.util.LinkedList;

public class ControllerEscalonador {

    private LinkedList<ModelProcesso> listaProcessos;

    public ControllerEscalonador (LinkedList<ModelProcesso> lista) {
        listaProcessos = new LinkedList<>(lista);
    }

}

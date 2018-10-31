/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelProcesso;
import java.util.LinkedList;

/**
 *
 * @author root
 */
public class ControllerAdicaoProcessos {

    private LinkedList<ModelProcesso> listaProcessos;

    public ControllerAdicaoProcessos(LinkedList<ModelProcesso> lista) {
        listaProcessos = lista;
    }

    public void adicionaNaListaController(ModelProcesso processo) {
        listaProcessos.add(processo);
    }
}

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
public class ControllerEscalonador {

    private LinkedList<ModelProcesso> listaProcessos;

    public ControllerEscalonador (LinkedList<ModelProcesso> lista) {
        listaProcessos = new LinkedList<>(lista);
    }

}

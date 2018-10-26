/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author root
 */
public class ModelProcesso {

    private int numeroProcesso;
    private boolean tipoProcesso;
    private int tempoExecucao;

    /**
     * @return the numeroProcesso
     */
    public int getNumeroProcesso() {
        return numeroProcesso;
    }

    /**
     * @param numeroProcesso the numeroProcesso to set
     */
    public void setNumeroProcesso(int numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    /**
     * @return the tipoProcesso
     */
    public boolean isTipoProcesso() {
        return tipoProcesso;
    }

    /**
     * @param tipoProcesso the tipoProcesso to set
     */
    public void setTipoProcesso(boolean tipoProcesso) {
        this.tipoProcesso = tipoProcesso;
    }

    /**
     * @return the tempoExecucao
     */
    public int getTempoExecucao() {
        return tempoExecucao;
    }

    /**
     * @param tempoExecucao the tempoExecucao to set
     */
    public void setTempoExecucao(int tempoExecucao) {
        this.tempoExecucao = tempoExecucao;
    }

}

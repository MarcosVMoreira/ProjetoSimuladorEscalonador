package Model;

public class ModelProcesso {

    private int numeroProcesso;
    private boolean tipoProcesso;
    private int tempoExecucao;
    private int listaAtual;
    private int ciclosIO;
    
    
    
    public int getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(int numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public boolean isTipoProcesso() {
        return tipoProcesso;
    }

    public void setTipoProcesso(boolean tipoProcesso) {
        this.tipoProcesso = tipoProcesso;
    }

    public int getTempoExecucao() {
        return tempoExecucao;
    }

    public void setTempoExecucao(int tempoExecucao) {
        this.tempoExecucao = tempoExecucao;
    }

    /**
     * @return the listaAtual
     */
    public int getListaAtual() {
        return listaAtual;
    }

    /**
     * @param listaAtual the listaAtual to set
     */
    public void setListaAtual(int listaAtual) {
        this.listaAtual = listaAtual;
    }

    /**
     * @return the ciclosIO
     */
    public int getCiclosIO() {
        return ciclosIO;
    }

    /**
     * @param ciclosIO the ciclosIO to set
     */
    public void setCiclosIO(int ciclosIO) {
        this.ciclosIO = ciclosIO;
    }

}

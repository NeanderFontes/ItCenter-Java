package EmpresaAerea;

/**
 *
 */
public class Aviao {
    private int serial, anoFabricacao, numMotores;
    private String modelo;
    private double peso, cumprimentoFuselagem, envergaduraAsas, alturaCauda, autonomia, velMax, precoAviao;

    /**
     * Método Construtor da SuperClass <b>Avião</b>
     * @param serial - Numeo de Serie
     * @param anoFabricacao - Ano Fabricação
     * @param numMotores - Numero de MOtoros
     * @param modelo - Modelo
     * @param peso - Peso (kg)
     * @param cumprimentoFuselagem - Cumprimento da Fuselagem (m)
     * @param envergaduraAsas - Envergadura da Asa - (m)
     * @param alturaCauda - Altura da Cauda(m)
     * @param autonomia - Autonomia (l)
     * @param velMax - Velocidade Max (kt)
     * @param precoAviao - Valor(€)
     */
    public Aviao(int serial, int anoFabricacao, int numMotores, String modelo, double peso, double cumprimentoFuselagem, double envergaduraAsas, double alturaCauda, double autonomia, double velMax, double precoAviao) {
        this.serial = serial;
        this.anoFabricacao = anoFabricacao;
        this.numMotores = numMotores;
        this.modelo = modelo;
        this.peso = peso;
        this.cumprimentoFuselagem = cumprimentoFuselagem;
        this.envergaduraAsas = envergaduraAsas;
        this.alturaCauda = alturaCauda;
        this.autonomia = autonomia;
        this.velMax = velMax;
        this.precoAviao = precoAviao;
    }

    /**
     * Método para imprimir no console detalhes do <b>Avião</b>
     */
    public void exibirDetalhes(){
        System.out.println("\nModelo: "+this.modelo);
        System.out.println("Serial: "+this.serial);
        System.out.println("Ano Fabrico: "+this.anoFabricacao);
        System.out.println("Número de Motores: "+this.numMotores);
        System.out.println("Peso: "+this.peso+" Kg.");
        System.out.println("Comprimento da Fuselagem: "+this.cumprimentoFuselagem+" m.");
        System.out.println("Envergadura das Asas: "+this.envergaduraAsas+" m.");
        System.out.println("Altura da Causa: "+this.alturaCauda+" m.");
        System.out.println("Autonomia: "+this.autonomia+" Km.");
        System.out.println("Velocidade Máxima: "+this.velMax+" Kt.");
        System.out.println("Preço: "+this.precoAviao+" €");
    }

    /**
     * Métodos Especiais Getter e Setter:
     */
    public int getSerial() {
        return this.serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getAnoFabricacao() {
        return this.anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getNumMotores() {
        return this.numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCumprimentoFuselagem() {
        return this.cumprimentoFuselagem;
    }

    public void setCumprimentoFuselagem(double cumprimentoFuselagem) {
        this.cumprimentoFuselagem = cumprimentoFuselagem;
    }

    public double getEnvergaduraAsas() {
        return this.envergaduraAsas;
    }

    public void setEnvergaduraAsas(double envergaduraAsas) {
        this.envergaduraAsas = envergaduraAsas;
    }

    public double getAlturaCauda() {
        return this.alturaCauda;
    }

    public void setAlturaCauda(double alturaCauda) {
        this.alturaCauda = alturaCauda;
    }

    public double getAutonomia() {
        return this.autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public double getVelMax() {
        return this.velMax;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    public double getPrecoAviao() {
        return this.precoAviao;
    }

    public void setPrecoAviao(double precoAviao) {
        this.precoAviao = precoAviao;
    }
}

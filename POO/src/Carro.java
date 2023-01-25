class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    // construtor
    Carro() {

    }

    // construtor com sobrecarga
    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // set = colocar um valor em um atributo, colocar um valor no atributo cor.
    void setCor(String cor) {
        this.cor = cor;
    }

    // get = retorne a cor desse carro. Se vai retorna algo, não pode ser void.
    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    // get e o set do tanque
    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(int capacidadeTanque) {
        return capacidadeTanque;
    }

    // método de total para encher o tanque - empplementar uma lógica aqui

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }

}
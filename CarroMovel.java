// Carro implementa FazSom e Movimenta
class CarroMovel implements FazSom, Movimenta {
    @Override
    public void emitirSom() {
        System.out.println("Vroom vroom!");  // Som do carro
    }

    @Override
    public void mover() {
        System.out.println("Carro acelerando!");  // Movimento do carro
    }
}
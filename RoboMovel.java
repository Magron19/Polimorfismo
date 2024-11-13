// Robo implementa FazSom e Movimenta
class RoboMovel implements FazSom, Movimenta {
    @Override
    public void emitirSom() {
        System.out.println("Beep beep!");  // Som do robô
    }

    @Override
    public void mover() {
        System.out.println("Robo se movendo!");  // Movimento do robô
    }
}

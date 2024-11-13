// Classe Alarme que implementa a interface FazSom
public class Alarme implements FazSom {
    @Override
    public void emitirSom() {
        System.out.println("Bip bip!");  // Som do alarme
    }
}
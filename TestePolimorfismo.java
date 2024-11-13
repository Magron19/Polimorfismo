// Teste Polimorfismo por Herança e por Interface
import java.util.ArrayList;
import java.util.List;

public class TestePolimorfismo {
    public static void main(String[] args) {
        // ** Teste de Polimorfismo por Herança **
        System.out.println("** Polimorfismo por Herança **");
        Animal[] animais = { new Cachorro(), new Gato(), new Papagaio() };
        for (Animal animal : animais) {
            animal.fazerSom();  // O método fazerSom é polimórfico, pois pode ser chamado em diferentes tipos de Animal
        }

        // ** Teste de Polimorfismo por Interface **
        System.out.println("\n** Polimorfismo por Interface **");
        List<FazSom> emissoresDeSom = new ArrayList<>();
        emissoresDeSom.add(new Alarme());
        emissoresDeSom.add(new Robo());
        emissoresDeSom.add(new Carro());

        for (FazSom emissor : emissoresDeSom) {
            emissor.emitirSom();  // O método emitirSom pode ser chamado em qualquer classe que implemente a interface FazSom
        }

        // ** Teste de Múltiplas Interfaces **
        System.out.println("\n** Movimentação e Som de Entidades **");
        List<Movimenta> entidadesMoviveis = new ArrayList<>();
        entidadesMoviveis.add(new RoboMovel());
        entidadesMoviveis.add(new CarroMovel());

        for (Movimenta entidade : entidadesMoviveis) {
            entidade.mover();  // O método mover pode ser chamado em qualquer classe que implemente a interface Movimenta
        }

        // Teste de polimorfismo combinando som e movimento
        System.out.println("\n** Combinação de Som e Movimento **");
        for (Movimenta entidade : entidadesMoviveis) {
            if (entidade instanceof FazSom) {
                ((FazSom) entidade).emitirSom();  // Chamando o som do movimento
            }
            entidade.mover();  // Chamando o movimento
        }
    }
}
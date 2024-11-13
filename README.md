# Explicação e Defesa do Código:

* 1. Polimorfismo por Herança:
* Como funciona: A classe Animal é uma classe base abstrata, e as subclasses (Cachorro, Gato, Papagaio) a estendem e implementam o método fazerSom() de maneiras específicas. No teste, criamos um array de Animal e chamamos o método fazerSom() para diferentes tipos de animais, demonstrando que o mesmo método se comporta de maneira diferente dependendo da instância.

# Vantagens:

* 1.1 Facilidade de Expansão:
* Para adicionar um novo tipo de animal, basta criar uma nova classe que estenda Animal e implemente o método fazerSom(). Não é necessário modificar o código existente.
  
* 1.2 Encapsulamento: A lógica específica de como cada animal faz o som está encapsulada em suas próprias classes, mantendo o código mais organizado e modular.
* Princípio da Substituição de Liskov (LSP): O código pode usar a classe Animal em qualquer lugar sem se preocupar com qual tipo de animal está sendo utilizado, pois todos os tipos derivados de Animal têm a garantia de que irão implementar fazerSom().
  
* 2. Polimorfismo por Interface:
* Como funciona: A interface FazSom define um contrato que exige que qualquer classe que a implemente forneça uma implementação do método emitirSom(). As classes Alarme, Robo, e Carro implementam essa interface, permitindo que todas sejam tratadas polimorficamente no mesmo método que aceita uma lista de objetos que implementam FazSom.

# Vantagens:

* 2.1 Desacoplamento:
* Usando interfaces, podemos separar a definição do comportamento (FazSom) da implementação real. Isso significa que podemos adicionar novas classes que emitem sons (como um novo tipo de alarme) sem modificar as classes existentes.
  
* 2.2 Flexibilidade e Reusabilidade:
* A interface permite que classes que não têm uma relação de herança possam ser tratadas de maneira semelhante, por exemplo, um Robo e um Carro podem ser tratados da mesma forma, apesar de não compartilharem uma classe base comum.
  
* 2.3 Múltiplas Interfaces:
* Uma classe pode implementar várias interfaces, como demonstrado no Carro, que implementa tanto FazSom quanto Movimenta. Isso aumenta a flexibilidade e a reutilização do código.
  
* 2.4 Princípio da Segregação de Interfaces (ISP):
* O uso de interfaces permite que classes implementem apenas os comportamentos de que realmente precisam, sem ser forçadas a herdar comportamentos indesejados de uma superclasse.
  
# Conclusão:
* O polimorfismo por herança é útil quando existe uma relação clara de "é um tipo de", permitindo que subclasses herdem comportamentos e características de uma classe base. Já o polimorfismo por interface é vantajoso quando diferentes classes (que não compartilham uma hierarquia comum) precisam compartilhar comportamentos, permitindo um design mais flexível e desacoplado. Ambas as abordagens aumentam a modularidade, a extensibilidade e a reutilização do código.

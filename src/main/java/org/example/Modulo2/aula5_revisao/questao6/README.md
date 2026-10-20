Encapsulamento

Na classe Funcionario, foi declarado nome e salarioBase como private e criado getters e setters para controlar o acesso aos atributos.

private String nome;
private double salarioBase;



Herança

Desenvolvedor e Gerente herdam de Funcionario usando extends.

public class Gerente extends Funcionario


Abstração

A classe Funcionario é abstrata e define o método calcularSalario() sem determinar como cada tipo de funcionário deve calculá-lo.

public abstract double calcularSalario();



Polimorfismo

O mesmo método calcularSalario() produz resultados diferentes dependendo do objeto: 20% a mais para o desenvolvedor e 50% a mais para o gerente.

return getSalarioBase() * 1.20; // Desenvolvedor

Interfaces e sobrescrita

NotificadorEmail e NotificadorSms implementam Notificador com implements e sobrescrevem notificar() usando @Override.

E o SOLID

S — Single Responsibility Principle

Aplicado

Cada classe tem uma responsabilidade principal: Funcionario representa os dados e o comportamento comum do funcionário, os notificadores enviam mensagens e FolhaDePagamento coordena o pagamento e a notificação.


O — Open/Closed Principle

Demonstrado

Você pode criar um NotificadorWhatsApp, por exemplo, implementando Notificador, sem precisar alterar a lógica interna de FolhaDePagamento.


L — Liskov Substitution Principle

Parcialmente demonstrado

Desenvolvedor e Gerente podem ser usados onde se espera um Funcionario. Para afirmar que o princípio está plenamente respeitado, também precisamos verificar se as subclasses mantêm os comportamentos e contratos esperados da classe base.


I — Interface Segregation Principle

Compatível

A interface Notificador é pequena e específica: define somente notificar(String mensagem). As implementações não são obrigadas a implementar métodos desnecessários.


D — Dependency Inversion Principle

Aplicado

FolhaDePagamento depende da abstração Notificador, em vez de depender diretamente de NotificadorEmail ou NotificadorSms.

private final Notificador notificador;

public FolhaDePagamento(Notificador notificador) {
this.notificador = notificador;
}
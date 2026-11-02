# Lista de Exercícios – POO Aula 09: Construindo Métodos e Construtores

**Disciplina:** Programação Orientada a Objetos (Java)\
**Aluno:** Gabriel Moises Alves

## Parte 1 – Teoria: Métodos

> **Questão 1.** Qual é o nome do método que, sozinho, poderia fazer toda aplicação Java rodar? Por que, se você só utiliza esse método para programar, não está usando todo o potencial da programação orientada a objetos?

R1: O método main. Se você só utiliza esse método para programar, não está usando todo o potencial da programação orientada a objetos porque o método main é apenas um ponto de entrada para a aplicação e não aproveita os conceitos de encapsulamento, herança e polimorfismo que são fundamentais na POO.

> **Questão 2.** Segundo a aula, o que são métodos? Cite as quatro características apresentadas no slide “Métodos”.

R2: **Métodos:**
- Métodos definem ações a serem tomadas na execução de um programa. 
- São conjuntos ordenados de declarações de dados, instruções e expressões. 
- Tratam-se de blocos nomeados de código, que exercem uma função
específica (Ex.: soma, imprime, calcula...).
- São definidos dentro de alguma classe.

> **Questão 3.** Funções e procedimentos existem dentro de classes? Explique qual é o nome dado aos blocos nomeados que existem dentro de uma classe.

R3: Funções e procedimentos não existem dentro de classes. Os blocos nomeados que existem dentro da classe são o métodos.

> **Questão 4.** Cite as seis vantagens em utilizar métodos apresentadas na aula.

R4: Vantagens de utilizar métodos:
- Reduzem o tamanho do código-fonte de programas.
- Facilitam a visualização e compreensão de programas.
- Pensa-se na solução do problema por partes.
- É mais fácil corrigir e detectar erros.
- Se é preciso alterar, altera-se apenas uma vez.
- Um mesmo método pode ser utilizado em várias classes.

> **Questão 5.** Como a aula classifica os métodos? Cite as três classificações.

R5: A aula classifica os métodos em três tipos:
1. Métodos sem parâmetros.
2. Métodos com parâmetro(s).
3. Métodos que retornam valor (ou não retornam) – podem ser com parâmetros ou sem parâmetros.

> **Questão 6.** Qual é a diferença entre parâmetro e argumento? No exemplo abaixo, identifique qual é o parâmetro e qual é o argumento.

```java
public void saudação (String nome) {
    System.out.println("Olá, " + nome);
}

saudação ("Maria");
```

R6: Parâmetro é a variável definida na assinatura do método que recebe um valor quando o método é chamado. Argumento é o valor real passado para o método quando ele é invocado. No exemplo acima, `String nome` é o parâmetro e `"Maria"` é o argumento.

> **Questão 7.** O que indica o modificador void? Exibir uma mensagem no console ou abrir uma janela para o usuário é uma forma de retorno? Justifique.

R7: O modificador `void` indica que o método não retorna nenhum valor. Exibir uma mensagem no console ou abrir uma janela para o usuário não é considerado uma forma de retorno, pois essas ações não fornecem um valor de volta ao chamador do método, elas apenas realizam uma ação sem retornar dados.

> **Questão 8.** O que significa “retornar valor”? Na linha ```java
double v1 = mediaAritmética(8, 10);```, para onde o método mediaAritmética(double, double) retorna o valor?

R8: "Retornar valor" significa que o método fornece um resultado que pode ser utilizado pelo código que o chamou. Na linha `double v1 = mediaAritmética(8, 10);`, o método `mediaAritmética(double, double)` retorna um valor do tipo `double`, que é então armazenado na variável `v1`.

> **Questão 9.** Quando um método possui os parênteses vazios, o que isso significa?

R9: Significa que o método não recebe nenhum parâmetro.

> **Questão 10.** Observe o método abaixo. O que o modificador static faz? E o void? Qual é a sintaxe de um método que retorna valor e qual palavra reservada é usada para efetivamente retornar o valor?

```java
public static void metodoTeste() {
    // Lista de instruções
}
```

R10: O modificador `static` indica que o método pertence à classe e não a uma instância específica da classe, permitindo que ele seja chamado sem criar um objeto da classe. O `void` indica que o método não retorna nenhum valor. A sintaxe de um método que retorna valor inclui o tipo de retorno antes do nome do método (por exemplo, `public int metodoComRetorno()`) e a palavra reservada `return` é usada para efetivamente retornar o valor desejado.

## Parte 2 – Prática: Construindo Métodos

### Exercício 1 – Escopo dos métodos dentro da classe

> Observe o código abaixo. Atente para o escopo de cada método dentro da classe e observe que existem chaves mais externas, que delimitam toda a classe, e chaves mais internas, que circundam o alcance de cada método.

```java
public class Principal {

    public static void main(String args[]) {
        System.out.println("Patati, Patata");
    }

    public void escreva() {
        System.out.println("Patati, Patata");
    }

}
```

> a) Quais são os dois métodos dentro da classe Principal?

> b) Marque no código as chaves externas (da classe) e as chaves internas (de cada método).

R1:

a) Os dois métodos dentro da classe Principal são: `main` e `escreva`.

b): 
```java
public class Principal { // Chave externa da classe
    public static void main(String args[]) { // Chave interna do método main
        System.out.println("Patati, Patata");
    }

    public void escreva() { // Chave interna do método escreva
        System.out.println("Patati, Patata");
    }

}
```

### Exercício 2 – Chamando um método na mesma classe

> Modifique o conteúdo do método main() para chamar o método escreva(). Observe que ainda estamos programando numa única classe.

```java
public class Principal {

    public static void main(String args[]) {
        escreva();
    }

    public static void escreva() {
        System.out.println("Patati, Patata");
    }
}
```

> Explique: por que o método escreva() passou a ser static?

R2: O método `escreva()` passou a ser `static` para que ele possa ser chamado diretamente dentro do método `main()`, sem a necessidade de criar uma instância da classe `Principal`. Métodos `static` pertencem à classe em si, permitindo que sejam acessados sem a criação de objetos.

### Exercício 3 – Acessando um método de outra classe

> A situação agora é um pouco diferente. Foi criada uma outra classe chamada Secundária, e o método escreva() foi implementado lá. Como acessamos esse método a partir da classe Principal?

```java
public class Principal {

    public static void main(String args[]) {
        //Como chamar o método escreva()?
    }
}

public class Secundária {
    
    public void escreva() {
        System.out.println("Patati, Patata");
    }
}
```

> a) Opção 1 – Criando objeto da classe: crie um objeto da classe Secundária e chame seu método escreva().

> b) Opção 2 – Método estático: transforme o método em estático e chame-o digitando o nome da classe, um ponto e o nome do método.

> c) Qual a diferença entre as duas opções?

R3: A diferença entre as duas opções é que na opção 1, é necessário criar uma instância da classe Secundária para poder chamar o método escreva(), enquanto na opção 2, o método é estático e pode ser chamado diretamente pela classe, sem a necessidade de criar uma instância.

### Exercício 4 – Média de um aluno

> Faça um programa para ler 2 notas de um determinado aluno e calcular sua média.

> *Observação: todo o código deve ficar no método main(), numa única classe.*

R4: [Resposta no arquivo `src/MediaAluno`](src/MediaAluno.java).

### Exercício 5 – Método sem retorno e sem parâmetros

> Agora crie um método nesta mesma classe chamado calculaMedia. O método vai receber as notas digitadas pelo usuário e calcular a média.

> - O método não tem retorno para quem chamou.
> - O método não tem parâmetro (ainda).
> - O método deve exibir no console a média do aluno.

R5: [Resposta no arquivo `src/MediaAluno`](src/MediaAluno.java).

### Exercício 6 – Método sem retorno e com parâmetros

> Modifique o exercício anterior para passar os valores digitados pelo usuário por argumentos no método calculaMedia(n1, n2).

> Use como referência a sintaxe:

```java
public void metodoExemplo (tipo nome_parametro) {
    // Lista de instruções que serão executadas
}
```

R6: [Resposta no arquivo `src/MediaAluno`](src/MediaAluno.java).

### Exercício 7 – Método com retorno e com parâmetros

> Modifique o exercício anterior para que o método calculaMédia receba parâmetros e retorne o valor da média. A exibição da média deve ser feita por quem chamou o método, a partir do valor retornado.

> Use como referência a sintaxe:

```java
public tipo nome_metodo() {
    // Lista de instruções
    return valor;
}
```

R7: [Resposta no arquivo `src/MediaAluno`](src/MediaAluno.java).

## Parte 3 – Hora do Treinamento: Mini Calculadora

### Exercício 8 – Mini calculadora

> Implementar um programa que realiza as 4 operações (+), (-), (/) e (*) entre dois números informados pelo usuário.
> - Primeiro devem ser digitados 2 números. Em seguida, o usuário deve escolher a operação matemática e receber a resposta.
> - Cada operação matemática deve ser implementada num método diferente.
> - Crie também um método chamado menu() para apresentar as opções ao usuário e redirecionar para a operação escolhida.
> - O programa deve ficar repetindo até a opção 5 (sair) ser escolhida.
>
> *Não utilize nenhuma estrutura de repetição. Faça apenas chamada aos métodos.*

R8: [Resposta no arquivo `src/MiniCalculadora`](src/MiniCalculadora.java).

## Parte 4 – Teoria: Métodos Construtores

> **Questão 11.** Você já notou que, quando um objeto é instanciado, não passamos nada nos argumentos? Observe a linha abaixo e explique o que há dentro dos parênteses.

```java
Pessoa p1 = new Pessoa();
```

R11: Dentro dos parênteses, não há nenhum argumento sendo passado. Isso significa que o objeto `p1` está sendo criado utilizando o construtor padrão da classe `Pessoa`, que não requer parâmetros. O construtor é um método especial que é chamado automaticamente quando um objeto é instanciado, e ele inicializa o objeto com valores padrão ou realiza configurações iniciais.

> **Questão 12.** Considere a classe Pessoa (atributos privados nome: String e fone: int; métodos setNome(String), getNome(), setFone(int) e getFone()). Compare as duas situações abaixo para atribuir o nome Walter e o telefone 55555555 a p1. Qual é mais fácil? Quantas linhas de código cada uma usa?

```java
// Situação 1
Pessoa p1 = new Pessoa();
p1.setNome("walter");
p1.setFone(55555555);
// Situação 2
Pessoa p1 = new Pessoa ("Walter", 55555555);
```

R12: A situação 2 é mais fácil, pois permite a inicialização do objeto `p1` com os valores desejados em uma única linha de código, utilizando um construtor que aceita parâmetros. A situação 1 utiliza três linhas de código para criar o objeto e definir seus atributos, enquanto a situação 2 utiliza apenas uma linha.

> **Questão 13.** Para que a classe Pessoa possa aceitar esses valores como argumentos na criação do objeto, o que é preciso criar na classe?

R13: Para que a classe `Pessoa` possa aceitar esses valores como argumentos na criação do objeto, é preciso criar um **método construtor** que receba os parâmetros correspondentes aos atributos da classe. Esse construtor deve inicializar os atributos `nome` e `fone` com os valores fornecidos.

> **Questão 14.** Explique as 5 regras para utilizar métodos construtores apresentadas na aula:
> 1. Quando instanciamos um objeto, o que acontece com o método construtor de classe? Como o construtor funciona?
> 2. Qual é a estrutura de um construtor? Que modificador de acesso possui, pode receber argumentos e qual tipo de retorno ele tem?
> 3. Que nome o método construtor sempre terá?
> 4. É possível ter mais de um método construtor na classe? Que condição cada um deve cumprir?
> 5. O que acontece quando nenhum construtor é declarado?

R14:
1. Quando instanciamos um objeto, o método construtor da classe é chamado automaticamente. O construtor funciona inicializando o objeto recém-criado, configurando seus atributos e realizando qualquer configuração necessária para que o objeto esteja pronto para uso.
2. A estrutura de um construtor é semelhante a de um método, mas ele não possui tipo de retorno (nem mesmo `void`). Ele pode receber argumentos e geralmente possui um modificador de acesso, como `public`, para permitir que seja chamado de fora da classe.
3. O método construtor sempre terá o mesmo nome da classe em que ele está definido. Isso é uma convenção que permite ao compilador identificar o método como um construtor.
4. É possível ter mais de um método construtor na classe, desde que cada um tenha uma assinatura diferente (ou seja, um número diferente de parâmetros ou tipos diferentes de parâmetros). Isso permite a sobrecarga de construtores, oferecendo diferentes maneiras de inicializar objetos da mesma classe.
5. Quando nenhum construtor é declarado, o compilador cria automaticamente um construtor padrão (sem parâmetros) para a classe. Este construtor inicializa os atributos com seus valores padrão (por exemplo, 0 para números, null para objetos).

> **Questão 15.** Observe os três construtores abaixo. Quantos métodos construtores a classe Pessoa possui? Em que eles diferem?

```Java
public Pessoa() { }
public Pessoa(String n) { nome = n; }
public Pessoa(String n, String f) { nome = n; fone = f; }
```

R15: A classe `Pessoa` possui três métodos construtores. Eles diferem na quantidade e no tipo de parâmetros que recebem:
1. O primeiro construtor não recebe nenhum parâmetro e é o construtor padrão.
2. O segundo construtor recebe um parâmetro do tipo `String` para inicializar o atributo `nome`.
3. O terceiro construtor recebe dois parâmetros do tipo `String`, um para inicializar o atributo `nome` e outro para inicializar o atributo `fone`.

> **Questão 16.** O que o construtor pode fazer com os argumentos recebidos? O que ele pode fazer caso o argumento seja nulo (null) ou vazio ("")?

R16: O construtor pode validar os argumentos recebidos, realizando verificações para garantir que os valores sejam válidos antes de inicializar os atributos. Caso o argumento seja nulo (null) ou vazio (""), o construtor pode lançar uma exceção ou atribuir um valor padrão apropriado aos atributos.

> **Questão 17.** Qual é a diferença entre os valores zero e null? O que indica “campo vazio”?

R17: O valor zero (0) é um valor numérico que representa a ausência de quantidade ou magnitude. Já o valor null representa a ausência de um objeto ou referência. O que indica "campo vazio" é um campo que não contém nenhum valor, seja ele zero, null ou uma string vazia ("").

> **Questão 18.** Em `Scanner teclado = new Scanner(System.in);`, o que é System.in? Por que o fato de System.in usar um buffer de linha pode ser fonte de aborrecimentos? O que acontece quando pressionamos ENTER e o que será preciso fazer em alguns aplicativos antes da próxima operação de entrada?

R18: `System.in` é um fluxo de entrada padrão que representa a entrada do teclado. O fato de `System.in` usar um buffer de linha pode ser fonte de aborrecimentos porque ele lê a entrada do usuário até que o ENTER seja pressionado, armazenando tudo em um buffer. Quando pressionamos ENTER, o buffer é enviado para o programa, e qualquer entrada adicional pode ser afetada pelo conteúdo restante no buffer. Em alguns aplicativos, será preciso limpar o buffer ou consumir a linha restante antes da próxima operação de entrada para evitar problemas de leitura incorreta dos dados.
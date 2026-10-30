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

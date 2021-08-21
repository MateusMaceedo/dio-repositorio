*Bootcamp everis New Talents - Java by Digital Innovation One*

# Estrutura de dados em Java

Professor: [João Ricardo Côre Dutra](https://github.com/jrdutra/estruturaDeDadosJavaDio)

O repositório completo deste módulo está disponível em: [https://github.com/jrdutra/estruturaDeDadosJavaDio](https://github.com/jrdutra/estruturaDeDadosJavaDio)

Abaixo estão as anotações sobre o que considerei mais relevante para o meu aprendizado.

## AULA 01: INTRODUÇÃO AO CURSO E CONCEITOS BÁSICOS

## Vídeo 01: Apresentação Pessoal

**Conceitos:**

- Bit (menor unidade de memória)
- Organizar dados em memória
- Mecanismos de organização de dados que atendam diferentes requisitos de processamento

## Vídeo 02: Apresentação do curso

A grade de aulas completa está disponível no repositório do módulo:

[https://github.com/jrdutra/estruturaDeDadosJavaDio](https://github.com/jrdutra/estruturaDeDadosJavaDio)


*Tipos de dados*

|   Tipo    |   Memória consumida   |   Valor mínimo                |   Valor máximo                | Precisão      |
| :-------: | ----------------------|  ---------------------------  | ---------------------------   |:---------:    |
| boolean   | 1 bit                 | false                         | true                          | ---           |
| byte      | 1 byte                | -128                          | 127                           | ---           |
| char      | 2 bytes               | '\u0000'                      | '\uffff'                      | ---           |
| short     | 2 bytes               | -32.768                       | 32.767                        | ---           |
| int       | 4 bytes               | -2.147.483.648                | 2.147.483.647                 | ---           |
| long      | 8 bytes               | -9.223.372.036.854.770.000    | 9.223.372.036.854.770.000     | ---           |
| float     | 4 bytes               | -3,4028E + 38                 | 3,4028E + 38                  | 6-7 dígitos   |
| double    | 8 bytes               | -1,7976E + 308                | 1,7976E + 308                 | ---           |


## Vídeo 03: Conceito de memória

Instalação da [IDE IntelliJ Community Edition](https://www.jetbrains.com/pt-br/idea/download/#section=windows)

Instalação do [Java SE](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html)

**Configuração das variáveis de Sistema**

Atenção!! Se você já tem as configurações abaixo, não precisa refazer.

No Windows:
    Painel de Controle > Sistema e Segurança > Sistema > Configurações avançadas do sistema. Na aba Avançado > Variáveis de Ambiente

Em Variáveis do Sistema >  Novo
    
    ```
    Nome da variável: CLASSPATH
    Valor da variável: .
    ```
 Clique em Novo (denovo):

 ```
 Nome da Variável: JAVA_HOME
 Valor da Variável: C:\Program Files\Java\jdk-16.0.1
 ```

O valor da variável no Java Home é o caminho até a JDK instalada.

Localize Path e clique em editar. Clique em Novo e adicione: %JAVAHOME%\bin

A minha configuração está com o JDK 16, mas nessa aula foi usado o JDK 11 que é a última versão LTS até o momento.

## Vídeo 04: Atribuição e referência em Java

A atribuição em Java são por cópia de valor sempre.

Com tipo primitivo, copiamos o valor em memória.

Com objetos copiamos o valor da referência em memória, sem duplicar o objeto.

Exercício: Atribuição e referência na pasta [projeto](https://bit.ly/3kCwpO7).

## Vídeo 05: Conceito de nó e encadeamento

Um nó é um espaço em memória que armazena tanto o valor quanto a referência para outro nó. Essa referência serve para criar um elo entre os nós. O último nó aponta para null. A seguir uma abstração de uma lista encadeada simples.

![](images/tela02.PNG)

O Java não trabalha com ponteiros, a própria variável armazena a referência por si só.

## Vídeo 06: Generics

```
Lista<String> minhaLista = newLista<>();
```

```
public class Lista<T>{
    private Tt;
}
```
O 'T' da estrutura acima representa uma classe genérica. Ele pode representar uma String, um Integer ou qualquer classe que for criada.

**Por que usar?**

* Evitar casting excessivo
* Evitar códigos redundantes
* Encontrar erros em tempo de compilação

**Quando foi introduzido?**

Desde o Java SE 5.0

**Wildcards**

* Unknown Wildcards (Unbounded)
* Bounded Wildcard(Upper Bounded / Lower Bounded)

Exemplo de Unknown Wildcard

```
public void imprimeLista(List<?>lista){
    for(Object obj:lista){
        System.out.prinln(obj)
    }
}

List<Aluno>minhaLista = new List<Aluno>();
imprimeLista(minhaLista);
```

Exemplo de UpperBounded Wildcard

```
public void imprimeLista(List<? extends Pessoa>lista Pessoas){
    for(Pessoa p: listaPessoas){
        System.out.println(p);
    }
}

List<Aluno> minhaLista = new List<Aluno>();
imprimeLista(minhaLista);
```
Na estrutura do exemplo acima só e possível passar listas de Pessoa e herdeiros de Pessoa.

Exemplo de LowerBounded Wildcard

```
public void imprimeLista(List<? super Pessoa> listaPessoas){
    for(Pessoa p: listaPessoas){
        System.out.println(p);
    }
}

List<Aluno>minhaLista = new List<Aluno>();
imprimeLista(minhaLista);
```
Qualquer herdeiro da classe Pesso não será aceito. Ele só aceitará da classe pessoa para cima.

**Convenção**

|   Letra   |   Representa  |   Exemplo          |
| :-------: | ------------- | ------------------ |
| K         |  "Key"        | Map<K, V>          |
| V         |  "Value"      | Map<K, V>          |
| E         |  "Element"    | List<E>            |
| T         |  "Type   "    | Collections#addAll |
| ?         |  genérico     |                    |

Documentação: [Generics](https://docs.oracle.com/javase/tutorial/extra/generics/index.html)

## AULA 02: FILAS[FIFO: FIRST IN, FIRST OUT]

## Vídeo 01: Explicação teórica do conceito de pilhas

Regras de uma pilha:

**LIFO - Last in first out**

O último elemento que entra é o primeiro a sair.

Nesse tipo de estrutura nunca trabalharemos com o elemento do meio. Sempre trabalharemos com o último elemento colocado na pilha.

Como seria uma pilha de nós?

![](images/tela03.PNG)

**Método Top**

Supondo que eu declare um objeto chamado *meuNo* e chame o método top():

```
No meuNo = pilha.top();
```

O objeto meuNo vai receber a referência do primeiro nó, mas não vai tirar o primeiro nó da pilha. Não ocorre uma exclusão.

![](/print/aula02/video01/tela04.PNG)

O método getInt() é utilizado para obter a referência do objeto:

```
int numero = meuNo.getInt();
```
```
int numero = int;
```

O inteiro na linha de código acima é apenas uma simplificação. Na refatoração realizada na aula passada,vimos que é possível guardar qualquer valor.


**Método Pop**

No método Pop o primeiro elemento da pilha é retirado. Eu fico com o elemento e a referência que aponta para o topo da fila passa a apontar para o elemento logo abaixo do elemento retirado.

**Método Push**

É o contrário do método pop.

Criação do nó:

```
No meuNo = newNo();
```

Set payload:

```
meuNo.setInt(1);
```

O nó vai passar a ser o nó que foi colocado por último.

Ex: Imagine uma pilha com 3 livros. A referência de topo é o terceiro livro, pois ele foi colocado por último. Ao colocar um quarto livro na pilha, este passa a receber a referência de topo.

**Método isEmpty**

Retorna se a pilha ou estrutura de dados está nula. Se estiver nula, não há pilha. Mesmo tendo apenas 1 elemento é considerada uma pilha.

Esse método é usado apenas para dizer se a pilha está vazia ou não.

```
public boolean isEmpty(){
    if(refNo == null){
        return true;
    }
    return false;
}
```

## Vídeo 2: Implementação da classe pilha (Métodos:Top, Push e Pop)

Anotações no [código](https://bit.ly/3Bm3ELr).

## Vídeo 3: Utilização da classe Pilha.

Anotações no [código](https://bit.ly/3rq2GZX).

## AULA 03: FILAS[FIRST IN, FIRST OUT]

## Vídeo 1: Explicação teórica do conceito de filas

**FIFO - first in first out**

O primeiro que entra é o primeiro a sair.

![](images/tela05.PNG)

Principais métodos:

* enqueue() -> enfileirar
* dequeue() -> desenfileirar
* isEmpty() -> verifica se a fila está vazia

**Método enqueue()**

Na imagem 'minha fila' acima, imagine que foi inserido um novo objeto antes do 'Ref.nó'. O Ref.Nó que antes apontava para o objeto que ocupava aquela posição, vai apontar para o novo objeto.

**Método dequeue()**

Na imagem 'minha fila' acima, imagine que o primeiro elemento da fila (que aponta para null) foi retirado. O elemento que estava atrás dele passou a ser o primeiro e agora é ele que aponta para null.

## Vídeo 2: Implementação da classe Fila (Métodos: Enqueue, Dequeue)

Anotações no [código](https://bit.ly/3zr9XvH).

## Vídeo 3: Utilização da classe Fila

Anotações no [código](https://bit.ly/36OKXSC)

## Vídeo 4: Refatorando para embutir o nó

Como está:
```
Fila minhaFila = new Fila();
minhaFila.enqueue(new No("primeiro));
```

Refatoração:

```
Fila minhaFila = new Fila();
minhaFila.enqueue("primeiro);
```
ou

```
minhaFila.enqueue(1);
```

## Vídeo 5: Refatoração para utilização de generics

Como está:

```
Fila minhaFila = new Fila();
minhaFila.enqueue("primeiro");
minhaFila.enqueue(1);
```

Refatoração:

```
Fila<String>minhaFila = new Fila<String>();
minhaFila.enqueue("primeiro");
minhaFila.enqueue(1); //Erro
```
## AULA 04: LISTAS ENCADEADAS

## Vídeo 01: Explicação teórica do conceito de listas encadeadas

**Estrutura da lista encadeada**

![](images/tela05.PNG)

**Métodos**

* .add();

* .remove();

* .isEmpty();

* .get();

**Método add()**

Permite adicionar um nó em qualquer lugar. No começo, no final, no meio..

**Método remove()**

Permite retirar nó em qualquer posição.

**Método get()**

Pega uma cópia do nó. Na verdade ele pega a referência do nó, mas não exclui ele da lista.

## Vídeo 02: Implementação da classe No

## Vídeo 03: Implementação da classe ListaEncadeada(isEmpty e size())

## Vídeo 04:Implementação da classe Lista Encadeada(add())

## Vídeo 05:Implementação da classe Lista Encadeada(getNo())

## Vídeo 06:Implementação da classe Lista Encadeada(get())

## Vídeo 07:Implementação da classe Lista Encadeada(remove())

## Vídeo 08:Implementação da classe Lista Encadeada(toString())


## Vídeo 09:Utilização da classe Lista Encadeada

## AULA 05: LISTAS DUPLAMENTE ENCADEADAS

## Vídeo 01: Explicação teórica do conceito de Listas Duplamente Encadeadas

Na lista encadeada simples o nó tem o payload (informação útil) e a referência para o próximo nó.

![](images/tela05.PNG)

Métodos:

* add()
* get()
* remove()
* isEmpty()

Na lista duplamente encadeada o nó tem duas referências onde uma aponta para o nó posterior e a outra para o anterior. Além disso ela tem duas referências de entrada na lista. Uma aponta para o primeiro nó e a outra para o último.

![](images/tela06.PNG)

![](images/tela07.PNG)

Principais métodos:

* add(el);
* add(index, el)
* remove(index)
* get(index)

el = elemento

## AULA 06 - LISTAS CIRCULARES

## Vídeo 01 - Explicação teórica do conceito de Listas Circulares

Se parece com a estrutura da lista de encadeamento simples porém a referência do próximo no do último elemento ao invés de apontar para nulo, aponta para o primeiro nó.

![](images/tela08.PNG)

O primeiro elemento de uma lista circular é chamado de calda e o último de cabeça.

O primeiro nó terá uma referência de entrada que será a calda da lista.

**Métodos**:

* remove()
* get(index)
* add(el)
* isEmpty

el = elemento

## Vídeo 02 - Implementação da classe No
## Vídeo 03 - Implementação da classe ListaCircular(isEmpty() e size())
## Vídeo 04 - Implementação da classe ListaCircular(getNo() e get())
## Vídeo 05 - Implementação da classe ListaCircular(remove())
## Vídeo 06 - Implementação da classe ListaCircular(add())
## Vídeo 07 - Implementação da classe ListaCircular(toString())
## Vídeo 08 - Utilização da classe ListaCircular

## AULA 07 - ÁRVORES

## Vídeo 01 : Explicação teórica do conceito de árvores

* Árvores são estruturas de dados bidimencionais
* Não lineares
* Contituídas de nó que representam um modelo hierárquico
* Armazenam os dados com base em relações de dependências
* Listas, filas e pilhas são estruturas lineares.

**Utilização**:

* Sistemas de arquivos
* Bancos de dados
* Interfaces gráficas
* Páginas web

**Estrutura**:

![](images/tela09.PNG)

**Características de uma árvore hierárquica**

* Nó
* Raiz
* Pai e filho
* Irmão
* Nível de um nó
* Altura ou profundidade
* Folha ou nó terminal
* Nó interno
* Grau de um nó
* Subárvore

_Nó_ --> elemento da árvore que pode armazenar dados e referências para outros nós.

_raiz_ --> nó principal da árvore origem de todas as demais ramificações.

_Pai e filho_ --> em dois nós interligados o descendente direto é o filho e o ancestral disposto acima dele, o pai.

_irmãos_ --> nós com o mesmo pai são irmãos.

_Nível_ --> posição hierárquica do nó em relação a raiz.

_altura ou profundidade_ --> nível máximo dos nós

_folha ou nó terminal_ --> é o nó que não tem filhos

_nó interno_ --> nós que não são nós folhas

_grau do nó_ --> indicado pelo número de filhos

_subárvore_ --> formada a partir de um nó da árvore principal sendo considerada um ramo.

![](images/tela010.PNG)

![](images/tela011.PNG)

![](images/tela012.PNG)

![](images/tela013.PNG)

![](images/tela014.PNG)

![](images/tela015.PNG)

![](images/tela016.PNG)

## Vídeo 02: Explicação teórica de árvore de busca binária

**Tipos de árvores**

* Árvore Binária
* Árvore AVL
* Árvore Ordenada
* Árvore Rubro-Negra
* Árvore 2-3
* Árvore 2-4
* Árvore B
* Árvore B+
* Árvore Hiperbólica

**Árvore Binária**

Suponha que você tem apenas o número 57 e que ele será a raiz de uma árvore binária. Em seguida você precisa colocar o número 45. 45 é menor ou maior que 57? Menor. Então ele ficará á esquerda. Depois você precisa incluir o número 77. 77 é maior ou menor que 57? Maior. Então ele ficará à direita. Essa regrinha vai valer para todas as demais inclusões. Veja a imagem a seguir:

![](images/tela017.PNG)

A representação de um nó da árvore binária poderia ser feita como na imagem a seguir:

![](images/tela018.PNG)

A área de payload (conteúdo útil do nó) a referência de nó da esquerda e a referência de nó da direita, muito parecida com a lista duplamente encadeada.

![](images/tela019.PNG)

De acordo com a ilustração acima as folhas sempre apontarão para nulo.

## Vídeo 03: A interface Comparable

O código Nó da árvore binária será construído da seguinte maineira:

![](images/tela020.PNG)

Como saber se o conteúdo do nó é maior ou menor? Se for um número fica fácil, mas e se for uma String?

Para isso a interface Comparable vai ser implementada.

## Vídeo 04: Explicando operações básicas em árvores de busca binária

**Inserção**

![](images/tela021.PNG)

Supondo que você tenha que inserir o nó 23 na árvore acima. Começando a comparação pelo nó raiz. 23 é maior do que 57? Não. Então ele vai para esquerda. 23 é maior que 45? Não. Novamente ele vai para a esquerda. 23 é maior do que 13? Sim. Ele vai para a direita. 23 é maior que 25?
Não. Ele vai para esquerda. Veja a imagem a seguir?

![](images/tela022.PNG)

É preciso garantir que o objeto a ser inserido é comparável. 

**Exclusão**

![](images/tela023.PNG)

No exemplo acima a raiz está sendo excluída (14). 

Regra: Pega o maior elemento da esquerda.

Essa regra visa garantir que todos os nós restantes a esquerda serão menores que a raiz.

**Exibição**

![](images/tela024.PNG)

## Vídeo 05: Explicando atravessamento em árvores binárias

**Tipos de atravessamento**:

* IN-ORDEM
* PRÉ-ORDEM
* PÓS-ORDEM

Exemplo:

![](images/tela025.PNG)

_Atravessamento IN-ORDEM_

Saída: 2, 10, 12, 13, 20, 25, 29 e 31

![](images/tela026.PNG)

_Atravessamento PRÉ-ORDEM_

Primeiro exibe para depois visitar.

Saída: 13,10, 2, 12, 25, 20, 31 e 29

![](images/tela027.PNG)

Dica: trace diagonais na árvore da esquerda para a direita, leia de cima para baixo e você encontrará a saída.

![](images/tela028.PNG)

_Atravessamento PÓS-ORDEM_

Visita primeiro para depois exibir.

Saída: 2, 12, 10, 20, 29, 31, 25, 13

![](images/tela029.PNG)

## Vídeo 06: Implementação da classe NoArvore(Nó Árvore)

## Vídeo 07: Implementação da classe ArvoreBinaria - parte 1

## Vídeo 08: Implementação da classe ArvoreBinaria - parte 2

## Vídeo 09: Implementação da classe ArvoreBinaria - parte 3

## Vídeo 010: Implementação da classe ArvoreBinaria - parte 4

## Vídeo 011: Implementação da classe ArvoreBinaria - parte 5

## Vídeo 012: Implementação da classe ArvoreBinaria - parte 6

## Vídeo 013: Implementação da classe ArvoreBinaria - parte 7

## Vídeo 014: Implementação da classe Árvore Binária

## AULA 08: PRINCIPAIS IMPLEMENTAÇÕES DAS ESTRUTURAS DE DADOS DO JAVA

## Vídeo 01: Conceitos de equals e hashCode

**Utilidade:**

* Melhorar a busca de objetos
* Devem se implementados juntos

Hashcode -> organização dos objetos
Equals -> testa se um objeto é igual ao outro

![](images/tela028-02.PNG)

## Vídeo 02: Stack(Pilha)

## Vídeo 03: Queue(Fila, LinkedList)

**Principais métodos:**

```
Queue<Carro> queueCarros = new LinkedList<Carro>();

queueCarros.add(new Carro("Fiat));
queueCarros.element();
queueCarros.offer(new Carro("Renalt"));
queueCarros.peek();
queueCarros.remove();
queueCarros.poll();
queueCarros.isEmpty();
```

## Vídeo 04: List(ArrayList)

![](images/tela031.PNG)

![](images/tela032.PNG)

## Vídeo 05: Set(HashSet)

![](images/tela033.PNG)

## Vídeo 06: Map(HashMap)

![](images/tela034.PNG)


## Vídeo 07: Conclusão

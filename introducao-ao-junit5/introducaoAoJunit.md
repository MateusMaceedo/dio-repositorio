# Bootcamp everis New Talents by Digital Innovation One (2021)

# Introdução ao Junit 5

Professor: Rui Rodrigues

Repositório: [Repositório](https://github.com/ruirodri/introJUnit)

## Objetivos e requisitos básicos do curso

* Java 8
* Maven
* IDE (VS Code)
  

## O que é um framework de testes?

Ferramenta que permite acelerar, facilitar ou organizar o processo de testes, normalmente no contexto de automatização.

Conjunto de regras ou diretrizes utilizados para definir um processo de trabalho de testes.

Exemplos: Junit, TestNG, e-FATHREE(da everis), Selenium...

_JUnit e TestNG_ -> trabalham mais ou menos da mesma forma. Trabalham na parte mais básica: identificar um teste,se ele passou, se falhou, gerenciar o ciclo de vida de um teste (saber o que executar antes e depois dos testes).

_e-FATHEREE_ -> trabalha a facilitação num nível mais alto. Tem comandos que permitem ler dados de uma planilha ou base de dados para fazer imput no teste. Permite gerar evidências de teste de maneira mais fácil e de forma automática. Grava se passou ou falhou o teste em uma base de dados.

_Selenium_: Abstrai o acesso ao navegador para que se possa automatizar aplicações web. Ele não faz o que o JUnit, TestNG e e-FATHEREE fazem. 

Principais benefícios de utilizar um framework de testes:

* maior eficiência
* maior velocidade na criação dos testes
* menor custo de manutenção
* maior cobertura de testes
* reutilização do código


## Um teste unitário ingênuo

Por que ingênuo? Porque usa somente o Java para fazer o teste e não utiliza nenhum framework.

![](screenshot/tela00.PNG)

System.exit(1) -> Se passar qualquer código diferente de 0 a interpretação é de que houve um erro no programa. Por isso quanto tem erro ele retorna 1 e quando não tem erro ele retorna 0.

No método verifica a soma a mensagem de erro sai do próprio método. Já no método que valida as substrações a mensagem de erro ocorre fora. A falta de padronização pode gerar vários problemas. Veja as duas imagens a seguir:

![](screenshot/tela01.PNG)


![](screenshot/tela02.PNG)


Muitas outras coisas poderiam ser testadas nesse código. O que foi mostrado é apenas uma ilustração do que poderia ser observado a princípio para levantar falhas comuns quando os testes não são preparados adequadamente.

**Extensão para VS Code:** Java Extension Pack


## Um teste unitário "menos" ingênuo - Parte 1

Por que é um teste menos ingênuo? Porque a classe de teste possui logo no início uma anotação @Test
e no final o teste é indicado com um fail. Veja as imagens a seguir:


![](screenshot/tela03.PNG)


![](screenshot/tela04.PNG)

A IDE identifica essa classe como um teste e marca como Run Test. Veja a linha 28 da imagem a seguir:

![](screenshot/tela06.PNG)

Quando o teste falha:

![](screenshot/tela07.PNG)


Rodando os testes pelo terminal:

```
mvn clean compile test
```

mvn -> indica que é um comando do Maven

clean -> limpa tudo o que foi compilado até o momento

compile test -> roda os testes programados

![](screenshot/tela09.PNG)

A própria IDE mostra qual teste não passou:

![](screenshot/tela010.PNG)


Quem permite isso é o padrão JUnit. Os similares também funcionam.


## Um teste unitário "menos" ingênuo - Parte 2

Imagine a seguinte situação:

Você roda 9 testes, nenhum falha, mas 1 é pulado. Como isso é mostrado pela IDE quando o JUnit está aplicado? Veja a seguir:

![](screenshot/tela011.PNG)

Isso acontece porque o código recebeu a anotação @Disabled do JUnit.

Na tela abaixo você vai ver que foi o objeto calculadora recebeu uma nova instância para cada teste. Essa repetição não é uma boa prática e existe uma forma de evitá-la.

![](screenshot/tela012.PNG)

No JUnit existe uma anotação chamada @BeforeAll que faz com que o código marcado com ela seja executado antes de todos os testes. Veja:

![](screenshot/tela013.PNG)

O método assertEquals verifica se o valor esperado e o valor recebido são iguais. Se não forem, ele dispara um exception.

Existem diversos assertEquals para diferentes tipos de dados. Verifique outros tipos na [JUnit Docs](https://junit.org/junit4/javadoc/4.12/org/junit/Assert.html).

A anotação:

* @BeforeEach -> É executada antes de cada teste 
* @AfterEach -> Depois de cada teste
* @AfterAll -> roda uma vez ao final dos testes

Nos exemplos acima os valores de teste foram inseridos manualmente em cada método. Essa é uma maneira de fazer isso, mas não a única.

Evite métodos muito grandes. Se o seu método tem mais de 10 linhas, preocupe-se.Se tem mais de 20 refatore e quebre em métodos menores. Mude a abordagem. Quanto maior o método, mais difícil entendê-lo.

O código de exemplo não tem comentários. Os nomes dos métodos e variáveis devem ser autoexplicativos. Os packages devem ter nomes que dizem respeito ao conteúdo.

A anotação @DisplayName("Nome do método") serve para atribuir explicitamente um nome para o método.

![](screenshot/tela014.PNG)


## Anotações de testes com parâmetros

```
@ParameterizedTest
@CsvSource("1.0, 1.0, 2.0","2.0, 3.0, 5.0"})
```
Na anotação acima aparecem dois conjuntos de dados que serão testados. No primeiro, 1 + 1 = 2 e no segundo 2 + 3 = 5. As duas condições são verdadeiras.

![](screenshot/tela015.PNG)

Agora trocando os dados por um arquivo de dados CSV.

![](screenshot/tela016.PNG)

O arquivo fica armazenado na pasta resources.

![](screenshot/tela017.PNG)

## Dúvidas e comentários

Jest - Testes em Javascript

pesquisar: definições Gherkin

Dependendo da complexidade da massa de dados pode mais que dobrar o tempo de desenvolvimento. Existem coisas que são simples de implementar e difíceis de testar e o contrário também acontece.



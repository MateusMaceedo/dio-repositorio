Bootcamp Everis New Talents 2021

# Instrodução a Qualidade de Software

Prafa. Johanne Araújo

## Aula 01: Por que testar software?

**Objetivos de aula**

1. Por que testar software?
2. Como testar?
3. Até quando testar?

Quality Assurance (QA)

_Teste de Software_ é um processo que faz parte do ciclo de vida do software e tem como principal objetivo avaliar a qualidade do software e reduzir o risco de falha no software em operação.

**Princípios de testes de software**

* O teste mostra a presença de defeitos e não sua ausência.
* Testes exaustivos são impossíveis
* O teste inicial economizar tempo e dinheiro
* Cuidado com o paradoxo do pesticida
* O teste depende do contexto
* Ausência de erros é uma ilusão

## Como testar software? - Parte 1
Tipos X Técnicas X Níveis

![](screenshot/tela04.PNG)

## Processo de Teste

![](screenshot/tela05.PNG)

![](screenshot/tela06.PNG)

_Softwares utilizados_

![](screenshot/tela07.PNG)

Os mais utilizados e que abragem todo o ciclo de teste são o Jira e o Azure.

É bom documentar o bug e notificar o desenvolvedor.

## Visão geral de testes

![](screenshot/tela09.PNG)

## Testes Estáticos

Checklist de especificação de requisitos:

* Verificação de diagramas;
* Código;
* Plano de testes;
* Script de teste;
* Manual do Usuário
* ...

![](screenshot/tela011.PNG)

## Planejar

![](screenshot/tela012.PNG)

Leitura _ Ex: Caso de teste, história do usuário

Estimativa - complexidade, experiência do desenvolvedor

# Projetar


![](screenshot/tela014.PNG)

## Planejar

Existem diversas técnicas utilizadas para se gerar casos de testes. Vamos abordar as seguintes técnicas de testes:

* Petição por equivalência (Equivalence Partition)
* Análise do Valor Limite (Boundary Value Analysis)
* Tabela de Decisão(Decision Table)
* Testes por Transição de Estados (State Transitioning Testing)

## Análise do valor limite

O "Valor Limite" (bordas extremas de uma partição) são uma área em que os testes podem gerar defeitos. Os testes podem ser desenhados para cobrir tanto os valores válidos, quanto os inválidos. Deve ser feito um caso de teste para cada valor limite.

A técnica é executada da seguinte forma:

1. Identificar as partições equivalentes e os ranges de valores relacionados.
2. Identificar os valores máximos e mínimos(resultando em participações válidas e inválidas)
3. Desenvolver as condições de testes para cada valor limite identificado.

![](screenshot/tela016.PNG)

Variações dessa técnica podem identificar três valores de limite por limite de dados:

* O valor anterior ao limite;
* O próprio valor limite;
* E imediatamente superior a ele.
  

![](screenshot/tela017.PNG)

## Tabela de Decisão

Uma tabela de decisão ajuda a testar regras de negócios sobre várias condições do sistema(input do usuário) e as ações correspondêntes (system outputs).

A técnica de Tabela de Decisão analisa essencialmente dois parâmetros:

* Condições
* Ações

## Transição de Estados

Diagramas de Transição Estados são utilizados no design da aplicação para representar o comportamento de um sistema em um número finito de estados.
Estes diagramas são extremamente úteis em situações aonde a análise e testes de sistema são requeridas utilizand como base o comportamento /situação anterior da aplicação com o que está ocorrendo no presente.
A transição é iniciada por um evento(usuário inseriu valor em um campo).
O evento resulta em uma transição.
A mudança de estado pode fazer com que o software execute uma ação (gerar mensagem de cálculo ou de erro).

![](screenshot/tela018.PNG)

A transição é iniciada por um evento(entrada de um valor em um campo)

O evento resulta em uma transição;

A mudança de estado pode fazer com que o software execute uma ação(gerar uma mensagem de cálculo ou de erro).

![](screenshot/tela019.PNG)

## Técnica de testes baseadas na experiência

**Suposição de erro**

Como o aplicativo funcionou no passado.

Quais tipos de erros os desenvolvedores tendem a fazer.

Falhas ocorridas em outros aplicativos.

**Teste exploratório**

Sem um roteiro previamente definido. São modelados, executados, registrados e avalidados dinamicamente durante a execução do teste.

Ex: Sistemas sem documentaçao

## Executar

Posso testar?

* O ambiente está atualizado?
* Tenho os acessos necessários?
* Preciso de alguma massa de teste?

_Evidências de erro:_

O que uma boa evidência deve ter?

* Print do erro
* Descrição do passo a passo de como chegar ao problema.
* Descrição do erro mostrado na tela
* Navegador, sistema operacional usado
* Versão do sistema testado.

_Evidências de sucesso:_

O que uma boa evidência deve ter?

* print do resultado esperado
* nome ou id do caso de teste
* data da execução e versão do sistema realizado
* ciclo do teste

## Até quando testar?

A cultura de se testar o software pode ou tem algumas barreiras como:

* Tempo insuficiente;
* Orçamento curto;
* Falta de capacitação para identificar risco;
* Falta de capacitação dos desenvolvedores para executar ao menos um teste unitário.

* Quando atingir  confiança nos requisitos;
* Quando os critérios de encerramento forem atingidos
* Quando o custo para identificação dos defeitos não compensar mais.

A falha acarreta um bug e na mão do usuário vira um defeito.

## Entregar

![](screenshot/tela021.PNG)

## Certificação

CTFL



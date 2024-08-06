Exercicio 1

Crie um programa que pergunte qual a altura em metros e peso em Kg desta pessoa e retorne o IMC e a classificação deste IMC.
>  IMC = peso / altura x altura;

Como referência para para a classificação do IMC utilizar a tabela do link [Tabela IMC - Wikipedia](https://pt.wikipedia.org/wiki/%C3%8Dndice_de_massa_corporal#Tabela_de_IMC).

Exemplo:

```language
Informe sua altura em metros?
1,9
Informe seu peso em Kg?
72,2
O valor do seu IMC é 20 (considerado Peso normal)
```

----

Exercicio 2

Faça um programa que peça para o usuário quantas provas eles fez, depois pergunte para ele a nota inteira, de 0 a 100, de cada prova, e retorne a média, a maior nota e a menor nota entre as provas informadas. Exemplo:

```language
Informe a quantidade de provas:
5
Informe a nota da prova 1:
75
Informe a nota da prova 2:
60
Informe a nota da prova 3:
50
Informe a nota da prova 4:
80
Informe a nota da prova 5:
90
A menor nota é: 50
A maior nota é: 90
A média das notas é: 71
```

----

Exercicio 3

Faça um programa que pede para a usuária digitar um número inteiro positivo. Seu programa deverá responder a soma de do número com todos os seus antecessores positivos.

Ex: se o número digitado for 5, a conta a ser realizada será 5 + 4 + 3 + 2 + 1, e o resultado na tela será "15".

----

Exercicio 4

Faça um programa que imprima os números de 1 a 100, porém com as seguintes condições:
- Caso o número for divisível por 3 imprimir Fizz no lugar do número;
- Caso o número for divisível por 5 imprimir Buzz no lugar do número;
- Caso o número for divisível por 3 e 5 imprimir FizzBuzz no lugar do número;

Exemplo:

```language
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
...
```

----

Exercicio 5

Crie um enum chamado UnidadeTemperatura representando unidades de temperatura (CELSIUS, FAHRENHEIT, KELVIN).

Escreva um programa que utiliza um Scanner para obter a unidade de temperatura atual do usuário e a unidade desejada, pedindo a temperatura atual e imprimindo a temperatura convertida.

CELSIUS:
F -> (celsius * 9 / 5) + 32
K -> celsius + 273.15

FAHRENHEIT:
C -> (fehrenheit - 32) * 5 / 9
k -> (fehrenheit + 459.67) * 5 / 9

OBS: Utilizar Enum com metodos abstratos (desafio)

----

Exercicio 6

Pergunte para a usuária o valor que será investido em uma aplicação, a taxa de juros ao mês e o tempo que o dinheiro ficará aplicado.

Seu programa deverá exibir quanto de juros será pago e o saldo total em cada mês.

Exemplo:

```language
Informe o valor inicial investido em R$.
10000,00
Informe o juros ao mês em %.
5
Informe o tempo em meses que o dinheiro ficará investido.
3

10000.0 reais, 5% de juros ao mês por 3 meses.

Mês 1: Juros: R$ 500.0 , saldo: 10500.0 
Mês 2: Juros: R$ 525.0 , saldo: 11025.0 
Mês 3: Juros: RS 551.25 , saldo: 11576.25 
```

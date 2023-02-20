# Sintaxe Básica

## Operadores

### Atribuição (=)

```
//String
String nome = "Victor";

//Inteiro
int idade = 28;

//Float
double peso = 59.2;

//Caractere
char sexo = 'M';

//Boolean
boolean doadorOrgao = false;

//Objeto
Date dataNascimento = new Date();
```

### Aritméticos
```
//Soma
double soma = 10.5 + 14.3;

//Concatenação
String str = "Hello "+"World!"; 

//Subtração
double sub = 12.3 - 3.9;

//Multiplicação
double mult = 9.4 * 2.1;

//Divisão
double div = 9.3 / 3.1;

//Módulo
int mod = 14 % 3;
``` 

### Unário
```
//Declara um número positivo
int pos = +1;

//Declara um número negativo
int neg = -1;

//Negação
int num = 12;
boolean isOdd = !(num % 2 == 0);

//Incremento
int i = 0; 
i++;

//Decremento
int i = 10;
i--;
```

### Tenário
```
<Expressão Condicional> ? <caso verdadeira> : <caso falsa>
```
Exemplo:
```
int num = 12;
String paridade = num % 2 == 0 ? "Par" : "Ímpar";
```

### Relacionais
```
int num1 = 12;
int num2 = 21;

//Igual (==)
boolean isEqual = num1 == num2;

//Diferente (!=)
boolean isDifferent = num1 =! num2;

//Maior (>)
boolean isGreater = num1 > num2;

//Menor (<)
boolean isLower = num1 < num2;

//Maior  ou Igual (>=)
boolean isGreaterOrEqual = num1 >= num2;

//Menor  ou Igual (<=)
boolean isLowerOrEqual = num1 <= num2;
```
_Para comparar se dois objetos são iguais utiliza-se o método equals, não o operador "=="._

### Lógicos

```
boolean cond1 = true;
boolean cond2 = false; 

//And
boolean opAnd = cond1 && cond2;

//Or
boolean opOr = cond1 || cond2;
```
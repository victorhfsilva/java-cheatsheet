# Sintaxe Básica

## Estruturas de Repetição

### For
```
for (<expressão inicial>; <teste>; <atualização da expressão inicial>) {

	//Loop

}
```

Exemplo:
```
//Soma os dez primeiros inteiros

int sum = 0;
int n = 10;

for (int i = 1; i <= n; i++){
	sum += i;
}

System.out.println("Sum = " + sum);
```

### For-each
```
for(<Tipo> item : <array>){
	
	//Loop
	
}
```

Exemplo:

```
//Soma dos elementos de um array

int[] numbers = {1, 3, 5, 7, 9};
int sum = 0;

for (int number : numbers){
	sum += number;
}

System.out.println("Sum = " + sum);
```

### While
Verifica o teste e só então itera pelo loop.

```
while (<teste>){
	
	//Loop
	
}
```

Exemplo:

```
//Conta até 10

i = 1;

while(i <= 10) {

	System.out.println(i);
	i++;

}
```

### Do-while

Itera uma vez pelo loop antes de verificar o teste.

```
do {
	//Loop
} while (<teste>);
```
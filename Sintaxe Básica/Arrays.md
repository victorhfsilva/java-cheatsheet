# Sintaxe Básica

## Arrays

### Declarando um Array

```
<tipo>[] <nome do array>;
```
Exemplo:
```
double[] data;
```

### Alocando memória
```
<nome do array> = new <tipo>[<tamanho>]; 
```
Exemplo:
```
data = new double[5];
```
A declaração e alocação na memória podem ser feitas em uma única linha:
```
double[] data = new double[5];
```

### Inicialização do array
A declaração e inicialização dos arrays também podem ser feitas na mesma linha.
```
double[] data = {1, 2, 3, 4, 5};
```

### Acessando elementos de um array

```
System.out.println(data[2]);
```
_Os índices do array começam em 0._

### Arrays multidimensionais
```
double[][] matrix = {{1.2, 3.2, 4.3},
		     {2.4, 5.6}};
System.out.println(matrix[1][0]);
```
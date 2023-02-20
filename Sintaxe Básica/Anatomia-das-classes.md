# Sintaxe Básica

## Anatomia das Classes

### Declarando Classes

```
public class MinhaClasse {
	
	// CÓDIGO AQUI
	
}
```

### Declarando o Método Main
```
public static void main (String [] args){
	
	// CÓDIGO AQUI
	
}
```

### Declarando Variáveis
```
Visibilidade Tipo nomeBemDefinido = Atribuição;
```
_A atribuição é opcional._

Exemplo:
```
private String nome = "Victor";
private int idade = 28;
private boolean isMale = true;
```

### Declarando Métodos
```
Visibilidade TipoRetorno nomeObjetivoNoInfinitivo (TipoParametro parametro)
```
Exemplo:
```
private int somar(int num1, int num2){
	
	return num1+num2;
}

protected boolean isEven(int num){
	
	boolean isEven = num % 2 == 0; 
	return isEven;
}

public void imprime(String str){
	
	System.out.println(str);
}
```

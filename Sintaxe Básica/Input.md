# Sintaxe Básica

## Input

### Argumentos

Pode-se inserir argumentos de entrada na execução da classe utilizando o __args__. 

```
public class Main {
	public static void main(String[] args){
	
		String nome = args[0];
		int idade = Integer.valueOf(args[1]);
		
		System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
	
	}
}
```
Para executar a classe com estes argumentos basta executar o seguinte código dentro da pasta bin.

```
java Main Victor 28
```

### Scanner

Pode-se pedir para que o usuário insira dados durante a execução do programa utilizando a classe Scanner.

```
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número inteiro.");
		int num = sc.nextInt();
		isEven = num % 2 == 0;
		output = "O número " + num + " é " + (isEven ? "Par" : "Ímpar");
		System.out.println(output);
				
	}

}
```
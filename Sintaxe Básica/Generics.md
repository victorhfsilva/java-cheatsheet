# Sintaxe Básica
## Generics

Permitem que um ou mais variáveis possuam o tipo T especificado na declaração do objeto. 

- Evitam castings excessivos.
- Evitam códigos redundantes.
- Encontram erros no tempo de compilação.

Exemplo:
```
public class Objeto <T> {
	private T conteudo;
	
	public Objeto(T conteudo){
		this.conteudo = conteudo;
	}
	
	@Override
	public String toString() {
		return "Node [conteudo=" + var + "]";
	}
	
}
		
Objeto<String> obj = new Objeto<>("Conteúdo");
	
```

### Unknown Wildcard

São utilizados em funções que aceitam argumentos de qualquer tipo.

```
public void imprimeObjeto(Objeto<?> obj){
	for (Object o : obj){
		System.out.println(o);
	}
}

Objeto<String> obj = new Objeto<>("Conteúdo");
imprimeObjeto(obj);
```

### UpperBounded Wildcard

São utilizadas em funções que aceitam apenas argumentos de classes que extendem a classe especificada.

```
public void imprimeObjeto(Objeto<? extends SuperClasse> obj){
	for (Object o : obj){
		System.out.println(o);
	}
}

Objeto<String> obj = new Objeto<>("Conteúdo");
imprimeObjeto(obj);
```

### LowerBounded Wildcard

São utilizadas em funções que aceitam apenas argumentos de classes que são Super Classes da classe especificada.

```
public void imprimeObjeto(Objeto<? super  ClasseInferior> obj){
	for (Object o : obj){
		System.out.println(o);
	}
}

Objeto<String> obj = new Objeto<>("Conteúdo");
imprimeObjeto(obj);
```

### Notação

- K para "Key", exemplo: Map<K,V>
- V para "Value", exemplo: Map<K,V>
- E para "Element", exemplo: List\<E>
- T para "Type"
- ? quando genérico
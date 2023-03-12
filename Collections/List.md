# Collections

## List

* Permite elementos duplicados e garante ordem de inserção.
* Classes: vector, arrayList e linkedList.

	- ArrayList é preferível para problemas que envolvam muitas pesquisas.
	- LinkedList é preferível para problemas que envolvam muitas inserções e remoções.
	
	
### Inicializando um ArrayList

```
List<Tipo> lista = new ArrayList<>();
```
ou
```
ArrayList<Tipo> lista = new ArrayList<>();
```
ou 
```
List<Tipo> lista = new ArrayList<>(Arrays.asList(elementos));
```

Exemplo: 

```
List<Double> lista = new ArrayList<>(Arrays.asList(1.2, 3.4, 5.6, 7.8));
```

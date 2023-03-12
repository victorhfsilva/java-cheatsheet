# Collections
## Map

* Possui uma chave única para cada valor.
* Classes: HashMap [O(1)], LinkedHashMap [O(1)], TreeMap [O(log(n))]

### Inicializando um HashMap

```
Map<tipo da chave, tipo dos valores> map = new HashMap<>();
```
ou
```
HashMap<tipo da chave, tipo dos valores> map = new HashMap<>();
```
ou 
```
Map<tipo da chave, tipo dos valores> map = Map.of(chave elemento, valor elemento, chave elemento, valor elemento ...);
```
ou
```
Map<tipo da chave, tipo dos valores> map = new HashMap<>(){{
	put(chave, valor);
	put(chave, valor);
	...
}}
```

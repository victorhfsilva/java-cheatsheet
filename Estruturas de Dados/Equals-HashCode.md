# Estrutura de Dados

## Equals

Retorna verdadeiro se dois objetos tiverem o mesmo endereço de memória ou se tiverem atributos iguais.


```
public class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj){
    		
    		if (this == obj) return true;
    		if (obj == null || getClass() != obj.getClass()) return false;
    		
    		MyClass other = (MyClass) obj;
    		
    		return this.id == other.id && this.name.equals(other.name);
    }
```

## Hash Code

Gera um Hash Code que representa o estado do objeto. Hash Codes são frequentemente utilizados para comparar objetos. Eles são produzidos de tal forma que dois objetos que são considerados iguais pelo método Equals possuem o mesmo Hash Code.
 

```
public int hashCode(){
	return Objects.hash(id, name);
}
```
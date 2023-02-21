# Sintaxe Básica

## Documentação

### Comentários

```
//Linha de Comentário

/*
* 	Bloco de Comentário
*/

/**
*	Comentário de Documentação
*/
 ```
 
### Tags
__@author:__ Autor/Criador.

__@version:__ Versão do recurso disponibilizado.

__@since:__ Versão/Data de início da disponibilização do recurso.

__@param:__ Descrição dos parâmetros dos métodos criados.

__@return:__ Definição do tipo de retorno de um método.

__@throws:__ Define se o método lança alguma exceção.

Exemplo:

```
/**
* <h1>Calculadora</h1>
* A Calculadora realiza operações matemáticas entre números inteiros
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Gleyson Sampaio
* @version 1.0
* @since   01/01/2022
*/
public class Calculadora {
   /**
   * Este método é utilizado para somar dois números inteiros
   * @param numeroUm este é o primeiro parâmetro do método
   * @param numeroDois este é o segundo parâmetro do método
   * @return int o resultado deste método é a soma dos dois números.
   */
    public int somar(int numeroUm, int numeroDois) {
        return  numeroUm + numeroDois;
    }
}
```

### Javadoc

Para gerar arquivos HTML de documentação basta executar o seguinte código no terminal.

```
javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
```
# Sintaxe Básica

## Tipos de variáveis

### Inteiros

```
//8 bits: de -128 a 127
byte var1 = 125;

//16 bits: de -32768 a 32767
short var2 = 32756;

//32 bits: de -2147483648 a 2147483647 
int var3 = 2147483642; 

//64 bits: de -9223372036854775808 a 9223372036854775807
long var4 = 9223372036854775802L 
```

### Float

```
//32 bits: de -3.4028E+38 a 3.4028E+38
float var5 = 3.1621F;

//64 bits: de -1.7976E+308 a 1.7976E+308
double var6 = 4.2341;
```

### Boolean
```
boolean var7 = true;
```

### Caractere
```
char var8 = 'c';
```

### Constantes
As constantes não podem ser alteradas após serem declaradas.
```
final tipo VARIAVEL = valor;
```
Exemplo:
```
final double PI = 3.14159265359;
```

# POC Features Java 8 Functional Interfaces

````plantuml
functional-interfaces/
│
├── Example01FunctionalInterface
├── Example02Predicate
├── Example03Function
├── Example04Consumer
├── Example05Supplier
├── Example06UnaryOperator
├── Example07BinaryOperator
├── Example08BiFunction
├── Example09BiPredicate
├── Example10BiConsumer
└── Example11CustomFunctionalInterface
````

### Example 1

#### Example01FunctionalInterface

Outcome:

````plantuml
Addition: 15
Subtraction: 5
Multiplication: 50
````

### Example 2:

#### Example02Predicate

A vantagem do Predicate é a passagem de comportamento com argumento. 
O Predicate encapsula uma condição e possibilita reutilização; Além disso, ele pode ser combinado com outras 
Predicates e reutilizado.

````plantuml
Maria is adult
Carlos is adult
Ana is adult
````

### Example 3

#### Example03Function

A `function` representa a passagem de um valor de um tipo transformando em um outro;

Algo como:
````plantuml
T → R

T = tipo de entrada
R = tipo de saída
````

Pense que em Stream `Stream.filter()` e `Stream.map()` um recebe uma condição e o
outro recebe uma transformação, ou seja, uma function.

Saida:

````
Name: Carlos
````

### Example 4

#### Example04Consumer

O Consumer é uma interface que representa o recebimento de um argumento,
executa uma ação e não retorna nada.

```java
Consumer<Person> printPerson = System.out::println;
```

````
Person{name='Carlos', age=42}
````

````plantuml
Example02Predicate
        ↓
T → boolean
        ↓
test()

Example03Function
        ↓
T → R
        ↓
apply()

Example04Consumer
        ↓
T → void
        ↓
accept()
````

### Example Supplier

#### Example05Supplier

Essa interface excencialmente não recebe nenhum argumento, mas retorna um valor. Ou seja, ela representa a execução de
comportamento. Onde ela encapsula um comportamento permitindo a reutilização.

Saida:

````
Hello Java 8
````

### Resumo até aqui:


|Interface|	Entrada|	Saída|	Método|
|---------|--------|---------|--------|
|Predicate<T>|	T|	boolean	|test()|
|Function<T,R>|	T|	R|	apply()|
|Consumer<T>|	T|	void|	accept()|
|Supplier<T>|	nenhuma|	T|	get()|


### Example Unary Operator

#### Example06UnaryOperator

É uma especialização de `Function`:

````java
@FunctionalInterface
public interface UnaryOperator<T> extends Function<T, T> {
    T apply(T t);
}
````

A diferença está em que no unaryOperator recebe um valor de um tipo e retorna outro valor do mesmo tipo.


Aqui:

`Integer → Integer`

Entrou Integer, saiu Integer.

Basicamente o que o unary operator comunica é "Receba isso, transforme, mas mantenha o mesmo tipo."

Saida:
````
Result: 20
````

### Example Binary Operator 

o BinaryOperator<T> adiciona dois valores de entrada

#### Example07BinaryOperator

Saida:

````
15
````

Basicamente o BinaryOperator representa uma operação com duas 2 entradas e uma saída do mesmo tipo.

`BinaryOperator<T>	2	mesmo tipo	Integer,Integer → Integer`

O Binary operator é uma especialização para o Bifunction, com a diferença que a saída será sempre do 
mesmo tipo.

### Example Bi Function

#### Example08BiFunction 

Saida:

````
15
````

Aqui temos:

````
Integer + Integer → Integer
````

Agora:

````
Integer + Integer → String
````

A Bifunction recebe dois parametros e retorna um valor;

### Example BiPredicate

#### Example09BiPredicate

````plantuml
true
false
````

O BiPredicate faz uma pergunta envolvendo dois valores;

|Interface|	Entradas |Retorno|	Exemplo|
|---------|----------|-------|---------|
|Predicate<T>|	1|	boolean|	age → age >= 18|
|BiPredicate<T,U>|	2|	boolean|	(age,ticket) → age >= 18 && ticket|

Assim como Predicate, BiPredicate possui:

```
.and()
.or()
.negate()
````

Por exemplo:
````
BiPredicate<Integer, Boolean> isAdult =
(age, hasTicket) -> age >= 18;

BiPredicate<Integer, Boolean> hasTicket =
(age, hasTicketValue) -> hasTicketValue;

BiPredicate<Integer, Boolean> canEnter =
isAdult.and(hasTicket);
````

### Example Bi Consumer

#### Example10BiConsumer

````java
@FunctionalInterface
public interface BiConsumer<T, U> {
    void accept(T t, U u);
}
````

Saida:

````
John - 40
````

Obs:
O método utilizado pelo BiConsumer é accept(), assim como no Consumer.

### Example Custom Functional Interface

#### Example11CustomFunctionalInterface

Saida:

````
15
5
50

````


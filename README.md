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
└── Example11CustomFunctionalInterfac
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

Saida:
````
Result: 20
````

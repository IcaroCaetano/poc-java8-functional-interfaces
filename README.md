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

A vantagem do Predicate é a passagem de comportamento com argunmento. 
O Predicate encapsula uma condição e possibilita reutilização; Além disso, ele pode ser combinado com outras 
Predicates e reutilizado.

````plantuml
Maria is adult
Carlos is adult
Ana is adult
````
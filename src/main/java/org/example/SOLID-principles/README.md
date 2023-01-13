 # SOLID Principles
 
## Single Responsibility Principle
- A class should have one reponsibility and one reason to change.


## Open Closed Principle
- Classes should be open for extension but closed for modification. 

## Liskov Substitution principle
- Derived classes must be completely subsitutable for their base classes without interrupting the behaviour of the program


## Interface Segreagation Principle
- This principle states that the larger interfaces split into smaller ones . Because the implementation classes use only the methods that are required.
- Clients or inheriting classes should not be forced to use the methods they do not want to use.

## Dependency Inversion Principle
- High level modules should not import anything from low level modules. Both should depend on abstractions. 
- Abstractions should not depend on details, details should depend on abstractions. 
- The implications of violating this principle would result in a rigid, tightly coupled system where testing blocks of code independently would be very difficult, 
  reusability of code would be near impossible. 
Main point: Subclassing o implementation doesn't imply subtype relation.

ServiceSub extends/implements Service. Doesn't mean ServiceSub is a proper subtype of Service.
This relation means that ServiceSub can substitute to Service where Service is being used.

How can I say that a class is really a subtype of another class or not?

We will know whether a class is really a subtype of another class:

First section: 

    Method Signature Rules:

    - Contravariant of arguments:
        - If subclasses implements a method from its superclass, then number of arguments should be the same.
        - The type of each arguments in subclass method should be the supertype of the type of the respective argument in superclass method.
            (Don't make subclass method's arguments more specific than they are in the superclass)
    -  Covariant of result:
        - Either both superclass and subclass method return result, or neither does.
        - If there is a result, The type of the result in the subclass is a subtype of the type of result in the superclass.
            (Don't make subclass method's return type more general)
    -  Exception rule:
        - Exception thrown by the method in the subclass should be contained in the set of exception thrown by respective method in the superclass.
            (Throw type of exception from subclass that are subtype from superclass method's type)

    Pre/Post Condition Rules:
        What is a pre-condition? An assertion about state of the system before the method is called.
            - Pre-condition required by the method of the subclass mustn't be stronger than precondition required by the method of superclass.
                Example:
                    ServiceSub extends/implements Service.
                    Service has a doSomething(ClassArg) Method that recibes valid referent or null. 
                    ServiceSub has a doSomething(ClassArg) Method that recibes only valid referent(not null). 
                    In this situation ServiceSub is not a proper subtype of Service because it requires stronger pre-condition.
              (A subclass should be able to operate in all state that a superclass can operate in)
    
        What is a post-condition? An assertion about state of the system after the method is executed.
            -Post-Condition guaranteed by methods of a subclass mustn't be weaker than post-condition guaranteed by methods of a superclass.
                Example:    
                    ServiceSub extends/implements Service.
                    Service has a doSomething() Method that returns ClassArg type. Service says that the return type cannot be null. (It Only returns valid referent)
                    ServiceSub has a doSomething() Method that returns ClassArg type. ServiceSub says that the return type can be null or valid referent. 
                    In this situation ServiceSub is not a proper subtype of Service because it guarantees weaker post-condition.
                    

Second section: Properties Rules
        What is invariant: A assertion about a specific class property which is always true
            Example:
                BoundedQueue class has a add(Element) method and it has a remove(Element) method.
                BoundedQueue is a queue that can hold a limit amount of elements (limit capacity).
                Invariant: number of elements in the queue is smaller or equal to capacity of the queue. This statement is true for all instances of the BoundedQueue class.

        - Invariant guaranteed by the subclass must include all invariants guaranteed by a superclass.
                Example:
                    BoundedQueue class has a add(Element) method and it has a remove(Element) method.
                    BoundedQueue is a queue that can hold a limit amount of elements (limit capacity).
                    Invariant: number of elements in the queue is smaller or equal to capacity of the queue. This statement is true for all instances of the BoundedQueue class.

                    DuplicatingQueue class has a add(Element) method and it has a remove(Element) method.
                    DuplicatingQueue extends BoundedQueue
                    DuplicatingQueue should preserve all invariants of BoundedQueue. 
                    Later, DuplicatingQueue add a duplicateContent() method which duplicates its content. Because of this, the number of the elements in the queue is lager
                    than the capacity it may break the funcionality expected. (Violation of principle)
                    
        What is Constraint? A assertion about how class properties evolves over time.
                    Invariant never changes. A constraint came into play to compensate this statement because invariants can't express dynamic properties.
                    Example:
                        BoundedQueue class has a add(Element) method and it has a remove(Element) method.
                        BoundedQueue is a queue that can hold a limit amount of elements (limit capacity).
                        Invariant: number of elements in the queue is smaller or equal to capacity of the queue. This statement is true for all instances of the BoundedQueue class.
                        Constraint: Capacity(max number of elements) never changes.
                        Difference: 
                            Invariant is true for al instances of the classes. 
                            Constraint: Some instances can have different capacities if you initialize them with different capacities. This capacities never change after initialization.                         
        - Constraints enforced by subclass must include all constraints enforced by the superclass.
                    Example:                    
                        BoundedQueue class has a add(Element) method and it has a remove(Element) method.
                        BoundedQueue is a queue that can hold a limit amount of elements (limit capacity).
                        Constraint: Capacity(max number of elements) never changes.
                        DuplicatingQueue extends BoundedQueue
                        Later, DuplicatingQueue add a setCapacity(int) that change its capacity. Because of this, the capacity changes after initialization.  (Violation of principle)
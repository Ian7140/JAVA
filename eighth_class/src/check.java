/*
If the method is not containing '{}', it is not completed.
abstract void bcd(); -> abstract method
If it's containing at least one of abstract method, it should be abstract class
ex1 ->
abstract class A
{
    int a;
    abstract void bcd() {};
    !error! => method should not contain '{}' in bcd()
}

ex2 ->
A extends B : This brings A's method and field directly
abstract class B extends A
{
    int a;
    abstract void abc();
}
interface : if every method contains abstract method, it's class should be defined as INTERFACE
class -> interface

A implements B : A will override ALL the abstract methods in B (take responsibility)
 ex4 ->
 abstract class B implements A
 {
    @Override
    void abc() {};
 }

 class C extends D
 {
    @Override
    void bcd() {};
 }

 anonymous inner class vs son's class
 son's
 -> you don't have to define every time / you should write son's creation code by yourself
 anonymous : you don't have to define son's class / you have to override all the time to make several objects

 */
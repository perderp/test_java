package Interface;

interface A{}
interface B{}

class C implements A,B{
    // Abstract members of A
    // Abstract members of B
}

// Extending an Interface

interface Line{}

interface Polygon02 extends Line{}

/*
    Here, the Polygon interface extends the Line interface. Now, if any class implements Polygon,
    it should provide implementations for all the abstract methods of both Line and Polygon.
 */

//Extending Multiple Interfaces
interface D{}
interface E{}
interface F extends D, E{

}
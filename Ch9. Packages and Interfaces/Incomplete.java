/* If a class implements an interface, without defining the interface method, 
it should be declared as abstract

*/

abstract class Incomplete implements Callback {
    int a;
    Incomplete(int a){
        this.a = a;
    }

    void show(){
        System.out.println("Incomplete: value of a: " + a);
    }
}
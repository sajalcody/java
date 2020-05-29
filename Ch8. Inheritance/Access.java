// MEMBER ACCESS AND INHERITANCE

class A{
    int i;
    private int j;
    void setij(int x, int y){
        i=x;j=y;
    }
}

class B extends A{
    int total;
    void sum(){
        total = i + j; // ERROR: B can't access j as it is a private members of superclass.
    }
}
public class Access {
    public static void main(String[] args){
        B subObj = new B();
        subObj.setij(4,5);
        subObj.sum();
        System.out.println("Total: " + subObj.total);
    }
}
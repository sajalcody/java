package p1;

class Derived extends Protection{
    Derived(){
        System.out.println("Derived: Derived Constructor");

        System.out.println("n = "+ n);

        // Derived class cannot access private members of parent class
        // System.out.println("n_pri = "+ n_pri);

        System.out.println("n_pro = "+ n_pro);
        System.out.println("n_pub = "+ n_pub);
    }
}
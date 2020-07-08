package p2;

import p1.*;

class Protection2 extends Protection{
// class Protection2 extends p1.Protection{ // if import line is not included
    Protection2(){
        System.out.println("Protection2: Other Package Derived Class");

        // Class in other package cannot access default members
        // System.out.println("n = "+ n);

        // Classes in other package cannot access private members of a class
        // System.out.println("n_pri = "+ n_pri);

        System.out.println("n_pro = "+ n_pro);
        System.out.println("n_pub = "+ n_pub);
    }
}
package p2;

import javax.print.attribute.standard.MediaSize.Other;

class OtherPackage {
    OtherPackage() {
        p1.Protection p = new p1.Protection();

        System.out.println("OtherPackage: Other Package Class");

        // Class in other package cannot access default members
        // System.out.println("n = "+ p.n);

        // Classes in other package cannot access private members of a class
        // System.out.println("n_pri = "+ p.n_pri);

        // Classes in other package cannot access protected members of a class
        // System.out.println("n_pro = "+ p.n_pro);

        System.out.println("n_pub = "+ p.n_pub);
    }
}
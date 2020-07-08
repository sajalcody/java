package p1;

class SamePackage {
    SamePackage(){
        Protection p = new Protection();

        System.out.println("SamePackage: Same Package Constructor");

        System.out.println("n = "+ p.n);

        // Classes in same package cannot access private members of a class
        // System.out.println("n_pri = "+ p.n_pri);

        System.out.println("n_pro = "+ p.n_pro);
        System.out.println("n_pub = "+ p.n_pub);
    }
}
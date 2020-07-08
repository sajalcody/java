public class StringTest {
    // public static void change(String (nm)){
    public static void change(String nm){
        nm = "Changed value";
    }
    public static void test(){
        String name = "Original Value";
        System.out.println(name);
        change(name);
        System.out.println(name);
    }

    public static void main(String[] args){
        // StringTest s = new StringTest();
        String a = "Sajal";
        String b = "Sajal";
        String c = new String("Sajal");
        int i = 1;
        int j = (i);
        // StringTest.test();
        // if (a.equals(b)) //=> true
        // if (a.equals(c)) //=> true
        // if (a == c) //=> false
        if (a == b)
        System.out.println("true");
        else
        System.out.println("false");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        a = "Updated";
        System.out.println(a.hashCode());
    }
}
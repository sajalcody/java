public class Basics {
    public static void main(String[] args){
        float f =1;
        int a = 'A' + 1; // 66
        char c = 'A' + 1; // 'B'
        char c1 = 'A' + '1'; // 65 + 49 = 114
        System.out.println("Int: " + a);
        System.out.println("Char: " + c);
        System.out.println("Char with char: " + c1 + " and its int is: " + (int)c1);
    }
}
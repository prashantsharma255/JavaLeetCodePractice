package generics;

public class Generics {

    public static <T extends Comparable<T>> T findMax(T a, T b) {
        int n = a.compareTo(b);
        if (n < 0) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(findMax(2, 3));
        System.out.println(findMax(5, 3));
        System.out.println(findMax(3, 3));

        System.out.println(findMax(2.0, 3.0));
        System.out.println(findMax('a', 'k'));
        System.out.println(findMax("Nigga", "Apple"));
        
        Generics k = new Generics();
    }

}

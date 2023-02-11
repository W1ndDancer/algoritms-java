package Seminars.HW3;

public class Main {
    public static void main(String[] args) {
        MyTree<Integer> example1 = new MyTree<>();
        example1.add(1);
        example1.add(2);
        example1.add(3);
        example1.add(4);
        example1.add(5);
        example1.add(6);
        example1.add(7);
        example1.add(8);
        System.out.println(example1.contains(4));
        System.out.println(example1.contains(10));
        System.out.println();

        MyTree<String> example2 = new MyTree<>();
        example2.add("Ivan");
        example2.add("Vanya");
        example2.add("IVAN");
        example2.add("Vanjek");
        System.out.println(example2.contains("IVAN"));
        System.out.println(example2.contains("ivan"));
        System.out.println(example2.contains("Oleg"));
    }

}

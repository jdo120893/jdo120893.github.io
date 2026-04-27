package test;

public class ObjectTest{
    static void main(String[] args) {
        Person p1 = new Person("정동욱", 28);
        Person p2 = new Person("정동욱", 28);
        Person p3 = new Person("이영희", 23);

        System.out.println(p1.toString());
        System.out.println(p1);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1 == p2);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1.getClass().getName());
    }
    }

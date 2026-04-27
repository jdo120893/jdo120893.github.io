package test;

public class EnumTest{
    public static void main(String[]args) {
        Day today = Day.MONDAY;

        switch(today) {
            case MONDAY:
            case FRIDAY:
                System.out.println("평일입니다.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("주말입니다.");
                break;
        }

        OrderStatus status = OrderStatus.PENDING;
        System.out.println(status.getDescription());

        for(OrderStatus s : OrderStatus.values()){
            System.out.println(s.name() + ": " + s.getDescription());
        }

        OrderStatus found = OrderStatus.fromCode("S");
        System.out.println(found);
    }
    }

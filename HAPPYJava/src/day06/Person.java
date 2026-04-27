package day06;

public class Person {
    private String name;
    private int age;
    private String address;

    // this를 사용한 필드 접근
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // 메소드에서 this 사용
    public void introduce(){
        System.out.println("안녕하세요 저의 이름은" + name + "입니다.");
        System.out.println("나이는" + age + "입니다.");
    }

    // this를 반환하는 메소드 (메소드 체이닝)
    public Person setAddress(String address){
        this.address = address;
        return this;//현재 객채를 반환
    }


    // 다른 메소드 호출 시 this 사용 (선택적)
    public void displayAll(){
        this.introduce();
        System.out.println("주소는" + address + "입니다.");
    }
}

// 사용 예제
class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("김철수", 25);

        person.setAddress("경기도 평택시");

        person.displayAll();

    }
}
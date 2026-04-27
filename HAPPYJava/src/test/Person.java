package test;

    public class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // toString() 오버라이딩
        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }

        // equals() 오버라이딩
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Person person = (Person) obj;
            return age == person.age && name.equals(person.name);
        }

        @Override
        public int hashCode(){
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
        }
    }



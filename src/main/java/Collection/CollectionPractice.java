package Collection;

import java.util.*;
import java.util.stream.Collectors;

class CollectionPractice {
    public static void main(String[] args) {
        Person p1 = new Person("Johnny", "Jose", "Bloggs", 10);
        Person p2 = new Person("Sarah", "Bloggs", 55);
        Person p3 = new Person("Susan", "Penelope", "Bloggs", 40);
        Person p4 = new Person("Jimmy", "Bloggs", 40);
        Person p5 = new Person("Bobby", "Smith", 15);
        Person p6 = new Person("Bernice", "Louise", "Smith", 80);
        List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5, p6);

        // (Q1) Print out all the middle names, or an alert if no middle name
        for (Person p : personList) {
            if (p.getMiddleName().isPresent()) {
                System.out.println(p.getMiddleName().get());
            } else {
                System.out.println("Alert, no middle name!");
            }
        }

        // (Q2) Populate a string with all middle names using commas to separate
        // there must not be a comma at the end - ie. Jose,Penelope,Louise

        String middleNames = personList.stream().filter(p -> p.getMiddleName().isPresent()).map(p -> p.getMiddleName().get()).collect(Collectors.joining(","));
        System.out.println(middleNames);

        // (Q3) Populate the hashmap with each surname and a count of how many surnames there are
        // The map should contain Bloggs -> 4, Smith -> 2

        Map<String, Long> count = new HashMap<>();

        for (Person p : personList) {
            Long c = count.getOrDefault(p.getSurname(), 0L);
            count.put(p.getSurname(), c + 1);
        }

        System.out.println(count);
        for (String key : count.keySet()) {
            System.out.println(key + " has : " + count.get(key));
        }

        // (Q4) Optional sort personList by Age AND FirstName
        //
        personList.sort((pr1, pr2) -> {
            if (pr1.getAge() != pr2.getAge()) {
                return pr1.getAge() - pr2.getAge();
            } else {
                return pr1.getFirstName().compareTo(pr2.getFirstName());
            }
        });

        System.out.println(personList);

        // (Q5) Optional find the max age in the personList (ie. 80)
        int maxAge = 0;
        for (Person p : personList) {
            maxAge = Math.max(maxAge, p.getAge());
        }
        System.out.println(maxAge);

        //Alternative solution 2: since ther personList arlready sorted
        System.out.println(personList.get(personList.size()-1).getAge());

        //Alternative solution 1:
        System.out.println(personList.stream().max(Comparator.comparingInt(Person::getAge)).get().getAge());

    }

    static class Person {
        private String firstName;
        private String surname;
        private Optional<String> middleName;
        private int age;

        public Person(String firstName, String surname, int age) {
            this.firstName = firstName;
            this.surname = surname;
            this.age = age;
            this.middleName = Optional.empty();
        }

        public Person(String firstName, String middleName, String surname, int age) {
            this(firstName, surname, age);
            this.middleName = Optional.of(middleName);
        }

        public String getFirstName() {
            return firstName;
        }

        public String getSurname() {
            return surname;
        }

        public int getAge() {
            return age;
        }

        public Optional<String> getMiddleName() {
            return middleName;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age=" + age + '\'' +
                    '}';
        }
    }
}


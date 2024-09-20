
import java.util.ArrayList;

class ArraylistExample {

    public void example1() {

        Person p1 = new Person(18);
        p1.setName("Pooja");
        p1.setCity("Gurgaon");
        System.out.println("Name:" + p1.getName());
        System.out.println("City:" + p1.getCity());
        System.out.println("Age:" + p1.getAge());

        Person p2 = new Person(2);
        p2.setName("Mister Bipul");
        p2.setCity("Dhanbaad");
        System.out.println("Name:" + p2.getName());
        System.out.println("City:" + p2.getCity());
        System.out.println("Age:" + p2.getAge());

        ArrayList<Person> personlist = new ArrayList<Person>();

        personlist.add(p1);
        personlist.add(p2);

        for (Person p : personlist) {

            if (p.getAge() > 18) {
                System.out.println("Array List Example:" + p.getName() + " Elgible candidate:" + p.getAge() + " " + p.getCity());
            } else {
                System.out.println("Array List Example:" + p.getName() + " Not elgible candidate:" + p.getAge() + " " + p.getCity());
            }

        }

    }
}

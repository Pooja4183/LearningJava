
import java.util.HashSet;

class SetExample{

public void example(){

        Person p1 = new Person(12);
        p1.setName("Cheenu");
        p1.setCity("Gandhinagar");
        // System.out.println("Name:"+ p1.getName());
      

        Person p2 = new Person(23);
        p2.setName("Prince");
        p2.setCity("Vadodra");

        Person p3 = new Person(25);
        p3.setName("Prince");
        p3.setCity("Delhi");
       

        HashSet<Person> personlist = new HashSet<>();
    
        personlist.add(p1);
        personlist.add(p2);
        personlist.add(p3);

        for (Person p: personlist) {
            System.out.println("HashSet Example:" + p.getName()+" "+ p.getAge()+" "+ p.getCity() +" "+p.isElgible() );
            
        }
}

}
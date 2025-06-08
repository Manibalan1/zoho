import java.util.ArrayList;
import java.util.List;
public class Family {
    Person father;   // person's father
    Person mother;   // person's mother
    List <Person> sons = new ArrayList<>();
    List <Person> daughters = new ArrayList<>();
    Family(Person father)//, Person mother)
    {
        this.father = father;
        this.mother = mother;
    }
}
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        List <Person> male = new ArrayList<>();
        List <Person> female = new ArrayList<>();

        Person male1 = new Person("Appadurai" , "male");
        male.add(male1);

        Person male2 = new Person("Kumar","male");
        male.add(male2);

        Person male3 = new Person("Manibalan" , "male");
        male.add(male3);

        Person female1 = new Person("Mayil","female");
        female.add(female1);

        Person female2 = new Person("MayilDaughter1", "female");
        female.add(female2);

        Person female3 = new Person("MayilDaughter2", "female");
        female.add(female3);

        Family fam1 = new Family(null);
        fam1.sons.add(male2);
        fam1.daughters.add(female1);

        Family fam2 = new Family(male1);
        fam2.sons.add(male3);

        Family fam3 = new Family(male2);

        Family famFemale = new Family(male1);
        famFemale.daughters.add(female2);
        famFemale.daughters.add(female3);

        Family famFemale2 = new Family(null);
        famFemale2.mother = female1;

        male1.family = fam1;
        male2.family = fam2;
        male3.family = fam3;
        female1.family = famFemale;
        female2.family = famFemale2;

        // Finding Moraponnu

        String name = "Manibalan";
        Person p = null;
        for(int i=0;i<male.size();i++)
        {
            if(name.equals(male.get(i).name))
            {
                p = male.get(i).family.father.family.father;
                break;
            }
        }
        for(int i=0;i<p.family.daughters.size();i++)
        {
            List <Person> Daughters;
            Daughters = p.family.daughters.get(i).family.daughters;
            for(int j=0;j<Daughters.size();j++)
            {
                System.out.println(Daughters.get(j).name);
            }
        }

        // Finding Morapaiyan

        name = "MayilDaughter1";
        p = null;
        for(int i=0;i<female.size();i++)
        {
            if(name.equals(female.get(i).name))
            {
                p = female.get(i).family.mother.family.father;
                break;
            }
        }
        for(int i=0;i<p.family.sons.size();i++)
        {
            List <Person> Sons;
            Sons = p.family.sons.get(i).family.sons;
            for(int j=0;j<Sons.size();j++)
            {
                System.out.println(Sons.get(j).name);
            }
        }
    }
}
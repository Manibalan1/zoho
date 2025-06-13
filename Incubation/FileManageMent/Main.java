import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Directory> directories = new ArrayList<>();

        Directory animal= new Directory("Animal", null);

        Directory cat = new Directory("Cat",animal);
        Directory dog = new Directory("Dog",animal);
        Directory cow = new Directory("Cow",animal);

        Directory kitten = new Directory("Kitten",cat);
        Directory puppy = new Directory("puppy",dog);
        Directory calf = new Directory("calf",cow);

        directories.add(animal);
        directories.add(cat);
        directories.add(dog);
        directories.add(cow);
        directories.add(kitten);
        directories.add(puppy);
        directories.add(calf);

        animal.child.add(cat);
        animal.child.add(dog);
        animal.child.add(cow);

        cat.child.add(kitten);
        dog.child.add(puppy);
        cow.child.add(calf);

        File animalFile = new File("Animals","They are domestic");
        File catFile = new File("cat","they are fast");
        File dogFile = new File("dog","They are cute");
        File cowFile = new File("cow","They give milk");

        File kittenFile = new File("kitten","They are cat's child");
        File puppyFile = new File("puppy","They are dog's child");
        File calfFile = new File("calf","they are cow's child");

        animal.files.add(animalFile);
        cat.files.add(catFile);
        dog.files.add(dogFile);
        cow.files.add(cowFile);
        kitten.files.add(kittenFile);
        puppy.files.add(puppyFile);
        calf.files.add(calfFile);

        Directory root = directories.get(0);
        Directory current;

        String directoryName = "Animal";
        for(int i=0;i<directories.size();i++)
        {
            if(directories.get(i).name.equals(directoryName))
            {
                current = directories.get(i);
            }
        }

        String command = "";
        if(command.equals("cd."))
        {
            while((current.Parent.name))
        }

        if(command.equals("cd.."))
        {

        }
    }
}
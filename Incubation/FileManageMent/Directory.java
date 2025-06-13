import java.util.ArrayList;
import java.util.List;

public class Directory {
    List <Directory> child = new ArrayList<>();
    String name;
    List <File> files = new ArrayList<>();
    Directory Parent = null;
    Directory(String name , Directory Parent)
    {
        this.name = name;
        this.Parent = Parent;
    }
}
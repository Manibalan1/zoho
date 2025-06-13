import java.util.ArrayList;
import java.util.List;
public class Display {
    List <Character> spaces = new ArrayList(10);
    int start = spaces.size()-1;
    void printInput(char input)
    {
        spaces.add(input);
        for(int i=0;i<10-spaces.size();i++)
        {
            System.out.print("-");
        }
        for(int i=0;i<spaces.size();i++)
        {
            System.out.print(spaces.get(i));
        }
        System.out.println();
    }
}
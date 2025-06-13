import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Manager {
    Scanner in = new Scanner(System.in);
    Display display = new Display();
    List <Cell> cells = new ArrayList<>();
    List <Character> inputs = new ArrayList<>();
    void createCell()
    {
        char value[] = {'0','1','2','3','4','5','6','7','8','9','+','-','*','/'};
        for(int i=0;i<14;i++)
        {
            Cell cell = new Cell(value[i]);
            cells.add(cell);
        }
    }
    void getInput()
    {
        System.out.println("Enter input");
        while(true)
        {
            char input = in.next().charAt(0);
            if(input=='=')
            {
                calculate();
                break;
            }
            else
            {
                for(int i=0;i< cells.size();i++)
                {
                    if(input==cells.get(i).name)
                    {
                        display.printInput(input);
                        inputs.add(input);
                    }
                }
            }
        }
    }
    void calculate()
    {
        char operation = ' ';
        String str1 = "";
        String str2 = "";
        int start = 0;
        boolean check = true;
        while(start<inputs.size())
        {
            if(inputs.get(start)=='+'||inputs.get(start)=='-'||inputs.get(start)=='*'||inputs.get(start) =='/')
            {
                operation = inputs.get(start);
                check = false;
                start++;
            }
            if(check)
            {
                str1 = str1+inputs.get(start);
                start++;
            }
            else
            {
                str2 = str2+inputs.get(start);
                start++;
            }
        }
        if(operation=='+')
        {
            System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));
        }
        else if(operation=='-')
        {
            System.out.println(Integer.parseInt(str1)-Integer.parseInt(str2));
        }
        else if(operation=='*')
        {
            System.out.println(Integer.parseInt(str1)*Integer.parseInt(str2));
        }
        else if(operation=='/')
        {
            System.out.println(Integer.parseInt(str1)/Integer.parseInt(str2));
        }
        display.spaces.clear();
        inputs.clear();
    }
}
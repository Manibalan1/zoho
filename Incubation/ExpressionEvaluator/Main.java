public class Main {
    public static void main(String[] args) {
        Equation equation = EquationManager.parseEquation("2xy+y");
        Equation equation1 = EquationManager.parseEquation("2x+10y^2");
        System.out.println(equation1);

        Equation result = equation.multiply("2x+10y^2");
        System.out.println(result);

        double[] values = {2, 2};
        double evaluationResult = equation.evaluate(values);
        System.out.println(result.evaluate(values));
        System.out.println(equation);
        System.out.println(evaluationResult);
    }
}
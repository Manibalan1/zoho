import java.util.Arrays;

class Equation {
    Term[] equationTerms;
    String[] variableNames;

    Equation(int size) {
        equationTerms = new Term[size];
    }

    public void display() {
        for (Term term : equationTerms) {
            System.out.print(term + " ");
        }
        System.out.println();
    }

    public Equation multiply(String equationString) {
        Equation secondEquation = EquationManager.parseEquation(equationString);
        Equation resultEquation = new Equation(this.equationTerms.length * secondEquation.equationTerms.length);

        int count = 0;
        for (Term firstTerm : this.equationTerms) {
            for (Term secondTerm : secondEquation.equationTerms) {
                resultEquation.equationTerms[count++] = firstTerm.multiply(secondTerm);
            }
        }
        return resultEquation;
    }

    public double evaluate(double[] values) {
        double result = 0.0;
        for (Term term : equationTerms) {
            result += term.evaluate(variableNames, values);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Equation [terms=" + Arrays.toString(equationTerms) + ", variables=" + Arrays.toString(variableNames) + "]";
    }
}
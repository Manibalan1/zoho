class EquationManager {
    public static Equation parseEquation(String equationInString) {
        equationInString = equationInString.trim();
        String[] termsInPrimitive = splitTerms(equationInString); // Split into terms

        int count = 0;
        Equation equation = new Equation(termsInPrimitive.length);
        for (String termInPrimitive : termsInPrimitive) {
            equation.equationTerms[count++] = Term.parseTerm(termInPrimitive);
        }

        equation.variableNames = extractVariableNames(equationInString);
        return equation;
    }

    public static String[] splitTerms(String input) {
        String[] tempArray = new String[input.length()];
        int index = 0;
        String regex = "([+-]?[^-+]+)";

        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(input.replaceAll(" ", ""));

        while (matcher.find()) {
            tempArray[index++] = matcher.group();
        }
        String[] termArray = new String[index];
        System.arraycopy(tempArray, 0, termArray, 0, index);
        return termArray;
    }
    public static String[] extractVariableNames(String equationInString) {
        java.util.Set<String> variableSet = new java.util.HashSet<>();
        for (char ch : equationInString.toCharArray()) {
            if (Character.isLetter(ch)) {
                variableSet.add(String.valueOf(ch));
            }
        }
        return variableSet.toArray(new String[0]);
    }
}
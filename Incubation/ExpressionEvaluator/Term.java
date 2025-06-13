class Term {
    int coefficient;
    Variable[] termVariables;

    Term(int size) {
        termVariables = new Variable[size];
    }
    public Term multiply(Term secondTerm) {
        int[] powerMap = new int[26];
        int resultCoefficient = this.coefficient * secondTerm.coefficient;

        loadVariablesToMap(powerMap, this.termVariables);
        loadVariablesToMap(powerMap, secondTerm.termVariables);

        Term resultTerm = new Term(getNonZeroCount(powerMap));
        resultTerm.termVariables = mapToVariableArray(powerMap);
        resultTerm.coefficient = resultCoefficient;
        return resultTerm;
    }

    private void loadVariablesToMap(int[] powerMap, Variable[] variables) {
        if (variables != null) {
            for (Variable variable : variables) {
                powerMap[variable.name - 'a'] += variable.power;
            }
        }
    }

    private int getNonZeroCount(int[] map) {
        int count = 0;
        for (int value : map) {
            if (value > 0) count++;
        }
        return count;
    }

    private Variable[] mapToVariableArray(int[] map) {
        Variable[] variables = new Variable[getNonZeroCount(map)];
        int index = 0;
        for (int i = 0; i < map.length; i++) {
            if (map[i] > 0) {
                variables[index++] = new Variable((char) (i + 'a'), map[i]);
            }
        }
        return variables;
    }

    public static Term parseTerm(String termInString) {
        termInString = termInString.trim();
        StringBuilder coefficientBuilder = new StringBuilder();
        StringBuilder variableBuilder = new StringBuilder();
        int index = 0;

        if (termInString.charAt(index) == '-') {
            coefficientBuilder.append(termInString.charAt(index));
            index++;
        } else if (termInString.charAt(index) == '+') {
            index++;
        }

        boolean foundVariable = false;
        for (; index < termInString.length(); index++) {
            char ch = termInString.charAt(index);
            if (Character.isDigit(ch)) {
                if (foundVariable) {
                    variableBuilder.append(ch);
                } else {
                    coefficientBuilder.append(ch);
                }
            } else if (ch == '^') {
                foundVariable = true;
            } else {
                variableBuilder.append(ch);
                foundVariable = true;
            }
        }

        int coefficient = coefficientBuilder.length() > 0 ? Integer.parseInt(coefficientBuilder.toString()) : 1;
        Variable variable = variableBuilder.length() > 0 ? Variable.parseVariable(variableBuilder.toString()) : null;
        Term term = new Term(variable != null ? 1 : 0);
        term.coefficient = coefficient;
        if (variable != null) {
            term.termVariables[0] = variable;
        }

        return term;
    }

    public double evaluate(String[] variableNames, double[] values) {
        double result = coefficient;
        if (termVariables != null) {
            for (Variable variable : termVariables) {
                for (int i = 0; i < variableNames.length; i++) {
                    if (variable.name == variableNames[i].charAt(0)) {
                        result *= Math.pow(values[i], variable.power);
                        break;
                    }
                }
            }
        }
        return result;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(coefficient);
        if (termVariables != null) {
            for (Variable variable : termVariables) {
                sb.append(variable.name).append("^").append(variable.power);
            }
        }
        return sb.toString();
    }
}
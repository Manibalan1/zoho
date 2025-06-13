class Variable {
    char name;
    int power;

    Variable(char name, int power) {
        this.name = name;
        this.power = power;
    }

    public static Variable parseVariable(String varString) {
        char name = varString.charAt(0);
        int power = varString.length() > 1 ? Integer.parseInt(varString.substring(1)) : 1;
        return new Variable(name, power);
    }

    @Override
    public String toString() {
        return name + "^" + power;
    }
}
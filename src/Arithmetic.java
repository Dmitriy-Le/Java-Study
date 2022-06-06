package src;

public class Arithmetic {
    int varA;
    int varB;

    public Arithmetic(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }

    public int sum () {
        return varA + varB;
    }

    public int mul () {
        return varA * varB;
    }

    public int  max () {
        return (varA >= varB) ? varA : varB;
    }

    public int  min () {
        return (varA >= varB) ? varB : varA;
    }


}

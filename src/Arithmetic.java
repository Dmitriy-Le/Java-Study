package src;

public class Arithmetic {
    int varA;
    int varB;

    public Arithmetic (int A, int B) {
        varA = A;
        varB = B;
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

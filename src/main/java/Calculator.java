public class Calculator {
    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int divInt(int a, int b){
        if ( b == 0) {
            throw new ArithmeticException("Недопустимая операция");
        }
        return a / b;
    }
    public double divDouble(double a, double b){
        if (b == 0) {
            throw new ArithmeticException("Недопустимая операция");
        }
        return (a / b);
    }
}

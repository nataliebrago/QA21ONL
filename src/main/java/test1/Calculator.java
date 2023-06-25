package test1;

public class Calculator {
    private String packageName;

    public int sum (int a, int b) {
        return a+b;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
}

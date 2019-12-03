public class Calculator {
    // Add 2 numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Add multiple numbers
    public int addMany(int ...args) {
        int sum = 0;
        for (int i = 0; i <args.length ; i++) {
            sum += args[i];
        }
        return sum;
    }
    // multiply 2 numbers
    public int multiply(int a, int b) {
        return a * b;
    }
    // multiply many numbers
    public int multiplyMany(int ...args) {
        int multiple = 1;
        for (int i = 0; i <args.length ; i++) {
            multiple = multiple * args[i];
        }
        return multiple;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.add(-1,-1);
        int times = calc.multiply(-1,-1);
        int multiNum = calc.addMany(1,2,3,4,5);
        int multiplyMany = calc.multiplyMany(1,2,3,4,5);


        System.out.println(sum);
        System.out.println(times);
        System.out.println(multiNum);
        System.out.println(multiplyMany);
    }
}

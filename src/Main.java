public class Main {
    public static void main(String[] args) {

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;


        System.out.println(totalWeight);

        var weightDifference = secondBoxer - firstBoxer;
        System.out.println(weightDifference);

        var remains = secondBoxer % firstBoxer;
        System.out.println(remains);
    }
}
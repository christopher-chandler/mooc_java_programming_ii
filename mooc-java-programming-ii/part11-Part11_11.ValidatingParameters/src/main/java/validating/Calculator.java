package validating;

public class Calculator {

    /*
    The methods of the Calculator class should be as follows:
    The method factorial should only work if the parameter is a non-negative number (0 or greater).
    The method binomialCoefficient should only work when the parameters are non-negative
    and the subset size does not exceed the set size.
    If these methods receive invalid parameters when they are called,
    they should throw an IllegalArgumentException
     */
    public int factorial(int num) {

        if (num >= 0) {

            int answer = 1;
            for (int i = 1; i <= num; i++) {
                answer *= i;
            }

            return answer;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    public int binomialCoefficent(int setSize, int subsetSize) {

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }

}

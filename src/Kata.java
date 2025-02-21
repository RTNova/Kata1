// creamos total
// recorremos array
// creamos mayor
// creamos menor
// sumamos total, restamos mayor  menor

public class Kata
{
    public static int sum(int[] numbers)
    {

        if (numbers.length <= 2 || numbers == null) {
            return 0;
        }

        int max = numbers[0];
        int min = numbers[0];
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {

            total += numbers[i];

            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }

        }

        return total - max - min;

    }

}
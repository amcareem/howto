public class AverageCalculator {
  public static void main(String[] args) {
    // Define a list of numbers
    List<Double> numbers = new ArrayList<>();
    numbers.add(1.0);
    numbers.add(2.0);
    numbers.add(3.0);
    numbers.add(4.0);
    numbers.add(5.0);

    // Calculate the average of the numbers
    double average = calculateAverage(numbers);

    // Print the result
    System.out.println("The average of the numbers is " + average);
  }

  // Method that calculates the average of a list of numbers
  public static double calculateAverage(List<Double> numbers) {
    double sum = 0.0;
    for (double number : numbers) {
      sum += number;
    }
    return sum / numbers.size();
  }
}

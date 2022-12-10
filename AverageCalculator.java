public class AverageCalculator {
  public static void main(String[] args) {
    // Define a list of numbers
    List<Double> numbers = new ArrayList<>();
    numbers.add(10.0);
    numbers.add(20.0);
    numbers.add(30.0);
    numbers.add(40.0);
    numbers.add(50.0);

    // Calculate the average of the numbers
    double sum = 0.0;
    for (double number : numbers) {
      sum += number;
    }
    double average = sum / numbers.size();

    // Print the result
    System.out.println("The average of the numbers is " + average);
  }
}

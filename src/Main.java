//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                for (int i = 1; i <= 100; i++) {
                    System.out.println("Valore: " + i);
                    System.out.println(checkValue(i));
                }
            }

            private static String checkValue(int value) {
                return (value % 5 == 0) ? "FizzBuzz" : "Buzz";
            }

        }


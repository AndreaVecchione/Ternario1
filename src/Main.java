//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        
//ciclare con il ciclo for 100 volte per andarmi individuare quando il caso è fizz o buzz
                for (int i = 1; i <= 100; i++) {
                    
                    //stampiamo prima il nostro valore incrementato fino a 100, poi controlliamo ogni numero se è FizzBuzz o Buzz
                    System.out.println("Valore: " + i);
                    System.out.println(checkValue(i));
                }
            }
//metodo di controllo del nostro valore ciclato nel ciclo for 
            private static String checkValue(int value) {
                
                //ritornerà Fizzbuzz è divisibile per 5, se non lo è sarà invece Buzz
                return (value % 5 == 0) ? "FizzBuzz" : "Buzz";
            }

        }


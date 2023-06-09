//Вывод простых чисел
public class Primes {

    //Поиск и вывод простых чисел
    public static void main(String[] args) {
        System.out.println("Prime numbers from 2 to 100:");
        for (int i = 2; i <= 100; i++){
            if (isPrime(i)){
                System.out.print(i+ " ");
            }
        }
    }

    //Проверка на простое число
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n%i == 0){
                return(false);
            }
        }
        return (true);
    }
}

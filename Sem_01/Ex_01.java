// запросить пользователя ввести имя;
// вывести на экран: Привет, имя!
package Java_sem.Sem_01;

import java.util.Scanner;
public class Ex_01 {
    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        String name = System.console().readLine();
        System.out.println("Привет, " + name);

        
        // Альтернативный способ через сканер
        // Scanner in = new Scanner(System.in);
        // System.out.print("Введите имя: ");
        // String name = in.nextLine();
              
        // System.out.printf("Привет, %s!", name);
        // in.close(); 
    }
    
}

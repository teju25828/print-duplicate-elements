import java.util.Scanner;

public class DuplicateElementPrint {
    public static void main(String[] args) {
        System.out.println("enter number of elements you want to enter in array-->");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int array[];//=new int(count);
        array = new int[count];
        System.out.println("Enter " + count + " integer numbers in array-->");
        for (int i = 0; i < count; i++)
            array[i] = scanner.nextInt();
        System.out.println("All array elements are-->");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("repeated elements are -->");
        for (int i = 0; i < (array.length); i++)
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[j]);
                }
            }
    }
}

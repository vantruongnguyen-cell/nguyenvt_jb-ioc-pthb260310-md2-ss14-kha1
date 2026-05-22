package baikha2.presentation;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberConversionWithException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> validNumbers = new ArrayList<>();
        int invalidCount = 0;

        System.out.println("--- Nhập danh sách chuỗi (Nhập 'exit' để dừng và xem kết quả) ---");

        while (true) {
            System.out.print("Nhập một chuỗi: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);

                validNumbers.add(number);
            } catch (NumberFormatException e) {

                invalidCount++;
            }
        }
        // HIỂN THỊ KẾT QUẢ THEO MẪU
        System.out.println("\n---------------------------------");
        System.out.println("Số chuỗi hợp lệ: " + validNumbers.size());
        System.out.println("Số chuỗi không hợp lệ: " + invalidCount);
        System.out.println("Danh sách số nguyên hợp lệ: " + validNumbers);
        System.out.println("---------------------------------");

        scanner.close();
    }
}

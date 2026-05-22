package baikha1.presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeCheckWithException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập vào một số nguyên dương: ");

            int number = scanner.nextInt();

            if (number <= 0) {
                throw new IllegalArgumentException("Lỗi: Số nhập vào phải lớn hơn 0. Các số ≤ 0 không hợp lệ để kiểm tra số nguyên tố.");
            }

            if (isPrime(number)) {
                System.out.println("Kết quả: " + number + " LÀ số nguyên tố.");
            } else {
                System.out.println("Kết quả: " + number + " KHÔNG PHẢI là số nguyên tố.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Dữ liệu nhập vào không hợp lệ! Vui lòng chỉ nhập số nguyên.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Chương trình kết thúc.");
        }
    }

    /**
     * Hàm kiểm tra một số có phải là số nguyên tố hay không.
     * Số nguyên tố là số lớn hơn 1 và chỉ chia hết cho 1 và chính nó.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

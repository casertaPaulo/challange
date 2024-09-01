class Problems {
    public void hasA(String str) {
        int count = 0;

        for (char letter: str.toCharArray()) {
            if (letter == 'A' || letter == 'a') {
                count++;
            }
        }

        System.out.println(count == 0 ? "Não aparece." : "Aparece " + count + " vezes");
    }

    public boolean isFibonacci(int n) {
        // f(n) = f(n - 1) + f(n - 2)
        // 0 1 1 2 3 5 8 13 21...
        if (n < 0) {
            return false;
        }

        int a = 0, b = 1;
        while (a < n) {
            int temp = a;
            a = b;
            b = temp + a;
        }

        // returns true if input number is equal to fibonacci number
        return a == n;

    }
}

public class Main {
    public static void main(String[] args) {
        Problems problems = new Problems();

        String str = "AaaaaBBCC";
        int number = 7;

        problems.hasA(str);

        System.out.println(problems.isFibonacci(number));

    }
}

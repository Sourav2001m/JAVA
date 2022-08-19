class SwapNumbers {

    public static void main(String[] args) {

        int a = 10, b = 20;

        System.out.println("Before swaping");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("After swaping");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}
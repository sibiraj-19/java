package conditional;

public class calculator {

    public static void main(String[] args) {
        int a = 9;
        int b = 0;
        char op = '*';

        switch (op) {
            case '+':
                System.out.println("Add:" + (a + b));
                break;
            case '-':
                System.out.println("Sub:" + (a - b));
                break;
            case '*':
                System.out.println("Mul:" + (a * b));
                break;
            case '/':
                System.out.println("Div:" + (a / b));
                break;

            default:
                System.out.println("Enter the operator correctly");
                break;
        }
    }
}

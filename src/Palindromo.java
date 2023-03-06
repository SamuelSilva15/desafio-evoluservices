import java.util.Stack;

public class Palindromo {

    public static boolean isPalindrome(String s) {
        Stack<Character> pilha = new Stack<>();

        for (int i=0; i<s.length(); i++){
            pilha.push(s.charAt(i));
        }

        String palavraInversa = "";
        while (!pilha.empty()){
            palavraInversa += pilha.pop();
        }

        if (palavraInversa.equalsIgnoreCase(s)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("ADA"));

        System.out.println(isPalindrome("ABCD"));

        System.out.println(isPalindrome("ABCCBA"));

        System.out.println(isPalindrome("Deleveled"));
    }
}

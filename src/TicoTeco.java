public class TicoTeco {

    public static void ticoTeco() {
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.print("TicoTeco, ");
            } else if(i % 3 == 0) {
                    System.out.print("Tico, ");
            } else if (i % 5 == 0) {
                    System.out.print("Teco, ");
            } else {
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args) {

    }
}

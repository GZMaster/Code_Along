package Chapter7;

class Monster {
    boolean frighten(int d) {
        System.out.println("arrrgh");
        return true;
    }
    static class Vampire extends Monster {
        boolean frighten(int x) {
            System.out.println("a bite?");
            return false;
        }
    }
    static class Dragon extends Monster {
        boolean frighten(int degree) {
            System.out.println("breath fire");
            return true;
        }
    }
}

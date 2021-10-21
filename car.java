public interface Car {
    default void caption() {
        System.out.println(" car makes Your easier...... welcome in the Car world !!!!");
    }
    static void logo() {
        System.out.println("**********");
    }
void engin();
void sitting();
void power();
void price();
}
public class HW2 {
    public static void main(String[] args) {
        hanoiTower(3, 'A', 'B', 'C');
    }

    public static void hanoiTower(int amount, char rod1, char rod2, char temp) {
        if (amount == 0)
            return;
        hanoiTower(amount-1, rod1, temp, rod2);
        move(rod1, rod2);
        hanoiTower(amount-1, temp, rod2, rod1);
    }
    public static void move ( char rod1, char rod2) {
        System.out.printf("Со стержня %s на стержень %s\n", rod1, rod2);
        }
    }

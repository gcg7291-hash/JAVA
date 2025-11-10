package c.oop2;

public class Enum {
    public static void main(String[] args) {

        Direction direc = Direction.South;
        System.out.println(direc);

        System.out.println(direc.name());

        System.out.println(direc.ordinal());

        Direction[] directios = Direction.values();
        for (Direction d : directios) {
            System.out.println(d.name());
        }

        Direction[] directios2 = Direction.values();
        for (Direction d : directios2) {
            System.out.println(d.name());
        }
    }
}

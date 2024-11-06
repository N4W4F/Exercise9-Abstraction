public class Main {
    public static void main(String[] args) {

        MovablePoint m1 = new MovablePoint(0, 0, 4, 8);
        MovablePoint m2 = new MovablePoint(4, 8, 2, 4);

        System.out.println("M1: " +
                "\nX = " + m1.getX() +
                "\nY = " + m1.getY() +
                "\nX Speed = " + m1.getxSpeed() +
                "\nY Speed = " + m1.getySpeed());

        System.out.println("-----------------------------------");

        m1.moveUp();
        m1.moveRight();

        System.out.println("M1 after moving up by " + m1.getySpeed() + " and right by " + m1.getxSpeed() +
                "\nX = " + m1.getX() +
                "\nY = " + m1.getY());
        System.out.println("-----------------------------------");

        m1.setxSpeed(2);
        m1.setySpeed(2);
        m1.moveDown();
        m1.moveLeft();

        System.out.println("M1 after moving down by " + m1.getxSpeed() + " and left by " + m1.getxSpeed() +
                "\nX = " + m1.getX() +
                "\nY = " + m1.getY());

        System.out.println("########################################");

        System.out.println("M2: " +
                "\nX = " + m2.getX() +
                "\nY = " + m2.getY() +
                "\nX Speed = " + m2.getxSpeed() +
                "\nY Speed = " + m2.getySpeed());

        System.out.println("-----------------------------------");

        m2.moveUp();
        m2.moveRight();

        System.out.println("M2 after moving up by " + m2.getySpeed() + " and right by " + m2.getxSpeed() +
                "\nX = " + m2.getX() +
                "\nY = " + m2.getY());

        System.out.println("-----------------------------------");

        m2.setxSpeed(4);
        m2.setySpeed(3);
        m2.moveDown();
        m2.moveLeft();

        System.out.println("M2 after moving down by " + m2.getySpeed() + " and left by " + m2.getxSpeed() +
                "\nX = " + m2.getX() +
                "\nY = " + m2.getY());
    }
}

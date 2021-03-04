import java.util.Date;
import java.awt.*;

class QuickStart {
    public static void main(String[] args) {
        byte age = 30;
        Date now = new Date();
        now.getTime();
        System.out.println("Hello, World.");
        System.out.println(now);
    }
}


// class QuickStart {
//     public static void main(String[] args) {
//         byte x = 1;
//         byte y = x;
//         x = 4;
//         System.out.println(y);
//         // x and y are independent from each other
//     }
// }

// class QuickStart {
//     public static void main(String[] args) {
//         Point point1 = new Point(1, 1);
//         Point point2 = point1;
//         point1.x = 2;
//         System.out.println(point2);
//         // references the same object in memory
//         //reference types are copied by their references
//     }
// }
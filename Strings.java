public class Strings {
     public static void main(String[] args) {
    String message = "    Hellow World" + "!!!";
      System.out.println(message);
      System.out.println(message.endsWith("!!!"));
      System.out.println(message.startsWith("!!!"));
      System.out.println(message.length());
      System.out.println(message.toLowerCase());
      System.out.println(message.indexOf("e"));
      System.out.println(message.trim());
      System.out.println(message.replace("e", "*"));

    String message2 = "Hello \"Mister\"" + "!!!";
    String message3 = "c:\\Windows\\. . . ";
    String message4 = "c:\tWindows\\. . . ";
    String message5 = "c:\nWindows\\. . . ";

    System.out.println(message2);
    System.out.println(message3);
    System.out.println(message4);
    System.out.println(message5);
    System.out.println(message2);
 
    }
}

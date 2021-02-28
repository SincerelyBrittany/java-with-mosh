public class Strings {
     public static void main(String[] args) {
    String message = "Hellow World" + "!!!";
      System.out.println(message);
      System.out.println(message.endsWith("!!!"));
      System.out.println(message.startsWith("!!!"));
      System.out.println(message.length());
      System.out.println(message.indexOf("e"));
      System.out.println(message.replace("e", "*"));
    }
}

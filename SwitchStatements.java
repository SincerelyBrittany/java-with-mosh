public class SwitchStatements {
       public static void main(String[] args) {
        String role = "admin";

        //If statement 

        // if(role == "admin"){
        //     System.out.println("You are an admin");
        // }else if(role == "moderator"){
        //      System.out.println("You are a moderator");
        // } else{
        //      System.out.println("You are a guest");
        // }


        //SWITCH STATMENT

        switch (role){
            case "admin":
                System.out.println("You are an admin");
                break;
            case "moderator":
                System.out.println("You are a moderator");
                break;
            default:
                System.out.println("You are a guest");
        }

        //SWITCH STATMENT WITH NUMBERS
         int num = 1;
         switch (num){
            case 1:
                System.out.println("You are an admin");
                break;
            case 2:
                System.out.println("You are a moderator");
                break;
            default:
                System.out.println("You are a guest");
        }
    } 
}

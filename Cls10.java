import java.util.*;
import java.security.*;

public class Solution {
    public static void main(String[] args) {

        DoNotTerminate.forbidExit();   // Do not worry, HackerRank provides this

        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            
            // Convert int to String
            String s = String.valueOf(n); 
            // OR: String s = Integer.toString(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

// This helper class is already given in the editor
class DoNotTerminate {
    public static class ExitTrappedException extends SecurityException {}
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}

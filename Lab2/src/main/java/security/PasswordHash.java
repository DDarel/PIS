package security;

public class PasswordHash {
    public static String HashCode(String password, String key, int prime){
        int hash = 0;
        //int prime = 31; // prime number for hashing

        for (int i = 0; i < key.length(); i++) {
            hash = hash * prime + key.charAt(i);
        }

        for (int i = 0; i < password.length(); i++) {
            hash = hash * prime + password.charAt(i);
        }

        return Integer.toString(hash);
    }
}

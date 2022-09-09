import java.math.BigInteger;
import java.util.Scanner;

public class DiffieHellman {
    public static void main(String[] args) {
        System.out.println("This is a diffie-hellman program.");
        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);
        BigInteger generator = new BigInteger("2");
        BigInteger prime = new BigInteger("FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AACAA68FFFFFFFFFFFFFFFF", 16);


        System.out.print("Enter a random four-digit number: ");
        BigInteger secretInt1 = new BigInteger(Integer.toString(scn.nextInt()));
        BigInteger publicInt1 = (generator.modPow(secretInt1, prime));
        System.out.println("Give this code to your friend: " + publicInt1.toString(16));

        System.out.print("Enter your friends number: ");
        BigInteger secretInt2 = new BigInteger((scn1.nextLine().toLowerCase()), 16);
        String finalSecretKeyHex = (secretInt2.modPow(secretInt1, prime).toString(16));

        System.out.println("Your secret key is: \n\n" + finalSecretKeyHex);

    }
}

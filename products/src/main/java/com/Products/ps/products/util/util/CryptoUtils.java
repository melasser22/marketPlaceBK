package com.Products.ps.products.util.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.security.Key;
import java.security.MessageDigest;
import java.util.Base64;

public class CryptoUtils {

    private static final String ALGO = "AES";
    public static String key="22C42C0914523569FE1445F9SS4E50R5";
   
    /**
     * Encrypt a string with AES algorithm.
     *
     * @param data is a string
     * @return the encrypted string
     */
    public static String encrypt(String data) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(data.getBytes());
        return  Base64.getEncoder().encodeToString(encVal);
    }

    /**
     * Decrypt a string with AES algorithm.
     *
     * @param encryptedData is a string
     * @return the decrypted string
     */
    public static String decrypt(String encryptedData) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decordedValue = Base64.getDecoder().decode(encryptedData);
        byte[] decValue = c.doFinal(decordedValue);
        return new String(decValue);
    }

    /**
     * Generate a new encryption key.
     */
    private static Key generateKey() throws Exception {
        return new SecretKeySpec(key.getBytes(), ALGO);
    }
    
    public static String sha1(String text) {
    	try {
	    	MessageDigest digest = MessageDigest.getInstance("SHA-1");
	    	digest.reset();
	    	digest.update(text.getBytes("utf8"));
	    	return String.format("%040x", new BigInteger(1, digest.digest()));
	    	
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return null;
    }
    
    public static void main(String[] args) throws Exception {
    	String encrypted=encrypt("P@ssw0rd");
    	String hashed=sha1("P@ssw0rd");
    	System.out.println(encrypted);
    }
}

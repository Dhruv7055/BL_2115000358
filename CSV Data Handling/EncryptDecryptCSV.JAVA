package org.example;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
        import java.util.Base64;

public class EncryptDecryptCSV {
    private static final String CSV_FILE = "employee.csv";
    private static final String AES_ALGORITHM = "AES";
    private static SecretKey secretKey;

    public static void main(String[] args) throws Exception {

        secretKey = generateAESKey();

        String[][] employees = {
                {"101", "Alice Johnson", encrypt("alice@example.com"), encrypt("75000")},
                {"102", "Bob Smith", encrypt("bob@example.com"), encrypt("62000")},
                {"103", "Charlie Brown", encrypt("charlie@example.com"), encrypt("85000")}
        };

        writeEncryptedCSV(employees);

        readAndDecryptCSV();
    }

    private static SecretKey generateAESKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance(AES_ALGORITHM);
        keyGen.init(128);
        return keyGen.generateKey();
    }
    private static String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes()));
    }
    private static String decrypt(String encryptedData) throws Exception {
        Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        return new String(cipher.doFinal(Base64.getDecoder().decode(encryptedData)));
    }

    private static void writeEncryptedCSV(String[][] data) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(CSV_FILE))) {
            writer.writeNext(new String[]{"ID", "Name", "Email", "Salary"});
            for (String[] row : data) {
                writer.writeNext(row);
            }

            System.out.println("Encrypted CSV file created: " + CSV_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void readAndDecryptCSV() {
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE))) {
            String[] row;
            reader.readNext();

            System.out.println("\n Decrypted Employee Data:");
            while ((row = reader.readNext()) != null) {
                System.out.println("ID: " + row[0] +
                        ", Name: " + row[1] +
                        ", Email: " + decrypt(row[2]) +
                        ", Salary: " + decrypt(row[3]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

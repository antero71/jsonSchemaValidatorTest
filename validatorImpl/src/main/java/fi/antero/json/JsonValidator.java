package fi.antero.json;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonValidator {

    public static void main(String[] args) {
        System.out.println("Compile");

        try {
            String json = new String(Files.readAllBytes(Paths.get("settings.gradle")));
            //String json = new String(Files.readAllBytes(Paths.get("resources/PostalAddressSchema.json")));
            System.out.println(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

package GsonAPI;

import com.google.gson.Gson;
import com.jackson.jackson.Hospital;

import java.io.FileWriter;
import java.io.IOException;

public class JavaToJson {
    public static void main(String[] args) throws Exception {
        Hospital hospital = new Hospital(1,"RIM2");
        FileWriter fileWriter=new FileWriter("JavaToJson.json");
        Gson gson = new Gson();

        gson.toJson(hospital,fileWriter);
        fileWriter.close();
        System.out.println("Hospital Saved using Gson");
    }
}

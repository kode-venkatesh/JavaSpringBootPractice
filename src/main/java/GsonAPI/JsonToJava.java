package GsonAPI;

import com.google.gson.Gson;
import com.jackson.jackson.Hospital;

import java.io.FileReader;
import java.io.IOException;

public class JsonToJava {
    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();
        FileReader reader=new FileReader("JavaToJson.json");
        Hospital hospital = gson.fromJson(reader, Hospital.class);
        System.out.println(hospital);
    }

}

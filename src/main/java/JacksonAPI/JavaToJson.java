package JacksonAPI;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jackson.jackson.Hospital;

import java.io.File;

public class JavaToJson {
    public static void main(String[] args) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        Hospital hospital=mapper.readValue(new File("hospital.json"), Hospital.class);
        System.out.println(hospital);
    }
}

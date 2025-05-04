package JacksonAPI;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jackson.jackson.Hospital;

import java.io.File;
import java.io.IOException;

public class JsonToJava {
    public static void main(String[] args) throws Exception {
        Hospital hospital = new Hospital();
        hospital.setHosp_no(1);
        hospital.setHosp_name("RIMS");
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("hospital.json"), hospital);
        System.out.println("Hospital has been saved to file");

    }
}

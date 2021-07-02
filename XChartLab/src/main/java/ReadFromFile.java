import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ReadFromFile {
    public ReadFromFile() {
    }

    public List<TitanicPassenger> getPassengersFromJsonFile(String s) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        InputStream input = new FileInputStream(s);
        List<TitanicPassenger> allPassengers = (List)objectMapper.readValue(input, new TypeReference<List<TitanicPassenger>>() {
        });
        return allPassengers;
    }
}

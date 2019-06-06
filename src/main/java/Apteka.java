import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Apteka {
    private List<Customer> kolejka=new ArrayList<Customer>();

    @Override
    public String toString() {
        return "Aktualna lista osób w kolejce w aptece: "+ kolejka;
    }

    List<Customer> dodajDoKolejki (Customer c){
        kolejka.add(c);
        return kolejka;
    }

}

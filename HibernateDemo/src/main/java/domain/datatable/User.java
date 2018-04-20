package domain.datatable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String name;
    private Address address;
    private Article article;

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

}

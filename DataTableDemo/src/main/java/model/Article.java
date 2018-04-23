package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Article {

    private String name;
    private String publish;
    private String publishTimestamp;

}

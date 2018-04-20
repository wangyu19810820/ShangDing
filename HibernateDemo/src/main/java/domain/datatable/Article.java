package domain.datatable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Article {

    private String name;
    private String publish;
    private String publishTimestamp;

}

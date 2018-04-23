package domain.datatable.param;

import lombok.Data;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class DataTablesInput {

    private Integer draw = 1;

    private Integer start = 0;

    private Integer length = 10;

    private Search search = new Search();

    private List<Order> order = new ArrayList<>();

    private List<Column> columns = new ArrayList<>();

    public Map<String, Column> getColumnsAsMap() {
        Map<String, Column> map = new HashMap<>();
        for (Column column : columns) {
            map.put(column.getData(), column);
        }
        return map;
    }

    public void addColumn(String columnName, boolean searchable, boolean orderable,
                          String searchValue) {
        this.columns.add(new Column(columnName, "", searchable, orderable,
                new Search(searchValue, false)));
    }

    public void addOrder(String columnName, boolean ascending) {
        if (columnName == null) {
            return;
        }
        for (int i = 0; i < columns.size(); i++) {
            if (!columnName.equals(columns.get(i).getData())) {
                continue;
            }
            order.add(new Order(i, ascending ? "asc" : "desc"));
        }
    }
}

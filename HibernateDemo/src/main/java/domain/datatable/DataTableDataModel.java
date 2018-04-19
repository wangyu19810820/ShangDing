package domain.datatable;

import java.util.List;

public class DataTableDataModel {

    private List data;

    public DataTableDataModel() {
    }

    public DataTableDataModel(List data) {
        this.data = data;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataTableDataModel{" +
                "data=" + data +
                '}';
    }
}

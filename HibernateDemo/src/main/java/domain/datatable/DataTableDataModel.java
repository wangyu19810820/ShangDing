package domain.datatable;

import java.util.List;

// 将数据塞进data属性中，方便客户端使用
// 和DataTable的API关系不大
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

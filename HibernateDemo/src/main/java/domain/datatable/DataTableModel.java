package domain.datatable;

// 用于最简单的调用，本身和DataTable的API是无关的
public class DataTableModel {

    private String column1;
    private String column2;

    public DataTableModel() {
    }

    public DataTableModel(String column1, String column2) {
        this.column1 = column1;
        this.column2 = column2;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    @Override
    public String toString() {
        return "DataTableModel{" +
                "column1='" + column1 + '\'' +
                ", column2='" + column2 + '\'' +
                '}';
    }
}

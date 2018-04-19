package domain.datatable;

import java.util.List;

public class DataTableStaffModel {

    private List staff;

    public DataTableStaffModel() {
    }

    public DataTableStaffModel(List staff) {
        this.staff = staff;
    }

    public List getStaff() {
        return staff;
    }

    public void setStaff(List data) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "DataTableDataModel{" +
                "data=" + staff +
                '}';
    }

}

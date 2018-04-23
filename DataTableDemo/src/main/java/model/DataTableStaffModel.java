package model;

import java.util.List;

// 将数据塞进staff属性中
// 客户端指定dataSrc: 'staff',具体设置见ajax2.html
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

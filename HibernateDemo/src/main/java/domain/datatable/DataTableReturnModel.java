package domain.datatable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

// DataTable应用服务器端处理模式，返回值的数据容器
// 和DataTable紧耦合
@Data
public class DataTableReturnModel {

    private Integer sEcho;
    private Integer draw;
    private Integer recordsTotal;
    private Integer recordsFiltered;
    private List data;
    private String error;

}

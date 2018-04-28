package domain.datatable.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 服务端处理，参数模型
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OldDataTablesInput {

    private int sEcho;              // 标识
    private int iDisplayStart;      // 开始索引
    private int iDisplayLength;     // 分页长度
    private String sSearch;         // 搜索内容
    private int iSortCol_0;         // 排序列索引
    private String sSortDir_0;      // 升序还是降序

}

package controller;

import model.*;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/datatable")
public class DataTableController {

    @RequestMapping("/getData")
    @ResponseBody
    public List<DataTableModel> getData() {
        List list = new ArrayList();
        DataTableModel m1 = new DataTableModel("abc", "2017-12-11");
        DataTableModel m2 = new DataTableModel("xyz", "2012-01-08");
        list.add(m1);
        list.add(m2);
        return list;
    }

    @RequestMapping("/getData6")
    @ResponseBody
    public DataTableReturnModel getData6(DataTablesInput input) {
        final int total = 45;

        List<User> list = new ArrayList<>();
        for (int i = 0; i < input.getLength() && i + input.getStart() < total; i++) {
            int index = input.getStart() + i;
            User user1 = new User("user" + index,
                    new Address("city" + index, "street" + index),
                    new Article("name" + index, "2nd April 2017", "1491062400"));
            list.add(user1);
        }

        DataTableReturnModel returnModel = new DataTableReturnModel();
        returnModel.setDraw(input.getDraw());
        returnModel.setRecordsTotal(total);
        returnModel.setRecordsFiltered(total);
        returnModel.setData(list);
        return returnModel;
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    @ResponseBody
    public DataTablesOutput<Employee> list(@Valid DataTablesInput input) {
        return null;
    }
}

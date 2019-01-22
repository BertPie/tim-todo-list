package pie.bert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pie.bert.model.TodoDao;
import pie.bert.util.Mappings;
import pie.bert.util.ViewNames;

@Controller
public class TodoItemController {

    @ModelAttribute
    public TodoDao todoDao(){
        return new TodoDao();
    }

    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
    }
}
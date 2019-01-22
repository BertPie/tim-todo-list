package pie.bert.service;

import org.springframework.stereotype.Service;
import pie.bert.model.TodoDao;
import pie.bert.model.TodoItem;

@Service
public class TodoItemServiceImpl implements TodoItemService {

    private final TodoDao todoDao = new TodoDao();

    @Override
    public void addItem(TodoItem toAdd) {
        todoDao.addItem(toAdd);
    }

    @Override
    public void removeItem(int id) {
        todoDao.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return todoDao.getItem(id);
    }

    @Override
    public void updateItem(TodoItem toUpdate) {
        todoDao.updateItem(toUpdate);
    }

    @Override
    public TodoDao getData() {
        return todoDao;
    }
}
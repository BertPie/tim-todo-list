package pie.bert.service;

import pie.bert.model.TodoDao;
import pie.bert.model.TodoItem;

public interface TodoItemService {
    void addItem(TodoItem toAdd);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem toUpdate);
    TodoDao getData();
}
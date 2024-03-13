import java.util.ArrayList;

public class TodoList {

    private final ArrayList<String> taskList = new ArrayList<>();

    public TodoList() {

    }


    public void add(String task){
        taskList.add(task);

    }

    public void print(){
        int i = 0;
        for (String entry: taskList) {
            i++;
            String result = String.format("%d: %s", i, entry);
            System.out.println(result);
        }

    }

    public void remove (int number){
        taskList.remove(number-1);
     }

}

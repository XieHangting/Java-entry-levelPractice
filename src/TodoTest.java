public class TodoTest {
    public static void main(String[] args) {

        Todo todo = new Todo();
        todo.setData("2018.4.1");
        todo.setContect("我开始学习 Java");

        System.out.println(todo.getData()+" | "+todo.getContect() );
    }
}

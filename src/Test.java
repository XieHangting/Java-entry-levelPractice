import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Book> books=new ArrayList<>();
        Book a=new Book("《Java编程思想（第4版）》",85.7);
        Book b=new Book("《Head First Java(中文版)(第2版)》",53.66);
        Book c=new Book("《人类简史》",46.24);
        Book d=new Book("《三体》",17.1);
        Book e=new Book("《算法导论》",101.9);

        books.add(a);
        books.add(b);
        books.add(c);
        books.add(d);
        books.add(e);

        ArrayList<Person>  persons= new ArrayList<>();
        Person Q = new Person("小Q","男",22,"《算法导论》");
        Person M= new Person("小M","女",18,"《三体》");

        persons.add(Q);
        persons.add(M);

        for (Person person : persons) {
            person.buy(books);

        }
    }
}

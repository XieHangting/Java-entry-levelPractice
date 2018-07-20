import java.util.ArrayList;

public class Person {
    private String name;
    private String sex;
    private int age;
    private String wanted;

    public Person(String name,String sex,int age,String wanted){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.wanted=wanted;
    }
    public void buy(ArrayList<Book> books){
        for (Book book : books) {
            if (book.getName().equals(wanted)){
                pay(book.getPrice());
            }

        }

    }

    public void pay(double price){
        System.out.println(String.format("%s，%d岁，他买了一本%s，支付了%.2f",name,age,wanted,price));
    }




    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setWanted(String wanted) {
        this.wanted = wanted;
    }

    public String getWanted() {
        return wanted;
    }


}


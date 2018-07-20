import java.util.ArrayList;

public class DataTest {
    public static void main(String[] args) {
        Data one = new Data("Monday",30,false);
        Data two = new Data("Tuesday",20,false);
        Data three = new Data("Wednesday",24,true);
        Data four = new Data("Thursday",13,true);
        Data five = new Data("Friday",33,false);

        ArrayList<Data> datas =new ArrayList();

        datas.add(one);
        datas.add(two);
        datas.add(three);
        datas.add(four);
        datas.add(five);

        for (Data data : datas) {
            int temprature = data.getTemprature();
            boolean rainy = data.isRainy();

            if (temprature>=30){
                if (rainy=true){
                    System.out.println(data.getDate()+"|"+"穿短袖，带雨伞");
                }
                else
                    System.out.println(data.getDate()+"|"+"穿短袖，不带伞");
            }
            else if (temprature<30 && temprature>20){
                if (rainy=true){
                    System.out.println(data.getDate()+"|"+"穿长袖，带雨伞");

                }
                else
                    System.out.println(data.getDate()+"|"+"穿长袖，不带伞");
            }
            else{
                if (rainy=true)
                    System.out.println(data.getDate()+"|"+"穿外套，带雨伞");
                else
                    System.out.println(data.getDate()+"|"+"穿外套，不带伞");
            }
        }
    }
}

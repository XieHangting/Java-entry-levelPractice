public class Data {
    private String date;
    private int temprature;
    private boolean rainy;


    public Data(String date,int temprature,boolean rainy){
        this.date=date;
        this.temprature=temprature;
        this.rainy=rainy;

    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setTemprature(int temprature) {
        this.temprature = temprature;
    }

    public int getTemprature() {
        return temprature;
    }

    public void setRainy(boolean rainy) {
        this.rainy = rainy;
    }

    public boolean isRainy() {
        return rainy;
    }

}








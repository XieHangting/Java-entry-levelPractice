public class Todo {
    private String contect;
    private String data;

    public void print(){
        System.out.println(this.data+"|"+this.contect);
    }

    public void setContect(String contect) {
        this.contect = contect;
    }

    public String getContect() {
        return contect;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
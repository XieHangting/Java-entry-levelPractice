public class Coffee {
    private String size;
    private String kind;
    private String number;

    public Coffee(String number,String size,String kind){
        this.kind=kind;
        this.size=size;
        this.number=number;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}


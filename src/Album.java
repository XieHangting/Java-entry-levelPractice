import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Photo> photos;

    public Album(String name,ArrayList photos){
        this.name=name;
        this.photos=photos;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhotos(ArrayList<Photo> photos) {
        this.photos = photos;
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }
}

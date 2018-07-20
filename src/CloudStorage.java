import java.util.ArrayList;

public class CloudStorage {
    private ArrayList<Album> albums;

    public CloudStorage(ArrayList albums){
        this.albums=albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void upload(ArrayList<Photo> photos){
        for (Photo photo : photos) {
            for (Album album : albums) {
                if (photo.getName().equals(album.getName())){
                    if (album.getPhotos() == null){
                        album.getPhotos().add(photo);
                    }
                }

            }

        }
    }
}

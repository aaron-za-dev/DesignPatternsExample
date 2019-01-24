package Factory;

public class Instagram implements ISocialNetwork {

    private String baseUrl;

    public Instagram() {
        this.baseUrl = "www.instagram.com";
    }

    @Override
    public void makePost(String content) {
        throw new UnsupportedOperationException("No se puede realizar este tipo de publicacion, es necesario una fotografia...");
    }

    @Override
    public void makePost(String imgUrl, String description) {
        System.out.println("Cargando nueva imagen: "+description);
        System.out.println("Direccion: "+baseUrl+"/"+imgUrl);
    }
}

package Facade;

public class InstagramAPI implements Post {

    private String baseUrl;

    public InstagramAPI() {
        this.baseUrl = "www.instagram.com";
    }

    @Override
    public void UpdateStatus(String content) {

        throw new UnsupportedOperationException("Esta operacion no esta disponible en Instagram");

    }

    @Override
    public void UploadPicture(String img, String description) {

        System.out.println("Cargando nueva imagen: " + description);
        System.out.println("Direccion: " + baseUrl + "/" + img);

    }
}

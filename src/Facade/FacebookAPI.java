package Facade;

public class FacebookAPI implements Post {

    private String baseUrl;

    public FacebookAPI() {
        this.baseUrl = "www.facebook.com";
    }

    @Override
    public void UpdateStatus(String content) {
        System.out.println("Actualizando estado en Facebook: " + content);
    }

    @Override
    public void UploadPicture(String img, String description) {

        System.out.println("Publicando nueva imagen en Facebook: " + description);
        System.out.println("Direccion: " + baseUrl + "/@usernx/" + img);

    }
}

package Factory;

public class Facebook implements ISocialNetwork {

    private String baseUrl;

    public Facebook() {
        this.baseUrl = "www.facebook.com";
    }

    @Override
    public void makePost(String content) {
        System.out.println("Actualizando estado en Facebook: "+content);
    }

    @Override
    public void makePost(String imgUrl, String description) {
        System.out.println("Actualizando foto de perfil: "+description);
        System.out.println("Direccion: "+baseUrl+"/@usernx/"+imgUrl);
    }
}

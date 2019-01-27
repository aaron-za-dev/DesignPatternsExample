package Facade;

public class TwitterAPI implements Post {

    private String baseUrl;

    public TwitterAPI() {
        this.baseUrl = "www.twitter.com";
    }

    @Override
    public void UpdateStatus(String content) {

        if (checkLengthTweet(content)) {

            System.out.println("Publicando nuevo tweet: " + content);

        } else {

            System.out.printf("El tamaño del tweet excede los 280 caracteres, intentalo nuevamente");

        }
    }

    @Override
    public void UploadPicture(String img, String description) {

        if (checkLengthTweet(description)) {

            System.out.println("Publicando nueva imagen en Twitter: " + description);
            System.out.println("Direccion: " + baseUrl + "/" + img);

        } else {

            System.out.printf("El tamaño del tweet excede los 280 caracteres, intentalo nuevamente");

        }

    }

    private boolean checkLengthTweet(String tweet) {

        return tweet.length() <= 280 ? true : false;

    }
}

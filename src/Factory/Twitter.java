package Factory;

public class Twitter implements ISocialNetwork {

    private String baseUrl;

    public Twitter() {
        this.baseUrl = "www.twitter.com";
    }

    @Override
    public void makePost(String content) {

        if (checkLengthTweet(content)){

            System.out.println("Publicando nuevo tweet: "+content);

        }
        else {

            System.out.printf("El tamaño del tweet excede los 280 caracteres, intentalo nuevamente");

        }

    }

    @Override
    public void makePost(String imgUrl, String description) {

        if (checkLengthTweet(description)){

            System.out.println("Publicando nuevo tweet: "+description);
            System.out.println("Direccion: "+baseUrl+"/"+imgUrl);

        }
        else {

            System.out.printf("El tamaño del tweet excede los 280 caracteres, intentalo nuevamente");

        }

    }

    private boolean checkLengthTweet(String tweet){

        return tweet.length() <= 280 ? true : false;

    }
}

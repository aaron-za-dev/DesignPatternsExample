package Factory;

public class SocialNetworkFactory {

    public ISocialNetwork getSocialNetwork(String name){

        switch (name){
            case "Facebook": return new Facebook();
            case "Twitter" : return new Twitter();
            case "Instagram": return new Instagram();
        }

        return null;
    }

}

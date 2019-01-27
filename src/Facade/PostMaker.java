package Facade;

public class PostMaker {

    private Post twApi;
    private Post fbApi;
    private Post igApi;

    public PostMaker() {

        twApi = new TwitterAPI();
        fbApi = new FacebookAPI();
        igApi = new InstagramAPI();

    }

    public void UploadPictureToFacebook(String desc, String img) {

        fbApi.UploadPicture(img, desc);

    }

    public void UploadPictureToTwitter(String desc, String img) {

        twApi.UploadPicture(img, desc);

    }

    public void UploadPictureToInstagram(String desc, String img) {

        igApi.UploadPicture(img, desc);

    }

    public void UpdateStatusOnFacebook(String post) {

        fbApi.UpdateStatus(post);

    }

    public void UpdateStatusOnTwitter(String tweet) {

        twApi.UpdateStatus(tweet);

    }


}

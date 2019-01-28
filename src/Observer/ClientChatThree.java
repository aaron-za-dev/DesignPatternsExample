package Observer;

public class ClientChatThree extends ChatRoomObserver {

    public ClientChatThree(ChatRoom cr) {
        this.mChatRoom = cr;
        this.mChatRoom.AddClientChat(this);
    }

    @Override
    public void Update() {

        System.out.println("Cliente 3, ultimo mensaje recibido: " + mChatRoom.getLastMessage());

    }
}

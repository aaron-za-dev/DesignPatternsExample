package Observer;

public class ClientChatTwo extends ChatRoomObserver {

    public ClientChatTwo(ChatRoom cr) {
        this.mChatRoom = cr;
        this.mChatRoom.AddClientChat(this);
    }

    @Override
    public void Update() {

        System.out.println("Cliente 2, ultimo mensaje recibido: " + mChatRoom.getLastMessage());

    }
}

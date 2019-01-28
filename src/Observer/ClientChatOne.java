package Observer;

public class ClientChatOne extends ChatRoomObserver {

    public ClientChatOne(ChatRoom cr) {
        this.mChatRoom = cr;
        this.mChatRoom.AddClientChat(this);
    }

    @Override
    public void Update() {

        System.out.println("Cliente 1, ultimo mensaje recibido: " + mChatRoom.getLastMessage());

    }
}

package Observer;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {

    private List<ChatRoomObserver> clientsChats;
    private String lastMessage;

    public ChatRoom() {

        clientsChats = new ArrayList<ChatRoomObserver>();

    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
        NotifyAllObservers();
    }

    public void AddClientChat(ChatRoomObserver client) {

        clientsChats.add(client);

    }

    private void NotifyAllObservers() {

        clientsChats.forEach(x -> x.Update());

    }
}

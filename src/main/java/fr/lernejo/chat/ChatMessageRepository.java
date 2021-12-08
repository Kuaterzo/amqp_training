package fr.lernejo.chat;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ChatMessageRepository {

    private List<String> lastTenMessage = new ArrayList<>();

    public void addChatMessage(String message) {

        this.lastTenMessage.add(message);
    }

    public List<String> getLastTenMessages(){

        List<String> list = new LinkedList<>();
        int i = 0;

        if(this.lastTenMessage.size() > 9){

            for (i = 10; i > 0;i--) {
                list.add(this.lastTenMessage.get(this.lastTenMessage.size() - i));
            }
        }
        else{
            return this.lastTenMessage;
        }
        return list;
    }
}

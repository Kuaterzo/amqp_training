package fr.lernejo.chat;

import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {

   public static ChatMessageRepository repository = new ChatMessageRepository();

    public void onMessage(String message){

        repository.addChatMessage(message);

    }
}

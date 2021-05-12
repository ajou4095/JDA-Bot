import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class MainListener: ListenerAdapter() {

    override fun onMessageReceived(event: MessageReceivedEvent) {
        if(event.message.contentRaw.startsWith(PREFIX)) {
            val message = event.message.contentRaw.substring(1).toLowerCase()
            val msg = message.split(" ")
            when(msg[0]){
                "ping" -> {
                    event.channel.sendMessage("pong").queue()
                }
            }

        }
    }



    companion object{
        const val PREFIX = '!';
    }
}


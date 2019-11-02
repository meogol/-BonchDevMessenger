package bonch.dev.school.ui.moduls

import java.util.*

data class Message(val ID : Int, val messageText:String, val sentDate: Date, val sentUser: Boolean)

class  MessageLab(){
    val articleList: MutableList<Message>

    init {
        articleList = mutableListOf()
        for(i in 0..50){
            val message = Message(i, "fgdfgdfgdf",  Date(), true)
            val message2 = Message(i+1, "dsfdsfsdfds",  Date(), false)
            articleList.add(message)
            articleList.add(message2)
        }
    }

}
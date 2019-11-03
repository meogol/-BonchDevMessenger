package bonch.dev.school.ui.moduls


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class Message(val ID: Int, val messageText: String?, val sentDate: Date, val sentUser: Boolean) :
    Parcelable


class  MessageLab() {
    val messageList: MutableList<Message>

    init {
        messageList = mutableListOf()
        for(i in 0..50){
            val message = Message(i, "fgdfgdfgdf",  Date(), true)
            val message2 = Message(-i, "fgdfgdfgdf",  Date(), false)
            messageList.add(message)
            messageList.add(message2)
        }
    }

}
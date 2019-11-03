package bonch.dev.school.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.MultiAutoCompleteTextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import bonch.dev.school.R
import bonch.dev.school.ui.moduls.Message
import bonch.dev.school.ui.moduls.MessageAdapter
import bonch.dev.school.ui.moduls.MessageLab
import java.util.*



class ChatFragmenst : Fragment() {

    lateinit var sendMessageButton: ImageButton

    private lateinit var messageRecyclerView: RecyclerView
    private var adapter = MessageAdapter()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.chat_fragmenst_fragment, container, false)

        messageRecyclerView = view.findViewById(R.id.message_recycler_view)
        messageRecyclerView.layoutManager = LinearLayoutManager(container!!.context)

        messageRecyclerView.adapter = adapter

        sendMessageButton = view.findViewById(R.id.send_message_button)
        sendMessageButton.setOnClickListener {
            val messageTextViev = view.findViewById<MultiAutoCompleteTextView>(R.id.message_et)
            val text = messageTextViev.text.toString()

            if(text.replace(" ", "")!="" && text.count()>0) {
                adapter.messageList.add(Message(1, text, Date(), true))

            }
            messageTextViev.text.clear()
        }

        return view
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        if(savedInstanceState==null) {
            super.onActivityCreated(savedInstanceState)
            return
        }

        adapter.messageList.clear()
        for (i in 0..adapter.messageList.size){
            adapter.messageList.add(savedInstanceState!!.getParcelable(i.toString())!!)
        }

        super.onCreate(savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        for (i in 0..adapter.messageList.size)
        outState?.run {
            putParcelable(i.toString(),adapter.messageList[i])
        }

    }


}



package bonch.dev.school.ui.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

import bonch.dev.school.R

class ChatFragmenst : Fragment() {

    lateinit var sendMessageButton: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.chat_fragmenst_fragment, container, false)
        sendMessageButton = view.findViewById(R.id.send_message_button)
        sendMessageButton.setOnClickListener {
            fragmentManager!!.beginTransaction()
                .replace(R.id.fragment_container, ProfileFragment())
                .addToBackStack("profile")
                .commit()
        }

        return view
    }

}

package bonch.dev.school.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import bonch.dev.school.R
import bonch.dev.school.ui.fragments.ChatFragmenst

class MainActivity : AppCompatActivity() {

    val fm = supportFragmentManager
    lateinit var fragmentContainer: FrameLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentContainer = findViewById(R.id.fragment_container)
        fm.beginTransaction()
            .add(fragmentContainer.id, ChatFragmenst())
            .commit()

    }
}

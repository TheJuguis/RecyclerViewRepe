package com.example.recyclerviewfortheclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewfortheclass.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeVideoData: Array<JSONObject> = arrayOf(
            JSONObject("{\"title\": \"an awesome video title\", \"channel\": \"ChannelName\", \"views\": \"6k views\", \"dataPosted\": \"5 days ago\", \"duration\": \"05:00\"}"),
            JSONObject("{\"title\": \"Top 5 materias dificiles\", \"channel\": \"Dross\", \"views\": \"2k views\", \"dataPosted\": \"6 months ago\", \"duration\": \"28:00\"}"),
            JSONObject("{\"title\": \"009 System sound\", \"channel\": \"oldYoutubeMusic\", \"views\": \"8k views\", \"dataPosted\": \"9 hours ago\", \"duration\": \"48:53\"}"),
            JSONObject("{\"title\": \"La historia detras del meme JUAN\", \"channel\": \"memeando ando\", \"views\": \"15k views\", \"dataPosted\": \"5 months ago\", \"duration\": \"45:00\"}"),
            JSONObject("{\"title\": \"me voy de youtube\", \"channel\": \"ElYoutuberTrollo\", \"views\": \"253k views\", \"dataPosted\": \"7 years ago\", \"duration\": \"10:00\"}")

        )

        binding.rvVideoEntries.adapter = MainAdapter(fakeVideoData)
    }
}
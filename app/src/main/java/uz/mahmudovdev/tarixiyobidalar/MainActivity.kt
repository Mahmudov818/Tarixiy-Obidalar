package uz.mahmudovdev.tarixiyobidalar

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.mahmudovdev.tarixiyobidalar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.history.setOnClickListener {
            val intent = Intent(this, HistoryActivity::class.java)
            startActivity(intent)
        }

        binding.connect.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://t.me//elegent65_92"))
            startActivity(intent)
        }
        binding.about.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
        binding.location.setOnClickListener {
            val intent = Intent(this, LocationActivity::class.java)
            startActivity(intent)
        }

    }
}
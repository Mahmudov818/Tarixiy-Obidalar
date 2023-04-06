package uz.mahmudovdev.tarixiyobidalar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.mahmudovdev.tarixiyobidalar.databinding.ActivityHistoryBinding

class HistoryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHistoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gijduvoniy.setOnClickListener {
            appInfo(1)
        }
        binding.revgariy.setOnClickListener {
            appInfo(2)
        }
        binding.fagnaviy.setOnClickListener {
            appInfo(3)
        }
        binding.romitaniy.setOnClickListener {
            appInfo(4)
        }
        binding.samosiy.setOnClickListener {
            appInfo(5)
        }
        binding.kulol.setOnClickListener {
            appInfo(6)
        }
        binding.naqshband.setOnClickListener {
            appInfo(7)
        }


    }

    private fun appInfo(number: Int) {
        val intent = Intent(this, InfoActivity::class.java)
        intent.putExtra("NUMBER",number)
        startActivity(intent)
    }
}
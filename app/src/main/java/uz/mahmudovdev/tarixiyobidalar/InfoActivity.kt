package uz.mahmudovdev.tarixiyobidalar

import android.annotation.SuppressLint
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import uz.mahmudovdev.tarixiyobidalar.databinding.ActivityInfoBinding

class InfoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        intent.extras?.let {
            val number = it.getInt("NUMBER")
            loadData(number)
        }
    }

    @SuppressLint("SetTextI18n")
    private fun loadData(number: Int) {
        val image = binding.image
        val title = binding.title
        val description = binding.textDescription
        when (number) {
            1 -> {
                image.setImageResource(R.drawable.gijduvoniy1)
                title.setText(R.string.xoja_abduxoliq_g_ijduvoniy)
                description.setText(R.string.gijduvoniy)
                setTitle(R.string.xoja_abduxoliq_g_ijduvoniy)
            }
            2 -> {
                image.setImageResource(R.drawable.revgariy2)
                title.setText(R.string.xoja_orif_revgariy)
                description.setText(R.string.revgariy)
                setTitle(R.string.xoja_orif_revgariy)

            }
            3 -> {
                image.setImageResource(R.drawable.fagnaviy2)
                title.setText(R.string.xoja_mahmud_anjir_fag_naviy)
                description.setText(R.string.fagnaviy)
                setTitle(R.string.xoja_mahmud_anjir_fag_naviy)

            }
            4 -> {
                image.setImageResource(R.drawable.romitaniy1)
                title.setText(R.string.xoja_ali_romitaniy)
                description.setText(R.string.romitaniy)
                setTitle(R.string.xoja_ali_romitaniy)

            }
            5 -> {
                image.setImageResource(R.drawable.samosiy2)
                title.setText(R.string.xoja_mahmud_boboyi_samosiy)
                description.setText(R.string.samosiy)
                setTitle(R.string.xoja_mahmud_boboyi_samosiy)

            }
            6 -> {
                image.setImageResource(R.drawable.kulol2)
                title.setText(R.string.xoja_sayyid_amir_kulol)
                description.setText(R.string.kulol)
                setTitle(R.string.xoja_sayyid_amir_kulol)

            }
            7 -> {
                image.setImageResource(R.drawable.naqshband2)
                title.setText(R.string.xoja_bahouddin_naqshband)
                description.setText(R.string.naqshband)
                setTitle(R.string.xoja_bahouddin_naqshband)

            }
            else -> {
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
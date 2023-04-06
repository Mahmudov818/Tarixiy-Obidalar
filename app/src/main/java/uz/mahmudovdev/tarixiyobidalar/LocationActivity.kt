package uz.mahmudovdev.tarixiyobidalar

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.mahmudovdev.tarixiyobidalar.databinding.ActivityLocationBinding

class LocationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLocationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLocationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gijduvoniy.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Hodja+Abduxoliq+Gizhduvani+tomb/@40.103313,64.6783833,244m/data=!3m1!1e3!4m6!3m5!1s0x3f50698c87b88317:0x82ef50c71a4f827!8m2!3d40.1029713!4d64.6778333!16s%2Fg%2F11p04qf1fs"))
            startActivity(intent)
        }

        binding.revgariy.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://yandex.uz/maps/193729/shafirkan/?ll=64.499966%2C40.122094&mode=routes&rtext=39.768083%2C64.455577~40.122243%2C64.499906&rtt=auto&ruri=~ymapsbm1%3A%2F%2Forg%3Foid%3D237472984817&z=20.51"))
            startActivity(intent)
        }
        binding.fagnaviy.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/jn6mMU1ABrS5dqYD7"))
            startActivity(intent)
        }
        binding.romitaniy.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://yandex.uz/maps/-/CCUWFUv8OB"))
            startActivity(intent)
        }
        binding.samosiy.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://yandex.uz/maps/-/CCUWFUhq9B"))
            startActivity(intent)
        }

        binding.kulol.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://yandex.uz/maps/-/CCUWFYa2wC"))
            startActivity(intent)
        }

        binding.naqshband   .setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://yandex.uz/maps/-/CCUWFYBt~B"))
            startActivity(intent)
        }
    }
}
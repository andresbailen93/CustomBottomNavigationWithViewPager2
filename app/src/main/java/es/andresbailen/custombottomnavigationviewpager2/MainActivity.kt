package es.andresbailen.custombottomnavigationviewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.andresbailen.custombottomnavigationviewpager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private  val mainAdapter: MainAdapter = MainAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.mainPager.adapter = mainAdapter
        binding.mainPager.isUserInputEnabled = false
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId){
                R.id.bottom_action_1 -> {
                    binding.mainPager.setCurrentItem(0, false)
                }
                R.id.bottom_action_2 -> {
                    binding.mainPager.setCurrentItem(1, false)
                }

                R.id.bottom_action_3 -> {
                    binding.mainPager.setCurrentItem(2, false)
                }
            }
            true
        }
    }
}
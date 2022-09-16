package bean.sample.alias

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import bean.sample.alias.databinding.ActivityMainBinding
import bean.sample.alias.databinding.ActivitySecondBinding
import bean.sample.alias.databinding.ActivityThreeBinding

class ThreeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("testJB","ThreeActivity0")
    }
}
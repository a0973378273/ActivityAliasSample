package bean.sample.alias

import android.content.ComponentName
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import bean.sample.alias.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val deviceAdmin = ComponentName("bean.sample.alias", "bean.sample.alias.second")
        Log.d("testJB","MainActivity : ${packageManager.getComponentEnabledSetting(deviceAdmin)}")

//        packageManager.setComponentEnabledSetting(
//            deviceAdmin,
//            PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
//            PackageManager.DONT_KILL_APP
//        )
    }

}
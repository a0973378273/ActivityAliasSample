package bean.sample.alias

import android.content.ComponentName
import android.content.pm.PackageManager
import android.content.pm.PackageManager.COMPONENT_ENABLED_STATE_DEFAULT
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
        val second = ComponentName("bean.sample.alias", "bean.sample.alias.second")
        val three = ComponentName("bean.sample.alias", "bean.sample.alias.three")
        binding.buttonSecondApp.setOnClickListener {
            Log.d("testJB","${packageManager.getComponentEnabledSetting(second)} : ${PackageManager.COMPONENT_ENABLED_STATE_ENABLED}" )
            if(packageManager.getComponentEnabledSetting(second) == PackageManager.COMPONENT_ENABLED_STATE_ENABLED || packageManager.getComponentEnabledSetting(second) == COMPONENT_ENABLED_STATE_DEFAULT){
                binding.buttonSecondApp.setText(R.string.enable_second_app)
                packageManager.setComponentEnabledSetting(second,PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)
            }else{
                binding.buttonSecondApp.setText(R.string.disable_second_app)
                packageManager.setComponentEnabledSetting(second,PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP)
            }
        }
        binding.buttonThreeApp.setOnClickListener {
            if(packageManager.getComponentEnabledSetting(three) == PackageManager.COMPONENT_ENABLED_STATE_ENABLED || packageManager.getComponentEnabledSetting(three) == COMPONENT_ENABLED_STATE_DEFAULT){
                binding.buttonThreeApp.setText(R.string.enable_three_app)
                packageManager.setComponentEnabledSetting(three,PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)
            }else{
                binding.buttonThreeApp.setText(R.string.disable_three_app)
                packageManager.setComponentEnabledSetting(three,PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP)
            }
        }

    }

}
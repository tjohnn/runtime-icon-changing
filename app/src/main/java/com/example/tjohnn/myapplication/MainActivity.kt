package com.example.tjohnn.myapplication

import android.content.ComponentName
import android.content.pm.PackageManager.COMPONENT_ENABLED_STATE_DISABLED
import android.content.pm.PackageManager.COMPONENT_ENABLED_STATE_ENABLED
import android.content.pm.PackageManager.DONT_KILL_APP
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.tjohnn.myapplication.launcher.FirstLauncherAlias
import com.example.tjohnn.myapplication.launcher.SecondLauncherAlias

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.launcherIcon1Button).setOnClickListener {
            packageManager.setComponentEnabledSetting(
                ComponentName(
                    this,
                    FirstLauncherAlias::class.java
                ),
                COMPONENT_ENABLED_STATE_ENABLED,
                DONT_KILL_APP
            )

            packageManager.setComponentEnabledSetting(
                ComponentName(
                    this,
                    SecondLauncherAlias::class.java
                ),
                COMPONENT_ENABLED_STATE_DISABLED,
                DONT_KILL_APP
            )
        }

        findViewById<View>(R.id.launcherIcon2Button).setOnClickListener {
            packageManager.setComponentEnabledSetting(
                ComponentName(
                    this,
                    FirstLauncherAlias::class.java
                ),
                COMPONENT_ENABLED_STATE_DISABLED,
                DONT_KILL_APP
            )

            packageManager.setComponentEnabledSetting(
                ComponentName(
                    this,
                    SecondLauncherAlias::class.java
                ),
                COMPONENT_ENABLED_STATE_ENABLED,
                DONT_KILL_APP
            )
        }
    }
}
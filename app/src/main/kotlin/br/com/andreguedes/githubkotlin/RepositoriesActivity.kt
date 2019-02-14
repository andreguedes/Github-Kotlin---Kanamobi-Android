package br.com.andreguedes.githubkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric

class RepositoriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repositories)

        Fabric.with(this, Crashlytics())
    }

}

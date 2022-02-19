package io.github.tuguzt.statecontroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    companion object {
        const val NCREATE = "Activity CREATED"
        const val NSTART = "Activity STARTED"
        const val NRESUME = "Activity RESUMED"
        const val NPAUSE = "Activity PAUSED"
        const val NSTOP = "Activity STOPPED"
        const val NRESTART = "Activity RESTARTED"
        const val NDESTROY = "Activity DESTROYED"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val toast = Toast.makeText(this, NCREATE, Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onStart() {
        super.onStart()
        val toast = Toast.makeText(this, NSTART, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.LEFT, 0, 0)
        toast.show()
    }

    override fun onResume() {
        super.onResume()
        val toast = Toast.makeText(this, NRESUME, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.TOP, 0, 0)
        toast.show()
    }

    override fun onPause() {
        super.onPause()
        val toast = Toast.makeText(this, NPAUSE, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.RIGHT, 0, 0)
        toast.show()
    }

    override fun onStop() {
        super.onStop()
        val toast = Toast.makeText(this, NSTOP, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }

    override fun onRestart() {
        super.onRestart()
        val toast = Toast.makeText(this, NRESTART, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.FILL_HORIZONTAL, 0, 0)
        toast.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val toast = Toast.makeText(this, NDESTROY, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.FILL, 0, 0)
        toast.show()
    }
}

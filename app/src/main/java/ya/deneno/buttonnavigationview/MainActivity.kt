package ya.deneno.buttonnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ya.deneno.buttonnavigationview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bc: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bc = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bc.root)
        bc.bNavView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.item1 -> Toast.makeText(this, "item 1", Toast.LENGTH_SHORT).show()
                R.id.item2 -> Toast.makeText(this, "item 2", Toast.LENGTH_SHORT).show()
                R.id.item3 -> Toast.makeText(this, "item 3", Toast.LENGTH_SHORT).show()
                R.id.item4 -> Toast.makeText(this, "item 4", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }
}
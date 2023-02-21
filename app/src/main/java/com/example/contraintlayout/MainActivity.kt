import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

import com.example.contraintlayout.MainActivity2
import com.example.contraintlayout.R

class MainActivity : AppCompatActivity() {

    lateinit var firstname: EditText
    lateinit var lastname: EditText
    lateinit var school: EditText
    lateinit var graduation: EditText
    lateinit var major:EditText
    lateinit var activity: EditText
    lateinit var degre: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstname= findViewById(R.id.editTextTextPersonName)
        lastname= findViewById(R.id.editTextTextPersonName2)
        school= findViewById(R.id.editTextTextPersonName4)
        graduation= findViewById(R.id.editTextTextPersonName5)
        major= findViewById(R.id.editTextTextPersonName8)
        activity= findViewById(R.id.editTextTextPersonName9)
        degre= findViewById(R.id.editTextText)

        val buttonClick = findViewById<Button>(R.id.button)

        buttonClick.setOnClickListener{
            val i = Intent(this,MainActivity2::class.java)
            val intent= Intent(this,MainActivity2::class.java).apply{
                putExtra("Data1",firstname.text.toString())
                putExtra("Data2",lastname.text.toString())
                putExtra("Data3",school.text.toString())
                putExtra("Data4",graduation.text.toString())
                putExtra("Data5",major.text.toString())
                putExtra("Data6",activity.text.toString())
                putExtra("Data7",degre.text.toString())
            }
startActivity(intent)
        }


    }
}
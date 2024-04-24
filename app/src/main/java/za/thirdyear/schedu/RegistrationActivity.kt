package za.thirdyear.schedu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.NumberPicker
import android.widget.TextView
import android.widget.Toast
//import androidx.databinding.DataBindingUtil





class RegistrationActivity : AppCompatActivity() {
    private lateinit var txtTextName: TextView
    private lateinit var txtSurname: TextView
    private lateinit var txtUserName: TextView
    private lateinit var txtEmailAddress: TextView
    private lateinit var txtPassword: EditText
    private lateinit var btnRegister:Button


    // Define view variables
    private lateinit var binding: RegistrationActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialize data binding

        binding = RegistrationActivity.setContentView(this, R.layout.activity_registration)


        // Bind views
        binding.apply {
            txtTextName = findViewById(R.id.txtTextName)
            txtSurname = findViewById(R.id.txtSurname)
            txtUserName = findViewById(R.id.txtUserName)
            txtEmailAddress = findViewById(R.id.txtEmailAddress)
            txtPassword = findViewById(R.id.txtPassword)
            btnRegister = findViewById(R.id.btnRegister)
        }

        binding.btnRegister.setOnClickListener {
            val Name = binding.txtTextName.text.toString()
            val Surname = binding.txtSurname.text.toString()
            val Username = binding.txtUserName.text.toString()
            val Email = binding.txtEmailAddress.text.toString()
            val Pass = binding.txtPassword.text.toString()

            Toast.makeText(this@RegistrationActivity, "Thank you, your registration has been successful", Toast.LENGTH_SHORT).show()
        }
    }

    companion object {
        fun setContentView(registrationActivity: RegistrationActivity, activityRegistration: Any): RegistrationActivity {

            return TODO("Provide the return value")
        }
    }
}
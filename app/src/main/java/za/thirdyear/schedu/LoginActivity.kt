package za.thirdyear.schedu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    private lateinit var btnDontHaveAccount:Button
    private lateinit var binding: LoginActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = LoginActivity.setContentView(this, R.layout.activity_registration)

        binding.btnDontHaveAccount.setOnClickListener {

        }
    }


    companion object {
        fun setContentView(loginActivity: LoginActivity, activityRegistration: Any): LoginActivity {
            TODO("Not yet implemented")
        }
    }
}
package com.example.ecommerceapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    private var decorView: View? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: ImageButton = findViewById(R.id.filter_button)

        button.setOnClickListener{
            val buttonSheetDialog = BottomSheetDialog(
                this@MainActivity, R.style.BottomSheetDialogTheme
            )

            val bottomSheetView = LayoutInflater.from(applicationContext).inflate(
                R.layout.layer_bottom_sheet,
                findViewById<LinearLayout>(R.id.bottomSheet)
            )

            bottomSheetView.findViewById<View>(R.id.button_popular).setOnClickListener  {
                Toast.makeText(this@MainActivity, "Popular", Toast.LENGTH_SHORT).show()
                buttonSheetDialog.dismiss()
            }
            bottomSheetView.findViewById<View>(R.id.button_newest).setOnClickListener  {
                Toast.makeText(this@MainActivity, "Newest", Toast.LENGTH_SHORT).show()
                buttonSheetDialog.dismiss()
            }
            bottomSheetView.findViewById<View>(R.id.button_customer_review).setOnClickListener  {
                Toast.makeText(this@MainActivity, "Customer Review", Toast.LENGTH_SHORT).show()
                buttonSheetDialog.dismiss()
            }
            bottomSheetView.findViewById<View>(R.id.button_price_low_high).setOnClickListener  {
                Toast.makeText(this@MainActivity, "Price: lowest to high", Toast.LENGTH_SHORT).show()
                buttonSheetDialog.dismiss()
            }
            bottomSheetView.findViewById<View>(R.id.button_price_high_low).setOnClickListener  {
                Toast.makeText(this@MainActivity, "Price: highest to low", Toast.LENGTH_SHORT).show()
                buttonSheetDialog.dismiss()
            }

            buttonSheetDialog.setContentView(bottomSheetView)
            buttonSheetDialog.show()
        }

//        val searchButton = findViewById<Button>(R.id.search_button)
//        val searchBoxEditText = findViewById<EditText>(R.id.search_box_edittext)
//
//        searchButton.setOnClickListener{
//            val text = searchBoxEditText.text.toString()
//            Toast.makeText(applicationContext, "You typed: $text", Toast.LENGTH_SHORT).show()
//        }

//        decorView = window.decorView
//        decorView!!.setOnSystemUiVisibilityChangeListener { visibility ->
//            if (visibility == 0) {
//                decorView!!.systemUiVisibility = hideSystemBars()
//            }
//        }
    }

//    override fun onWindowFocusChanged(hasFocus: Boolean) {
//        super.onWindowFocusChanged(hasFocus)
//        if (hasFocus) {
//            decorView!!.systemUiVisibility = hideSystemBars()
//        }
//    }

//    private fun hideSystemBars(): Int {
//        return (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
//                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                or View.SYSTEM_UI_FLAG_FULLSCREEN
//                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)
//    }
}
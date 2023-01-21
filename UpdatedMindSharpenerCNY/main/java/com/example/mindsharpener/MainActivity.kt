package com.example.mindsharpener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import java.util.*


class MainActivity : AppCompatActivity() {

    //button check funcionality
    val checkButton: Button

    val inputAnswer: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declares and initializes three variables
        val textView2: TextView = findViewById(R.id.textView2)
        val textView3: TextView = findViewById(R.id.textView3)
        val textView4: TextView = findViewById(R.id.textView4)

        //lock the input answer from user
        inputAnswer = findViewById(R.id.textInputAnswer) as TextInputEditText
    }

    fun clickEasy(view: View) {
        Toast.makeText(this, " Easy Mode Selected!", Toast.LENGTH_SHORT).show() //showing message

        //producing a single place random number
        val random = Random()
        val randomNumber = random.nextInt(9)
        val randomNumber2 = random.nextInt(9)

        //setting the elements to its value
        val textView2: TextView = findViewById(R.id.textView2)
        textView2.text = randomNumber.toString()
        val textView4: TextView = findViewById(R.id.textView4)
        textView4.text = randomNumber2.toString()

        //generating of 3 random operators
        val randomOperator = (0..2).random()

        val textView3 = null
        when (randomOperator) {
            0 -> textView3.text = "+"
            1 -> textView3.text = "-"
            2 -> textView3.text = "*"

            //checking answer but not accepting negative input
            if (inputAnswer.text.toString().toInt() == result) {
                Toast.makeText(this, "CORRECT", Toast.LENGTH_SHORT).show()

                //Increasing the point and add it into counter
                points += 1
                pointCounter.text = "POINT : $points"

            } else {
                Toast.makeText(this, "FALSE", Toast.LENGTH_SHORT).show()

                //Deduct the point
                points -= 1
                pointCounter.text = "POINT : $points"
            }

        }
    }
    fun clickMedium(view: View) {
        Toast.makeText(this, " Medium Mode Selected!", Toast.LENGTH_SHORT).show()
        val random = Random()
        val randomNumber = random.nextInt(99)
        val randomNumber2 = random.nextInt(99)

        val textView2: TextView = findViewById(R.id.textView2)
        textView2.text = randomNumber.toString()
        val textView4: TextView = findViewById(R.id.textView4)
        textView4.text = randomNumber2.toString()

        val randomOperator = (0..2).random()

        val textView3 = null
        when (randomOperator) {
            0 -> textView3.text = "+"
            1 -> textView3.text = "-"
            2 -> textView3.text = "*"
        }
        if (inputAnswer.text.toString().toInt() == result) {
            Toast.makeText(this, "CORRECT", Toast.LENGTH_SHORT).show()

            points += 1
            pointCounter.text = "POINT : $points"

        } else {
            Toast.makeText(this, "FALSE", Toast.LENGTH_SHORT).show()
            points -= 1
            pointCounter.text = "POINT : $points"
        }
    }
    }

    fun clickHard(view: View) {
        Toast.makeText(this, "Hard Mode Selected!", Toast.LENGTH_SHORT).show()
        val random = Random()
        val randomNumber = random.nextInt(999)
        val randomNumber2 = random.nextInt(999)

        val textView2: TextView = findViewById(R.id.textView2)
        textView2.text = randomNumber.toString()
        val textView4: TextView = findViewById(R.id.textView4)
        textView4.text = randomNumber2.toString()
        val randomOperator = (0..2).random()

        val textView3 = null
        when (randomOperator) {
            0 -> textView3.text = "+"
            1 -> textView3.text = "-"
            2 -> textView3.text = "*"

            fun clickCheckButton(view: View){
    }
                if (inputAnswer.text.toString().toInt() == result) {
                Toast.makeText(this, "CORRECT", Toast.LENGTH_SHORT).show()

                points += 1
                pointCounter.text = "POINT : $points"

            } else {
            Toast.makeText(this, "FALSE", Toast.LENGTH_SHORT).show()
            points -= 1
            pointCounter.text = "POINT : $points"
        }}}


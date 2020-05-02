package com.example.baseball

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var button2: Button
    lateinit var listView: ListView
    var list: ArrayList<String> = ArrayList()
    lateinit var arrayAdapter: ArrayAdapter<String>
    var answer = makeValue()
    var idx = 1;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Baseball v1.0"
        listView = findViewById(R.id.listView)
        editText = findViewById(R.id.editText)
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)

        Toast.makeText(applicationContext, answer, Toast.LENGTH_LONG).show()

        button.setOnClickListener {
            val output = getAnswer(editText.text.toString())
            list.add("(${idx}) : ${editText.text.toString()} => ${output}")

            if(output == "3S") {
                Toast.makeText(applicationContext, "정답!!", Toast.LENGTH_LONG).show()
            }

            editText.setText("")
            arrayAdapter.notifyDataSetChanged()
            listView.adapter = arrayAdapter
            idx++
        }

        button2.setOnClickListener {
            answer = makeValue()
            Toast.makeText(applicationContext, answer, Toast.LENGTH_LONG).show()
            idx = 1
            list.clear()
            editText.setText("")
            arrayAdapter.notifyDataSetChanged()
            listView.adapter = arrayAdapter
        }
    }

    fun makeValue():String {
        val randomList = (0..9).shuffled().take(3)

        return randomList.joinToString(separator="")
    }

    fun getAnswer(value:String):String {
        var nStrike:Int = 0
        var nBall:Int = 0
        var nOut:Int = 0
        var msg:String = ""

        for(i in 0..2) {
            for(j in 0..2) {
                if(value[i] == answer[j]) {
                    if(i==j) {
                        nStrike++
                    } else {
                        nBall++
                    }
                }
            }
        }

        nOut = 3 - nStrike - nBall

        if(nStrike > 0) {
            msg = nStrike.toString() + "S"
            if(nStrike != 3) {
                msg += " "
            }
        }

        if(nBall > 0) {
            msg += nBall.toString() + "B"
        }

        if(nOut == 3) {
            msg = nOut.toString() + "Out"
        }

        return "${msg}"
    }
}

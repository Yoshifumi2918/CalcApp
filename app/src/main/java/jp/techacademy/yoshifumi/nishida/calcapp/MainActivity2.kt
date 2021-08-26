package jp.techacademy.yoshifumi.nishida.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        //idを取得
        var ans :TextView = findViewById(R.id.ans)
        var back :Button = findViewById(R.id.back)

        //割り算の処理になるのは、最後のコードが反映されているから？　改善のために条件分岐の処理　→　書き方がわからないからヒントが欲しい

            val value1 = intent.getFloatExtra("VALUE1", 0f)
            val value2 = intent.getFloatExtra("VALUE2", 0f)
            val value3 = intent.getFloatExtra("VALUE3", 0f)
            val value4 = intent.getFloatExtra("VALUE4", 0f)
            val value5 = intent.getFloatExtra("VALUE5", 0f)
            val value6 = intent.getFloatExtra("VALUE6", 0f)
            val value7 = intent.getFloatExtra("VALUE7", 0f)
            val value8 = intent.getFloatExtra("VALUE8", 0f)

            ans.text = "${value1 + value2}"


            ans.text = "${value3 - value4}"


            ans.text = "${value5 * value6}"


            ans.text = "${value7 / value8}"
        }
    }

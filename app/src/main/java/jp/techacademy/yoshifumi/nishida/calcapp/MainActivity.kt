package jp.techacademy.yoshifumi.nishida.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //idを取得
        var et1: EditText = findViewById(R.id.et1)
        var et2: EditText = findViewById(R.id.et2)
        var button1: Button = findViewById(R.id.button1)
        var button2: Button = findViewById(R.id.button2)
        var button3: Button = findViewById(R.id.button3)
        var button4: Button = findViewById(R.id.button4)


        //ページ遷移
        val intent = Intent(this, MainActivity2::class.java)


            //四則計算をしたデータを送る
            button1.setOnClickListener {

                if (et1.text.toString()==("")) {

                    Toast.makeText(this,"数字を入力してください",Toast.LENGTH_LONG).show()


                } else if (et2.text.toString()==("")) {

                    Toast.makeText(this,"数字を入力してください",Toast.LENGTH_LONG).show()

                }else {
                    intent.putExtra(
                        "VALUE",
                        et1.text.toString().toFloat() + et2.text.toString().toFloat()
                    )
                    startActivity(intent)
                }

            }

            button2.setOnClickListener {


                if (et1.text.toString()==("")) {

                    Toast.makeText(this,"数字を入力してください",Toast.LENGTH_LONG).show()


                } else if (et2.text.toString()==("")) {

                    Toast.makeText(this,"数字を入力してください",Toast.LENGTH_LONG).show()

                }else {

                    intent.putExtra(
                        "VALUE",
                        et1.text.toString().toFloat() - et2.text.toString().toFloat()
                    )
                    startActivity(intent)
                }

            }

            button3.setOnClickListener {


                if (et1.text.toString()==("")) {

                    Toast.makeText(this,"数字を入力してください",Toast.LENGTH_LONG).show()


                } else if (et2.text.toString()==("")) {

                    Toast.makeText(this,"数字を入力してください",Toast.LENGTH_LONG).show()

                }else {
                    intent.putExtra(
                        "VALUE",
                        et1.text.toString().toFloat() * et2.text.toString().toFloat()
                    )

                    startActivity(intent)
                }

            }
            button4.setOnClickListener {


                if (et1.text.toString()==("")) {

                    Toast.makeText(this,"数字を入力してください",Toast.LENGTH_LONG).show()


                } else if (et2.text.toString()==("")) {

                    Toast.makeText(this,"数字を入力してください",Toast.LENGTH_LONG).show()

                }else {

                    intent.putExtra(
                        "VALUE",
                        et1.text.toString().toFloat() / et2.text.toString().toFloat()
                    )

                    startActivity(intent)
                }

            }

        }
    }

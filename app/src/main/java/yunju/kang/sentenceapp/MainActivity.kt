package yunju.kang.sentenceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import yunju.kang.sentenceapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private var isDouble = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentenceList = mutableListOf<String>()

        sentenceList.add("복잡성을 통제하는 것이 컴퓨터 프로그래밍의 기초다.")
        sentenceList.add("좋은 소프트웨어의 기능이란 복잡한 것을 간단하게 보이도록 만드는 것이다.")
        sentenceList.add("소프트웨어 제작사들은 소프트웨어를 더욱 “사용자 친화적”으로 만들려고 노력한다.")
        sentenceList.add("훌륭한 코드를 만들어내는 개발자는 일반적인 개발자보다 1만배 이상의 가치가 있다.")
        sentenceList.add("먼저 문제를 풀고 그 다음에 개발을 하라.")
        sentenceList.add("사람은 반복문을 쓰고, 신은 재귀함수를 쓴다.")
        sentenceList.add("훌륭한 코드는 훌륭한 문서보다 낫다.")
        sentenceList.add("당신이 6개월 이상 한 번도 보지 않은 코드는 다른 사람이 다시 만드는 게 훨씬 더 나을 수 있다.")

        Log.e("MainActivity", sentenceList.random())


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener {

            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }

        binding.goodWordTextArea.setText(sentenceList.random())
    }
}


 //       val list_item = mutableListOf<ListViewModel>()

 //       list_item.add(ListViewModel("a", "b"))
 //       list_item.add(ListViewModel("c", "d"))
 //       list_item.add(ListViewModel("e", "f"))

 //       val listview = findViewById<ListView>(R.id.mainListview)

 //       val listAdapter = ListViewAdapter(list_item)
 //       listview.adapter = listAdapter


 //   }

//    override fun onBackPressed() {
//        Log.d("MainActivity", "backbutton")
//        if (isDouble == true) {
//           finish()
//        }

//        isDouble = true
//        Toast.makeText(this, "종료하실려면 더블클릭", Toast.LENGTH_LONG).show()

//        Handler().postDelayed(Runnable {
//            isDouble = false
//        }, 2000)
//    }
//}
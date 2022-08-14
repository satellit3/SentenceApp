package yunju.kang.sentenceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()

        sentenceList.add("복잡성을 통제하는 것이 컴퓨터 프로그래밍의 기초다.")
        sentenceList.add("좋은 소프트웨어의 기능이란 복잡한 것을 간단하게 보이도록 만드는 것이다.")
        sentenceList.add("소프트웨어 제작사들은 소프트웨어를 더욱 “사용자 친화적”으로 만들려고 노력한다.")
        sentenceList.add("훌륭한 코드를 만들어내는 개발자는 일반적인 개발자보다 1만배 이상의 가치가 있다.")
        sentenceList.add("먼저 문제를 풀고 그 다음에 개발을 하라.")
        sentenceList.add("사람은 반복문을 쓰고, 신은 재귀함수를 쓴다.")
        sentenceList.add("훌륭한 코드는 훌륭한 문서보다 낫다.")
        sentenceList.add("당신이 6개월 이상 한 번도 보지 않은 코드는 다른 사람이 다시 만드는 게 훨씬 더 나을 수 있다.")

        val sentenceadapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceadapter


    }
}
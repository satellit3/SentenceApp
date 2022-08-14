package yunju.kang.sentenceapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List : MutableList<String>) : BaseAdapter() {
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(position: Int): Any {
        return List[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var convertView = convertView

        if (convertView == null) {
            convertView =
                LayoutInflater.from(parent?.context).inflate(R.layout.listview_item, parent, false)
        }

        val listviewText = convertView?.findViewById<TextView>(R.id.listviewTextArea)
        listviewText!!.text = List[position]

        return convertView!!


//        val title = converView!!.findViewById<TextView>(R.id.listviewItem)
//        val content = converView!!.findViewById<TextView>(R.id.listviewItem2)
//        title.text = List[position].title
//        content.text = List[position].content
        // list [0]번째 값 -> ListViewmodel("a","b")

        //        return converView!!
    }

}

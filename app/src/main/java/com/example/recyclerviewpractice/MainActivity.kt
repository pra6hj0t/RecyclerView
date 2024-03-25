package com.example.recyclerviewpractice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var userArrayList : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val recyclerView =findViewById<RecyclerView>(R.id.recyclerView)

        var userimages = arrayOf(R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,)

        var usernames = arrayOf("Nav","Prabh","Harman","Jatin","Jasvir","Jaskaran","Sukhman","Jagjit","Akash","Karan",)

        recyclerView.layoutManager = LinearLayoutManager(this)

        userArrayList = ArrayList<User>()


        for (index in userimages.indices){
            var user = User(userimages[index],usernames[index])
            userArrayList.add(user)
        }

        recyclerView.adapter = MyAdapter(this,userArrayList)


    }
}
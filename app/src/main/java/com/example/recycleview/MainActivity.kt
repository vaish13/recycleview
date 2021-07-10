package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)

        val users = ArrayList<user>()
        users.add(user("karuna", "7498296105", 2))
        users.add(user("tanvi", "8798296105", 2))
        users.add(user("gopal", "7400096105", 1))
        users.add(user("yash", "7498666605", 3))
        users.add(user("shraddha", "7498777775", 2))
        users.add(user("nidhi", "7498999905", 2))
        users.add(user("vaishnavi", "7498296555", 2))
        users.add(user("karan", "8888296105", 3))
        users.add(user("aayush", "6666296105", 1))
        users.add(user("khushi", "9999296105", 2))
        users.add(user("rishi", "9998890105", 1))
        users.add(user("eshika", "7498296105", 2))
        users.add(user("sameer", "7664467105", 3))
        users.add(user("pallavi", "8947296105", 2))
        users.add(user("priyanka", "0998296105", 2))
        users.add(user("sharvari", "7429896105", 2))
        users.add(user("riyansh", "7498299105", 1))
        users.add(user("kiyara", "7498777705", 2))

        val adapter = customadapter(users)

        recyclerView.adapter = adapter
    }
}
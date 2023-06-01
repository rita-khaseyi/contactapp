package com.ritakhaseyi.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.ritakhaseyi.contactap.contactRvAdapter
import com.ritakhaseyi.contactapp.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }


    fun  displayContacts() {
        var contact1 = ContactData(
            "", "rita khaseyi", "0757770427",
            "ritazee@gmail.com", "kenya"
        )
        var contact2 = ContactData(
            "", "wendy", "0757770427",
            "ritazee@gmail.com", "kenya"
        )
        var contact3 = ContactData(
            "", "kimmy", "0757770427",
            "ritazee@gmail.com", "kenya"
        )
        var contact4 = ContactData(
            "", "aaliyah", "0757770427",
            "ritazee@gmail.com", "kenya"
        )
        var contact5 = ContactData(
            "", "rita khaseyi", "0757770427",
            "ritazee@gmail.com", "kenya"
        )
        var contact6 = ContactData(
            "", "rita khaseyi", "0757770427",
            "ritazee@gmail.com", "kenya"
        )
        var contactlist =
            listOf<ContactData>(contact1, contact2, contact3, contact4, contact5, contact6)
        binding.rvContact.layoutManager = LinearLayoutManager(this)
        var contactAdapter = contactRvAdapter(contactlist)
        binding.rvContact.adapter = contactAdapter
    }}
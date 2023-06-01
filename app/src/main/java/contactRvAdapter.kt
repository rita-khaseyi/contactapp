package com.ritakhaseyi.contactap

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ritakhaseyi.contactapp.ContactData
import com.ritakhaseyi.contactapp.databinding.ContactListNameBinding

class contactRvAdapter(var contactlist:List<ContactData>):RecyclerView.Adapter<contactRvAdapter.ContactViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {

        var binding =
            ContactListNameBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)


    }

    override fun getItemCount(): Int {
        return contactlist.size
    }


    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contact = contactlist[position]
        holder.binding.apply {
            tvname.text = contact.displayName
            tvphonenumber.text = contact.PhoneNUmber
            tvemail.text = contact.emailADress
            tvcountry.text = contact.country

        }


    }

    class ContactViewHolder(var binding: ContactListNameBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }


}
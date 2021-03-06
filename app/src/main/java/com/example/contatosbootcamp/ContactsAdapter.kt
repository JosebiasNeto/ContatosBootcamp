package com.example.contatosbootcamp

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ContactsAdapter (val contactsList: ArrayList<Contact>): RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contacts_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactsAdapter.ViewHolder, position: Int) {
        holder.bindItem(contactsList[position])
    }

    override fun getItemCount(): Int = contactsList.size

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(contact: Contact){
            val textName = itemView.findViewById<TextView>(R.id.tv_contacts_name)
            val textPhone = itemView.findViewById<TextView>(R.id.tv_contacts_phone)

            textName.text = contact.name
            textPhone.text = contact.phoneNumber
        }
    }
}


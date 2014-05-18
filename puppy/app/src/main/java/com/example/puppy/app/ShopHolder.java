package com.example.puppy.app;

import android.view.View;
import android.widget.TextView;

import com.example.puppy.app.model.Contact;

public class ShopHolder {
    TextView identify;
    TextView name;
    TextView email;
    TextView address;
    TextView gender;
    TextView mobile;
    TextView home;
    TextView office;

    public ShopHolder(View view) {
        identify = (TextView) view.findViewById(R.id.identify);
        name = (TextView) view.findViewById(R.id.name);
        email = (TextView) view.findViewById(R.id.email);
        address = (TextView) view.findViewById(R.id.address);
        gender = (TextView) view.findViewById(R.id.gender);
        mobile = (TextView) view.findViewById(R.id.mobile);
        home = (TextView) view.findViewById(R.id.home);
        office = (TextView) view.findViewById(R.id.office);

    }

    public void add(Contact contact) {
        identify.setText("id:" + contact.getId());
        name.setText("name:" + contact.getName());
        email.setText("email:" + contact.getEmail());
        address.setText("address:" + contact.getAddress());
        gender.setText("gender:" + contact.getGender());
        Contact.Phones phones = contact.getPhones();
        mobile.setText("mobile phone:" + phones.getMobile());
        home.setText("home phone:" + phones.getHome());
        office.setText("office phone:" + phones.getOffice());

    }
}

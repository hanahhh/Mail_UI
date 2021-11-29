package com.example.mail_app_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    List<Item> items;
    Faker faker = new Faker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        items.add(new Item(faker.name().fullName(), "The new iconic creator heare !", "Announcing the all-new creator, builder in..."));
        items.add(new Item(faker.name().fullName(), "The new iconic creator heare !", "Announcing the all-new creator, builder in..."));
        items.add(new Item(faker.name().fullName(), "The new iconic creator heare !", "Announcing the all-new creator, builder in..."));
        items.add(new Item(faker.name().fullName(), "The new iconic creator heare !", "Announcing the all-new creator, builder in..."));
        items.add(new Item(faker.name().fullName(), "The new iconic creator heare !", "Announcing the all-new creator, builder in..."));
        items.add(new Item(faker.name().fullName(), "The new iconic creator heare !", "Announcing the all-new creator, builder in..."));
        items.add(new Item(faker.name().fullName(), "The new iconic creator heare !", "Announcing the all-new creator, builder in..."));
        items.add(new Item(faker.name().fullName(), "The new iconic creator heare !", "Announcing the all-new creator, builder in..."));
        items.add(new Item(faker.name().fullName(), "The new iconic creator heare !", "Announcing the all-new creator, builder in..."));
        items.add(new Item(faker.name().fullName(), "The new iconic creator heare !", "Announcing the all-new creator, builder in..."));
        items.add(new Item(faker.name().fullName(), "The new iconic creator heare !", "Announcing the all-new creator, builder in..."));
        items.add(new Item(faker.name().fullName(), "The new iconic creator heare !", "Announcing the all-new creator, builder in..."));
        items.add(new Item(faker.name().fullName(), "The new iconic creator heare !", "Announcing the all-new creator, builder in..."));
        items.add(new Item(faker.name().fullName(), "The new iconic creator heare !", "Announcing the all-new creator, builder in..."));
        items.add(new Item(faker.name().fullName(), "The new iconic creator heare !", "Announcing the all-new creator, builder in..."));
        items.add(new Item(faker.name().fullName(), "The new iconic creator heare !", "Announcing the all-new creator, builder in..."));
        items.add(new Item(faker.name().fullName(), "The new iconic creator heare !", "Announcing the all-new creator, builder in..."));
        items.add(new Item(faker.name().fullName(), "The new iconic creator heare !", "Announcing the all-new creator, builder in..."));

        ItemAdapter adapter = new ItemAdapter(items);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
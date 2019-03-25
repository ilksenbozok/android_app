package com.example.macbook.gyk_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Book> bookList;
    private List_View_Adapter listViewAdapter;
    private Book book,book1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.ListView);
        bookList = new ArrayList<>();
        book=new Book("EMPATİ","ADAM FAVOR");
        book1=new Book("AKLINDAN BİR SAYI TUT","ADAM FAVOR");

        bookList.add(book);
        bookList.add(book1);

        listViewAdapter=new List_View_Adapter(MainActivity.this,bookList);
        listView.setAdapter(listViewAdapter);

    }
}

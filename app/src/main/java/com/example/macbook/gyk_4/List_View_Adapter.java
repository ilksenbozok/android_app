package com.example.macbook.gyk_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class List_View_Adapter extends ArrayAdapter<Book> {

    private final LayoutInflater inflater;
    private  final Context context;
    private ViewHolder viewHolder;
    private  final ArrayList<Book> book_list;

    public static class ViewHolder{
        TextView tv_book_name,tv_book_author;
    }

    public List_View_Adapter(Context context, ArrayList<Book> book_list) {
        super(context, 0, book_list);
        this.context = context;
        this.book_list = book_list;

        inflater = LayoutInflater.from(context);
    }
  //getCount,getItem,getItemId,getView biz @override ettik...
    @Override
    public int getCount() {
        return book_list.size();
    }

    @Override
    public Book getItem(int position) {
        return book_list.get(position);
    }




    @Override
    public View getView(int position, View convertView,ViewGroup parent) {

        convertView = inflater.inflate(R.layout.list_item_view,null); //listenin her item ine erişiyoruz...
        viewHolder = new ViewHolder();

        viewHolder.tv_book_name = convertView.findViewById(R.id.tv_book_name);
        viewHolder.tv_book_author=convertView.findViewById(R.id.tv_book_author);

        convertView.setTag(viewHolder); //arayüz, for gibi işlev görüyor

        Book book = book_list.get(position);//listedeki her elemanla book_listesi yarattık

        viewHolder.tv_book_name.setText(book.getBook_name());
        viewHolder.tv_book_author.setText(book.getBook_author());

        return convertView;

    }

}

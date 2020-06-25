package com.example.pc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import Adapters.MyAdapter;

public class lista extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Los Rodríguez", "Santoro", "La Palomino", "Che carlitos", "Tradición arequipeña"};
    String mPedido[] ={"Pedido mínimo: S/.13","Pedido mínimo: S/.13", "Pedido mínimo: S/.16",
            "Pedido mínimo: S/.25", "Pedido mínimo: S/.15"};
    String mEntrega[]={"Entrega: De 45 a 60 minutos", "Entrega: De 45 a 60 minutos", "Entrega: De 45 a 60 minutos",
            "Entrega: De 45 a 60 minutos", "Entrega: De 45 a 60 minutos"};
    int images[]= {R.drawable.i1, R.drawable.i2, R.drawable.i3, R.drawable.i4, R.drawable.i5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        listView = findViewById(R.id.lv_courses);

        MyAdapter adapter = new MyAdapter(this, mTitle, mPedido, mEntrega, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Sesiones(position, mTitle[position]);

            }
        });
    }
}
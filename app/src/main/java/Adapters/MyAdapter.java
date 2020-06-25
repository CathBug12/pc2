package Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.pc2.R;


public class MyAdapter extends ArrayAdapter<String> {
    Context context;
    String rTitle[];
    String rPedido[];
    String rEntrega[];
    int rImgs[];
    RatingBar rb;
    public MyAdapter(Context c, String title[], String pedido[], String entrega[], int imgs[]){
        super(c, R.layout.row , R.id.textView1,title);
        this.context=c;
        this.rTitle=title;
        this.rPedido= pedido;
        this.rEntrega=entrega;
        this.rImgs=imgs;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.row,parent,false);
        ImageView images = row.findViewById(R.id.image);
        TextView myTitle = row.findViewById(R.id.textView1);
        TextView myPedido = row.findViewById(R.id.textView2);
        TextView myEntrega = row.findViewById(R.id.textView3);
        rb= row.findViewById(R.id.ratingBar);

        images.setImageResource(rImgs[position]);
        myTitle.setText(rTitle[position]);
        myPedido.setText(rPedido[position]);
        myEntrega.setText(rEntrega[position]);

        return row;
    }

}

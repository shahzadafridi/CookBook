package im.bcs.cookbook;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Opriday on 5/9/2018.
 */

public class AdapterForFoodMenu extends ArrayAdapter {
    LayoutInflater layoutInflater;
    String[] food;
    int[] images;
    public AdapterForFoodMenu(@NonNull Context context, int resource, String[] food, int[] images) {
        super(context, resource);
        this.food = food;
        this.images = images;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return food.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            convertView = layoutInflater.inflate(R.layout.food_item, parent, false);
        }
        TextView tv = (TextView) convertView.findViewById(R.id.title);
        ImageView iv = (ImageView) convertView.findViewById(R.id.image);
        iv.setImageResource(images[position]);
        tv.setText(food[position]);
        return convertView;
    }
}

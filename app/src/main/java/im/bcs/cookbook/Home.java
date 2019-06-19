package im.bcs.cookbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity implements View.OnClickListener{

    Button chinese,korean,pakistani,turkish;
    String FOOD_TITLE = "title";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        chinese = (Button) findViewById(R.id.chinese);
        korean = (Button) findViewById(R.id.korean);
        pakistani = (Button) findViewById(R.id.pakistani);
        turkish = (Button) findViewById(R.id.turkish);

        chinese.setOnClickListener(this);
        korean.setOnClickListener(this);
        pakistani.setOnClickListener(this);
        turkish.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.chinese){
            Intent i = new Intent(this,FoodMenu.class);
            i.putExtra(FOOD_TITLE,"chinese");
            startActivity(i);

        }else if (v.getId() == R.id.korean){
            Intent i = new Intent(this,FoodMenu.class);
            i.putExtra(FOOD_TITLE,"korean");
            startActivity(i);
        }else if (v.getId() == R.id.pakistani){
            Intent i = new Intent(this,FoodMenu.class);
            i.putExtra(FOOD_TITLE,"pakistani");
            startActivity(i);
        }else if (v.getId() == R.id.turkish){
            Intent i = new Intent(this,FoodMenu.class);
            i.putExtra(FOOD_TITLE,"turkish");
            startActivity(i);
        }
    }
}

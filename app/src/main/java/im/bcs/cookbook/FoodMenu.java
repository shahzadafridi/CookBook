package im.bcs.cookbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class FoodMenu extends AppCompatActivity {
    ListView listView;
    String FOOD_TITLE = "title";
    String[] food;
    int[] images;
    String findImageArray="";
    ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);
        String getTitle = getIntent().getStringExtra(FOOD_TITLE);
        food = checkFoodType(getTitle);
        images = checkFoodImages(findImageArray);
        if(food != null) {
            adapter = new AdapterForFoodMenu(this, R.layout.food_item,food,images);
        }
        listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(FoodMenu.this,Reciepe.class);
                startActivity(intent);
            }
        });

    }

    private String[] checkFoodType(String getTitle) {

        String[] chineseFood = {"Soups","Noodles","Manchurian","Fried Rice","Chili Chicken"};
        String[] korenFood = {"Japchae","Kimbap","Bingsu","Samgyeopsal","Samggye-tang"};
        String[] pakistaniFood = {"Nihari","Korma","Karahi","Biryani","Pulao"};
        String[] turkishFood = {"Mezes","Kofte","Lahmacun","Kebab","Desserts"};

            if(getTitle.contentEquals("chinese")){
                findImageArray = "chinese";
            return chineseFood;
        }else if(getTitle.contentEquals("korean")){
                findImageArray = "korean";
            return korenFood;
        }else if(getTitle.contentEquals("pakistani")){
                findImageArray = "pakistani";
            return pakistaniFood;
        }else if(getTitle.contentEquals("turkish")){
                findImageArray = "turkish";
            return turkishFood;
        }
        return null;
    }
    private int[] checkFoodImages(String getTitle){
        int[] chineseFoodImages = {R.drawable.chinese_soups,R.drawable.chinese_noodles,R.drawable.chinese_manchurian,R.drawable.chinese_fried_rice,R.drawable.chinese_chili_chicken};
        int[] korenFoodImages = {R.drawable.korean_japchae_1,R.drawable.korean_kimbap_2,R.drawable.korean_bingsu_3,R.drawable.korean_samgyeopsal_4,R.drawable.korean_samggye_tang_5};
        int[] pakistaniFoodImages = {R.drawable.pakistani_nihari_1,R.drawable.pakistani_korma_2,R.drawable.pakistani_karahi_3,R.drawable.pakistani_biryani_4,R.drawable.pakistani_pulao_5};
        int[] turkishFoodImages = {R.drawable.turkey_meze,R.drawable.turkey_kofte,R.drawable.turkey_lahmacun,R.drawable.turkey_kebab,R.drawable.turkey_desserts};
        if(getTitle.contentEquals("chinese")){
            return chineseFoodImages;
        }else if(getTitle.contentEquals("korean")){
            return korenFoodImages;
        }else if(getTitle.contentEquals("pakistani")){
            return pakistaniFoodImages;
        }else if(getTitle.contentEquals("turkish")){
            return turkishFoodImages;
        }
        return null;
    }
}

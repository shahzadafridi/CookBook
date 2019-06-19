package im.bcs.cookbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Reciepe extends AppCompatActivity {

    TextView tv;
    String gredient = "The rice is rinsed a few times in water and drained until the water turns from milky to clear. The rice should be soaked in water for at least 30 minutes before cooking. The unsoaked rice takes 25 minutes to parboil, whereas the soaked grains take only 15 minutes.[1] Rice should be parboiled till al dente. Remove the pot from the flame and transfer the rice in a sieve to drain the boiling water. Then transfer the rice back into the pot, and cover it with a lid, to prevent the steam from escaping. Cook the rice in its own steam at the lowest flame possible for a few minutes.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciepe);

        tv = (TextView) findViewById(R.id.recipe);
        tv.setText(gredient);


    }
}

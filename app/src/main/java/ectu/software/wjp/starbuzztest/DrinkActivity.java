package ectu.software.wjp.starbuzztest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKID="drinkId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        ImageView imageView=findViewById(R.id.drinkView);
        TextView textViewDscriptation=findViewById(R.id.descriptation);
        TextView textViewName=findViewById(R.id.name);

        int drinkId=getIntent().getIntExtra(EXTRA_DRINKID,0);
        Drink drink=Drink.drinks[drinkId];

        imageView.setImageResource(drink.getImageResourceId());
        textViewDscriptation.setText(drink.getDescription());
        textViewName.setText(drink.getName());


    }
}
package startup.softflix.com.startup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_food_details.*

class FoodDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)
        val bundle= intent.extras

        ivFoodimage.setImageResource(bundle.getInt("image"))
        tvname.text= bundle.getString("name")
        tvDetails.text=bundle.getString("des")
    }
}

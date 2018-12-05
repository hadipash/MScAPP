package hk.hku.cs.msccompsc_app.Curriculum;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;




import androidx.appcompat.app.AppCompatActivity;
import hk.hku.cs.msccompsc_app.R;

public class AlumniNewsPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumni_news_page);

        TextView title = findViewById(R.id.news_title_detailed);
        TextView content = findViewById(R.id.news_content_detailed);
        ImageView pic = findViewById(R.id.news_img_detailed);



        title.setText(getIntent().getStringExtra("title"));
        content.setText(getIntent().getStringExtra("content"));
        pic.setImageBitmap(        BitmapFactory.decodeByteArray(
                getIntent().getByteArrayExtra("img"), 0, getIntent().getByteArrayExtra("img").length));

//        title.setText(news.getString("topic"));
//        setText(content, news.getString("content"));
//        Picasso.get().load(news.getString("pic")).into(pic);

    }
}

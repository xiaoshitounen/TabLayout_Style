package swu.xl.tablayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 第一个
         */
        TabLayout tabLayout1 = findViewById(R.id.tab_1);
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab1"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab2"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab3"));

        /**
         * 第二个
         */
        TabLayout tabLayout2 = findViewById(R.id.tab_2);
        tabLayout2.addTab(tabLayout2.newTab().setText("Tab1"));
        tabLayout2.addTab(tabLayout2.newTab().setText("Tab2"));
        tabLayout2.addTab(tabLayout2.newTab().setText("Tab3"));

        /**
         * 第三个
         */
        final TabLayout tabLayout3 = findViewById(R.id.tab_3);
        tabLayout3.addTab(tabLayout3.newTab().setText("Tab1"));
        tabLayout3.addTab(tabLayout3.newTab().setText("Tab2"));
        tabLayout3.addTab(tabLayout3.newTab().setText("Tab3"));

        /**
         * 第四个
         */
        final TabLayout tabLayout4 = findViewById(R.id.tab_4);
        tabLayout4.addTab(tabLayout4.newTab().setText("Tab1"));
        tabLayout4.addTab(tabLayout4.newTab().setText("Tab2"));
        tabLayout4.addTab(tabLayout4.newTab().setText("Tab3"));
        for (int i = 0; i < tabLayout4.getTabCount(); i++) {
            tabLayout4.getTabAt(i).setIcon(R.mipmap.ic_launcher_round);
        }

        /**
         * 第五个
         */
        final TabLayout tabLayout5 = findViewById(R.id.tab_5);
        String[] texts = {"Tab1","Tab2","Tab3"};
        int[] resources = {R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round};
        for (int i = 0; i < texts.length; i++) {
            tabLayout5.addTab(tabLayout5.newTab());
        }
        for (int i = 0; i < tabLayout5.getTabCount(); i++) {
            tabLayout5.getTabAt(i).setCustomView(myTabView(i,texts,resources));
        }

        /**
         * 第六个
         */
        final TabLayout tabLayout6 = findViewById(R.id.tab_6);
        tabLayout6.addTab(tabLayout6.newTab().setText("Tab1"));
        tabLayout6.addTab(tabLayout6.newTab().setText("Tab2"));
        tabLayout6.addTab(tabLayout6.newTab().setText("Tab3"));
        tabLayout6.addTab(tabLayout6.newTab().setText("Tab4"));
        tabLayout6.addTab(tabLayout6.newTab().setText("Tab5"));
        tabLayout6.addTab(tabLayout6.newTab().setText("Tab6"));
        tabLayout6.addTab(tabLayout6.newTab().setText("Tab7"));
        tabLayout6.addTab(tabLayout6.newTab().setText("Tab8"));
        tabLayout6.addTab(tabLayout6.newTab().setText("Tab9"));
        tabLayout6.addTab(tabLayout6.newTab().setText("Tab10"));
        tabLayout6.addTab(tabLayout6.newTab().setText("Tab11"));
        tabLayout6.addTab(tabLayout6.newTab().setText("Tab12"));
    }

    /**
     *
     * @param position
     * @return
     */
    private View myTabView(int position,String[] texts,int[] resources){
        //加载布局
        View tabView = LayoutInflater.from(this).inflate(R.layout.tab_layout, null);

        //找到对应的控件
        ImageView imageView = tabView.findViewById(R.id.imgView);
        TextView textView = tabView.findViewById(R.id.textView);

        //设置对应内容
        imageView.setImageResource(resources[position]);
        textView.setText(texts[position]);

        return tabView;
    }
}

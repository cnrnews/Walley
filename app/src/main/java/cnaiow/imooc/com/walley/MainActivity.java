package cnaiow.imooc.com.walley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.meituan.android.walle.WalleChannelReader;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView=findViewById(R.id.tv_content);
        //获取多渠道信息
        String channel= WalleChannelReader.getChannel(getApplicationContext());
        //多环境
        int envType=BuildConfig.ENV_TYPE;
        mTextView.setText(channel+":"+envType);
    }
}

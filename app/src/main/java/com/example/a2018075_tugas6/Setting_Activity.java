package com.example.a2018075_tugas6;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import com.example.a2018075_tugas6.databinding.ActivitySettingBinding;
public class Setting_Activity extends AppCompatActivity {
    private ActivitySettingBinding binding;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setup view binding
        binding =
                ActivitySettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        preferences = getSharedPreferences("AndroidHiveLogin",
                0);
        editor = preferences.edit();
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.clear();
                editor.commit();
                Intent intent = new Intent(Setting_Activity.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}
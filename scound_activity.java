package com.example.book_exchange;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Objects;

import static com.example.book_exchange.R.menu.menu_item;

public class scound_activity extends AppCompatActivity {
    private Button rear;
Toolbar tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scound_activity);
        tb=findViewById(R.id.tb);
        setSupportActionBar(tb);
        tb.setNavigationIcon(R.drawable.ic_menu_black_24dp);


        rear = (Button) findViewById(R.id.rearId);
        rear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(scound_activity.this, five.class);
                        startActivity(intent);

                    }
                });


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(menu_item, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.StoryBookId) {
            Toast.makeText(scound_activity.this, "STORY BOOK IS SELECTED", Toast.LENGTH_SHORT).show();

        }
if (item.getItemId() == R.id.POETRYBOOKId)
{
            Toast.makeText(scound_activity.this, "POETRY BOOKIS SELECTED", Toast.LENGTH_SHORT).show();

        }

        return super.onOptionsItemSelected(item);
    }
}

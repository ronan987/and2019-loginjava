package co.jjsolarte.uno;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Switch;

import co.jjsolarte.uno.R;
import co.jjsolarte.uno.fragments.AyudaFragment;

public class ContainerActivity extends AppCompatActivity {

    BottomNavigationView botomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        botomView.findViewById(R.id.containeFrame);

        botomView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Switch(menuItem.getItemId()){
                    case R.id.menu_ayuda:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.containeFrame,);

                }
            }
        });

    }
}

package proyect.my.of.example.miyuki.myapplication;

import android.app.Fragment;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {


    Interfaz interfaz = new Interfaz() {
        @Override
        public void llenarTextview(String s) {

            textView.setText(s);
        }
    };
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);


        BlankFragment fragment = new BlankFragment();
        fragment.setInterfaz(interfaz);
        getFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}

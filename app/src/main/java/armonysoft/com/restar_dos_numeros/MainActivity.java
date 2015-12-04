package armonysoft.com.restar_dos_numeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText et1,et2;
    public TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     et1=(EditText)findViewById(R.id.et1);
     et2=(EditText)findViewById(R.id.et2);
     tv3=(TextView)findViewById(R.id.tv3);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void restar(View view){
    String valor1 = et1.getText().toString();
    String valor2 = et2.getText().toString();
    int nro1 = Integer.parseInt(valor1);
    int nro2 = Integer.parseInt(valor2);
    int restar = nro1 - nro2;
    String resu = String.valueOf(restar);
    tv3.setText(resu);


    }

    public void sumar(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        int restar = nro1 + nro2;
        String resu = String.valueOf(restar);
        tv3.setText(resu);


    }

    public void multiplicar(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        int restar = nro1 * nro2;
        String resu = String.valueOf(restar);
        tv3.setText(resu);


    }

    public void dividir(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        int restar = nro1 / nro2;
        String resu = String.valueOf(restar);
        tv3.setText(resu);


    }

}

package com.example.turki.animo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AccueilActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String INFO_KEY = "typeAnimo";

    private Button btnFerme;
    private Button btnAniSau;
    private Button btnMammif;
    private Button btnOiseaux;
    private Button btnInsec;
    private Button btnAnAqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);


        btnFerme = (Button) findViewById(R.id.btnFerme);
         btnFerme.setOnClickListener(this);

        btnAniSau = (Button) findViewById(R.id.btnAniSau);
         btnAniSau.setOnClickListener(this);

        btnMammif = (Button) findViewById(R.id.btnMammif);
         btnMammif.setOnClickListener(this);

        btnOiseaux = (Button) findViewById(R.id.btnOiseaux);
         btnOiseaux.setOnClickListener(this);

        btnInsec = (Button) findViewById(R.id. btnInsec);
          btnInsec.setOnClickListener(this);

        btnAnAqua = (Button) findViewById(R.id.btnAnAqua);
         btnAnAqua.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

            switch (v.getId()) {
            case R.id.btnFerme:
                btnFermeClicked();
                break;
            case R.id.btnAniSau:
                btnAniSauClicked();
                break;
            case R.id.btnMammif:
                btnMammifClicked();
                break;
            case R.id.btnOiseaux:
                btnOiseauxClicked();
                break;
            case R.id.btnInsec:
                btnInsecClicked();
                break;
            case R.id.btnAnAqua:
                btnAnAquaClicked();
                break;

        }

    }

 private void btnFermeClicked() {
        Toast.makeText(this, "Ferme", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(INFO_KEY,"1");
        intent.putExtras(bundle);
        startActivity(intent);
    }
 private void btnAniSauClicked() {
        Toast.makeText(this, "Animaux Sauvages", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(INFO_KEY,"2");
        intent.putExtras(bundle);
        startActivity(intent);
    }

 private void btnMammifClicked() {
        Toast.makeText(this, "Mammifères", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(INFO_KEY,"3");
        intent.putExtras(bundle);
        startActivity(intent);
    }
 private void btnOiseauxClicked() {
        Toast.makeText(this, "Oiseaux", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(INFO_KEY,"4");
        intent.putExtras(bundle);
        startActivity(intent);
    } 
private void btnInsecClicked() {
        Toast.makeText(this, "Insectes", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(INFO_KEY,"5");
        intent.putExtras(bundle);
        startActivity(intent);
    }
 private void btnAnAquaClicked() {
        Toast.makeText(this, "Animaux Aquatiques", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(INFO_KEY,"6");
        intent.putExtras(bundle);
        startActivity(intent);
    }



}

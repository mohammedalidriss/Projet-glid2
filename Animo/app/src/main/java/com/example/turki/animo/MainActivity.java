package com.example.turki.animo;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button details;

    ArrayList<Animal> animalList;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {

            String animo = bundle.getString(AccueilActivity.INFO_KEY);
            if (animo != null) {
                Toast.makeText(getApplicationContext(),  animo , Toast.LENGTH_SHORT).show();

            animalList = new ArrayList<Animal>();
            listview = (ListView) findViewById(R.id.listanim);
                JSONAsyncTask   list= new JSONAsyncTask();
                list.setType(animo);
                list.execute();



            }
        }




    }


    class JSONAsyncTask extends AsyncTask<Void, Void, Boolean> {

        ProgressDialog dialog;
        private String type;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }



        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            dialog = new ProgressDialog(MainActivity.this);
            dialog.setMessage("Loading, please wait");
            dialog.setTitle("Connecting server");
            dialog.show();
            dialog.setCancelable(false);

        }

        @Override
        protected Boolean doInBackground(Void... urls) {

            try {

                String url = "http://192.168.0.186/animal.php";
                //
                JSONParser jsp = new JSONParser();
                List<NameValuePair> param = new ArrayList<NameValuePair>();
                JSONObject jsobj = jsp.makeHttpRequest(url, "GET", param);
                JSONArray jarray = jsobj.getJSONArray("animal");
                Log.d("Animal", jarray.toString());
                for (int i = 0; i < jarray.length(); i++) {
                    JSONObject JRealObject = jarray.getJSONObject(i);
                  if(JRealObject.getString("type").equals(type)){
                    Animal anim = new Animal();
                    anim.setId(JRealObject.getInt("id"));
                    anim.setNom(JRealObject.getString("nom"));
                    anim.setImage(JRealObject.getString("image"));
                    anim.setNourriture(JRealObject.getString("nourriture"));
                    anim.setTaille(JRealObject.getInt("taille"));
                    anim.setPoids(JRealObject.getInt("poids"));
                    anim.setDescription(JRealObject.getString("description"));
                    anim.setType(JRealObject.getString("type"));
                    anim.setVideo(JRealObject.getString("video"));

                    animalList.add(anim);}

                }

                return true;

            }  catch (JSONException e) {
                e.printStackTrace();
            }
            return false;

        }

        protected void onPostExecute(Boolean result) {
            dialog.dismiss();
            if (result == false) {
                Toast.makeText(getApplicationContext(), "Unable to fetch data from server", Toast.LENGTH_LONG).show();
            } else {
               AdapterAnimal adapterAnimal = new AdapterAnimal(animalList, getApplicationContext()) {
               };
                listview.setAdapter(adapterAnimal);
            }

        }
    }


    }



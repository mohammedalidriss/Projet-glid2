package com.example.turki.animo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by turki on 24/04/2016.
 */
public abstract class AdapterAnimal extends BaseAdapter {
    public AdapterAnimal(ArrayList<Animal> arrayListAnimal, Context context) {
        super();
        ArrayListAnimal = arrayListAnimal;
        this.context = context;
    }

    ArrayList<Animal> ArrayListAnimal;
    Context context;

    @Override
    public int getCount() {
        return ArrayListAnimal.size();
    }

    @Override
    public Object getItem(int position) {
        return ArrayListAnimal.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater vi = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = vi.inflate(R.layout.activity_adapter_animal, null);
        TextView nom = (TextView) convertView.findViewById(R.id.nom);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);

        TextView nourriture = (TextView) convertView.findViewById(R.id.nouri);
        TextView poids = (TextView) convertView.findViewById(R.id.poid);
        TextView taille = (TextView) convertView.findViewById(R.id.taille);


       image.setImageResource(R.drawable.jung);
        nom.setText(ArrayListAnimal.get(position).getNom());
        new DownloadImageTask(image).execute(ArrayListAnimal.get(position).getImage());

        nourriture.setText(" " + ArrayListAnimal.get(position).getNourriture());
        poids.setText(" " + ArrayListAnimal.get(position).getPoids());
        taille.setText(" "+ArrayListAnimal.get(position).getTaille());
        return convertView;


    }


    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }

    }


}

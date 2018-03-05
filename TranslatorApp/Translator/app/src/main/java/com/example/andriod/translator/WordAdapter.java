package com.example.andriod.translator;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by yarra on 01-03-2018.
 */

 public class WordAdapter extends ArrayAdapter<Word> {

    private int backgroundColorId;
    public WordAdapter(Activity context, ArrayList<Word> words,int backgroundColorId) {
        super(context,0,words);
        this.backgroundColorId=backgroundColorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Word currentWord=getItem(position);
        View listItemView=convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_display_activity, parent, false);
        }
        TextView englishWord=(TextView) listItemView.findViewById(R.id.english_text_view);
        englishWord.setText(currentWord.getEnglishWord());

        TextView translatedWord=(TextView)listItemView.findViewById(R.id.translated_text_view);

        translatedWord.setText(currentWord.getTranslatedWord());

        ImageView iconImage=(ImageView)listItemView.findViewById(R.id.icon_image_view);
        if(currentWord.getImageResourceId()==-1){
            iconImage.setVisibility(View.GONE);
        }else{
            iconImage.setImageResource(currentWord.getImageResourceId());
        }

        // This method is used to set the color to the view which is viewing
        View containerColor=listItemView.findViewById(R.id.background_adjustment);
        int colorOfBg= ContextCompat.getColor(getContext(),backgroundColorId);
        containerColor.setBackgroundColor(colorOfBg);

        /*getContext().getColor(R.color.black);
Now its deprecated since android 6.0 (API 22+) so you should use:

getContext().getColor(R.color.black,theme);
or use ContextCompat which fill theme automatically depends on your Context's theme:

ContextCompat.getColor(getContext(),R.color.black)*/
        return listItemView;
    }
}

package com.ivanilov.techcard.Presenter.Entity;

import androidx.room.TypeConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IngedientsConverter {

    @TypeConverter
    public String fromIngredients (List<String> ingredients) {

        String result = "";

        for (String ingredient:ingredients){
            result = result  + ingredient +(",");
        }

        result.substring(0, result.length()-1);


        return result;
    }

    @TypeConverter
    public ArrayList<String> toIngredients(String data) {
        List<String> d = Arrays.asList(data.split(","));
        ArrayList<String> result = new ArrayList<>(d);
        return result;
    }
}

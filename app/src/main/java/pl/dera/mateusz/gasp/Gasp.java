package pl.dera.mateusz.gasp;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.ArraySet;

import androidx.annotation.NonNull;

import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.SignalInfo;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Gasp extends GodotPlugin {
    public SharedPreferences sharedPreferences = null;
    public SharedPreferences.Editor sharedPreferencesEditor = null;
    public Context context = null;
    public Gasp(Godot godot) {
        super(godot);
    }

    public void setContext(){
        context = Objects.requireNonNull(getActivity()).getApplicationContext();
    }
    public void setSharedPreferences(String name){
        sharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE);
    }
    public void setSharedPreferencesEditor(){
        sharedPreferencesEditor = sharedPreferences.edit();
    }

    @NonNull
    @Override
    public String getPluginName() {
        return "Gasp";
    }

    @NonNull
    @Override
    public List<String> getPluginMethods() {
        return Arrays.asList("sharedPreferencesName","getString","getInt","getFloat","getBoolean","putString","putInt","putFloat","putBoolean","commit","apply");
    }

    public void sharedPreferencesName(String name){
        setContext();
        setSharedPreferences(name);
        setSharedPreferencesEditor();
    }
    // GET
    public String getString(String name){
        return sharedPreferences.getString(name, "");
    }

    public int getInt(String name){
        return sharedPreferences.getInt(name, 0);
    }

    public float getFloat(String name){
        return sharedPreferences.getFloat(name, 0.0f);
    }

    public boolean getBoolean(String name){
        return sharedPreferences.getBoolean(name, false);
    }

    // PUT
    public void putString(String name, String value){
        sharedPreferencesEditor.putString(name, value);
    }
    public void putInt(String name, int value){
        sharedPreferencesEditor.putInt(name, value);
    }

    public void putFloat(String name, float value){
        sharedPreferencesEditor.putFloat(name, value);
    }

    public void putBoolean(String name, boolean value){
        sharedPreferencesEditor.putBoolean(name, value);
    }
    // SAVE
    public void commit(){
        sharedPreferencesEditor.commit();
    }

    public void apply(){
        sharedPreferencesEditor.apply();
    }

}
package test.tv.rs.com.retrofittest.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Akash.Sharma on 10/25/2017.
 */

public class ParceableExampleObject implements Parcelable {


    private String age;
    private String name;


    public ParceableExampleObject(String age, String name) {
        this.age = age;
        this.name = name;

    }


    public ParceableExampleObject(Parcel input)
    {
        age = input.readString();
        name = input.readString();

    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(age);
        dest.writeString(name);
    }


    public static   Creator<ParceableExampleObject> CREATOR  = new Creator<ParceableExampleObject>() {
         @Override
         public ParceableExampleObject createFromParcel(Parcel source) {
             return new ParceableExampleObject(source);
         }

         @Override
         public ParceableExampleObject[] newArray(int size) {
             return new ParceableExampleObject[size];
         }
     };
}

package com.plkj.studysample.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Renzituo
 * on 2020-05-20
 */
public class Book implements Parcelable {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    protected Book(Parcel in) {
        this.name = in.readString();
    }

    public Book (String name){
        this.name = name;
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
    }

    public void readFromParcel(Parcel dest) {
        name = dest.readString();
    }

}

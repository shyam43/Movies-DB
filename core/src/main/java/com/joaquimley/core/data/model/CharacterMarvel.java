/*
 * Copyright (c) Joaquim Ley 2016. All Rights Reserved.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.joaquimley.core.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model for Marvel character
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CharacterMarvel implements Parcelable {

    @JsonProperty(value = "id")
    private long mId;
//    @JsonProperty(value = "title")
//    private String mName;
    @JsonProperty(value = "overview")
    private String mDescription;
    @JsonProperty(value = "backdrop_path")
    private String mThumbnail;
    @JsonProperty(value = "adult")
    private boolean adult;
    @JsonProperty(value = "release_date")
    private String release_date;
    @JsonProperty(value = "original_title")
    private String original_title;
    @JsonProperty(value = "title")
    private String title;

    public CharacterMarvel() {
    }

    /**
     * START of custom methods
     */

    public String getImageUrl() {
        return mThumbnail;
    }

//    @Override
//    public String toString() {
//        return mName;
//    }

    public long getId() {
        return mId;
    }

    public void setmId(long mId) {
        this.mId = mId;
    }

//    public String getmName() {
//        return mName;
//    }
//
//    public void setmName(String mName) {
//        this.mName = mName;
//    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmThumbnail() {
        return mThumbnail;
    }

    public void setmThumbnail(String mThumbnail) {
        this.mThumbnail = mThumbnail;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * END of custom methods
     */



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CharacterMarvel)) return false;
        CharacterMarvel that = (CharacterMarvel) o;
        return mId == that.mId;
    }

    @Override
    public int hashCode() {
        return (int) (mId ^ (mId >>> 32));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(mId);
//        dest.writeString(mName);
        dest.writeString(mDescription);
        dest.writeString(mThumbnail);
        dest.writeByte((byte) (adult ? 1 : 0));
        dest.writeString(release_date);
        dest.writeString(original_title);
        dest.writeString(title);
    }

    protected CharacterMarvel(Parcel in) {
        mId = in.readLong();
//        mName = in.readString();
        mDescription = in.readString();
        mThumbnail = in.readString();
        adult = in.readByte() != 0;
        release_date = in.readString();
        original_title = in.readString();
        title = in.readString();
    }

    public static final Parcelable.Creator<CharacterMarvel> CREATOR = new Parcelable.Creator<CharacterMarvel>() {
        @Override
        public CharacterMarvel createFromParcel(Parcel source) {
            return new CharacterMarvel(source);
        }

        @Override
        public CharacterMarvel[] newArray(int size) {
            return new CharacterMarvel[size];
        }
    };
}

package com.tavares.kaique.video_project

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by kaiqu on 15/06/2018.
 */
data class HeroiObjeto (
        val titulo: String,
        val foto : Int,
        val descricao : String,
        val forca : Int,
        val velocidade : Int):Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readInt(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(titulo)
        parcel.writeInt(foto)
        parcel.writeString(descricao)
        parcel.writeInt(forca)
        parcel.writeInt(velocidade)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<HeroiObjeto> {
        override fun createFromParcel(parcel: Parcel): HeroiObjeto {
            return HeroiObjeto(parcel)
        }

        override fun newArray(size: Int): Array<HeroiObjeto?> {
            return arrayOfNulls(size)
        }
    }
}
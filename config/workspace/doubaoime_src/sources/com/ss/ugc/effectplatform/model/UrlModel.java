package com.ss.ugc.effectplatform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class UrlModel implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private String md5;
    private String uri;
    private List<String> url_list;
    private Integer url_type;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            l.g(parcel, "in");
            return new UrlModel(parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UrlModel[i];
        }
    }

    public UrlModel() {
        this(null, null, null, null, 15, null);
    }

    public UrlModel(List<String> list, String str, String str2, Integer num) {
        l.g(list, "url_list");
        this.url_list = list;
        this.uri = str;
        this.md5 = str2;
        this.url_type = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlModel)) {
            return false;
        }
        UrlModel urlModel = (UrlModel) obj;
        return ((l.a(getUrl_list(), urlModel.getUrl_list()) ^ true) || (l.a(getUri(), urlModel.getUri()) ^ true) || (l.a(getMd5(), urlModel.getMd5()) ^ true) || (l.a(getUrl_type(), urlModel.getUrl_type()) ^ true)) ? false : true;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrl_list() {
        return this.url_list;
    }

    public Integer getUrl_type() {
        return this.url_type;
    }

    public int hashCode() {
        List<String> url_list = getUrl_list();
        int intValue = (url_list != null ? Integer.valueOf(url_list.hashCode()) : null).intValue() * 31;
        String uri = getUri();
        int hashCode = (intValue + (uri != null ? uri.hashCode() : 0)) * 31;
        String md5 = getMd5();
        int hashCode2 = (hashCode + (md5 != null ? md5.hashCode() : 0)) * 31;
        Integer url_type = getUrl_type();
        return hashCode2 + (url_type != null ? url_type.hashCode() : 0);
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrl_list(List<String> list) {
        l.g(list, "<set-?>");
        this.url_list = list;
    }

    public void setUrl_type(Integer num) {
        this.url_type = num;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("UrlModel(url_list=");
        M.append(getUrl_list());
        M.append(", uri=");
        M.append(getUri());
        M.append(')');
        return M.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        l.g(parcel, "parcel");
        parcel.writeStringList(this.url_list);
        parcel.writeString(this.uri);
        parcel.writeString(this.md5);
        Integer num = this.url_type;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }

    public /* synthetic */ UrlModel(List list, String str, String str2, Integer num, int i, g gVar) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num);
    }
}

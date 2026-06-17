package com.ss.ugc.effectplatform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class AuthorThumbModel implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private Integer height;
    private String uri;
    private List<String> url_list;
    private Integer width;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            l.g(parcel, "in");
            return new AuthorThumbModel(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AuthorThumbModel[i];
        }
    }

    public AuthorThumbModel() {
        this(null, null, null, null, 15, null);
    }

    public AuthorThumbModel(String str, List<String> list, Integer num, Integer num2) {
        this.uri = str;
        this.url_list = list;
        this.width = num;
        this.height = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthorThumbModel copy$default(AuthorThumbModel authorThumbModel, String str, List list, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authorThumbModel.uri;
        }
        if ((i & 2) != 0) {
            list = authorThumbModel.url_list;
        }
        if ((i & 4) != 0) {
            num = authorThumbModel.width;
        }
        if ((i & 8) != 0) {
            num2 = authorThumbModel.height;
        }
        return authorThumbModel.copy(str, list, num, num2);
    }

    public final String component1() {
        return this.uri;
    }

    public final List<String> component2() {
        return this.url_list;
    }

    public final Integer component3() {
        return this.width;
    }

    public final Integer component4() {
        return this.height;
    }

    public final AuthorThumbModel copy(String str, List<String> list, Integer num, Integer num2) {
        return new AuthorThumbModel(str, list, num, num2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorThumbModel)) {
            return false;
        }
        AuthorThumbModel authorThumbModel = (AuthorThumbModel) obj;
        return l.a(this.uri, authorThumbModel.uri) && l.a(this.url_list, authorThumbModel.url_list) && l.a(this.width, authorThumbModel.width) && l.a(this.height, authorThumbModel.height);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrl_list() {
        return this.url_list;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.uri;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.url_list;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.width;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.height;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setHeight(Integer num) {
        this.height = num;
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public final void setUrl_list(List<String> list) {
        this.url_list = list;
    }

    public final void setWidth(Integer num) {
        this.width = num;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("AuthorThumbModel(uri=");
        M.append(this.uri);
        M.append(", url_list=");
        M.append(this.url_list);
        M.append(", width=");
        M.append(this.width);
        M.append(", height=");
        M.append(this.height);
        M.append(")");
        return M.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        l.g(parcel, "parcel");
        parcel.writeString(this.uri);
        parcel.writeStringList(this.url_list);
        Integer num = this.width;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.height;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public /* synthetic */ AuthorThumbModel(String str, List list, Integer num, Integer num2, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2);
    }
}

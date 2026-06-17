package com.ss.ugc.effectplatform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class ResourceListModel implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private String icon_uri;
    private String params;
    private List<? extends ResourceListBean> resource_list;
    private List<String> url_prefix;

    @Keep
    public static class ResourceListBean implements AndroidParcelable {
        public static final Parcelable.Creator CREATOR = new a();
        private String name;
        private String resource_uri;
        private String value;

        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                l.g(parcel, "in");
                return new ResourceListBean(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ResourceListBean[i];
            }
        }

        public ResourceListBean() {
            this(null, null, null, 7, null);
        }

        public ResourceListBean(String str, String str2, String str3) {
            this.name = str;
            this.value = str2;
            this.resource_uri = str3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getName() {
            return this.name;
        }

        public String getResource_uri() {
            return this.resource_uri;
        }

        public String getValue() {
            return this.value;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setResource_uri(String str) {
            this.resource_uri = str;
        }

        public void setValue(String str) {
            this.value = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            l.g(parcel, "parcel");
            parcel.writeString(this.name);
            parcel.writeString(this.value);
            parcel.writeString(this.resource_uri);
        }

        public /* synthetic */ ResourceListBean(String str, String str2, String str3, int i, g gVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            l.g(parcel, "in");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((ResourceListBean) parcel.readParcelable(ResourceListModel.class.getClassLoader()));
                readInt--;
            }
            return new ResourceListModel(arrayList, parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ResourceListModel[i];
        }
    }

    public ResourceListModel() {
        this(null, null, null, null, 15, null);
    }

    public ResourceListModel(List<? extends ResourceListBean> list, List<String> list2, String str, String str2) {
        l.g(list, "resource_list");
        l.g(list2, "url_prefix");
        this.resource_list = list;
        this.url_prefix = list2;
        this.icon_uri = str;
        this.params = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getIcon_uri() {
        return this.icon_uri;
    }

    public String getParams() {
        return this.params;
    }

    public List<ResourceListBean> getResource_list() {
        return this.resource_list;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public void setIcon_uri(String str) {
        this.icon_uri = str;
    }

    public void setParams(String str) {
        this.params = str;
    }

    public void setResource_list(List<? extends ResourceListBean> list) {
        l.g(list, "<set-?>");
        this.resource_list = list;
    }

    public void setUrl_prefix(List<String> list) {
        l.g(list, "<set-?>");
        this.url_prefix = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        l.g(parcel, "parcel");
        List<? extends ResourceListBean> list = this.resource_list;
        parcel.writeInt(list.size());
        Iterator<? extends ResourceListBean> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        parcel.writeStringList(this.url_prefix);
        parcel.writeString(this.icon_uri);
        parcel.writeString(this.params);
    }

    public /* synthetic */ ResourceListModel(List list, List list2, String str, String str2, int i, g gVar) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}

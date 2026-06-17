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
public class EffectCategoryResponse implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private List<? extends Effect> collection_effect;
    private String extra;
    private Effect front_effect;
    private String icon_normal_url;
    private String icon_selected_url;
    private String id;
    private boolean is_default;
    private String key;
    private String name;
    private Effect rear_effect;
    private List<String> tags;
    private String tags_update_time;
    private List<? extends Effect> total_effects;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            l.g(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Effect effect = (Effect) parcel.readParcelable(EffectCategoryResponse.class.getClassLoader());
            Effect effect2 = (Effect) parcel.readParcelable(EffectCategoryResponse.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((Effect) parcel.readParcelable(EffectCategoryResponse.class.getClassLoader()));
                readInt--;
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            String readString6 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList2.add((Effect) parcel.readParcelable(EffectCategoryResponse.class.getClassLoader()));
                readInt2--;
            }
            return new EffectCategoryResponse(readString, readString2, readString3, readString4, readString5, effect, effect2, arrayList, createStringArrayList, readString6, arrayList2, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EffectCategoryResponse[i];
        }
    }

    public EffectCategoryResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
    }

    public EffectCategoryResponse(String str, String str2, String str3, String str4, String str5, Effect effect, Effect effect2, List<? extends Effect> list, List<String> list2, String str6, List<? extends Effect> list3, boolean z, String str7) {
        l.g(str, "id");
        l.g(str2, "name");
        l.g(str3, "key");
        l.g(list, "total_effects");
        l.g(list2, "tags");
        l.g(list3, "collection_effect");
        this.id = str;
        this.name = str2;
        this.key = str3;
        this.icon_normal_url = str4;
        this.icon_selected_url = str5;
        this.front_effect = effect;
        this.rear_effect = effect2;
        this.total_effects = list;
        this.tags = list2;
        this.tags_update_time = str6;
        this.collection_effect = list3;
        this.is_default = z;
        this.extra = str7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<Effect> getCollection_effect() {
        return this.collection_effect;
    }

    public String getExtra() {
        return this.extra;
    }

    public Effect getFront_effect() {
        return this.front_effect;
    }

    public String getIcon_normal_url() {
        return this.icon_normal_url;
    }

    public String getIcon_selected_url() {
        return this.icon_selected_url;
    }

    public String getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public Effect getRear_effect() {
        return this.rear_effect;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTags_update_time() {
        return this.tags_update_time;
    }

    public List<Effect> getTotal_effects() {
        return this.total_effects;
    }

    public boolean is_default() {
        return this.is_default;
    }

    public void setCollection_effect(List<? extends Effect> list) {
        l.g(list, "<set-?>");
        this.collection_effect = list;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFront_effect(Effect effect) {
        this.front_effect = effect;
    }

    public void setIcon_normal_url(String str) {
        this.icon_normal_url = str;
    }

    public void setIcon_selected_url(String str) {
        this.icon_selected_url = str;
    }

    public void setId(String str) {
        l.g(str, "<set-?>");
        this.id = str;
    }

    public void setKey(String str) {
        l.g(str, "<set-?>");
        this.key = str;
    }

    public void setName(String str) {
        l.g(str, "<set-?>");
        this.name = str;
    }

    public void setRear_effect(Effect effect) {
        this.rear_effect = effect;
    }

    public void setTags(List<String> list) {
        l.g(list, "<set-?>");
        this.tags = list;
    }

    public void setTags_update_time(String str) {
        this.tags_update_time = str;
    }

    public void setTotal_effects(List<? extends Effect> list) {
        l.g(list, "<set-?>");
        this.total_effects = list;
    }

    public void set_default(boolean z) {
        this.is_default = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        l.g(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.key);
        parcel.writeString(this.icon_normal_url);
        parcel.writeString(this.icon_selected_url);
        parcel.writeParcelable(this.front_effect, i);
        parcel.writeParcelable(this.rear_effect, i);
        List<? extends Effect> list = this.total_effects;
        parcel.writeInt(list.size());
        Iterator<? extends Effect> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        parcel.writeStringList(this.tags);
        parcel.writeString(this.tags_update_time);
        List<? extends Effect> list2 = this.collection_effect;
        parcel.writeInt(list2.size());
        Iterator<? extends Effect> it3 = list2.iterator();
        while (it3.hasNext()) {
            parcel.writeParcelable(it3.next(), i);
        }
        parcel.writeInt(this.is_default ? 1 : 0);
        parcel.writeString(this.extra);
    }

    public /* synthetic */ EffectCategoryResponse(String str, String str2, String str3, String str4, String str5, Effect effect, Effect effect2, List list, List list2, String str6, List list3, boolean z, String str7, int i, g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : effect, (i & 64) != 0 ? null : effect2, (i & 128) != 0 ? new ArrayList() : list, (i & 256) != 0 ? new ArrayList() : list2, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? new ArrayList() : list3, (i & 2048) != 0 ? false : z, (i & 4096) == 0 ? str7 : null);
    }
}

package com.ss.ugc.effectplatform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.s.c.A;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class RankingEffectModel implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private String category_key;
    private String category_name;
    private Integer ranking;
    private UrlModel ranking_url;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            l.g(parcel, "in");
            return new RankingEffectModel(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (UrlModel) parcel.readParcelable(RankingEffectModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RankingEffectModel[i];
        }
    }

    public RankingEffectModel() {
        this(null, null, null, null, 15, null);
    }

    public RankingEffectModel(String str, String str2, Integer num, UrlModel urlModel) {
        this.category_key = str;
        this.category_name = str2;
        this.ranking = num;
        this.ranking_url = urlModel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!l.a(A.b(getClass()), A.b(obj.getClass())))) {
            return false;
        }
        RankingEffectModel rankingEffectModel = (RankingEffectModel) obj;
        return ((l.a(getCategory_key(), rankingEffectModel.getCategory_key()) ^ true) || (l.a(getCategory_name(), rankingEffectModel.getCategory_name()) ^ true) || (l.a(getRanking(), rankingEffectModel.getRanking()) ^ true) || (l.a(getRanking_url(), rankingEffectModel.getRanking_url()) ^ true)) ? false : true;
    }

    public String getCategory_key() {
        return this.category_key;
    }

    public String getCategory_name() {
        return this.category_name;
    }

    public Integer getRanking() {
        return this.ranking;
    }

    public UrlModel getRanking_url() {
        return this.ranking_url;
    }

    public int hashCode() {
        String category_key = getCategory_key();
        int hashCode = (category_key != null ? category_key.hashCode() : 0) * 31;
        String category_name = getCategory_name();
        int hashCode2 = (hashCode + (category_name != null ? category_name.hashCode() : 0)) * 31;
        Integer ranking = getRanking();
        int intValue = (hashCode2 + (ranking != null ? ranking.intValue() : 0)) * 31;
        UrlModel ranking_url = getRanking_url();
        return intValue + (ranking_url != null ? ranking_url.hashCode() : 0);
    }

    public void setCategory_key(String str) {
        this.category_key = str;
    }

    public void setCategory_name(String str) {
        this.category_name = str;
    }

    public void setRanking(Integer num) {
        this.ranking = num;
    }

    public void setRanking_url(UrlModel urlModel) {
        this.ranking_url = urlModel;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        l.g(parcel, "parcel");
        parcel.writeString(this.category_key);
        parcel.writeString(this.category_name);
        Integer num = this.ranking;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeParcelable(this.ranking_url, i);
    }

    public /* synthetic */ RankingEffectModel(String str, String str2, Integer num, UrlModel urlModel, int i, g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? new UrlModel(null, null, null, null, 15, null) : urlModel);
    }
}

package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.AuthorModel;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.InspirationFeedEffectModel;
import com.ss.ugc.effectplatform.model.InspirationModel;
import com.ss.ugc.effectplatform.model.MaterialModel;
import com.ss.ugc.effectplatform.model.UrlModel;
import com.ss.ugc.effectplatform.model.VideoModel;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class InspirationFeedEffectsResponse extends e<List<? extends Effect>> {
    private ArrayList<Effect> effectList;
    private int has_more;
    private List<InspirationFeedEffectModel> inspiration_awemes;
    private String message;
    private int status_code;

    public InspirationFeedEffectsResponse() {
        this(null, null, 0, 0, null, 31, null);
    }

    public /* synthetic */ InspirationFeedEffectsResponse(List list, String str, int i, int i2, ArrayList arrayList, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : list, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : arrayList);
    }

    private final ArrayList<Effect> component5() {
        return this.effectList;
    }

    public static /* synthetic */ InspirationFeedEffectsResponse copy$default(InspirationFeedEffectsResponse inspirationFeedEffectsResponse, List list, String str, int i, int i2, ArrayList arrayList, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = inspirationFeedEffectsResponse.inspiration_awemes;
        }
        if ((i3 & 2) != 0) {
            str = inspirationFeedEffectsResponse.message;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            i = inspirationFeedEffectsResponse.status_code;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = inspirationFeedEffectsResponse.has_more;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            arrayList = inspirationFeedEffectsResponse.effectList;
        }
        return inspirationFeedEffectsResponse.copy(list, str2, i4, i5, arrayList);
    }

    public final List<InspirationFeedEffectModel> component1() {
        return this.inspiration_awemes;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final int component4() {
        return this.has_more;
    }

    public final InspirationFeedEffectsResponse copy(List<InspirationFeedEffectModel> list, String str, int i, int i2, ArrayList<Effect> arrayList) {
        return new InspirationFeedEffectsResponse(list, str, i, i2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InspirationFeedEffectsResponse)) {
            return false;
        }
        InspirationFeedEffectsResponse inspirationFeedEffectsResponse = (InspirationFeedEffectsResponse) obj;
        return l.a(this.inspiration_awemes, inspirationFeedEffectsResponse.inspiration_awemes) && l.a(this.message, inspirationFeedEffectsResponse.message) && this.status_code == inspirationFeedEffectsResponse.status_code && this.has_more == inspirationFeedEffectsResponse.has_more && l.a(this.effectList, inspirationFeedEffectsResponse.effectList);
    }

    public final int getHas_more() {
        return this.has_more;
    }

    public final List<InspirationFeedEffectModel> getInspiration_awemes() {
        return this.inspiration_awemes;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public String getResponseMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public int hashCode() {
        List<InspirationFeedEffectModel> list = this.inspiration_awemes;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.message;
        int hashCode2 = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code) * 31) + this.has_more) * 31;
        ArrayList<Effect> arrayList = this.effectList;
        return hashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setHas_more(int i) {
        this.has_more = i;
    }

    public final void setInspiration_awemes(List<InspirationFeedEffectModel> list) {
        this.inspiration_awemes = list;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("InspirationFeedEffectsResponse(inspiration_awemes=");
        M.append(this.inspiration_awemes);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        M.append(this.status_code);
        M.append(", has_more=");
        M.append(this.has_more);
        M.append(", effectList=");
        M.append(this.effectList);
        M.append(")");
        return M.toString();
    }

    public InspirationFeedEffectsResponse(List<InspirationFeedEffectModel> list, String str, int i, int i2, ArrayList<Effect> arrayList) {
        this.inspiration_awemes = list;
        this.message = str;
        this.status_code = i;
        this.has_more = i2;
        this.effectList = arrayList;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public List<? extends Effect> getResponseData() {
        VideoModel video;
        UrlModel play_addr;
        AuthorModel author;
        AuthorModel author2;
        ArrayList<Effect> arrayList = this.effectList;
        if (!(arrayList == null || arrayList.isEmpty())) {
            return this.effectList;
        }
        this.effectList = new ArrayList<>();
        List<InspirationFeedEffectModel> list = this.inspiration_awemes;
        if (list != null) {
            for (InspirationFeedEffectModel inspirationFeedEffectModel : list) {
                List<MaterialModel> materials = inspirationFeedEffectModel.getMaterials();
                if (materials != null) {
                    for (MaterialModel materialModel : materials) {
                        Effect sticker_data = materialModel.getSticker_data();
                        if (sticker_data != null) {
                            InspirationModel aweme = inspirationFeedEffectModel.getAweme();
                            List<String> list2 = null;
                            sticker_data.setNickname((aweme == null || (author2 = aweme.getAuthor()) == null) ? null : author2.getNickname());
                            InspirationModel aweme2 = inspirationFeedEffectModel.getAweme();
                            sticker_data.setAvatar_thumb((aweme2 == null || (author = aweme2.getAuthor()) == null) ? null : author.getAvatar_thumb());
                            Long use_count = materialModel.getUse_count();
                            sticker_data.setUse_number(use_count != null ? use_count.longValue() : 0L);
                            InspirationModel aweme3 = inspirationFeedEffectModel.getAweme();
                            if (aweme3 != null && (video = aweme3.getVideo()) != null && (play_addr = video.getPlay_addr()) != null) {
                                list2 = play_addr.getUrl_list();
                            }
                            sticker_data.setVideoPlayURLs(list2);
                            ArrayList<Effect> arrayList2 = this.effectList;
                            if (arrayList2 != null) {
                                arrayList2.add(sticker_data);
                            }
                        }
                    }
                }
            }
        }
        return this.effectList;
    }
}

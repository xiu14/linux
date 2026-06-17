package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import e.a.a.a.a;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class InfoStickerListModel {
    private Integer cursor;
    private String extra;
    private Boolean has_more;
    private List<InfoStickerEffect> sticker_list;
    private String subtitle;

    public InfoStickerListModel() {
        this(null, null, null, null, null, 31, null);
    }

    public InfoStickerListModel(String str, Integer num, Boolean bool, List<InfoStickerEffect> list, String str2) {
        this.subtitle = str;
        this.cursor = num;
        this.has_more = bool;
        this.sticker_list = list;
        this.extra = str2;
    }

    public static /* synthetic */ InfoStickerListModel copy$default(InfoStickerListModel infoStickerListModel, String str, Integer num, Boolean bool, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = infoStickerListModel.subtitle;
        }
        if ((i & 2) != 0) {
            num = infoStickerListModel.cursor;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            bool = infoStickerListModel.has_more;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            list = infoStickerListModel.sticker_list;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str2 = infoStickerListModel.extra;
        }
        return infoStickerListModel.copy(str, num2, bool2, list2, str2);
    }

    public final String component1() {
        return this.subtitle;
    }

    public final Integer component2() {
        return this.cursor;
    }

    public final Boolean component3() {
        return this.has_more;
    }

    public final List<InfoStickerEffect> component4() {
        return this.sticker_list;
    }

    public final String component5() {
        return this.extra;
    }

    public final InfoStickerListModel copy(String str, Integer num, Boolean bool, List<InfoStickerEffect> list, String str2) {
        return new InfoStickerListModel(str, num, bool, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoStickerListModel)) {
            return false;
        }
        InfoStickerListModel infoStickerListModel = (InfoStickerListModel) obj;
        return l.a(this.subtitle, infoStickerListModel.subtitle) && l.a(this.cursor, infoStickerListModel.cursor) && l.a(this.has_more, infoStickerListModel.has_more) && l.a(this.sticker_list, infoStickerListModel.sticker_list) && l.a(this.extra, infoStickerListModel.extra);
    }

    public final Integer getCursor() {
        return this.cursor;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final Boolean getHas_more() {
        return this.has_more;
    }

    public final List<InfoStickerEffect> getSticker_list() {
        return this.sticker_list;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        String str = this.subtitle;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.cursor;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.has_more;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        List<InfoStickerEffect> list = this.sticker_list;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.extra;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCursor(Integer num) {
        this.cursor = num;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setHas_more(Boolean bool) {
        this.has_more = bool;
    }

    public final void setSticker_list(List<InfoStickerEffect> list) {
        this.sticker_list = list;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public String toString() {
        StringBuilder M = a.M("InfoStickerListModel(subtitle=");
        M.append(this.subtitle);
        M.append(", cursor=");
        M.append(this.cursor);
        M.append(", has_more=");
        M.append(this.has_more);
        M.append(", sticker_list=");
        M.append(this.sticker_list);
        M.append(", extra=");
        return a.J(M, this.extra, ")");
    }

    public /* synthetic */ InfoStickerListModel(String str, Integer num, Boolean bool, List list, String str2, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str2);
    }
}

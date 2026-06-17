package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import e.a.a.a.a;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class StickerCategoryListModel {
    private StickerUrlStruct icon_url;
    private Long id;
    private String name;
    private Boolean use_recommend;

    public StickerCategoryListModel() {
        this(null, null, null, null, 15, null);
    }

    public StickerCategoryListModel(Long l, String str, StickerUrlStruct stickerUrlStruct, Boolean bool) {
        this.id = l;
        this.name = str;
        this.icon_url = stickerUrlStruct;
        this.use_recommend = bool;
    }

    public static /* synthetic */ StickerCategoryListModel copy$default(StickerCategoryListModel stickerCategoryListModel, Long l, String str, StickerUrlStruct stickerUrlStruct, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            l = stickerCategoryListModel.id;
        }
        if ((i & 2) != 0) {
            str = stickerCategoryListModel.name;
        }
        if ((i & 4) != 0) {
            stickerUrlStruct = stickerCategoryListModel.icon_url;
        }
        if ((i & 8) != 0) {
            bool = stickerCategoryListModel.use_recommend;
        }
        return stickerCategoryListModel.copy(l, str, stickerUrlStruct, bool);
    }

    public final Long component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final StickerUrlStruct component3() {
        return this.icon_url;
    }

    public final Boolean component4() {
        return this.use_recommend;
    }

    public final StickerCategoryListModel copy(Long l, String str, StickerUrlStruct stickerUrlStruct, Boolean bool) {
        return new StickerCategoryListModel(l, str, stickerUrlStruct, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerCategoryListModel)) {
            return false;
        }
        StickerCategoryListModel stickerCategoryListModel = (StickerCategoryListModel) obj;
        return l.a(this.id, stickerCategoryListModel.id) && l.a(this.name, stickerCategoryListModel.name) && l.a(this.icon_url, stickerCategoryListModel.icon_url) && l.a(this.use_recommend, stickerCategoryListModel.use_recommend);
    }

    public final StickerUrlStruct getIcon_url() {
        return this.icon_url;
    }

    public final Long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getUse_recommend() {
        return this.use_recommend;
    }

    public int hashCode() {
        Long l = this.id;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        StickerUrlStruct stickerUrlStruct = this.icon_url;
        int hashCode3 = (hashCode2 + (stickerUrlStruct != null ? stickerUrlStruct.hashCode() : 0)) * 31;
        Boolean bool = this.use_recommend;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setIcon_url(StickerUrlStruct stickerUrlStruct) {
        this.icon_url = stickerUrlStruct;
    }

    public final void setId(Long l) {
        this.id = l;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setUse_recommend(Boolean bool) {
        this.use_recommend = bool;
    }

    public String toString() {
        StringBuilder M = a.M("StickerCategoryListModel(id=");
        M.append(this.id);
        M.append(", name=");
        M.append(this.name);
        M.append(", icon_url=");
        M.append(this.icon_url);
        M.append(", use_recommend=");
        M.append(this.use_recommend);
        M.append(")");
        return M.toString();
    }

    public /* synthetic */ StickerCategoryListModel(Long l, String str, StickerUrlStruct stickerUrlStruct, Boolean bool, int i, g gVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : stickerUrlStruct, (i & 8) != 0 ? null : bool);
    }
}

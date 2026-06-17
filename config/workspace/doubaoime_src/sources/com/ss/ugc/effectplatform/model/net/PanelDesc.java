package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.UrlModel;
import e.a.a.a.a;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class PanelDesc {
    private String extra;
    private UrlModel icon;
    private List<String> tags;
    private String tags_updated_at;
    private String text;

    public PanelDesc() {
        this(null, null, null, null, null, 31, null);
    }

    public PanelDesc(String str, UrlModel urlModel, String str2, String str3, List<String> list) {
        this.text = str;
        this.icon = urlModel;
        this.tags_updated_at = str2;
        this.extra = str3;
        this.tags = list;
    }

    public static /* synthetic */ PanelDesc copy$default(PanelDesc panelDesc, String str, UrlModel urlModel, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = panelDesc.text;
        }
        if ((i & 2) != 0) {
            urlModel = panelDesc.icon;
        }
        UrlModel urlModel2 = urlModel;
        if ((i & 4) != 0) {
            str2 = panelDesc.tags_updated_at;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = panelDesc.extra;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            list = panelDesc.tags;
        }
        return panelDesc.copy(str, urlModel2, str4, str5, list);
    }

    public final String component1() {
        return this.text;
    }

    public final UrlModel component2() {
        return this.icon;
    }

    public final String component3() {
        return this.tags_updated_at;
    }

    public final String component4() {
        return this.extra;
    }

    public final List<String> component5() {
        return this.tags;
    }

    public final PanelDesc copy(String str, UrlModel urlModel, String str2, String str3, List<String> list) {
        return new PanelDesc(str, urlModel, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PanelDesc)) {
            return false;
        }
        PanelDesc panelDesc = (PanelDesc) obj;
        return l.a(this.text, panelDesc.text) && l.a(this.icon, panelDesc.icon) && l.a(this.tags_updated_at, panelDesc.tags_updated_at) && l.a(this.extra, panelDesc.extra) && l.a(this.tags, panelDesc.tags);
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.icon;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str2 = this.tags_updated_at;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.extra;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.tags;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setTags(List<String> list) {
        this.tags = list;
    }

    public final void setTags_updated_at(String str) {
        this.tags_updated_at = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public String toString() {
        StringBuilder M = a.M("PanelDesc(text=");
        M.append(this.text);
        M.append(", icon=");
        M.append(this.icon);
        M.append(", tags_updated_at=");
        M.append(this.tags_updated_at);
        M.append(", extra=");
        M.append(this.extra);
        M.append(", tags=");
        M.append(this.tags);
        M.append(")");
        return M.toString();
    }

    public /* synthetic */ PanelDesc(String str, UrlModel urlModel, String str2, String str3, List list, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : urlModel, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list);
    }
}

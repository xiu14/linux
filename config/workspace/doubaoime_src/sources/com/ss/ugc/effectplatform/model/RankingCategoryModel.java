package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import java.util.Arrays;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class RankingCategoryModel {
    private UrlModel icon;
    private String id;
    private String key;
    private String name;
    private String[] tags;
    private Integer type;

    public RankingCategoryModel(String str, String str2, UrlModel urlModel, String str3, Integer num, String[] strArr) {
        l.g(str, "id");
        l.g(str2, "name");
        l.g(str3, "key");
        this.id = str;
        this.name = str2;
        this.icon = urlModel;
        this.key = str3;
        this.type = num;
        this.tags = strArr;
    }

    public UrlModel getIcon() {
        return this.icon;
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

    public String[] getTags() {
        return this.tags;
    }

    public Integer getType() {
        return this.type;
    }

    public void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
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

    public void setTags(String[] strArr) {
        this.tags = strArr;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public String toString() {
        String str;
        StringBuilder M = e.a.a.a.a.M("RankingCategoryModel(id='");
        M.append(getId());
        M.append("', name='");
        M.append(getName());
        M.append("', icon=");
        M.append(getIcon());
        M.append(", key='");
        M.append(getKey());
        M.append("', type=");
        M.append(getType());
        M.append(", tags=");
        String[] tags = getTags();
        if (tags != null) {
            str = Arrays.toString(tags);
            l.b(str, "java.util.Arrays.toString(this)");
        } else {
            str = null;
        }
        return e.a.a.a.a.G(M, str, ')');
    }

    public /* synthetic */ RankingCategoryModel(String str, String str2, UrlModel urlModel, String str3, Integer num, String[] strArr, int i, g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new UrlModel(null, null, null, null, 15, null) : urlModel, (i & 8) != 0 ? "" : str3, num, (i & 32) != 0 ? null : strArr);
    }
}

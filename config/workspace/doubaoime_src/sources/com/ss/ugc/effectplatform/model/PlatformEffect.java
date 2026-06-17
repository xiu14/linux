package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class PlatformEffect {
    private String file_uri;
    private String hint;
    private String hint_uri;
    private String icon_uri;
    private String name;
    private List<String> requirements;
    private List<String> types;

    public PlatformEffect() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public PlatformEffect(String str, String str2, String str3, String str4, List<String> list, String str5, List<String> list2) {
        l.g(str3, "file_uri");
        l.g(str4, "icon_uri");
        l.g(str5, "hint_uri");
        this.name = str;
        this.hint = str2;
        this.file_uri = str3;
        this.icon_uri = str4;
        this.types = list;
        this.hint_uri = str5;
        this.requirements = list2;
    }

    private final UrlModel concatPrefixWithUri(List<String> list, String str) {
        UrlModel urlModel = new UrlModel(null, null, null, null, 15, null);
        urlModel.setUri(str);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i) + str);
            }
            urlModel.setUrl_list(arrayList);
        }
        return urlModel;
    }

    public static /* synthetic */ PlatformEffect copy$default(PlatformEffect platformEffect, String str, String str2, String str3, String str4, List list, String str5, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = platformEffect.name;
        }
        if ((i & 2) != 0) {
            str2 = platformEffect.hint;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = platformEffect.file_uri;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = platformEffect.icon_uri;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            list = platformEffect.types;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            str5 = platformEffect.hint_uri;
        }
        String str9 = str5;
        if ((i & 64) != 0) {
            list2 = platformEffect.requirements;
        }
        return platformEffect.copy(str, str6, str7, str8, list3, str9, list2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.hint;
    }

    public final String component3() {
        return this.file_uri;
    }

    public final String component4() {
        return this.icon_uri;
    }

    public final List<String> component5() {
        return this.types;
    }

    public final String component6() {
        return this.hint_uri;
    }

    public final List<String> component7() {
        return this.requirements;
    }

    public final PlatformEffect copy(String str, String str2, String str3, String str4, List<String> list, String str5, List<String> list2) {
        l.g(str3, "file_uri");
        l.g(str4, "icon_uri");
        l.g(str5, "hint_uri");
        return new PlatformEffect(str, str2, str3, str4, list, str5, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformEffect)) {
            return false;
        }
        PlatformEffect platformEffect = (PlatformEffect) obj;
        return l.a(this.name, platformEffect.name) && l.a(this.hint, platformEffect.hint) && l.a(this.file_uri, platformEffect.file_uri) && l.a(this.icon_uri, platformEffect.icon_uri) && l.a(this.types, platformEffect.types) && l.a(this.hint_uri, platformEffect.hint_uri) && l.a(this.requirements, platformEffect.requirements);
    }

    public final String getFile_uri() {
        return this.file_uri;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getHint_uri() {
        return this.hint_uri;
    }

    public final String getIcon_uri() {
        return this.icon_uri;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getRequirements() {
        return this.requirements;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.hint;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.file_uri;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.icon_uri;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<String> list = this.types;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str5 = this.hint_uri;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<String> list2 = this.requirements;
        return hashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setFile_uri(String str) {
        l.g(str, "<set-?>");
        this.file_uri = str;
    }

    public final void setHint(String str) {
        this.hint = str;
    }

    public final void setHint_uri(String str) {
        l.g(str, "<set-?>");
        this.hint_uri = str;
    }

    public final void setIcon_uri(String str) {
        l.g(str, "<set-?>");
        this.icon_uri = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRequirements(List<String> list) {
        this.requirements = list;
    }

    public final void setTypes(List<String> list) {
        this.types = list;
    }

    public final Effect toEffect(List<String> list) {
        Effect effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, 0L, -1, -1, 15, null);
        String str = this.name;
        if (str == null) {
            str = "";
        }
        effect.setName(str);
        String str2 = this.hint;
        if (str2 == null) {
            str2 = "";
        }
        effect.setHint(str2);
        effect.setFile_url(concatPrefixWithUri(list, this.file_uri));
        List<String> list2 = this.types;
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        effect.setTypes(list2);
        effect.setHint_icon(concatPrefixWithUri(list, this.hint_uri));
        effect.setIcon_url(concatPrefixWithUri(list, this.icon_uri));
        List<String> list3 = this.requirements;
        if (list3 == null) {
            list3 = new ArrayList<>();
        }
        effect.setRequirements(list3);
        String str3 = this.file_uri;
        effect.setId(str3 != null ? str3 : "");
        return effect;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("PlatformEffect(name=");
        M.append(this.name);
        M.append(", hint=");
        M.append(this.hint);
        M.append(", file_uri=");
        M.append(this.file_uri);
        M.append(", icon_uri=");
        M.append(this.icon_uri);
        M.append(", types=");
        M.append(this.types);
        M.append(", hint_uri=");
        M.append(this.hint_uri);
        M.append(", requirements=");
        M.append(this.requirements);
        M.append(")");
        return M.toString();
    }

    public /* synthetic */ PlatformEffect(String str, String str2, String str3, String str4, List list, String str5, List list2, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? null : list2);
    }
}

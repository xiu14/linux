package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class TagInfo {
    private final String tag;

    public TagInfo(String str) {
        l.g(str, "tag");
        this.tag = str;
    }

    public static /* synthetic */ TagInfo copy$default(TagInfo tagInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tagInfo.tag;
        }
        return tagInfo.copy(str);
    }

    public final String component1() {
        return this.tag;
    }

    public final TagInfo copy(String str) {
        l.g(str, "tag");
        return new TagInfo(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TagInfo) && l.a(this.tag, ((TagInfo) obj).tag);
        }
        return true;
    }

    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        String str = this.tag;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return e.a.a.a.a.J(e.a.a.a.a.M("TagInfo(tag="), this.tag, ")");
    }
}

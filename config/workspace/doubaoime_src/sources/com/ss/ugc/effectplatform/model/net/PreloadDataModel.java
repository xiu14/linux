package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import kotlin.s.c.A;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class PreloadDataModel {
    private final String id;
    private final String md5;

    public PreloadDataModel(String str, String str2) {
        l.g(str, "id");
        l.g(str2, "md5");
        this.id = str;
        this.md5 = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!l.a(A.b(PreloadDataModel.class), A.b(obj.getClass())))) {
            return false;
        }
        PreloadDataModel preloadDataModel = (PreloadDataModel) obj;
        return ((l.a(this.id, preloadDataModel.id) ^ true) || (l.a(this.md5, preloadDataModel.md5) ^ true)) ? false : true;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMd5() {
        return this.md5;
    }

    public int hashCode() {
        return this.md5.hashCode() + (this.id.hashCode() * 31);
    }
}

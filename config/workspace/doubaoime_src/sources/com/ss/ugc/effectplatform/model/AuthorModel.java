package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class AuthorModel {
    private AuthorThumbModel avatar_thumb;
    private String nickname;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthorModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public AuthorModel(String str, AuthorThumbModel authorThumbModel) {
        this.nickname = str;
        this.avatar_thumb = authorThumbModel;
    }

    public static /* synthetic */ AuthorModel copy$default(AuthorModel authorModel, String str, AuthorThumbModel authorThumbModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authorModel.nickname;
        }
        if ((i & 2) != 0) {
            authorThumbModel = authorModel.avatar_thumb;
        }
        return authorModel.copy(str, authorThumbModel);
    }

    public final String component1() {
        return this.nickname;
    }

    public final AuthorThumbModel component2() {
        return this.avatar_thumb;
    }

    public final AuthorModel copy(String str, AuthorThumbModel authorThumbModel) {
        return new AuthorModel(str, authorThumbModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorModel)) {
            return false;
        }
        AuthorModel authorModel = (AuthorModel) obj;
        return l.a(this.nickname, authorModel.nickname) && l.a(this.avatar_thumb, authorModel.avatar_thumb);
    }

    public final AuthorThumbModel getAvatar_thumb() {
        return this.avatar_thumb;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public int hashCode() {
        String str = this.nickname;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        AuthorThumbModel authorThumbModel = this.avatar_thumb;
        return hashCode + (authorThumbModel != null ? authorThumbModel.hashCode() : 0);
    }

    public final void setAvatar_thumb(AuthorThumbModel authorThumbModel) {
        this.avatar_thumb = authorThumbModel;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("AuthorModel(nickname=");
        M.append(this.nickname);
        M.append(", avatar_thumb=");
        M.append(this.avatar_thumb);
        M.append(")");
        return M.toString();
    }

    public /* synthetic */ AuthorModel(String str, AuthorThumbModel authorThumbModel, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : authorThumbModel);
    }
}

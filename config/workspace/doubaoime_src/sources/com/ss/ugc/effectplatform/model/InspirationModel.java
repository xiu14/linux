package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class InspirationModel {
    private AuthorModel author;
    private VideoModel video;

    /* JADX WARN: Multi-variable type inference failed */
    public InspirationModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public InspirationModel(VideoModel videoModel, AuthorModel authorModel) {
        this.video = videoModel;
        this.author = authorModel;
    }

    public static /* synthetic */ InspirationModel copy$default(InspirationModel inspirationModel, VideoModel videoModel, AuthorModel authorModel, int i, Object obj) {
        if ((i & 1) != 0) {
            videoModel = inspirationModel.video;
        }
        if ((i & 2) != 0) {
            authorModel = inspirationModel.author;
        }
        return inspirationModel.copy(videoModel, authorModel);
    }

    public final VideoModel component1() {
        return this.video;
    }

    public final AuthorModel component2() {
        return this.author;
    }

    public final InspirationModel copy(VideoModel videoModel, AuthorModel authorModel) {
        return new InspirationModel(videoModel, authorModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InspirationModel)) {
            return false;
        }
        InspirationModel inspirationModel = (InspirationModel) obj;
        return l.a(this.video, inspirationModel.video) && l.a(this.author, inspirationModel.author);
    }

    public final AuthorModel getAuthor() {
        return this.author;
    }

    public final VideoModel getVideo() {
        return this.video;
    }

    public int hashCode() {
        VideoModel videoModel = this.video;
        int hashCode = (videoModel != null ? videoModel.hashCode() : 0) * 31;
        AuthorModel authorModel = this.author;
        return hashCode + (authorModel != null ? authorModel.hashCode() : 0);
    }

    public final void setAuthor(AuthorModel authorModel) {
        this.author = authorModel;
    }

    public final void setVideo(VideoModel videoModel) {
        this.video = videoModel;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("InspirationModel(video=");
        M.append(this.video);
        M.append(", author=");
        M.append(this.author);
        M.append(")");
        return M.toString();
    }

    public /* synthetic */ InspirationModel(VideoModel videoModel, AuthorModel authorModel, int i, g gVar) {
        this((i & 1) != 0 ? null : videoModel, (i & 2) != 0 ? null : authorModel);
    }
}

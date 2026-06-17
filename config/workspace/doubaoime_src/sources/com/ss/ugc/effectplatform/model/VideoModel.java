package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class VideoModel {
    private UrlModel play_addr;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public VideoModel(UrlModel urlModel) {
        this.play_addr = urlModel;
    }

    public static /* synthetic */ VideoModel copy$default(VideoModel videoModel, UrlModel urlModel, int i, Object obj) {
        if ((i & 1) != 0) {
            urlModel = videoModel.play_addr;
        }
        return videoModel.copy(urlModel);
    }

    public final UrlModel component1() {
        return this.play_addr;
    }

    public final VideoModel copy(UrlModel urlModel) {
        return new VideoModel(urlModel);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof VideoModel) && l.a(this.play_addr, ((VideoModel) obj).play_addr);
        }
        return true;
    }

    public final UrlModel getPlay_addr() {
        return this.play_addr;
    }

    public int hashCode() {
        UrlModel urlModel = this.play_addr;
        if (urlModel != null) {
            return urlModel.hashCode();
        }
        return 0;
    }

    public final void setPlay_addr(UrlModel urlModel) {
        this.play_addr = urlModel;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("VideoModel(play_addr=");
        M.append(this.play_addr);
        M.append(")");
        return M.toString();
    }

    public /* synthetic */ VideoModel(UrlModel urlModel, int i, g gVar) {
        this((i & 1) != 0 ? null : urlModel);
    }
}

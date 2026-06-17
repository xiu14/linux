package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.support.v4.media.c;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes.dex */
class d<T extends c> extends MediaBrowser.SubscriptionCallback {
    protected final T a;

    public d(T t) {
        this.a = t;
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list) {
        this.a.c(str, list);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public void onError(@NonNull String str) {
        this.a.onError(str);
    }
}

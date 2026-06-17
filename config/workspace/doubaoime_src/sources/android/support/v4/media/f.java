package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.e;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes.dex */
class f<T extends e> extends d<T> {
    f(T t) {
        super(t);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list, @NonNull Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((e) this.a).b(str, list, bundle);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public void onError(@NonNull String str, @NonNull Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((e) this.a).a(str, bundle);
    }
}

package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.a;

/* loaded from: classes.dex */
class b<T extends a> extends MediaBrowser.ConnectionCallback {
    protected final T a;

    public b(T t) {
        this.a = t;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnected() {
        MediaBrowserCompat.b.C0002b c0002b = (MediaBrowserCompat.b.C0002b) this.a;
        MediaBrowserCompat.b.a aVar = MediaBrowserCompat.b.this.mConnectionCallbackInternal;
        if (aVar != null) {
            ((MediaBrowserCompat.d) aVar).e();
        }
        MediaBrowserCompat.b.this.onConnected();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnectionFailed() {
        MediaBrowserCompat.b bVar = MediaBrowserCompat.b.this;
        MediaBrowserCompat.b.a aVar = bVar.mConnectionCallbackInternal;
        if (aVar != null) {
        }
        bVar.onConnectionFailed();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnectionSuspended() {
        MediaBrowserCompat.b.C0002b c0002b = (MediaBrowserCompat.b.C0002b) this.a;
        MediaBrowserCompat.b.a aVar = MediaBrowserCompat.b.this.mConnectionCallbackInternal;
        if (aVar != null) {
            ((MediaBrowserCompat.d) aVar).f();
        }
        MediaBrowserCompat.b.this.onConnectionSuspended();
    }
}

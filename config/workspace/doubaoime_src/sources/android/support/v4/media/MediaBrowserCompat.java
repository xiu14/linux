package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.media.MediaBrowserCompatUtils;
import androidx.media.MediaBrowserProtocol;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {
    static final boolean b = Log.isLoggable("MediaBrowserCompat", 3);
    private final c a;

    private static class CustomActionResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        protected void a(int i, Bundle bundle) {
        }
    }

    private static class ItemReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        protected void a(int i, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            if (i != 0) {
                throw null;
            }
            if (bundle == null) {
                throw null;
            }
            if (!bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
            if (parcelable != null && !(parcelable instanceof MediaItem)) {
                throw null;
            }
            throw null;
        }
    }

    private static class SearchResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        protected void a(int i, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            if (i != 0) {
                throw null;
            }
            if (bundle == null) {
                throw null;
            }
            if (!bundle.containsKey(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS)) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS);
            if (parcelableArray == null) {
                throw null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    private static class a extends Handler {
        private final WeakReference<g> a;
        private WeakReference<Messenger> b;

        a(g gVar) {
            this.a = new WeakReference<>(gVar);
        }

        void a(Messenger messenger) {
            this.b = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.b;
            if (weakReference == null || weakReference.get() == null || this.a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.a(data);
            g gVar = this.a.get();
            Messenger messenger = this.b.get();
            try {
                int i = message.what;
                if (i == 1) {
                    Bundle bundle = data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS);
                    MediaSessionCompat.a(bundle);
                    gVar.a(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (MediaSessionCompat.Token) data.getParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN), bundle);
                } else if (i == 2) {
                    gVar.c(messenger);
                } else if (i != 3) {
                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                } else {
                    Bundle bundle2 = data.getBundle(MediaBrowserProtocol.DATA_OPTIONS);
                    MediaSessionCompat.a(bundle2);
                    Bundle bundle3 = data.getBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS);
                    MediaSessionCompat.a(bundle3);
                    gVar.b(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST), bundle2, bundle3);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    gVar.c(messenger);
                }
            }
        }
    }

    public static class b {
        a mConnectionCallbackInternal;
        final Object mConnectionCallbackObj = new android.support.v4.media.b(new C0002b());

        interface a {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b, reason: collision with other inner class name */
        class C0002b implements android.support.v4.media.a {
            C0002b() {
            }
        }

        public void onConnected() {
            throw null;
        }

        public void onConnectionFailed() {
            throw null;
        }

        public void onConnectionSuspended() {
            throw null;
        }

        void setInternalConnectionCallback(a aVar) {
            this.mConnectionCallbackInternal = aVar;
        }
    }

    interface c {
    }

    @RequiresApi(21)
    static class d implements c, g, b.a {
        final Context a;
        protected final Object b;

        /* renamed from: c, reason: collision with root package name */
        protected final Bundle f1183c;

        /* renamed from: d, reason: collision with root package name */
        protected final a f1184d = new a(this);

        /* renamed from: e, reason: collision with root package name */
        private final ArrayMap<String, i> f1185e = new ArrayMap<>();

        /* renamed from: f, reason: collision with root package name */
        protected h f1186f;

        /* renamed from: g, reason: collision with root package name */
        protected Messenger f1187g;
        private MediaSessionCompat.Token h;

        d(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            this.a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.f1183c = bundle2;
            bundle2.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
            bVar.setInternalConnectionCallback(this);
            this.b = new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) bVar.mConnectionCallbackObj, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public void a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public void b(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f1187g != messenger) {
                return;
            }
            i iVar = this.f1185e.get(str);
            if (iVar != null) {
                iVar.a(bundle);
            } else if (MediaBrowserCompat.b) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public void c(Messenger messenger) {
        }

        @NonNull
        public MediaSessionCompat.Token d() {
            if (this.h == null) {
                this.h = MediaSessionCompat.Token.a(((MediaBrowser) this.b).getSessionToken(), null);
            }
            return this.h;
        }

        public void e() {
            Bundle extras = ((MediaBrowser) this.b).getExtras();
            if (extras == null) {
                return;
            }
            extras.getInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
            IBinder binder = BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
            if (binder != null) {
                this.f1186f = new h(binder, this.f1183c);
                Messenger messenger = new Messenger(this.f1184d);
                this.f1187g = messenger;
                this.f1184d.a(messenger);
                try {
                    this.f1186f.a(this.a, this.f1187g);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                }
            }
            android.support.v4.media.session.b d2 = b.a.d(BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_SESSION_BINDER));
            if (d2 != null) {
                this.h = MediaSessionCompat.Token.a(((MediaBrowser) this.b).getSessionToken(), d2);
            }
        }

        public void f() {
            this.f1186f = null;
            this.f1187g = null;
            this.h = null;
            this.f1184d.a(null);
        }
    }

    @RequiresApi(23)
    static class e extends d {
        e(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    @RequiresApi(26)
    static class f extends e {
        f(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    interface g {
        void a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void b(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        void c(Messenger messenger);
    }

    private static class h {
        private Messenger a;
        private Bundle b;

        public h(IBinder iBinder, Bundle bundle) {
            this.a = new Messenger(iBinder);
            this.b = bundle;
        }

        private void b(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.a.send(obtain);
        }

        void a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
            bundle.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, this.b);
            b(6, bundle, messenger);
        }

        void c(Messenger messenger) throws RemoteException {
            b(7, null, messenger);
        }
    }

    private static class i {
        private final List<j> a = new ArrayList();
        private final List<Bundle> b = new ArrayList();

        public j a(Bundle bundle) {
            for (int i = 0; i < this.b.size(); i++) {
                if (MediaBrowserCompatUtils.areSameOptions(this.b.get(i), bundle)) {
                    return this.a.get(i);
                }
            }
            return null;
        }
    }

    public static abstract class j {
        final IBinder a = new Binder();

        private class a implements android.support.v4.media.c {
            a() {
            }

            @Override // android.support.v4.media.c
            public void c(@NonNull String str, List<?> list) {
                Objects.requireNonNull(j.this);
                j jVar = j.this;
                MediaItem.a(list);
                Objects.requireNonNull(jVar);
            }

            @Override // android.support.v4.media.c
            public void onError(@NonNull String str) {
                Objects.requireNonNull(j.this);
            }
        }

        private class b extends a implements android.support.v4.media.e {
            b() {
                super();
            }

            @Override // android.support.v4.media.e
            public void a(@NonNull String str, @NonNull Bundle bundle) {
                Objects.requireNonNull(j.this);
            }

            @Override // android.support.v4.media.e
            public void b(@NonNull String str, List<?> list, @NonNull Bundle bundle) {
                j jVar = j.this;
                MediaItem.a(list);
                Objects.requireNonNull(jVar);
            }
        }

        public j() {
            new android.support.v4.media.f(new b());
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, b bVar, Bundle bundle) {
        this.a = new f(context, componentName, bVar, null);
    }

    public void a() {
        ((MediaBrowser) ((d) this.a).b).connect();
    }

    public void b() {
        Messenger messenger;
        d dVar = (d) this.a;
        h hVar = dVar.f1186f;
        if (hVar != null && (messenger = dVar.f1187g) != null) {
            try {
                hVar.c(messenger);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        ((MediaBrowser) dVar.b).disconnect();
    }

    @NonNull
    public MediaSessionCompat.Token c() {
        return ((d) this.a).d();
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();
        private final int a;
        private final MediaDescriptionCompat b;

        static class a implements Parcelable.Creator<MediaItem> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(@NonNull MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.b())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.a = i;
            this.b = mediaDescriptionCompat;
        }

        public static List<MediaItem> a(List<?> list) {
            MediaItem mediaItem;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj != null) {
                    MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) obj;
                    mediaItem = new MediaItem(MediaDescriptionCompat.a(mediaItem2.getDescription()), mediaItem2.getFlags());
                } else {
                    mediaItem = null;
                }
                arrayList.add(mediaItem);
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder R = e.a.a.a.a.R("MediaItem{", "mFlags=");
            R.append(this.a);
            R.append(", mDescription=");
            R.append(this.b);
            R.append('}');
            return R.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            this.b.writeToParcel(parcel, i);
        }

        MediaItem(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}

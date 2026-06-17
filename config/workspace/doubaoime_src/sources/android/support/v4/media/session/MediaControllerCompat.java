package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.app.BundleCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class MediaControllerCompat {
    private final b a;

    @RequiresApi(21)
    static class MediaControllerImplApi21 implements b {
        protected final Object a;
        final Object b = new Object();

        /* renamed from: c, reason: collision with root package name */
        @GuardedBy("mLock")
        private final List<a> f1199c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private HashMap<a, a> f1200d = new HashMap<>();

        /* renamed from: e, reason: collision with root package name */
        final MediaSessionCompat.Token f1201e;

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference<MediaControllerImplApi21> a;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.a = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.a.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.b) {
                    mediaControllerImplApi21.f1201e.e(b.a.d(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    MediaSessionCompat.Token token = mediaControllerImplApi21.f1201e;
                    bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
                    Objects.requireNonNull(token);
                    mediaControllerImplApi21.a();
                }
            }
        }

        private static class a extends a.b {
            a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.b, android.support.v4.media.session.a
            public void B(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.b, android.support.v4.media.session.a
            public void C() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.b, android.support.v4.media.session.a
            public void F(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.b, android.support.v4.media.session.a
            public void m0(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.b, android.support.v4.media.session.a
            public void n(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.b, android.support.v4.media.session.a
            public void q(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) throws RemoteException {
            this.f1201e = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) token.c());
            this.a = mediaController;
            if (token.b() == null) {
                mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
            }
        }

        @GuardedBy("mLock")
        void a() {
            if (this.f1201e.b() == null) {
                return;
            }
            for (a aVar : this.f1199c) {
                a aVar2 = new a(aVar);
                this.f1200d.put(aVar, aVar2);
                aVar.a = aVar2;
                try {
                    this.f1201e.b().i(aVar2);
                } catch (RemoteException e2) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
                }
            }
            this.f1199c.clear();
        }
    }

    public static abstract class a implements IBinder.DeathRecipient {
        android.support.v4.media.session.a a;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a, reason: collision with other inner class name */
        static class C0003a implements android.support.v4.media.session.c {
            private final WeakReference<a> a;

            C0003a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            public void a(int i, int i2, int i3, int i4, int i5) {
                this.a.get();
            }

            public void b(Bundle bundle) {
                this.a.get();
            }

            public void c(Object obj) {
                if (this.a.get() != null) {
                    MediaMetadataCompat.a(obj);
                }
            }

            public void d(Object obj) {
                a aVar = this.a.get();
                if (aVar == null || aVar.a != null) {
                    return;
                }
                PlaybackStateCompat.a(obj);
            }

            public void e(List<?> list) {
                if (this.a.get() != null) {
                    MediaSessionCompat.QueueItem.a(list);
                }
            }

            public void f(CharSequence charSequence) {
                this.a.get();
            }

            public void g() {
                this.a.get();
            }

            public void h(String str, Bundle bundle) {
                a aVar = this.a.get();
                if (aVar != null) {
                    android.support.v4.media.session.a aVar2 = aVar.a;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        static class b extends a.AbstractBinderC0004a {
            private final WeakReference<a> a;

            b(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            public void B(CharSequence charSequence) throws RemoteException {
                this.a.get();
            }

            public void C() throws RemoteException {
                this.a.get();
            }

            public void F(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                this.a.get();
            }

            public void d(boolean z) throws RemoteException {
                this.a.get();
            }

            public void h(String str, Bundle bundle) throws RemoteException {
                this.a.get();
            }

            public void l(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                this.a.get();
            }

            public void m0(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                this.a.get();
            }

            public void n(Bundle bundle) throws RemoteException {
                this.a.get();
            }

            public void o(int i) throws RemoteException {
                this.a.get();
            }

            public void p() throws RemoteException {
                this.a.get();
            }

            public void q(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                this.a.get();
            }

            public void r(int i) throws RemoteException {
                this.a.get();
            }
        }

        public a() {
            new android.support.v4.media.session.d(new C0003a(this));
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
        }
    }

    interface b {
    }

    @RequiresApi(23)
    static class c extends MediaControllerImplApi21 {
        public c(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }
    }

    @RequiresApi(24)
    static class d extends c {
        public d(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat.Token token) throws RemoteException {
        new HashSet();
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.a = new d(context, token);
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return ((MediaController) ((MediaControllerImplApi21) this.a).a).dispatchMediaButtonEvent(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }
}

package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
    private final String a;
    private final CharSequence b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence f1188c;

    /* renamed from: d, reason: collision with root package name */
    private final CharSequence f1189d;

    /* renamed from: e, reason: collision with root package name */
    private final Bitmap f1190e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f1191f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f1192g;
    private final Uri h;
    private Object i;

    static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public static final class b {
        private String a;
        private CharSequence b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f1193c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f1194d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f1195e;

        /* renamed from: f, reason: collision with root package name */
        private Uri f1196f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f1197g;
        private Uri h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.a, this.b, this.f1193c, this.f1194d, this.f1195e, this.f1196f, this.f1197g, this.h);
        }

        public b b(@Nullable CharSequence charSequence) {
            this.f1194d = charSequence;
            return this;
        }

        public b c(@Nullable Bundle bundle) {
            this.f1197g = bundle;
            return this;
        }

        public b d(@Nullable Bitmap bitmap) {
            this.f1195e = bitmap;
            return this;
        }

        public b e(@Nullable Uri uri) {
            this.f1196f = uri;
            return this;
        }

        public b f(@Nullable String str) {
            this.a = str;
            return this;
        }

        public b g(@Nullable Uri uri) {
            this.h = uri;
            return this;
        }

        public b h(@Nullable CharSequence charSequence) {
            this.f1193c = charSequence;
            return this;
        }

        public b i(@Nullable CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.f1188c = charSequence2;
        this.f1189d = charSequence3;
        this.f1190e = bitmap;
        this.f1191f = uri;
        this.f1192g = bundle;
        this.h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L77
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            r2 = r9
            android.media.MediaDescription r2 = (android.media.MediaDescription) r2
            java.lang.String r3 = r2.getMediaId()
            r1.f(r3)
            java.lang.CharSequence r3 = r2.getTitle()
            r1.i(r3)
            java.lang.CharSequence r3 = r2.getSubtitle()
            r1.h(r3)
            java.lang.CharSequence r3 = r2.getDescription()
            r1.b(r3)
            android.graphics.Bitmap r3 = r2.getIconBitmap()
            r1.d(r3)
            android.net.Uri r3 = r2.getIconUri()
            r1.e(r3)
            android.os.Bundle r3 = r2.getExtras()
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L47
            android.support.v4.media.session.MediaSessionCompat.a(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L48
        L47:
            r5 = r0
        L48:
            if (r5 == 0) goto L60
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L5a
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L5a
            goto L61
        L5a:
            r3.remove(r4)
            r3.remove(r6)
        L60:
            r0 = r3
        L61:
            r1.c(r0)
            if (r5 == 0) goto L6a
            r1.g(r5)
            goto L71
        L6a:
            android.net.Uri r0 = r2.getMediaUri()
            r1.g(r0)
        L71:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.a()
            r0.i = r9
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Nullable
    public String b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.b) + ", " + ((Object) this.f1188c) + ", " + ((Object) this.f1189d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object obj = this.i;
        if (obj == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.a);
            builder.setTitle(this.b);
            builder.setSubtitle(this.f1188c);
            builder.setDescription(this.f1189d);
            builder.setIconBitmap(this.f1190e);
            builder.setIconUri(this.f1191f);
            builder.setExtras(this.f1192g);
            builder.setMediaUri(this.h);
            obj = builder.build();
            this.i = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }
}

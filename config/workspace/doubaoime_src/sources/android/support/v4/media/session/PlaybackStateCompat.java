package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    final int a;
    final long b;

    /* renamed from: c, reason: collision with root package name */
    final long f1206c;

    /* renamed from: d, reason: collision with root package name */
    final float f1207d;

    /* renamed from: e, reason: collision with root package name */
    final long f1208e;

    /* renamed from: f, reason: collision with root package name */
    final int f1209f;

    /* renamed from: g, reason: collision with root package name */
    final CharSequence f1210g;
    final long h;
    List<CustomAction> i;
    final long j;
    final Bundle k;
    private Object l;

    static class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f2, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.a = i;
        this.b = j;
        this.f1206c = j2;
        this.f1207d = f2;
        this.f1208e = j3;
        this.f1209f = i2;
        this.f1210g = charSequence;
        this.h = j4;
        this.i = new ArrayList(list);
        this.j = j5;
        this.k = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            arrayList = new ArrayList(customActions.size());
            Iterator<PlaybackState.CustomAction> it2 = customActions.iterator();
            while (it2.hasNext()) {
                arrayList.add(CustomAction.a(it2.next()));
            }
        }
        Bundle extras = playbackState.getExtras();
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), extras);
        playbackStateCompat.l = obj;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder R = e.a.a.a.a.R("PlaybackState {", "state=");
        R.append(this.a);
        R.append(", position=");
        R.append(this.b);
        R.append(", buffered position=");
        R.append(this.f1206c);
        R.append(", speed=");
        R.append(this.f1207d);
        R.append(", updated=");
        R.append(this.h);
        R.append(", actions=");
        R.append(this.f1208e);
        R.append(", error code=");
        R.append(this.f1209f);
        R.append(", error message=");
        R.append(this.f1210g);
        R.append(", custom actions=");
        R.append(this.i);
        R.append(", active item id=");
        return e.a.a.a.a.F(R, this.j, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        parcel.writeFloat(this.f1207d);
        parcel.writeLong(this.h);
        parcel.writeLong(this.f1206c);
        parcel.writeLong(this.f1208e);
        TextUtils.writeToParcel(this.f1210g, parcel, i);
        parcel.writeTypedList(this.i);
        parcel.writeLong(this.j);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.f1209f);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        private final String a;
        private final CharSequence b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1211c;

        /* renamed from: d, reason: collision with root package name */
        private final Bundle f1212d;

        /* renamed from: e, reason: collision with root package name */
        private Object f1213e;

        static class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.a = str;
            this.b = charSequence;
            this.f1211c = i;
            this.f1212d = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), customAction.getExtras());
            customAction2.f1213e = obj;
            return customAction2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("Action:mName='");
            M.append((Object) this.b);
            M.append(", mIcon=");
            M.append(this.f1211c);
            M.append(", mExtras=");
            M.append(this.f1212d);
            return M.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            TextUtils.writeToParcel(this.b, parcel, i);
            parcel.writeInt(this.f1211c);
            parcel.writeBundle(this.f1212d);
        }

        CustomAction(Parcel parcel) {
            this.a = parcel.readString();
            this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1211c = parcel.readInt();
            this.f1212d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readLong();
        this.f1207d = parcel.readFloat();
        this.h = parcel.readLong();
        this.f1206c = parcel.readLong();
        this.f1208e = parcel.readLong();
        this.f1210g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.j = parcel.readLong();
        this.k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f1209f = parcel.readInt();
    }
}

package com.obric.oui.calendar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes2.dex */
public final class CalendarDay implements Parcelable {
    public static final Parcelable.Creator<CalendarDay> CREATOR = new a();

    @NonNull
    private final org.threeten.bp.e a;

    class a implements Parcelable.Creator<CalendarDay> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public CalendarDay createFromParcel(Parcel parcel) {
            return new CalendarDay(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public CalendarDay[] newArray(int i) {
            return new CalendarDay[i];
        }
    }

    private CalendarDay(int i, int i2, int i3) {
        this.a = org.threeten.bp.e.H(i, i2, i3);
    }

    @NonNull
    public static CalendarDay a(int i, int i2, int i3) {
        return new CalendarDay(i, i2, i3);
    }

    public static CalendarDay b(@Nullable org.threeten.bp.e eVar) {
        if (eVar == null) {
            return null;
        }
        return new CalendarDay(eVar);
    }

    @NonNull
    public static CalendarDay m() {
        return b(org.threeten.bp.e.G());
    }

    @NonNull
    public org.threeten.bp.e c() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.a.t();
    }

    public boolean equals(Object obj) {
        return (obj instanceof CalendarDay) && this.a.equals(((CalendarDay) obj).a);
    }

    public int f() {
        return this.a.w();
    }

    public int g() {
        return this.a.y();
    }

    public int hashCode() {
        int y = this.a.y();
        return (this.a.w() * 100) + (y * 10000) + this.a.t();
    }

    public boolean i(@NonNull CalendarDay calendarDay) {
        return this.a.z(calendarDay.a);
    }

    public boolean j(@NonNull CalendarDay calendarDay) {
        return this.a.A(calendarDay.a);
    }

    public boolean k(@Nullable CalendarDay calendarDay, @Nullable CalendarDay calendarDay2) {
        return (calendarDay == null || !calendarDay.a.z(this.a)) && (calendarDay2 == null || !calendarDay2.a.A(this.a));
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CalendarDay{");
        M.append(this.a.y());
        M.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        M.append(this.a.w());
        M.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        M.append(this.a.t());
        M.append("}");
        return M.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.y());
        parcel.writeInt(this.a.w());
        parcel.writeInt(this.a.t());
    }

    private CalendarDay(@NonNull org.threeten.bp.e eVar) {
        this.a = eVar;
    }

    public CalendarDay(Parcel parcel) {
        this.a = org.threeten.bp.e.H(parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}

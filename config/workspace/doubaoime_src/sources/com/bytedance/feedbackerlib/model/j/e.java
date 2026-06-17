package com.bytedance.feedbackerlib.model.j;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class e {

    @SerializedName("username")
    public final String a;

    @SerializedName(NotificationCompat.CATEGORY_EMAIL)
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("avatar_url")
    public final String f4955c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("employee_id")
    public final int f4956d;

    @NonNull
    public String toString() {
        StringBuilder M = e.a.a.a.a.M("username: ");
        M.append(this.a);
        M.append(", useremail: ");
        M.append(this.b);
        M.append(", useravatarurl: ");
        M.append(this.f4955c);
        M.append(", employeeId: ");
        M.append(this.f4956d);
        return M.toString();
    }
}

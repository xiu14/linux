package e.b.m.a.a;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class e implements Serializable {

    @SerializedName("a")
    private List<e> a;

    @SerializedName("c1")
    private long b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("c2")
    private boolean f9684c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("c3")
    private boolean f9685d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("c4")
    private boolean f9686e;

    /* renamed from: f, reason: collision with root package name */
    @SerializedName("c5")
    private long f9687f;

    /* renamed from: g, reason: collision with root package name */
    @SerializedName("c6")
    private String f9688g;

    @SerializedName("c7")
    private String h;

    @SerializedName("c8")
    private String i;

    @SerializedName("c9")
    private boolean j;

    @SerializedName("ca")
    private boolean k;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return com.bytedance.feedbackerlib.a.t(this.h, ((e) obj).h);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.h});
    }
}

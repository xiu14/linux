package e.b.m.a.a;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class c implements Serializable {

    @SerializedName("cj")
    private List<f> a;

    @SerializedName("ck")
    private List<Object> b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("cl")
    private String f9675c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("af")
    private String f9676d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("ag")
    private String f9677e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return com.bytedance.feedbackerlib.a.t(this.f9676d, ((c) obj).f9676d);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9676d});
    }
}

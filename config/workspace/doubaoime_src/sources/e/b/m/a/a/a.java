package e.b.m.a.a;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class a implements Serializable {

    @SerializedName("cz")
    private String a;

    @SerializedName("d0")
    private int b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("ad")
    private String f9673c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("dh")
    private boolean f9674d;

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("JumpInfo{mFileName='");
        e.a.a.a.a.G0(M, this.a, '\'', ", mLineCount=");
        M.append(this.b);
        M.append(", mId='");
        return e.a.a.a.a.H(M, this.f9673c, '\'', '}');
    }
}

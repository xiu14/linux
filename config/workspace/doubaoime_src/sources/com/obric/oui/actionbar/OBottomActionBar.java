package com.obric.oui.actionbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.button.OButton;
import com.obric.oui.divider.ODivider;
import e.i.b.c.b.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class OBottomActionBar extends FrameLayout {
    private final String a;
    private View b;

    /* renamed from: c, reason: collision with root package name */
    private final LinearLayout f7605c;

    /* renamed from: d, reason: collision with root package name */
    private final ODivider f7606d;

    /* renamed from: e, reason: collision with root package name */
    private b f7607e;

    /* renamed from: f, reason: collision with root package name */
    private List<OButton> f7608f;

    public static final class a {
        private final boolean a;
        private final boolean b;

        /* renamed from: c, reason: collision with root package name */
        private final String f7609c;

        /* renamed from: d, reason: collision with root package name */
        private final List<String> f7610d;

        /* renamed from: e, reason: collision with root package name */
        private final List<Integer> f7611e;

        public a(boolean z, boolean z2, String str, List<String> list, List<Integer> list2) {
            l.f(str, "buttonStyle");
            this.a = z;
            this.b = z2;
            this.f7609c = str;
            this.f7610d = list;
            this.f7611e = list2;
        }

        public final List<Integer> a() {
            return this.f7611e;
        }

        public final String b() {
            return this.f7609c;
        }

        public final List<String> c() {
            return this.f7610d;
        }

        public final boolean d() {
            return this.a;
        }

        public final boolean e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && l.a(this.f7609c, aVar.f7609c) && l.a(this.f7610d, aVar.f7610d) && l.a(this.f7611e, aVar.f7611e);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        public int hashCode() {
            boolean z = this.a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            boolean z2 = this.b;
            int i2 = (i + (z2 ? 1 : z2 ? 1 : 0)) * 31;
            String str = this.f7609c;
            int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
            List<String> list = this.f7610d;
            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            List<Integer> list2 = this.f7611e;
            return hashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("OBABConfig(hasDivider=");
            M.append(this.a);
            M.append(", lastPrimary=");
            M.append(this.b);
            M.append(", buttonStyle=");
            M.append(this.f7609c);
            M.append(", buttonTexts=");
            M.append(this.f7610d);
            M.append(", buttonImgIds=");
            M.append(this.f7611e);
            M.append(")");
            return M.toString();
        }
    }

    public interface b {
        void a(View view, int i);
    }

    public OBottomActionBar(Context context) {
        this(context, null);
    }

    public static final void a(OBottomActionBar oBottomActionBar, View view, int i) {
        b bVar = oBottomActionBar.f7607e;
        if (bVar != null) {
            bVar.a(view, i);
        }
    }

    private final void b(a aVar) {
        int i;
        int i2;
        String b2 = aVar.b();
        int hashCode = b2.hashCode();
        OButton oButton = null;
        if (hashCode != -1612256902) {
            if (hashCode != 3397) {
                if (hashCode != 104387) {
                    if (hashCode != 678742426) {
                        if (hashCode != 3428) {
                            if (hashCode == 3429 && b2.equals("m2")) {
                                this.b = FrameLayout.inflate(getContext(), C0838R.layout.o_widget_bottom_action_bar_m2, null);
                                this.f7605c.addView(this.b, new LinearLayout.LayoutParams(-1, -1));
                                View findViewById = findViewById(C0838R.id.action_button_m20);
                                l.e(findViewById, "findViewById(R.id.action_button_m20)");
                                View findViewById2 = findViewById(C0838R.id.action_button_m21);
                                l.e(findViewById2, "findViewById(R.id.action_button_m21)");
                                View findViewById3 = findViewById(C0838R.id.action_button_m22);
                                l.e(findViewById3, "findViewById(R.id.action_button_m22)");
                                this.f7608f = g.K((OButton) findViewById, (OButton) findViewById2, (OButton) findViewById3);
                            }
                        } else if (b2.equals("m1")) {
                            this.b = FrameLayout.inflate(getContext(), C0838R.layout.o_widget_bottom_action_bar_m1, null);
                            this.f7605c.addView(this.b, new LinearLayout.LayoutParams(-1, -1));
                            View findViewById4 = findViewById(C0838R.id.action_button_0);
                            l.e(findViewById4, "findViewById(R.id.action_button_0)");
                            View findViewById5 = findViewById(C0838R.id.action_button_1);
                            l.e(findViewById5, "findViewById(R.id.action_button_1)");
                            View findViewById6 = findViewById(C0838R.id.action_button_2);
                            l.e(findViewById6, "findViewById(R.id.action_button_2)");
                            View findViewById7 = findViewById(C0838R.id.action_button_3);
                            l.e(findViewById7, "findViewById(R.id.action_button_3)");
                            View findViewById8 = findViewById(C0838R.id.action_button_4);
                            l.e(findViewById8, "findViewById(R.id.action_button_4)");
                            this.f7608f = g.K((OButton) findViewById4, (OButton) findViewById5, (OButton) findViewById6, (OButton) findViewById7, (OButton) findViewById8);
                        }
                    } else if (b2.equals("m2-primary")) {
                        this.b = FrameLayout.inflate(getContext(), C0838R.layout.o_widget_bottom_action_bar_m2_primary, null);
                        this.f7605c.addView(this.b, new LinearLayout.LayoutParams(-1, -1));
                        View findViewById9 = findViewById(C0838R.id.action_button_m2_primary0);
                        l.e(findViewById9, "findViewById(R.id.action_button_m2_primary0)");
                        View findViewById10 = findViewById(C0838R.id.action_button_m2_primary1);
                        l.e(findViewById10, "findViewById(R.id.action_button_m2_primary1)");
                        this.f7608f = g.K((OButton) findViewById9, (OButton) findViewById10);
                    }
                } else if (b2.equals("img")) {
                    this.b = FrameLayout.inflate(getContext(), C0838R.layout.o_widget_bottom_action_bar_img, null);
                    this.f7605c.addView(this.b, new LinearLayout.LayoutParams(-1, -1));
                    View findViewById11 = findViewById(C0838R.id.action_button_0);
                    l.e(findViewById11, "findViewById(R.id.action_button_0)");
                    View findViewById12 = findViewById(C0838R.id.action_button_1);
                    l.e(findViewById12, "findViewById(R.id.action_button_1)");
                    View findViewById13 = findViewById(C0838R.id.action_button_2);
                    l.e(findViewById13, "findViewById(R.id.action_button_2)");
                    View findViewById14 = findViewById(C0838R.id.action_button_3);
                    l.e(findViewById14, "findViewById(R.id.action_button_3)");
                    View findViewById15 = findViewById(C0838R.id.action_button_4);
                    l.e(findViewById15, "findViewById(R.id.action_button_4)");
                    View findViewById16 = findViewById(C0838R.id.action_button_5);
                    l.e(findViewById16, "findViewById(R.id.action_button_5)");
                    this.f7608f = g.K((OButton) findViewById11, (OButton) findViewById12, (OButton) findViewById13, (OButton) findViewById14, (OButton) findViewById15, (OButton) findViewById16);
                }
            } else if (b2.equals("l1")) {
                this.b = FrameLayout.inflate(getContext(), C0838R.layout.o_widget_bottom_action_bar_l1, null);
                this.f7605c.addView(this.b, new LinearLayout.LayoutParams(-1, -1));
                View findViewById17 = findViewById(C0838R.id.action_button_L10);
                l.e(findViewById17, "findViewById(R.id.action_button_L10)");
                View findViewById18 = findViewById(C0838R.id.action_button_L11);
                l.e(findViewById18, "findViewById(R.id.action_button_L11)");
                this.f7608f = g.K((OButton) findViewById17, (OButton) findViewById18);
            }
        } else if (b2.equals("l1-primary")) {
            this.b = FrameLayout.inflate(getContext(), C0838R.layout.o_widget_bottom_action_bar_l1_primary, null);
            this.f7605c.addView(this.b, new LinearLayout.LayoutParams(-1, -1));
            View findViewById19 = findViewById(C0838R.id.action_button_L1_primary);
            l.e(findViewById19, "findViewById(R.id.action_button_L1_primary)");
            this.f7608f = g.K((OButton) findViewById19);
        }
        if (aVar.b().compareTo("img") == 0) {
            List<OButton> list = this.f7608f;
            if (list != null) {
                if (aVar.a() != null) {
                    int min = Math.min(aVar.a().size(), list.size());
                    if (aVar.a().size() > list.size()) {
                        String str = this.a;
                        StringBuilder M = e.a.a.a.a.M("Exceeded the maximum number of buttons Max is ");
                        M.append(list.size());
                        Log.e(str, M.toString());
                    }
                    i2 = min - 1;
                    for (int i3 = 0; i3 < min; i3++) {
                        list.get(i3).setVisibility(0);
                        list.get(i3).setButtonSourceBitmap(aVar.a().get(i3).intValue());
                    }
                } else {
                    i2 = -1;
                }
                if (i2 == -1) {
                    i2 = list.size() - 1;
                }
                if (i2 >= 0) {
                    int i4 = 0;
                    while (true) {
                        list.get(i4).setOnClickListener(new com.obric.oui.actionbar.a(this, i4));
                        if (i4 == i2) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
        } else {
            List<OButton> list2 = this.f7608f;
            if (list2 != null) {
                if (aVar.c() != null) {
                    int min2 = Math.min(aVar.c().size(), list2.size());
                    if (aVar.c().size() > list2.size()) {
                        String str2 = this.a;
                        StringBuilder M2 = e.a.a.a.a.M("Exceeded the maximum number of buttons Max is ");
                        M2.append(list2.size());
                        Log.e(str2, M2.toString());
                    }
                    i = min2 - 1;
                    for (int i5 = 0; i5 < min2; i5++) {
                        list2.get(i5).setVisibility(0);
                        list2.get(i5).setText(aVar.c().get(i5));
                    }
                } else {
                    i = -1;
                }
                if (i == -1) {
                    i = list2.size() - 1;
                }
                if (aVar.e()) {
                    list2.get(i).setBackgroundColor(getResources().getColor(C0838R.color.oui_accent_bg_high_contrast));
                    list2.get(i).setTextColor(getResources().getColor(C0838R.color.oui_on_accent_default));
                    OButton oButton2 = list2.get(i);
                    if (oButton2 != null && (oButton2 instanceof e)) {
                        oButton = oButton2;
                    }
                    OButton oButton3 = oButton;
                    if (oButton3 != null) {
                        oButton3.b(this.a);
                    }
                }
                if (i >= 0) {
                    int i6 = 0;
                    while (true) {
                        list2.get(i6).setOnClickListener(new com.obric.oui.actionbar.b(this, i6));
                        if (i6 == i) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
            }
        }
        if (aVar.d()) {
            this.f7606d.setVisibility(0);
        } else {
            this.f7606d.setVisibility(8);
        }
    }

    public final void c(boolean z, String str, boolean z2, String[] strArr, Integer[] numArr) {
        l.f(str, "buttonStyle");
        View view = this.b;
        if (view != null) {
            this.f7605c.removeView(view);
            this.b = null;
        }
        b(new a(z, z2, str, g.l0(strArr), null));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void setBottomButtonClickListener(b bVar) {
        this.f7607e = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OBottomActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        List l0;
        List list;
        l.f(context, "context");
        this.a = "OBottomActionBar";
        FrameLayout.inflate(context, C0838R.layout.o_widget_bottom_action_bar, this);
        setBackgroundColor(ContextCompat.getColor(context, C0838R.color.Transparent));
        View findViewById = findViewById(C0838R.id.root_layout);
        l.e(findViewById, "findViewById(R.id.root_layout)");
        this.f7605c = (LinearLayout) findViewById;
        View findViewById2 = findViewById(C0838R.id.top_divider);
        l.e(findViewById2, "findViewById(R.id.top_divider)");
        this.f7606d = (ODivider) findViewById2;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, e.i.a.b.b.f9965d, 0, 0);
        boolean z = obtainStyledAttributes.getBoolean(4, true);
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        String string = obtainStyledAttributes.getString(2);
        int resourceId = obtainStyledAttributes.getResourceId(3, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId == -1) {
            l0 = null;
        } else {
            String[] stringArray = obtainStyledAttributes.getResources().getStringArray(resourceId);
            l.e(stringArray, "resources.getStringArray(buttonResourceId)");
            l0 = g.l0(stringArray);
        }
        if (resourceId2 == -1) {
            list = null;
        } else {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId2);
            l.e(obtainTypedArray, "resources.obtainTypedArray(buttonImg)");
            ArrayList arrayList = new ArrayList();
            int length = obtainTypedArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(Integer.valueOf(obtainTypedArray.getResourceId(i, -1)));
            }
            List k0 = g.k0(arrayList);
            obtainTypedArray.recycle();
            list = k0;
        }
        b(new a(z, z2, string != null ? string : "l1", l0, list));
    }
}

package com.bytedance.android.input.keyboard.CustomToolbar;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.OptionItemView;
import com.bytedance.android.input.keyboard.KeyboardView;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.message.log.PushLog;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.h;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ToolbarPagerAdapter extends RecyclerView.Adapter<PageViewHolder> {
    private final List<a> a;
    private final List<a> b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Boolean> f2502c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    private boolean f2503d;

    public static final class PageViewHolder extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PageViewHolder(View view) {
            super(view);
            l.f(view, "itemView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        private final String a;
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2504c;

        /* renamed from: d, reason: collision with root package name */
        private final int f2505d;

        /* renamed from: e, reason: collision with root package name */
        private final int f2506e;

        public a(String str, String str2, int i, int i2, int i3) {
            l.f(str, "key");
            l.f(str2, PushLog.KEY_LABEL);
            this.a = str;
            this.b = str2;
            this.f2504c = i;
            this.f2505d = i2;
            this.f2506e = i3;
        }

        public final int a() {
            return this.f2504c;
        }

        public final int b() {
            return this.f2505d;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final int e() {
            return this.f2506e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.a, aVar.a) && l.a(this.b, aVar.b) && this.f2504c == aVar.f2504c && this.f2505d == aVar.f2505d && this.f2506e == aVar.f2506e;
        }

        public int hashCode() {
            return Integer.hashCode(this.f2506e) + e.a.a.a.a.I(this.f2505d, e.a.a.a.a.I(this.f2504c, e.a.a.a.a.p0(this.b, this.a.hashCode() * 31, 31), 31), 31);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("ItemData(key=");
            M.append(this.a);
            M.append(", label=");
            M.append(this.b);
            M.append(", iconRes=");
            M.append(this.f2504c);
            M.append(", iconUnselectedRes=");
            M.append(this.f2505d);
            M.append(", viewId=");
            return e.a.a.a.a.C(M, this.f2506e, ')');
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0028 A[Catch: JSONException -> 0x0023, TryCatch #0 {JSONException -> 0x0023, blocks: (B:18:0x0016, B:5:0x0028, B:7:0x0047), top: B:17:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ToolbarPagerAdapter(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.CustomToolbar.ToolbarPagerAdapter.<init>(java.lang.String):void");
    }

    private static final void c(View view, int i, int i2) {
        View findViewById = view.findViewById(i2);
        if (findViewById == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams instanceof GridLayout.LayoutParams) {
            ((GridLayout.LayoutParams) layoutParams).topMargin = i;
            findViewById.setLayoutParams(layoutParams);
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i;
            findViewById.setLayoutParams(layoutParams);
        }
    }

    private static final int d(DisplayMetrics displayMetrics, float f2) {
        return (int) (f2 * displayMetrics.density);
    }

    public final float b() {
        float stretchScale = KeyboardView.getStretchScale();
        return stretchScale < 1.0f ? stretchScale - 0.05f : stretchScale;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? C0838R.layout.layout_custom_toolbar_page : C0838R.layout.layout_custom_toolbar_page2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(PageViewHolder pageViewHolder, int i) {
        Object J2;
        GridLayout gridLayout;
        PageViewHolder pageViewHolder2 = pageViewHolder;
        l.f(pageViewHolder2, "holder");
        List<a> list = i == 0 ? this.a : this.b;
        View view = pageViewHolder2.itemView;
        l.e(view, "holder.itemView");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            float b = b();
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            int d2 = (int) (d(displayMetrics, 22.5f) * b);
            int d3 = (int) (d(displayMetrics, 12.0f) * b);
            int d4 = (int) (d(displayMetrics, 22.5f) * b);
            int d5 = (int) (d(displayMetrics, 12.0f) * b);
            if ((view instanceof ViewGroup) && ((ViewGroup) view).getChildCount() > 0) {
                View childAt = ((ViewGroup) view).getChildAt(0);
                if (childAt instanceof GridLayout) {
                    childAt.setPadding(d2, d3, d4, d5);
                    ((GridLayout) childAt).setUseDefaultMargins(false);
                } else if ((childAt instanceof ViewGroup) && (gridLayout = (GridLayout) childAt.findViewById(C0838R.id.gridContainer)) != null) {
                    l.e(gridLayout, "grid");
                    gridLayout.setPadding(d2, d3, d4, d5);
                    gridLayout.setUseDefaultMargins(false);
                }
            }
            int d6 = (int) (d(displayMetrics, 16.0f) * b);
            if (i == 0) {
                c(view, d6, C0838R.id.item_emoji);
                c(view, d6, C0838R.id.item_quick_phrase);
                c(view, d6, C0838R.id.item_keyboard_switch);
                c(view, d6, C0838R.id.item_collapse_keyboard);
            } else {
                c(view, d6, C0838R.id.holder5);
                c(view, d6, C0838R.id.holder6);
                c(view, d6, C0838R.id.holder7);
                c(view, d6, C0838R.id.holder8);
            }
            J2 = o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        h.b(J2);
        for (a aVar : list) {
            OptionItemView optionItemView = (OptionItemView) view.findViewById(aVar.e());
            if (optionItemView != null) {
                l.e(optionItemView, "findViewById<OptionItemView>(item.viewId)");
                linkedHashMap.put(aVar.c(), optionItemView);
                boolean booleanValue = l.a(aVar.c(), "btn_hide") ? this.f2503d : this.f2502c.getOrDefault(aVar.c(), Boolean.FALSE).booleanValue();
                optionItemView.setAdded(booleanValue);
                optionItemView.setLabel(aVar.d());
                optionItemView.setIcon(booleanValue ? aVar.a() : aVar.b());
                optionItemView.setCompactScale(b());
                optionItemView.setOnAddRemoveToggle(new c(optionItemView, this, linkedHashMap, aVar));
                optionItemView.setOnItemClick(d.a);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public PageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        l.e(inflate, "view");
        return new PageViewHolder(inflate);
    }
}

package com.bytedance.android.input.keyboard.CustomToolbar;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bytedance.android.input.basic.IAppGlobals;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class CustomToolbarPagerController {
    private final Context a;
    private final ViewPager2 b;

    /* renamed from: c, reason: collision with root package name */
    private final LinearLayout f2499c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2500d;

    /* renamed from: e, reason: collision with root package name */
    private final List<ImageView> f2501e;

    public CustomToolbarPagerController(Context context, ViewPager2 viewPager2, LinearLayout linearLayout, String str) {
        l.f(context, "context");
        l.f(viewPager2, "viewPager");
        l.f(linearLayout, "indicatorLayout");
        this.a = context;
        this.b = viewPager2;
        this.f2499c = linearLayout;
        this.f2500d = str;
        this.f2501e = new ArrayList();
    }

    private final GradientDrawable c(boolean z) {
        int parseColor;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        boolean b = aVar.b();
        if (z) {
            parseColor = Color.parseColor(b ? "#80FFFFFF" : "#80000000");
        } else {
            parseColor = Color.parseColor(b ? "#26FFFFFF" : "#26000000");
        }
        gradientDrawable.setColor(parseColor);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int i) {
        int size = this.f2501e.size();
        int i2 = 0;
        while (i2 < size) {
            this.f2501e.get(i2).setImageDrawable(c(i2 == i));
            i2++;
        }
        this.f2499c.bringToFront();
    }

    public final void b() {
        this.b.setAdapter(new ToolbarPagerAdapter(this.f2500d));
        this.f2499c.removeAllViews();
        this.f2501e.clear();
        RecyclerView.Adapter adapter = this.b.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        for (int i = 0; i < itemCount; i++) {
            ImageView imageView = new ImageView(this.a);
            imageView.setImageDrawable(c(false));
            float f2 = 4;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) (this.a.getResources().getDisplayMetrics().density * f2), (int) (this.a.getResources().getDisplayMetrics().density * f2));
            layoutParams.setMargins((int) (this.a.getResources().getDisplayMetrics().density * f2), 0, (int) (f2 * this.a.getResources().getDisplayMetrics().density), 0);
            this.f2499c.addView(imageView, layoutParams);
            this.f2501e.add(imageView);
        }
        d(0);
        this.b.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.bytedance.android.input.keyboard.CustomToolbar.CustomToolbarPagerController$attach$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i2) {
                CustomToolbarPagerController.this.d(i2);
            }
        });
    }
}

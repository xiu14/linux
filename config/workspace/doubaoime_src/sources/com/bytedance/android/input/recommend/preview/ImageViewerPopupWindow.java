package com.bytedance.android.input.recommend.preview;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.popup.WindowId;
import com.bytedance.android.input.popup.o;
import com.bytedance.android.input.popup.q;
import com.bytedance.android.input.q.z;
import com.prolificinteractive.materialcalendarview.r;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.g;
import kotlin.h;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ImageViewerPopupWindow extends o {
    public static final /* synthetic */ int j = 0;
    private final ViewPager2 i;

    private static final class a extends RecyclerView.Adapter<b> {
        private final LinkedHashMap<String, Boolean> a;
        private final List<String> b;

        public a(LinkedHashMap<String, Boolean> linkedHashMap) {
            l.f(linkedHashMap, "uris");
            this.a = linkedHashMap;
            Set<String> keySet = linkedHashMap.keySet();
            l.e(keySet, "this.uris.keys");
            this.b = g.e0(keySet);
        }

        public final List<String> a() {
            LinkedHashMap<String, Boolean> linkedHashMap = this.a;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, Boolean> entry : linkedHashMap.entrySet()) {
                if (entry.getValue().booleanValue()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap2.size());
            Iterator it2 = linkedHashMap2.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.add((String) ((Map.Entry) it2.next()).getKey());
            }
            return arrayList;
        }

        public final LinkedHashMap<String, Boolean> b() {
            return this.a;
        }

        public final boolean c(int i) {
            Object J2;
            try {
                J2 = (Boolean) this.a.get(this.b.get(i));
                if (J2 == null) {
                    J2 = Boolean.FALSE;
                }
            } catch (Throwable th) {
                J2 = r.J(th);
            }
            Object obj = Boolean.FALSE;
            if (J2 instanceof h.a) {
                J2 = obj;
            }
            return ((Boolean) J2).booleanValue();
        }

        public final void d(int i, boolean z) {
            String J2;
            try {
                J2 = this.b.get(i);
            } catch (Throwable th) {
                J2 = r.J(th);
            }
            if (J2 instanceof h.a) {
                J2 = "";
            }
            l.e(J2, "runCatching { list[position] }.getOrDefault(\"\")");
            String str = (String) J2;
            if (this.a.containsKey(str)) {
                this.a.put(str, Boolean.valueOf(z));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.b.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(b bVar, int i) {
            b bVar2 = bVar;
            l.f(bVar2, "holder");
            String str = this.b.get(i);
            l.e(str, "list[position]");
            bVar2.a(str);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public b onCreateViewHolder(ViewGroup viewGroup, int i) {
            l.f(viewGroup, "parent");
            ImageView imageView = new ImageView(IAppGlobals.a.getApplication());
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            return new b(imageView);
        }
    }

    private static final class b extends RecyclerView.ViewHolder {
        private final ImageView a;
        private final ContentResolver b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ImageView imageView) {
            super(imageView);
            l.f(imageView, "view");
            this.a = imageView;
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            this.b = aVar.getApplication().getContentResolver();
        }

        public final void a(String str) {
            l.f(str, "uri");
            InputStream openInputStream = this.b.openInputStream(Uri.parse(str));
            if (openInputStream != null) {
                try {
                    this.a.setImageBitmap(BitmapFactory.decodeStream(openInputStream));
                    r.E(openInputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        r.E(openInputStream, th);
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewerPopupWindow(Context context) {
        super(context, WindowId.PREVIEW_IMAGES, 0);
        l.f(context, "context");
        IAppGlobals.a aVar = IAppGlobals.a;
        Context context2 = this.h;
        l.e(context2, "mContext");
        setContentView(aVar.E(context2, C0838R.layout.preview_image_layout));
        View findViewById = getContentView().findViewById(C0838R.id.view_pager);
        l.e(findViewById, "contentView.findViewById(R.id.view_pager)");
        ViewPager2 viewPager2 = (ViewPager2) findViewById;
        this.i = viewPager2;
        viewPager2.setOrientation(0);
        final CheckBox checkBox = (CheckBox) getContentView().findViewById(C0838R.id.check);
        View findViewById2 = getContentView().findViewById(C0838R.id.send);
        final TextView textView = (TextView) getContentView().findViewById(C0838R.id.send_text);
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.recommend.preview.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageViewerPopupWindow.m(ImageViewerPopupWindow.this, view);
            }
        });
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bytedance.android.input.recommend.preview.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ImageViewerPopupWindow.l(ImageViewerPopupWindow.this, textView, compoundButton, z);
            }
        });
        final TextView textView2 = (TextView) getContentView().findViewById(C0838R.id.indicator);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.bytedance.android.input.recommend.preview.ImageViewerPopupWindow.3
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i) {
                super.onPageSelected(i);
                RecyclerView.Adapter adapter = ImageViewerPopupWindow.this.i.getAdapter();
                a aVar2 = adapter instanceof a ? (a) adapter : null;
                if (aVar2 == null) {
                    return;
                }
                textView.setText(String.valueOf(((ArrayList) aVar2.a()).size()));
                checkBox.setChecked(aVar2.c(i));
                TextView textView3 = textView2;
                StringBuilder sb = new StringBuilder();
                sb.append(i + 1);
                sb.append('/');
                sb.append(aVar2.getItemCount());
                textView3.setText(sb.toString());
            }
        });
        getContentView().findViewById(C0838R.id.back).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.recommend.preview.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ImageViewerPopupWindow.j;
                q.f().d(WindowId.PREVIEW_IMAGES);
            }
        });
    }

    public static void l(ImageViewerPopupWindow imageViewerPopupWindow, TextView textView, CompoundButton compoundButton, boolean z) {
        l.f(imageViewerPopupWindow, "this$0");
        l.f(compoundButton, "<anonymous parameter 0>");
        try {
            RecyclerView.Adapter adapter = imageViewerPopupWindow.i.getAdapter();
            a aVar = adapter instanceof a ? (a) adapter : null;
            if (aVar == null) {
                return;
            }
            aVar.d(imageViewerPopupWindow.i.getCurrentItem(), z);
            textView.setText(String.valueOf(((ArrayList) aVar.a()).size()));
        } catch (Throwable th) {
            r.J(th);
        }
    }

    public static void m(ImageViewerPopupWindow imageViewerPopupWindow, View view) {
        l.f(imageViewerPopupWindow, "this$0");
        RecyclerView.Adapter adapter = imageViewerPopupWindow.i.getAdapter();
        a aVar = adapter instanceof a ? (a) adapter : null;
        if (aVar == null) {
            return;
        }
        z.F(aVar.a());
        q.f().d(WindowId.PREVIEW_IMAGES);
    }

    @Override // com.bytedance.android.input.popup.o, android.widget.PopupWindow
    public void dismiss() {
        RecyclerView.Adapter adapter = this.i.getAdapter();
        a aVar = adapter instanceof a ? (a) adapter : null;
        if (aVar != null) {
            LinkedHashMap<String, Boolean> b2 = aVar.b();
            z zVar = z.a;
            l.f(b2, "uris");
            if (!b2.isEmpty()) {
                KeyboardJni.getKeyboardJni().updateRecommendSelected(b2);
            }
        }
        this.i.setAdapter(null);
        super.dismiss();
    }

    public final void n(LinkedHashMap<String, Boolean> linkedHashMap, int i) {
        l.f(linkedHashMap, "uris");
        this.i.setAdapter(new a(linkedHashMap));
        this.i.setCurrentItem(i, false);
    }
}

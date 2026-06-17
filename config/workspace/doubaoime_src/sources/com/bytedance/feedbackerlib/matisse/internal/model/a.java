package com.bytedance.feedbackerlib.matisse.internal.model;

import android.content.ContentResolver;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.feedbackerlib.matisse.MimeType;
import com.bytedance.feedbackerlib.matisse.internal.entity.Item;
import com.bytedance.feedbackerlib.matisse.internal.entity.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    private final Context a;
    private LinkedHashSet<Item> b;

    /* renamed from: c, reason: collision with root package name */
    private int f4872c = 0;

    /* renamed from: d, reason: collision with root package name */
    private MediaPlayer f4873d = new MediaPlayer();

    public a(Context context) {
        this.a = context;
    }

    private int g() {
        b b = b.b();
        int i = b.f4861f;
        if (i > 0) {
            return i;
        }
        int i2 = this.f4872c;
        if (i2 == 1) {
            return 0;
        }
        return i2 == 2 ? b.f4862g : i;
    }

    public boolean a(Item item) {
        if (p(item)) {
            throw new IllegalArgumentException("Can't select images and videos at the same time.");
        }
        boolean add = this.b.add(item);
        if (add) {
            int i = this.f4872c;
            if (i == 0) {
                if (item.b()) {
                    this.f4872c = 1;
                } else if (item.c()) {
                    this.f4872c = 2;
                }
            } else if (i == 1) {
                if (item.c()) {
                    this.f4872c = 3;
                }
            } else if (i == 2 && item.b()) {
                this.f4872c = 3;
            }
        }
        return add;
    }

    public ArrayList<Item> b() {
        return new ArrayList<>(this.b);
    }

    public List<String> c() {
        ArrayList arrayList = new ArrayList();
        Iterator<Item> it2 = this.b.iterator();
        while (it2.hasNext()) {
            arrayList.add(com.bytedance.feedbackerlib.a.J(this.a, it2.next().f4853c));
        }
        return arrayList;
    }

    public List<Uri> d() {
        ArrayList arrayList = new ArrayList();
        Iterator<Item> it2 = this.b.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().f4853c);
        }
        return arrayList;
    }

    public int e(Item item) {
        int indexOf = new ArrayList(this.b).indexOf(item);
        if (indexOf == -1) {
            return Integer.MIN_VALUE;
        }
        return indexOf + 1;
    }

    public int f() {
        return this.b.size();
    }

    public Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("state_selection", new ArrayList<>(this.b));
        bundle.putInt("state_collection_type", this.f4872c);
        return bundle;
    }

    public com.bytedance.feedbackerlib.matisse.internal.entity.a i(Item item) {
        boolean z = false;
        if (k()) {
            String string = this.a.getString(C0838R.string.error_over_count, Integer.valueOf(g()));
            return new com.bytedance.feedbackerlib.matisse.internal.entity.a(1, string, string);
        }
        if (p(item)) {
            return new com.bytedance.feedbackerlib.matisse.internal.entity.a(this.a.getString(C0838R.string.error_type_conflict));
        }
        b b = b.b();
        Iterator<Item> it2 = this.b.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().c()) {
                i++;
            }
        }
        String string2 = this.a.getString(C0838R.string.error_over_video_count, Integer.valueOf(b.f4862g));
        if (i >= b.f4862g && item.c()) {
            return new com.bytedance.feedbackerlib.matisse.internal.entity.a(1, string2, "");
        }
        if (item.c()) {
            this.f4873d.reset();
            try {
                this.f4873d.setDataSource(this.a, item.f4853c);
                this.f4873d.prepare();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            if (this.f4873d.getDuration() >= 31000) {
                return new com.bytedance.feedbackerlib.matisse.internal.entity.a(1, "视频不可超过30秒", "");
            }
        }
        Context context = this.a;
        if (context != null) {
            ContentResolver contentResolver = context.getContentResolver();
            Iterator<MimeType> it3 = b.b().a.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (it3.next().checkType(contentResolver, item.f4853c)) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            return null;
        }
        return new com.bytedance.feedbackerlib.matisse.internal.entity.a(context.getString(C0838R.string.error_file_type));
    }

    public boolean j(Item item) {
        return this.b.contains(item);
    }

    public boolean k() {
        return this.b.size() == g();
    }

    public void l(Bundle bundle) {
        if (bundle == null) {
            this.b = new LinkedHashSet<>();
        } else {
            this.b = new LinkedHashSet<>(bundle.getParcelableArrayList("state_selection"));
            this.f4872c = bundle.getInt("state_collection_type", 0);
        }
    }

    public void m(Bundle bundle) {
        bundle.putParcelableArrayList("state_selection", new ArrayList<>(this.b));
        bundle.putInt("state_collection_type", this.f4872c);
    }

    public void n(ArrayList<Item> arrayList, int i) {
        if (arrayList.size() == 0) {
            this.f4872c = 0;
        } else {
            this.f4872c = i;
        }
        this.b.clear();
        this.b.addAll(arrayList);
    }

    public boolean o(Item item) {
        boolean remove = this.b.remove(item);
        if (remove) {
            boolean z = false;
            if (this.b.size() == 0) {
                this.f4872c = 0;
            } else if (this.f4872c == 3) {
                Iterator<Item> it2 = this.b.iterator();
                boolean z2 = false;
                while (it2.hasNext()) {
                    Item next = it2.next();
                    if (next.b() && !z) {
                        z = true;
                    }
                    if (next.c() && !z2) {
                        z2 = true;
                    }
                }
                if (z && z2) {
                    this.f4872c = 3;
                } else if (z) {
                    this.f4872c = 1;
                } else if (z2) {
                    this.f4872c = 2;
                }
            }
        }
        return remove;
    }

    public boolean p(Item item) {
        int i;
        int i2;
        if (b.b().b) {
            if (item.b() && ((i2 = this.f4872c) == 2 || i2 == 3)) {
                return true;
            }
            if (item.c() && ((i = this.f4872c) == 1 || i == 3)) {
                return true;
            }
        }
        return false;
    }
}

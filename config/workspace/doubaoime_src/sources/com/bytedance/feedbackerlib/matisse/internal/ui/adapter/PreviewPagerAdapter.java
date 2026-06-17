package com.bytedance.feedbackerlib.matisse.internal.ui.adapter;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.bytedance.feedbackerlib.matisse.internal.entity.Item;
import com.bytedance.feedbackerlib.matisse.internal.ui.PreviewItemFragment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class PreviewPagerAdapter extends FragmentPagerAdapter {
    private final ArrayList<Item> a;
    private final a b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public interface a {
        void a(int i);
    }

    public PreviewPagerAdapter(FragmentManager fragmentManager, a aVar) {
        super(fragmentManager);
        this.a = new ArrayList<>();
        this.b = null;
    }

    public void a(List<Item> list) {
        this.a.addAll(list);
    }

    public Item b(int i) {
        if (this.a.size() > i) {
            return this.a.get(i);
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.a.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        Item item = this.a.get(i);
        PreviewItemFragment previewItemFragment = new PreviewItemFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("args_item", item);
        previewItemFragment.setArguments(bundle);
        return previewItemFragment;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NonNull Object obj) {
        return this.a.indexOf(obj);
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(i);
        }
    }
}

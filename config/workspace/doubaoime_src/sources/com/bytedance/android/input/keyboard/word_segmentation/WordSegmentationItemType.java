package com.bytedance.android.input.keyboard.word_segmentation;

/* loaded from: classes.dex */
public enum WordSegmentationItemType {
    TEXT(1),
    IMAGE(2),
    SPACE(3);

    public static final a Companion = new a(null);
    private final int itemTypeValue;

    public static final class a {
        public a(kotlin.s.c.g gVar) {
        }

        public final WordSegmentationItemType a(int i) {
            WordSegmentationItemType wordSegmentationItemType;
            WordSegmentationItemType[] values = WordSegmentationItemType.values();
            int i2 = 0;
            while (true) {
                if (i2 >= 3) {
                    wordSegmentationItemType = null;
                    break;
                }
                wordSegmentationItemType = values[i2];
                if (wordSegmentationItemType.getItemTypeValue() == i) {
                    break;
                }
                i2++;
            }
            return wordSegmentationItemType == null ? WordSegmentationItemType.TEXT : wordSegmentationItemType;
        }
    }

    WordSegmentationItemType(int i) {
        this.itemTypeValue = i;
    }

    public final int getItemTypeValue() {
        return this.itemTypeValue;
    }
}

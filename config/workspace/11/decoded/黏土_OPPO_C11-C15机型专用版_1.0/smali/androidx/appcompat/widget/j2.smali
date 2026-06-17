.class public abstract Landroidx/appcompat/widget/j2;
.super Landroid/view/ViewGroup;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field private static final ACCESSIBILITY_CLASS_NAME:Ljava/lang/String; = "androidx.appcompat.widget.LinearLayoutCompat"

.field public static final HORIZONTAL:I = 0x0

.field private static final INDEX_BOTTOM:I = 0x2

.field private static final INDEX_CENTER_VERTICAL:I = 0x0

.field private static final INDEX_FILL:I = 0x3

.field private static final INDEX_TOP:I = 0x1

.field public static final SHOW_DIVIDER_BEGINNING:I = 0x1

.field public static final SHOW_DIVIDER_END:I = 0x4

.field public static final SHOW_DIVIDER_MIDDLE:I = 0x2

.field public static final SHOW_DIVIDER_NONE:I = 0x0

.field public static final VERTICAL:I = 0x1

.field private static final VERTICAL_GRAVITY_COUNT:I = 0x4


# instance fields
.field private mBaselineAligned:Z

.field private mBaselineAlignedChildIndex:I

.field private mBaselineChildTop:I

.field private mDivider:Landroid/graphics/drawable/Drawable;

.field private mDividerHeight:I

.field private mDividerPadding:I

.field private mDividerWidth:I

.field private mGravity:I

.field private mMaxAscent:[I

.field private mMaxDescent:[I

.field private mOrientation:I

.field private mShowDividers:I

.field private mTotalLength:I

.field private mUseLargestChild:Z

.field private mWeightSum:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/appcompat/widget/j2;->mBaselineAligned:Z

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    iput v1, p0, Landroidx/appcompat/widget/j2;->mBaselineAlignedChildIndex:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    iput v2, p0, Landroidx/appcompat/widget/j2;->mBaselineChildTop:I

    .line 12
    .line 13
    const v3, 0x800033

    .line 14
    .line 15
    .line 16
    iput v3, p0, Landroidx/appcompat/widget/j2;->mGravity:I

    .line 17
    .line 18
    sget-object v3, Lf/j;->LinearLayoutCompat:[I

    .line 19
    .line 20
    invoke-static {p1, p2, v3, p3}, La1/w;->A(Landroid/content/Context;Landroid/util/AttributeSet;[II)La1/w;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    sget-object v6, Lf/j;->LinearLayoutCompat:[I

    .line 25
    .line 26
    iget-object v4, v3, La1/w;->i:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v8, v4

    .line 29
    check-cast v8, Landroid/content/res/TypedArray;

    .line 30
    .line 31
    move-object v4, p0

    .line 32
    move-object v5, p1

    .line 33
    move-object v7, p2

    .line 34
    move v9, p3

    .line 35
    invoke-static/range {v4 .. v9}, Lm0/w0;->p(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 36
    .line 37
    .line 38
    sget p1, Lf/j;->LinearLayoutCompat_android_orientation:I

    .line 39
    .line 40
    iget-object p2, v3, La1/w;->i:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p2, Landroid/content/res/TypedArray;

    .line 43
    .line 44
    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-ltz p1, :cond_0

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/j2;->setOrientation(I)V

    .line 51
    .line 52
    .line 53
    :cond_0
    sget p1, Lf/j;->LinearLayoutCompat_android_gravity:I

    .line 54
    .line 55
    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-ltz p1, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/j2;->setGravity(I)V

    .line 62
    .line 63
    .line 64
    :cond_1
    sget p1, Lf/j;->LinearLayoutCompat_android_baselineAligned:I

    .line 65
    .line 66
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-nez p1, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/j2;->setBaselineAligned(Z)V

    .line 73
    .line 74
    .line 75
    :cond_2
    sget p1, Lf/j;->LinearLayoutCompat_android_weightSum:I

    .line 76
    .line 77
    const/high16 p3, -0x40800000    # -1.0f

    .line 78
    .line 79
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    iput p1, v4, Landroidx/appcompat/widget/j2;->mWeightSum:F

    .line 84
    .line 85
    sget p1, Lf/j;->LinearLayoutCompat_android_baselineAlignedChildIndex:I

    .line 86
    .line 87
    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    iput p1, v4, Landroidx/appcompat/widget/j2;->mBaselineAlignedChildIndex:I

    .line 92
    .line 93
    sget p1, Lf/j;->LinearLayoutCompat_measureWithLargestChild:I

    .line 94
    .line 95
    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    iput-boolean p1, v4, Landroidx/appcompat/widget/j2;->mUseLargestChild:Z

    .line 100
    .line 101
    sget p1, Lf/j;->LinearLayoutCompat_divider:I

    .line 102
    .line 103
    invoke-virtual {v3, p1}, La1/w;->t(I)Landroid/graphics/drawable/Drawable;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/j2;->setDividerDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 108
    .line 109
    .line 110
    sget p1, Lf/j;->LinearLayoutCompat_showDividers:I

    .line 111
    .line 112
    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    iput p1, v4, Landroidx/appcompat/widget/j2;->mShowDividers:I

    .line 117
    .line 118
    sget p1, Lf/j;->LinearLayoutCompat_dividerPadding:I

    .line 119
    .line 120
    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    iput p1, v4, Landroidx/appcompat/widget/j2;->mDividerPadding:I

    .line 125
    .line 126
    invoke-virtual {v3}, La1/w;->E()V

    .line 127
    .line 128
    .line 129
    return-void
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method


# virtual methods
.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Landroidx/appcompat/widget/i2;

    .line 2
    .line 3
    return p1
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public drawDividersHorizontal(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/j2;->getVirtualChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-boolean v1, Landroidx/appcompat/widget/s4;->a:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    if-ne v1, v3, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    if-ge v2, v0, :cond_3

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Landroidx/appcompat/widget/j2;->getVirtualChildAt(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    if-eqz v4, :cond_2

    .line 25
    .line 26
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    const/16 v6, 0x8

    .line 31
    .line 32
    if-eq v5, v6, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, v2}, Landroidx/appcompat/widget/j2;->hasDividerBeforeChildAt(I)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, Landroidx/appcompat/widget/i2;

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 53
    .line 54
    add-int/2addr v4, v5

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 61
    .line 62
    sub-int/2addr v4, v5

    .line 63
    iget v5, p0, Landroidx/appcompat/widget/j2;->mDividerWidth:I

    .line 64
    .line 65
    sub-int/2addr v4, v5

    .line 66
    :goto_1
    invoke-virtual {p0, p1, v4}, Landroidx/appcompat/widget/j2;->drawVerticalDivider(Landroid/graphics/Canvas;I)V

    .line 67
    .line 68
    .line 69
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/j2;->hasDividerBeforeChildAt(I)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_7

    .line 77
    .line 78
    sub-int/2addr v0, v3

    .line 79
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/j2;->getVirtualChildAt(I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-nez v0, :cond_5

    .line 84
    .line 85
    if-eqz v1, :cond_4

    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    goto :goto_3

    .line 92
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    sub-int/2addr v0, v1

    .line 101
    iget v1, p0, Landroidx/appcompat/widget/j2;->mDividerWidth:I

    .line 102
    .line 103
    :goto_2
    sub-int/2addr v0, v1

    .line 104
    goto :goto_3

    .line 105
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Landroidx/appcompat/widget/i2;

    .line 110
    .line 111
    if-eqz v1, :cond_6

    .line 112
    .line 113
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 118
    .line 119
    sub-int/2addr v0, v1

    .line 120
    iget v1, p0, Landroidx/appcompat/widget/j2;->mDividerWidth:I

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_6
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 128
    .line 129
    add-int/2addr v0, v1

    .line 130
    :goto_3
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/j2;->drawVerticalDivider(Landroid/graphics/Canvas;I)V

    .line 131
    .line 132
    .line 133
    :cond_7
    return-void
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method

.method public drawDividersVertical(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/j2;->getVirtualChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/j2;->getVirtualChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/16 v4, 0x8

    .line 19
    .line 20
    if-eq v3, v4, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/j2;->hasDividerBeforeChildAt(I)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Landroidx/appcompat/widget/i2;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iget v3, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 39
    .line 40
    sub-int/2addr v2, v3

    .line 41
    iget v3, p0, Landroidx/appcompat/widget/j2;->mDividerHeight:I

    .line 42
    .line 43
    sub-int/2addr v2, v3

    .line 44
    invoke-virtual {p0, p1, v2}, Landroidx/appcompat/widget/j2;->drawHorizontalDivider(Landroid/graphics/Canvas;I)V

    .line 45
    .line 46
    .line 47
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/j2;->hasDividerBeforeChildAt(I)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    add-int/lit8 v0, v0, -0x1

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/j2;->getVirtualChildAt(I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    sub-int/2addr v0, v1

    .line 73
    iget v1, p0, Landroidx/appcompat/widget/j2;->mDividerHeight:I

    .line 74
    .line 75
    sub-int/2addr v0, v1

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Landroidx/appcompat/widget/i2;

    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 88
    .line 89
    add-int/2addr v0, v1

    .line 90
    :goto_1
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/j2;->drawHorizontalDivider(Landroid/graphics/Canvas;I)V

    .line 91
    .line 92
    .line 93
    :cond_3
    return-void
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method

.method public drawHorizontalDivider(Landroid/graphics/Canvas;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/j2;->mDivider:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, p0, Landroidx/appcompat/widget/j2;->mDividerPadding:I

    .line 8
    .line 9
    add-int/2addr v1, v2

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    sub-int/2addr v2, v3

    .line 19
    iget v3, p0, Landroidx/appcompat/widget/j2;->mDividerPadding:I

    .line 20
    .line 21
    sub-int/2addr v2, v3

    .line 22
    iget v3, p0, Landroidx/appcompat/widget/j2;->mDividerHeight:I

    .line 23
    .line 24
    add-int/2addr v3, p2

    .line 25
    invoke-virtual {v0, v1, p2, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 26
    .line 27
    .line 28
    iget-object p2, p0, Landroidx/appcompat/widget/j2;->mDivider:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public drawVerticalDivider(Landroid/graphics/Canvas;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/j2;->mDivider:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, p0, Landroidx/appcompat/widget/j2;->mDividerPadding:I

    .line 8
    .line 9
    add-int/2addr v1, v2

    .line 10
    iget v2, p0, Landroidx/appcompat/widget/j2;->mDividerWidth:I

    .line 11
    .line 12
    add-int/2addr v2, p2

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    sub-int/2addr v3, v4

    .line 22
    iget v4, p0, Landroidx/appcompat/widget/j2;->mDividerPadding:I

    .line 23
    .line 24
    sub-int/2addr v3, v4

    .line 25
    invoke-virtual {v0, p2, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 26
    .line 27
    .line 28
    iget-object p2, p0, Landroidx/appcompat/widget/j2;->mDivider:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/j2;->generateDefaultLayoutParams()Landroidx/appcompat/widget/i2;

    move-result-object v0

    return-object v0
.end method

.method public generateDefaultLayoutParams()Landroidx/appcompat/widget/i2;
    .locals 3

    .line 2
    iget v0, p0, Landroidx/appcompat/widget/j2;->mOrientation:I

    const/4 v1, -0x2

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Landroidx/appcompat/widget/i2;

    .line 4
    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    return-object v0

    :cond_0
    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    .line 5
    new-instance v0, Landroidx/appcompat/widget/i2;

    const/4 v2, -0x1

    .line 6
    invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/j2;->generateLayoutParams(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/i2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/j2;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/i2;

    move-result-object p1

    return-object p1
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/i2;
    .locals 2

    .line 3
    new-instance v0, Landroidx/appcompat/widget/i2;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 4
    invoke-direct {v0, v1, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/i2;
    .locals 1

    .line 5
    instance-of v0, p1, Landroidx/appcompat/widget/i2;

    if-eqz v0, :cond_0

    .line 6
    new-instance v0, Landroidx/appcompat/widget/i2;

    check-cast p1, Landroidx/appcompat/widget/i2;

    .line 7
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    .line 8
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    .line 9
    new-instance v0, Landroidx/appcompat/widget/i2;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 10
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    .line 11
    :cond_1
    new-instance v0, Landroidx/appcompat/widget/i2;

    .line 12
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getBaseline()I
    .locals 5

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/j2;->mBaselineAlignedChildIndex:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Landroid/view/ViewGroup;->getBaseline()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v1, p0, Landroidx/appcompat/widget/j2;->mBaselineAlignedChildIndex:I

    .line 15
    .line 16
    if-le v0, v1, :cond_6

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getBaseline()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, -0x1

    .line 27
    if-ne v1, v2, :cond_2

    .line 28
    .line 29
    iget v0, p0, Landroidx/appcompat/widget/j2;->mBaselineAlignedChildIndex:I

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    return v2

    .line 34
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 35
    .line 36
    const-string v1, "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline."

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_2
    iget v2, p0, Landroidx/appcompat/widget/j2;->mBaselineChildTop:I

    .line 43
    .line 44
    iget v3, p0, Landroidx/appcompat/widget/j2;->mOrientation:I

    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    if-ne v3, v4, :cond_5

    .line 48
    .line 49
    iget v3, p0, Landroidx/appcompat/widget/j2;->mGravity:I

    .line 50
    .line 51
    and-int/lit8 v3, v3, 0x70

    .line 52
    .line 53
    const/16 v4, 0x30

    .line 54
    .line 55
    if-eq v3, v4, :cond_5

    .line 56
    .line 57
    const/16 v4, 0x10

    .line 58
    .line 59
    if-eq v3, v4, :cond_4

    .line 60
    .line 61
    const/16 v4, 0x50

    .line 62
    .line 63
    if-eq v3, v4, :cond_3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    sub-int/2addr v2, v3

    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    sub-int/2addr v2, v3

    .line 80
    iget v3, p0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 81
    .line 82
    sub-int/2addr v2, v3

    .line 83
    goto :goto_0

    .line 84
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    sub-int/2addr v3, v4

    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    sub-int/2addr v3, v4

    .line 98
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    sub-int/2addr v3, v4

    .line 103
    iget v4, p0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 104
    .line 105
    sub-int/2addr v3, v4

    .line 106
    div-int/lit8 v3, v3, 0x2

    .line 107
    .line 108
    add-int/2addr v2, v3

    .line 109
    :cond_5
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Landroidx/appcompat/widget/i2;

    .line 114
    .line 115
    iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 116
    .line 117
    add-int/2addr v2, v0

    .line 118
    add-int/2addr v2, v1

    .line 119
    return v2

    .line 120
    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    .line 121
    .line 122
    const-string v1, "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."

    .line 123
    .line 124
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v0
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public getBaselineAlignedChildIndex()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/j2;->mBaselineAlignedChildIndex:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public getChildrenSkipCount(Landroid/view/View;I)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public getDividerDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/j2;->mDivider:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public getDividerPadding()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/j2;->mDividerPadding:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public getDividerWidth()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/j2;->mDividerWidth:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public getGravity()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/j2;->mGravity:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public getLocationOffset(Landroid/view/View;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public getNextLocationOffset(Landroid/view/View;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public getOrientation()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/j2;->mOrientation:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public getShowDividers()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/j2;->mShowDividers:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public getVirtualChildAt(I)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public getVirtualChildCount()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public getWeightSum()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/j2;->mWeightSum:F

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public hasDividerBeforeChildAt(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget p1, p0, Landroidx/appcompat/widget/j2;->mShowDividers:I

    .line 6
    .line 7
    and-int/2addr p1, v1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    return v0

    .line 12
    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ne p1, v2, :cond_3

    .line 17
    .line 18
    iget p1, p0, Landroidx/appcompat/widget/j2;->mShowDividers:I

    .line 19
    .line 20
    and-int/lit8 p1, p1, 0x4

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    return v1

    .line 25
    :cond_2
    return v0

    .line 26
    :cond_3
    iget v2, p0, Landroidx/appcompat/widget/j2;->mShowDividers:I

    .line 27
    .line 28
    and-int/lit8 v2, v2, 0x2

    .line 29
    .line 30
    if-eqz v2, :cond_5

    .line 31
    .line 32
    sub-int/2addr p1, v1

    .line 33
    :goto_0
    if-ltz p1, :cond_5

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/16 v3, 0x8

    .line 44
    .line 45
    if-eq v2, v3, :cond_4

    .line 46
    .line 47
    return v1

    .line 48
    :cond_4
    add-int/lit8 p1, p1, -0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    return v0
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method

.method public isBaselineAligned()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/j2;->mBaselineAligned:Z

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public isMeasureWithLargestChildEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/j2;->mUseLargestChild:Z

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public layoutHorizontal(IIII)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-boolean v1, Landroidx/appcompat/widget/s4;->a:Z

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    sub-int v5, p4, p2

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    sub-int v6, v5, v6

    .line 27
    .line 28
    sub-int/2addr v5, v4

    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    sub-int/2addr v5, v7

    .line 34
    invoke-virtual {v0}, Landroidx/appcompat/widget/j2;->getVirtualChildCount()I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    iget v8, v0, Landroidx/appcompat/widget/j2;->mGravity:I

    .line 39
    .line 40
    const v9, 0x800007

    .line 41
    .line 42
    .line 43
    and-int/2addr v9, v8

    .line 44
    and-int/lit8 v8, v8, 0x70

    .line 45
    .line 46
    iget-boolean v10, v0, Landroidx/appcompat/widget/j2;->mBaselineAligned:Z

    .line 47
    .line 48
    iget-object v11, v0, Landroidx/appcompat/widget/j2;->mMaxAscent:[I

    .line 49
    .line 50
    iget-object v12, v0, Landroidx/appcompat/widget/j2;->mMaxDescent:[I

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 53
    .line 54
    .line 55
    move-result v13

    .line 56
    invoke-static {v9, v13}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    const/4 v13, 0x2

    .line 61
    if-eq v9, v3, :cond_2

    .line 62
    .line 63
    const/4 v14, 0x5

    .line 64
    if-eq v9, v14, :cond_1

    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    add-int v9, v9, p3

    .line 76
    .line 77
    sub-int v9, v9, p1

    .line 78
    .line 79
    iget v14, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 80
    .line 81
    sub-int/2addr v9, v14

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    sub-int v14, p3, p1

    .line 88
    .line 89
    iget v15, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 90
    .line 91
    sub-int/2addr v14, v15

    .line 92
    div-int/2addr v14, v13

    .line 93
    add-int/2addr v9, v14

    .line 94
    :goto_1
    if-eqz v1, :cond_3

    .line 95
    .line 96
    add-int/lit8 v1, v7, -0x1

    .line 97
    .line 98
    const/4 v15, -0x1

    .line 99
    goto :goto_2

    .line 100
    :cond_3
    const/4 v1, 0x0

    .line 101
    const/4 v15, 0x1

    .line 102
    :goto_2
    if-ge v2, v7, :cond_e

    .line 103
    .line 104
    mul-int v16, v15, v2

    .line 105
    .line 106
    const/16 v17, 0x1

    .line 107
    .line 108
    add-int v3, v16, v1

    .line 109
    .line 110
    const/16 p2, 0x2

    .line 111
    .line 112
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/j2;->getVirtualChildAt(I)Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object v13

    .line 116
    if-nez v13, :cond_4

    .line 117
    .line 118
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/j2;->measureNullChild(I)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    add-int/2addr v3, v9

    .line 123
    move/from16 p3, v1

    .line 124
    .line 125
    move v9, v3

    .line 126
    :goto_3
    move/from16 v18, v4

    .line 127
    .line 128
    move/from16 v19, v5

    .line 129
    .line 130
    goto/16 :goto_7

    .line 131
    .line 132
    :cond_4
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    .line 133
    .line 134
    .line 135
    move-result v14

    .line 136
    move/from16 p3, v1

    .line 137
    .line 138
    const/16 v1, 0x8

    .line 139
    .line 140
    if-eq v14, v1, :cond_d

    .line 141
    .line 142
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    .line 147
    .line 148
    .line 149
    move-result v14

    .line 150
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 151
    .line 152
    .line 153
    move-result-object v16

    .line 154
    move/from16 p4, v1

    .line 155
    .line 156
    move-object/from16 v1, v16

    .line 157
    .line 158
    check-cast v1, Landroidx/appcompat/widget/i2;

    .line 159
    .line 160
    move/from16 v16, v2

    .line 161
    .line 162
    if-eqz v10, :cond_5

    .line 163
    .line 164
    iget v2, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 165
    .line 166
    move/from16 v18, v4

    .line 167
    .line 168
    const/4 v4, -0x1

    .line 169
    if-eq v2, v4, :cond_6

    .line 170
    .line 171
    invoke-virtual {v13}, Landroid/view/View;->getBaseline()I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    goto :goto_4

    .line 176
    :cond_5
    move/from16 v18, v4

    .line 177
    .line 178
    :cond_6
    const/4 v4, -0x1

    .line 179
    :goto_4
    iget v2, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 180
    .line 181
    if-gez v2, :cond_7

    .line 182
    .line 183
    move v2, v8

    .line 184
    :cond_7
    and-int/lit8 v2, v2, 0x70

    .line 185
    .line 186
    move/from16 v19, v5

    .line 187
    .line 188
    const/16 v5, 0x10

    .line 189
    .line 190
    if-eq v2, v5, :cond_a

    .line 191
    .line 192
    const/16 v5, 0x30

    .line 193
    .line 194
    if-eq v2, v5, :cond_9

    .line 195
    .line 196
    const/16 v5, 0x50

    .line 197
    .line 198
    if-eq v2, v5, :cond_8

    .line 199
    .line 200
    move/from16 v2, v18

    .line 201
    .line 202
    const/4 v5, -0x1

    .line 203
    goto :goto_6

    .line 204
    :cond_8
    sub-int v2, v6, v14

    .line 205
    .line 206
    iget v5, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 207
    .line 208
    sub-int/2addr v2, v5

    .line 209
    const/4 v5, -0x1

    .line 210
    if-eq v4, v5, :cond_b

    .line 211
    .line 212
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    .line 213
    .line 214
    .line 215
    move-result v20

    .line 216
    sub-int v20, v20, v4

    .line 217
    .line 218
    aget v4, v12, p2

    .line 219
    .line 220
    sub-int v4, v4, v20

    .line 221
    .line 222
    :goto_5
    sub-int/2addr v2, v4

    .line 223
    goto :goto_6

    .line 224
    :cond_9
    const/4 v5, -0x1

    .line 225
    iget v2, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 226
    .line 227
    add-int v2, v18, v2

    .line 228
    .line 229
    if-eq v4, v5, :cond_b

    .line 230
    .line 231
    aget v20, v11, v17

    .line 232
    .line 233
    sub-int v20, v20, v4

    .line 234
    .line 235
    add-int v2, v20, v2

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_a
    const/4 v5, -0x1

    .line 239
    sub-int v2, v19, v14

    .line 240
    .line 241
    div-int/lit8 v2, v2, 0x2

    .line 242
    .line 243
    add-int v2, v2, v18

    .line 244
    .line 245
    iget v4, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 246
    .line 247
    add-int/2addr v2, v4

    .line 248
    iget v4, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_b
    :goto_6
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/j2;->hasDividerBeforeChildAt(I)Z

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    if-eqz v4, :cond_c

    .line 256
    .line 257
    iget v4, v0, Landroidx/appcompat/widget/j2;->mDividerWidth:I

    .line 258
    .line 259
    add-int/2addr v9, v4

    .line 260
    :cond_c
    iget v4, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 261
    .line 262
    add-int/2addr v9, v4

    .line 263
    invoke-virtual {v0, v13}, Landroidx/appcompat/widget/j2;->getLocationOffset(Landroid/view/View;)I

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    add-int/2addr v4, v9

    .line 268
    add-int v5, v4, p4

    .line 269
    .line 270
    add-int/2addr v14, v2

    .line 271
    invoke-virtual {v13, v4, v2, v5, v14}, Landroid/view/View;->layout(IIII)V

    .line 272
    .line 273
    .line 274
    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 275
    .line 276
    add-int v1, p4, v1

    .line 277
    .line 278
    invoke-virtual {v0, v13}, Landroidx/appcompat/widget/j2;->getNextLocationOffset(Landroid/view/View;)I

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    add-int/2addr v2, v1

    .line 283
    add-int/2addr v2, v9

    .line 284
    invoke-virtual {v0, v13, v3}, Landroidx/appcompat/widget/j2;->getChildrenSkipCount(Landroid/view/View;I)I

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    add-int v1, v1, v16

    .line 289
    .line 290
    move v9, v2

    .line 291
    move v2, v1

    .line 292
    goto :goto_7

    .line 293
    :cond_d
    move/from16 v16, v2

    .line 294
    .line 295
    goto/16 :goto_3

    .line 296
    .line 297
    :goto_7
    add-int/lit8 v2, v2, 0x1

    .line 298
    .line 299
    move/from16 v1, p3

    .line 300
    .line 301
    move/from16 v4, v18

    .line 302
    .line 303
    move/from16 v5, v19

    .line 304
    .line 305
    const/4 v3, 0x1

    .line 306
    const/4 v13, 0x2

    .line 307
    goto/16 :goto_2

    .line 308
    .line 309
    :cond_e
    return-void
.end method

.method public layoutVertical(IIII)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int/2addr p3, p1

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    sub-int p1, p3, p1

    .line 11
    .line 12
    sub-int/2addr p3, v0

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sub-int/2addr p3, v1

    .line 18
    invoke-virtual {p0}, Landroidx/appcompat/widget/j2;->getVirtualChildCount()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget v2, p0, Landroidx/appcompat/widget/j2;->mGravity:I

    .line 23
    .line 24
    and-int/lit8 v3, v2, 0x70

    .line 25
    .line 26
    const v4, 0x800007

    .line 27
    .line 28
    .line 29
    and-int/2addr v2, v4

    .line 30
    const/16 v4, 0x10

    .line 31
    .line 32
    if-eq v3, v4, :cond_1

    .line 33
    .line 34
    const/16 v4, 0x50

    .line 35
    .line 36
    if-eq v3, v4, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    add-int/2addr v3, p4

    .line 48
    sub-int/2addr v3, p2

    .line 49
    iget p2, p0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 50
    .line 51
    sub-int p2, v3, p2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    sub-int/2addr p4, p2

    .line 59
    iget p2, p0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 60
    .line 61
    sub-int/2addr p4, p2

    .line 62
    div-int/lit8 p4, p4, 0x2

    .line 63
    .line 64
    add-int p2, p4, v3

    .line 65
    .line 66
    :goto_0
    const/4 p4, 0x0

    .line 67
    :goto_1
    if-ge p4, v1, :cond_8

    .line 68
    .line 69
    invoke-virtual {p0, p4}, Landroidx/appcompat/widget/j2;->getVirtualChildAt(I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    const/4 v4, 0x1

    .line 74
    if-nez v3, :cond_2

    .line 75
    .line 76
    invoke-virtual {p0, p4}, Landroidx/appcompat/widget/j2;->measureNullChild(I)I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    add-int/2addr v3, p2

    .line 81
    move p2, v3

    .line 82
    goto :goto_4

    .line 83
    :cond_2
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    const/16 v6, 0x8

    .line 88
    .line 89
    if-eq v5, v6, :cond_7

    .line 90
    .line 91
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    check-cast v7, Landroidx/appcompat/widget/i2;

    .line 104
    .line 105
    iget v8, v7, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 106
    .line 107
    if-gez v8, :cond_3

    .line 108
    .line 109
    move v8, v2

    .line 110
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    invoke-static {v8, v9}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    and-int/lit8 v8, v8, 0x7

    .line 119
    .line 120
    if-eq v8, v4, :cond_5

    .line 121
    .line 122
    const/4 v9, 0x5

    .line 123
    if-eq v8, v9, :cond_4

    .line 124
    .line 125
    iget v8, v7, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 126
    .line 127
    add-int/2addr v8, v0

    .line 128
    goto :goto_3

    .line 129
    :cond_4
    sub-int v8, p1, v5

    .line 130
    .line 131
    iget v9, v7, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 132
    .line 133
    :goto_2
    sub-int/2addr v8, v9

    .line 134
    goto :goto_3

    .line 135
    :cond_5
    sub-int v8, p3, v5

    .line 136
    .line 137
    div-int/lit8 v8, v8, 0x2

    .line 138
    .line 139
    add-int/2addr v8, v0

    .line 140
    iget v9, v7, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 141
    .line 142
    add-int/2addr v8, v9

    .line 143
    iget v9, v7, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :goto_3
    invoke-virtual {p0, p4}, Landroidx/appcompat/widget/j2;->hasDividerBeforeChildAt(I)Z

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    if-eqz v9, :cond_6

    .line 151
    .line 152
    iget v9, p0, Landroidx/appcompat/widget/j2;->mDividerHeight:I

    .line 153
    .line 154
    add-int/2addr p2, v9

    .line 155
    :cond_6
    iget v9, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 156
    .line 157
    add-int/2addr p2, v9

    .line 158
    invoke-virtual {p0, v3}, Landroidx/appcompat/widget/j2;->getLocationOffset(Landroid/view/View;)I

    .line 159
    .line 160
    .line 161
    move-result v9

    .line 162
    add-int/2addr v9, p2

    .line 163
    add-int/2addr v5, v8

    .line 164
    add-int v10, v9, v6

    .line 165
    .line 166
    invoke-virtual {v3, v8, v9, v5, v10}, Landroid/view/View;->layout(IIII)V

    .line 167
    .line 168
    .line 169
    iget v5, v7, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 170
    .line 171
    add-int/2addr v6, v5

    .line 172
    invoke-virtual {p0, v3}, Landroidx/appcompat/widget/j2;->getNextLocationOffset(Landroid/view/View;)I

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    add-int/2addr v5, v6

    .line 177
    add-int/2addr v5, p2

    .line 178
    invoke-virtual {p0, v3, p4}, Landroidx/appcompat/widget/j2;->getChildrenSkipCount(Landroid/view/View;I)I

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    add-int/2addr p4, p2

    .line 183
    move p2, v5

    .line 184
    :cond_7
    :goto_4
    add-int/2addr p4, v4

    .line 185
    goto :goto_1

    .line 186
    :cond_8
    return-void
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
.end method

.method public measureChildBeforeLayout(Landroid/view/View;IIIII)V
    .locals 0

    .line 1
    move-object p2, p1

    .line 2
    move-object p1, p0

    .line 3
    invoke-virtual/range {p1 .. p6}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
.end method

.method public measureHorizontal(II)V
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    iput v7, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/appcompat/widget/j2;->getVirtualChildCount()I

    .line 7
    .line 8
    .line 9
    move-result v8

    .line 10
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 11
    .line 12
    .line 13
    move-result v9

    .line 14
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 15
    .line 16
    .line 17
    move-result v10

    .line 18
    iget-object v1, v0, Landroidx/appcompat/widget/j2;->mMaxAscent:[I

    .line 19
    .line 20
    const/4 v11, 0x4

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v1, v0, Landroidx/appcompat/widget/j2;->mMaxDescent:[I

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    :cond_0
    new-array v1, v11, [I

    .line 28
    .line 29
    iput-object v1, v0, Landroidx/appcompat/widget/j2;->mMaxAscent:[I

    .line 30
    .line 31
    new-array v1, v11, [I

    .line 32
    .line 33
    iput-object v1, v0, Landroidx/appcompat/widget/j2;->mMaxDescent:[I

    .line 34
    .line 35
    :cond_1
    iget-object v12, v0, Landroidx/appcompat/widget/j2;->mMaxAscent:[I

    .line 36
    .line 37
    iget-object v13, v0, Landroidx/appcompat/widget/j2;->mMaxDescent:[I

    .line 38
    .line 39
    const/4 v14, 0x3

    .line 40
    const/4 v15, -0x1

    .line 41
    aput v15, v12, v14

    .line 42
    .line 43
    const/16 v16, 0x2

    .line 44
    .line 45
    aput v15, v12, v16

    .line 46
    .line 47
    const/16 v17, 0x1

    .line 48
    .line 49
    aput v15, v12, v17

    .line 50
    .line 51
    aput v15, v12, v7

    .line 52
    .line 53
    aput v15, v13, v14

    .line 54
    .line 55
    aput v15, v13, v16

    .line 56
    .line 57
    aput v15, v13, v17

    .line 58
    .line 59
    aput v15, v13, v7

    .line 60
    .line 61
    iget-boolean v1, v0, Landroidx/appcompat/widget/j2;->mBaselineAligned:Z

    .line 62
    .line 63
    iget-boolean v2, v0, Landroidx/appcompat/widget/j2;->mUseLargestChild:Z

    .line 64
    .line 65
    const/high16 v3, 0x40000000    # 2.0f

    .line 66
    .line 67
    if-ne v9, v3, :cond_2

    .line 68
    .line 69
    const/16 v18, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    const/16 v18, 0x0

    .line 73
    .line 74
    :goto_0
    const/16 v19, 0x0

    .line 75
    .line 76
    move v4, v2

    .line 77
    const/4 v2, 0x0

    .line 78
    const/4 v5, 0x0

    .line 79
    const/4 v6, 0x0

    .line 80
    const/4 v11, 0x0

    .line 81
    const/4 v14, 0x0

    .line 82
    const/4 v15, 0x0

    .line 83
    const/16 v20, 0x4

    .line 84
    .line 85
    const/16 v21, 0x3

    .line 86
    .line 87
    const/16 v22, 0x0

    .line 88
    .line 89
    const/16 v24, 0x0

    .line 90
    .line 91
    const/16 v25, 0x1

    .line 92
    .line 93
    const/16 v26, 0x0

    .line 94
    .line 95
    :goto_1
    move/from16 v27, v6

    .line 96
    .line 97
    const/16 v6, 0x8

    .line 98
    .line 99
    if-ge v2, v8, :cond_15

    .line 100
    .line 101
    move/from16 v30, v1

    .line 102
    .line 103
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/j2;->getVirtualChildAt(I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    if-nez v1, :cond_3

    .line 108
    .line 109
    iget v1, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/j2;->measureNullChild(I)I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    add-int/2addr v6, v1

    .line 116
    iput v6, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 117
    .line 118
    :goto_2
    move/from16 v1, p2

    .line 119
    .line 120
    move/from16 v35, v8

    .line 121
    .line 122
    move/from16 v33, v9

    .line 123
    .line 124
    move-object/from16 v34, v12

    .line 125
    .line 126
    move-object/from16 v28, v13

    .line 127
    .line 128
    move/from16 v6, v27

    .line 129
    .line 130
    move/from16 v27, v4

    .line 131
    .line 132
    goto/16 :goto_e

    .line 133
    .line 134
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    if-ne v7, v6, :cond_4

    .line 139
    .line 140
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/widget/j2;->getChildrenSkipCount(Landroid/view/View;I)I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    add-int/2addr v2, v1

    .line 145
    goto :goto_2

    .line 146
    :cond_4
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/j2;->hasDividerBeforeChildAt(I)Z

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-eqz v6, :cond_5

    .line 151
    .line 152
    iget v6, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 153
    .line 154
    iget v7, v0, Landroidx/appcompat/widget/j2;->mDividerWidth:I

    .line 155
    .line 156
    add-int/2addr v6, v7

    .line 157
    iput v6, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 158
    .line 159
    :cond_5
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    move-object v7, v6

    .line 164
    check-cast v7, Landroidx/appcompat/widget/i2;

    .line 165
    .line 166
    iget v6, v7, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 167
    .line 168
    add-float v32, v5, v6

    .line 169
    .line 170
    if-ne v9, v3, :cond_8

    .line 171
    .line 172
    iget v5, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 173
    .line 174
    if-nez v5, :cond_8

    .line 175
    .line 176
    cmpl-float v5, v6, v19

    .line 177
    .line 178
    if-lez v5, :cond_8

    .line 179
    .line 180
    if-eqz v18, :cond_6

    .line 181
    .line 182
    iget v5, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 183
    .line 184
    iget v6, v7, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 185
    .line 186
    iget v3, v7, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 187
    .line 188
    add-int/2addr v6, v3

    .line 189
    add-int/2addr v6, v5

    .line 190
    iput v6, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_6
    iget v3, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 194
    .line 195
    iget v5, v7, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 196
    .line 197
    add-int/2addr v5, v3

    .line 198
    iget v6, v7, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 199
    .line 200
    add-int/2addr v5, v6

    .line 201
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    iput v3, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 206
    .line 207
    :goto_3
    if-eqz v30, :cond_7

    .line 208
    .line 209
    const/4 v3, 0x0

    .line 210
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    invoke-virtual {v1, v5, v5}, Landroid/view/View;->measure(II)V

    .line 215
    .line 216
    .line 217
    move-object v3, v1

    .line 218
    move/from16 v35, v8

    .line 219
    .line 220
    move/from16 v33, v9

    .line 221
    .line 222
    move-object/from16 v34, v12

    .line 223
    .line 224
    move-object/from16 v28, v13

    .line 225
    .line 226
    move/from16 v12, v27

    .line 227
    .line 228
    const/high16 v8, 0x40000000    # 2.0f

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_7
    move-object v3, v1

    .line 232
    move/from16 v35, v8

    .line 233
    .line 234
    move/from16 v33, v9

    .line 235
    .line 236
    move-object/from16 v34, v12

    .line 237
    .line 238
    move-object/from16 v28, v13

    .line 239
    .line 240
    move/from16 v12, v27

    .line 241
    .line 242
    const/high16 v8, 0x40000000    # 2.0f

    .line 243
    .line 244
    const/16 v22, 0x1

    .line 245
    .line 246
    :goto_4
    const/16 v29, -0x2

    .line 247
    .line 248
    move/from16 v1, p2

    .line 249
    .line 250
    move/from16 v27, v4

    .line 251
    .line 252
    goto/16 :goto_8

    .line 253
    .line 254
    :cond_8
    iget v3, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 255
    .line 256
    if-nez v3, :cond_9

    .line 257
    .line 258
    cmpl-float v3, v6, v19

    .line 259
    .line 260
    if-lez v3, :cond_9

    .line 261
    .line 262
    const/4 v3, -0x2

    .line 263
    iput v3, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 264
    .line 265
    const/4 v5, 0x0

    .line 266
    goto :goto_5

    .line 267
    :cond_9
    const/4 v3, -0x2

    .line 268
    const/high16 v5, -0x80000000

    .line 269
    .line 270
    :goto_5
    cmpl-float v6, v32, v19

    .line 271
    .line 272
    if-nez v6, :cond_a

    .line 273
    .line 274
    iget v6, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 275
    .line 276
    move/from16 v36, v6

    .line 277
    .line 278
    move v6, v4

    .line 279
    move/from16 v4, v36

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_a
    move v6, v4

    .line 283
    const/4 v4, 0x0

    .line 284
    :goto_6
    const/16 v28, 0x0

    .line 285
    .line 286
    move/from16 v3, p1

    .line 287
    .line 288
    move/from16 v35, v8

    .line 289
    .line 290
    move/from16 v33, v9

    .line 291
    .line 292
    move-object/from16 v34, v12

    .line 293
    .line 294
    move-object/from16 v28, v13

    .line 295
    .line 296
    move/from16 v12, v27

    .line 297
    .line 298
    const/high16 v8, 0x40000000    # 2.0f

    .line 299
    .line 300
    const/high16 v9, -0x80000000

    .line 301
    .line 302
    const/16 v29, -0x2

    .line 303
    .line 304
    move v13, v5

    .line 305
    move/from16 v27, v6

    .line 306
    .line 307
    const/4 v6, 0x0

    .line 308
    move/from16 v5, p2

    .line 309
    .line 310
    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/j2;->measureChildBeforeLayout(Landroid/view/View;IIIII)V

    .line 311
    .line 312
    .line 313
    move-object v3, v1

    .line 314
    move v1, v5

    .line 315
    if-eq v13, v9, :cond_b

    .line 316
    .line 317
    iput v13, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 318
    .line 319
    :cond_b
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 320
    .line 321
    .line 322
    move-result v4

    .line 323
    if-eqz v18, :cond_c

    .line 324
    .line 325
    iget v5, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 326
    .line 327
    iget v6, v7, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 328
    .line 329
    add-int/2addr v6, v4

    .line 330
    iget v9, v7, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 331
    .line 332
    add-int/2addr v6, v9

    .line 333
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/j2;->getNextLocationOffset(Landroid/view/View;)I

    .line 334
    .line 335
    .line 336
    move-result v9

    .line 337
    add-int/2addr v9, v6

    .line 338
    add-int/2addr v9, v5

    .line 339
    iput v9, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 340
    .line 341
    goto :goto_7

    .line 342
    :cond_c
    iget v5, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 343
    .line 344
    add-int v6, v5, v4

    .line 345
    .line 346
    iget v9, v7, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 347
    .line 348
    add-int/2addr v6, v9

    .line 349
    iget v9, v7, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 350
    .line 351
    add-int/2addr v6, v9

    .line 352
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/j2;->getNextLocationOffset(Landroid/view/View;)I

    .line 353
    .line 354
    .line 355
    move-result v9

    .line 356
    add-int/2addr v9, v6

    .line 357
    invoke-static {v5, v9}, Ljava/lang/Math;->max(II)I

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    iput v5, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 362
    .line 363
    :goto_7
    if-eqz v27, :cond_d

    .line 364
    .line 365
    invoke-static {v4, v15}, Ljava/lang/Math;->max(II)I

    .line 366
    .line 367
    .line 368
    move-result v15

    .line 369
    :cond_d
    :goto_8
    if-eq v10, v8, :cond_e

    .line 370
    .line 371
    iget v4, v7, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 372
    .line 373
    const/4 v5, -0x1

    .line 374
    if-ne v4, v5, :cond_e

    .line 375
    .line 376
    const/4 v4, 0x1

    .line 377
    const/16 v26, 0x1

    .line 378
    .line 379
    goto :goto_9

    .line 380
    :cond_e
    const/4 v4, 0x0

    .line 381
    :goto_9
    iget v5, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 382
    .line 383
    iget v6, v7, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 384
    .line 385
    add-int/2addr v5, v6

    .line 386
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 387
    .line 388
    .line 389
    move-result v6

    .line 390
    add-int/2addr v6, v5

    .line 391
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredState()I

    .line 392
    .line 393
    .line 394
    move-result v9

    .line 395
    move/from16 v13, v24

    .line 396
    .line 397
    invoke-static {v13, v9}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 398
    .line 399
    .line 400
    move-result v24

    .line 401
    if-eqz v30, :cond_10

    .line 402
    .line 403
    invoke-virtual {v3}, Landroid/view/View;->getBaseline()I

    .line 404
    .line 405
    .line 406
    move-result v9

    .line 407
    const/4 v13, -0x1

    .line 408
    if-eq v9, v13, :cond_10

    .line 409
    .line 410
    iget v13, v7, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 411
    .line 412
    if-gez v13, :cond_f

    .line 413
    .line 414
    iget v13, v0, Landroidx/appcompat/widget/j2;->mGravity:I

    .line 415
    .line 416
    :cond_f
    and-int/lit8 v13, v13, 0x70

    .line 417
    .line 418
    shr-int/lit8 v13, v13, 0x4

    .line 419
    .line 420
    and-int/lit8 v13, v13, -0x2

    .line 421
    .line 422
    shr-int/lit8 v13, v13, 0x1

    .line 423
    .line 424
    aget v8, v34, v13

    .line 425
    .line 426
    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    .line 427
    .line 428
    .line 429
    move-result v8

    .line 430
    aput v8, v34, v13

    .line 431
    .line 432
    aget v8, v28, v13

    .line 433
    .line 434
    sub-int v9, v6, v9

    .line 435
    .line 436
    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    .line 437
    .line 438
    .line 439
    move-result v8

    .line 440
    aput v8, v28, v13

    .line 441
    .line 442
    :cond_10
    invoke-static {v12, v6}, Ljava/lang/Math;->max(II)I

    .line 443
    .line 444
    .line 445
    move-result v8

    .line 446
    if-eqz v25, :cond_11

    .line 447
    .line 448
    iget v9, v7, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 449
    .line 450
    const/4 v13, -0x1

    .line 451
    if-ne v9, v13, :cond_11

    .line 452
    .line 453
    const/16 v25, 0x1

    .line 454
    .line 455
    goto :goto_a

    .line 456
    :cond_11
    const/16 v25, 0x0

    .line 457
    .line 458
    :goto_a
    iget v7, v7, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 459
    .line 460
    cmpl-float v7, v7, v19

    .line 461
    .line 462
    if-lez v7, :cond_13

    .line 463
    .line 464
    if-eqz v4, :cond_12

    .line 465
    .line 466
    goto :goto_b

    .line 467
    :cond_12
    move v5, v6

    .line 468
    :goto_b
    invoke-static {v14, v5}, Ljava/lang/Math;->max(II)I

    .line 469
    .line 470
    .line 471
    move-result v14

    .line 472
    goto :goto_d

    .line 473
    :cond_13
    if-eqz v4, :cond_14

    .line 474
    .line 475
    goto :goto_c

    .line 476
    :cond_14
    move v5, v6

    .line 477
    :goto_c
    invoke-static {v11, v5}, Ljava/lang/Math;->max(II)I

    .line 478
    .line 479
    .line 480
    move-result v11

    .line 481
    :goto_d
    invoke-virtual {v0, v3, v2}, Landroidx/appcompat/widget/j2;->getChildrenSkipCount(Landroid/view/View;I)I

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    add-int/2addr v2, v3

    .line 486
    move v6, v8

    .line 487
    move/from16 v5, v32

    .line 488
    .line 489
    :goto_e
    add-int/lit8 v2, v2, 0x1

    .line 490
    .line 491
    move/from16 v4, v27

    .line 492
    .line 493
    move-object/from16 v13, v28

    .line 494
    .line 495
    move/from16 v1, v30

    .line 496
    .line 497
    move/from16 v9, v33

    .line 498
    .line 499
    move-object/from16 v12, v34

    .line 500
    .line 501
    move/from16 v8, v35

    .line 502
    .line 503
    const/high16 v3, 0x40000000    # 2.0f

    .line 504
    .line 505
    const/4 v7, 0x0

    .line 506
    goto/16 :goto_1

    .line 507
    .line 508
    :cond_15
    move/from16 v30, v1

    .line 509
    .line 510
    move/from16 v35, v8

    .line 511
    .line 512
    move/from16 v33, v9

    .line 513
    .line 514
    move-object/from16 v34, v12

    .line 515
    .line 516
    move-object/from16 v28, v13

    .line 517
    .line 518
    move/from16 v13, v24

    .line 519
    .line 520
    move/from16 v12, v27

    .line 521
    .line 522
    const/high16 v9, -0x80000000

    .line 523
    .line 524
    const/16 v29, -0x2

    .line 525
    .line 526
    move/from16 v1, p2

    .line 527
    .line 528
    move/from16 v27, v4

    .line 529
    .line 530
    iget v2, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 531
    .line 532
    move/from16 v7, v35

    .line 533
    .line 534
    if-lez v2, :cond_16

    .line 535
    .line 536
    invoke-virtual {v0, v7}, Landroidx/appcompat/widget/j2;->hasDividerBeforeChildAt(I)Z

    .line 537
    .line 538
    .line 539
    move-result v2

    .line 540
    if-eqz v2, :cond_16

    .line 541
    .line 542
    iget v2, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 543
    .line 544
    iget v3, v0, Landroidx/appcompat/widget/j2;->mDividerWidth:I

    .line 545
    .line 546
    add-int/2addr v2, v3

    .line 547
    iput v2, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 548
    .line 549
    :cond_16
    aget v2, v34, v17

    .line 550
    .line 551
    const/4 v3, -0x1

    .line 552
    if-ne v2, v3, :cond_18

    .line 553
    .line 554
    const/16 v31, 0x0

    .line 555
    .line 556
    aget v4, v34, v31

    .line 557
    .line 558
    if-ne v4, v3, :cond_18

    .line 559
    .line 560
    aget v4, v34, v16

    .line 561
    .line 562
    if-ne v4, v3, :cond_18

    .line 563
    .line 564
    aget v4, v34, v21

    .line 565
    .line 566
    if-eq v4, v3, :cond_17

    .line 567
    .line 568
    goto :goto_f

    .line 569
    :cond_17
    move v6, v12

    .line 570
    goto :goto_10

    .line 571
    :cond_18
    :goto_f
    aget v3, v34, v21

    .line 572
    .line 573
    const/16 v31, 0x0

    .line 574
    .line 575
    aget v4, v34, v31

    .line 576
    .line 577
    aget v8, v34, v16

    .line 578
    .line 579
    invoke-static {v2, v8}, Ljava/lang/Math;->max(II)I

    .line 580
    .line 581
    .line 582
    move-result v2

    .line 583
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    .line 584
    .line 585
    .line 586
    move-result v2

    .line 587
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 588
    .line 589
    .line 590
    move-result v2

    .line 591
    aget v3, v28, v21

    .line 592
    .line 593
    aget v4, v28, v31

    .line 594
    .line 595
    aget v8, v28, v17

    .line 596
    .line 597
    aget v6, v28, v16

    .line 598
    .line 599
    invoke-static {v8, v6}, Ljava/lang/Math;->max(II)I

    .line 600
    .line 601
    .line 602
    move-result v6

    .line 603
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 604
    .line 605
    .line 606
    move-result v4

    .line 607
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 608
    .line 609
    .line 610
    move-result v3

    .line 611
    add-int/2addr v3, v2

    .line 612
    invoke-static {v12, v3}, Ljava/lang/Math;->max(II)I

    .line 613
    .line 614
    .line 615
    move-result v6

    .line 616
    :goto_10
    move/from16 v2, v33

    .line 617
    .line 618
    if-eqz v27, :cond_1d

    .line 619
    .line 620
    if-eq v2, v9, :cond_19

    .line 621
    .line 622
    if-nez v2, :cond_1d

    .line 623
    .line 624
    :cond_19
    const/4 v3, 0x0

    .line 625
    iput v3, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 626
    .line 627
    const/4 v3, 0x0

    .line 628
    :goto_11
    if-ge v3, v7, :cond_1d

    .line 629
    .line 630
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/j2;->getVirtualChildAt(I)Landroid/view/View;

    .line 631
    .line 632
    .line 633
    move-result-object v4

    .line 634
    if-nez v4, :cond_1a

    .line 635
    .line 636
    iget v4, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 637
    .line 638
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/j2;->measureNullChild(I)I

    .line 639
    .line 640
    .line 641
    move-result v8

    .line 642
    add-int/2addr v8, v4

    .line 643
    iput v8, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 644
    .line 645
    :goto_12
    move/from16 v32, v3

    .line 646
    .line 647
    goto :goto_13

    .line 648
    :cond_1a
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 649
    .line 650
    .line 651
    move-result v8

    .line 652
    const/16 v9, 0x8

    .line 653
    .line 654
    if-ne v8, v9, :cond_1b

    .line 655
    .line 656
    invoke-virtual {v0, v4, v3}, Landroidx/appcompat/widget/j2;->getChildrenSkipCount(Landroid/view/View;I)I

    .line 657
    .line 658
    .line 659
    move-result v4

    .line 660
    add-int/2addr v3, v4

    .line 661
    goto :goto_14

    .line 662
    :cond_1b
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 663
    .line 664
    .line 665
    move-result-object v8

    .line 666
    check-cast v8, Landroidx/appcompat/widget/i2;

    .line 667
    .line 668
    if-eqz v18, :cond_1c

    .line 669
    .line 670
    iget v9, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 671
    .line 672
    iget v12, v8, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 673
    .line 674
    add-int/2addr v12, v15

    .line 675
    iget v8, v8, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 676
    .line 677
    add-int/2addr v12, v8

    .line 678
    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/j2;->getNextLocationOffset(Landroid/view/View;)I

    .line 679
    .line 680
    .line 681
    move-result v4

    .line 682
    add-int/2addr v4, v12

    .line 683
    add-int/2addr v4, v9

    .line 684
    iput v4, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 685
    .line 686
    goto :goto_12

    .line 687
    :cond_1c
    iget v9, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 688
    .line 689
    add-int v12, v9, v15

    .line 690
    .line 691
    move/from16 v32, v3

    .line 692
    .line 693
    iget v3, v8, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 694
    .line 695
    add-int/2addr v12, v3

    .line 696
    iget v3, v8, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 697
    .line 698
    add-int/2addr v12, v3

    .line 699
    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/j2;->getNextLocationOffset(Landroid/view/View;)I

    .line 700
    .line 701
    .line 702
    move-result v3

    .line 703
    add-int/2addr v3, v12

    .line 704
    invoke-static {v9, v3}, Ljava/lang/Math;->max(II)I

    .line 705
    .line 706
    .line 707
    move-result v3

    .line 708
    iput v3, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 709
    .line 710
    :goto_13
    move/from16 v3, v32

    .line 711
    .line 712
    :goto_14
    add-int/lit8 v3, v3, 0x1

    .line 713
    .line 714
    goto :goto_11

    .line 715
    :cond_1d
    iget v3, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 716
    .line 717
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 718
    .line 719
    .line 720
    move-result v4

    .line 721
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 722
    .line 723
    .line 724
    move-result v8

    .line 725
    add-int/2addr v8, v4

    .line 726
    add-int/2addr v8, v3

    .line 727
    iput v8, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 728
    .line 729
    invoke-virtual {v0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 730
    .line 731
    .line 732
    move-result v3

    .line 733
    invoke-static {v8, v3}, Ljava/lang/Math;->max(II)I

    .line 734
    .line 735
    .line 736
    move-result v3

    .line 737
    move/from16 v4, p1

    .line 738
    .line 739
    const/4 v8, 0x0

    .line 740
    invoke-static {v3, v4, v8}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 741
    .line 742
    .line 743
    move-result v3

    .line 744
    const v8, 0xffffff

    .line 745
    .line 746
    .line 747
    and-int/2addr v8, v3

    .line 748
    iget v9, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 749
    .line 750
    sub-int/2addr v8, v9

    .line 751
    if-nez v22, :cond_22

    .line 752
    .line 753
    if-eqz v8, :cond_1e

    .line 754
    .line 755
    cmpl-float v12, v5, v19

    .line 756
    .line 757
    if-lez v12, :cond_1e

    .line 758
    .line 759
    goto :goto_17

    .line 760
    :cond_1e
    invoke-static {v11, v14}, Ljava/lang/Math;->max(II)I

    .line 761
    .line 762
    .line 763
    move-result v5

    .line 764
    if-eqz v27, :cond_21

    .line 765
    .line 766
    const/high16 v8, 0x40000000    # 2.0f

    .line 767
    .line 768
    if-eq v2, v8, :cond_21

    .line 769
    .line 770
    const/4 v2, 0x0

    .line 771
    :goto_15
    if-ge v2, v7, :cond_21

    .line 772
    .line 773
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/j2;->getVirtualChildAt(I)Landroid/view/View;

    .line 774
    .line 775
    .line 776
    move-result-object v8

    .line 777
    if-eqz v8, :cond_20

    .line 778
    .line 779
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    .line 780
    .line 781
    .line 782
    move-result v11

    .line 783
    const/16 v12, 0x8

    .line 784
    .line 785
    if-ne v11, v12, :cond_1f

    .line 786
    .line 787
    goto :goto_16

    .line 788
    :cond_1f
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 789
    .line 790
    .line 791
    move-result-object v11

    .line 792
    check-cast v11, Landroidx/appcompat/widget/i2;

    .line 793
    .line 794
    iget v11, v11, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 795
    .line 796
    cmpl-float v11, v11, v19

    .line 797
    .line 798
    if-lez v11, :cond_20

    .line 799
    .line 800
    const/high16 v11, 0x40000000    # 2.0f

    .line 801
    .line 802
    invoke-static {v15, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 803
    .line 804
    .line 805
    move-result v12

    .line 806
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    .line 807
    .line 808
    .line 809
    move-result v14

    .line 810
    invoke-static {v14, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 811
    .line 812
    .line 813
    move-result v14

    .line 814
    invoke-virtual {v8, v12, v14}, Landroid/view/View;->measure(II)V

    .line 815
    .line 816
    .line 817
    :cond_20
    :goto_16
    add-int/lit8 v2, v2, 0x1

    .line 818
    .line 819
    goto :goto_15

    .line 820
    :cond_21
    move/from16 v27, v3

    .line 821
    .line 822
    const/high16 v22, -0x1000000

    .line 823
    .line 824
    const/16 v31, 0x0

    .line 825
    .line 826
    goto/16 :goto_27

    .line 827
    .line 828
    :cond_22
    :goto_17
    iget v6, v0, Landroidx/appcompat/widget/j2;->mWeightSum:F

    .line 829
    .line 830
    cmpl-float v12, v6, v19

    .line 831
    .line 832
    if-lez v12, :cond_23

    .line 833
    .line 834
    move v5, v6

    .line 835
    :cond_23
    const/16 v23, -0x1

    .line 836
    .line 837
    aput v23, v34, v21

    .line 838
    .line 839
    aput v23, v34, v16

    .line 840
    .line 841
    aput v23, v34, v17

    .line 842
    .line 843
    const/4 v6, 0x0

    .line 844
    aput v23, v34, v6

    .line 845
    .line 846
    aput v23, v28, v21

    .line 847
    .line 848
    aput v23, v28, v16

    .line 849
    .line 850
    aput v23, v28, v17

    .line 851
    .line 852
    aput v23, v28, v6

    .line 853
    .line 854
    iput v6, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 855
    .line 856
    const/4 v6, -0x1

    .line 857
    const/4 v12, 0x0

    .line 858
    :goto_18
    if-ge v12, v7, :cond_32

    .line 859
    .line 860
    invoke-virtual {v0, v12}, Landroidx/appcompat/widget/j2;->getVirtualChildAt(I)Landroid/view/View;

    .line 861
    .line 862
    .line 863
    move-result-object v14

    .line 864
    if-eqz v14, :cond_31

    .line 865
    .line 866
    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    .line 867
    .line 868
    .line 869
    move-result v15

    .line 870
    const/16 v9, 0x8

    .line 871
    .line 872
    const/high16 v22, -0x1000000

    .line 873
    .line 874
    if-ne v15, v9, :cond_24

    .line 875
    .line 876
    :goto_19
    move/from16 v33, v2

    .line 877
    .line 878
    move/from16 v27, v3

    .line 879
    .line 880
    goto/16 :goto_24

    .line 881
    .line 882
    :cond_24
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 883
    .line 884
    .line 885
    move-result-object v9

    .line 886
    check-cast v9, Landroidx/appcompat/widget/i2;

    .line 887
    .line 888
    iget v15, v9, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 889
    .line 890
    cmpl-float v27, v15, v19

    .line 891
    .line 892
    if-lez v27, :cond_29

    .line 893
    .line 894
    move/from16 v27, v3

    .line 895
    .line 896
    int-to-float v3, v8

    .line 897
    mul-float v3, v3, v15

    .line 898
    .line 899
    div-float/2addr v3, v5

    .line 900
    float-to-int v3, v3

    .line 901
    sub-float/2addr v5, v15

    .line 902
    sub-int/2addr v8, v3

    .line 903
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 904
    .line 905
    .line 906
    move-result v15

    .line 907
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 908
    .line 909
    .line 910
    move-result v32

    .line 911
    add-int v32, v32, v15

    .line 912
    .line 913
    iget v15, v9, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 914
    .line 915
    add-int v32, v32, v15

    .line 916
    .line 917
    iget v15, v9, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 918
    .line 919
    add-int v15, v32, v15

    .line 920
    .line 921
    move/from16 v32, v3

    .line 922
    .line 923
    iget v3, v9, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 924
    .line 925
    invoke-static {v1, v15, v3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 926
    .line 927
    .line 928
    move-result v3

    .line 929
    iget v15, v9, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 930
    .line 931
    if-nez v15, :cond_27

    .line 932
    .line 933
    const/high16 v15, 0x40000000    # 2.0f

    .line 934
    .line 935
    if-eq v2, v15, :cond_25

    .line 936
    .line 937
    :goto_1a
    move/from16 v33, v2

    .line 938
    .line 939
    goto :goto_1c

    .line 940
    :cond_25
    move/from16 v33, v2

    .line 941
    .line 942
    if-lez v32, :cond_26

    .line 943
    .line 944
    move/from16 v2, v32

    .line 945
    .line 946
    goto :goto_1b

    .line 947
    :cond_26
    const/4 v2, 0x0

    .line 948
    :goto_1b
    invoke-static {v2, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 949
    .line 950
    .line 951
    move-result v2

    .line 952
    invoke-virtual {v14, v2, v3}, Landroid/view/View;->measure(II)V

    .line 953
    .line 954
    .line 955
    goto :goto_1d

    .line 956
    :cond_27
    const/high16 v15, 0x40000000    # 2.0f

    .line 957
    .line 958
    goto :goto_1a

    .line 959
    :goto_1c
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I

    .line 960
    .line 961
    .line 962
    move-result v2

    .line 963
    add-int v2, v2, v32

    .line 964
    .line 965
    if-gez v2, :cond_28

    .line 966
    .line 967
    const/4 v2, 0x0

    .line 968
    :cond_28
    invoke-static {v2, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 969
    .line 970
    .line 971
    move-result v2

    .line 972
    invoke-virtual {v14, v2, v3}, Landroid/view/View;->measure(II)V

    .line 973
    .line 974
    .line 975
    :goto_1d
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredState()I

    .line 976
    .line 977
    .line 978
    move-result v2

    .line 979
    and-int v2, v2, v22

    .line 980
    .line 981
    invoke-static {v13, v2}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 982
    .line 983
    .line 984
    move-result v13

    .line 985
    goto :goto_1e

    .line 986
    :cond_29
    move/from16 v33, v2

    .line 987
    .line 988
    move/from16 v27, v3

    .line 989
    .line 990
    :goto_1e
    if-eqz v18, :cond_2a

    .line 991
    .line 992
    iget v2, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 993
    .line 994
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I

    .line 995
    .line 996
    .line 997
    move-result v3

    .line 998
    iget v15, v9, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 999
    .line 1000
    add-int/2addr v3, v15

    .line 1001
    iget v15, v9, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1002
    .line 1003
    add-int/2addr v3, v15

    .line 1004
    invoke-virtual {v0, v14}, Landroidx/appcompat/widget/j2;->getNextLocationOffset(Landroid/view/View;)I

    .line 1005
    .line 1006
    .line 1007
    move-result v15

    .line 1008
    add-int/2addr v15, v3

    .line 1009
    add-int/2addr v15, v2

    .line 1010
    iput v15, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 1011
    .line 1012
    :goto_1f
    const/high16 v15, 0x40000000    # 2.0f

    .line 1013
    .line 1014
    goto :goto_20

    .line 1015
    :cond_2a
    iget v2, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 1016
    .line 1017
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I

    .line 1018
    .line 1019
    .line 1020
    move-result v3

    .line 1021
    add-int/2addr v3, v2

    .line 1022
    iget v15, v9, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1023
    .line 1024
    add-int/2addr v3, v15

    .line 1025
    iget v15, v9, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1026
    .line 1027
    add-int/2addr v3, v15

    .line 1028
    invoke-virtual {v0, v14}, Landroidx/appcompat/widget/j2;->getNextLocationOffset(Landroid/view/View;)I

    .line 1029
    .line 1030
    .line 1031
    move-result v15

    .line 1032
    add-int/2addr v15, v3

    .line 1033
    invoke-static {v2, v15}, Ljava/lang/Math;->max(II)I

    .line 1034
    .line 1035
    .line 1036
    move-result v2

    .line 1037
    iput v2, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 1038
    .line 1039
    goto :goto_1f

    .line 1040
    :goto_20
    if-eq v10, v15, :cond_2b

    .line 1041
    .line 1042
    iget v2, v9, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 1043
    .line 1044
    const/4 v3, -0x1

    .line 1045
    if-ne v2, v3, :cond_2b

    .line 1046
    .line 1047
    const/4 v2, 0x1

    .line 1048
    goto :goto_21

    .line 1049
    :cond_2b
    const/4 v2, 0x0

    .line 1050
    :goto_21
    iget v3, v9, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1051
    .line 1052
    iget v15, v9, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1053
    .line 1054
    add-int/2addr v3, v15

    .line 1055
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredHeight()I

    .line 1056
    .line 1057
    .line 1058
    move-result v15

    .line 1059
    add-int/2addr v15, v3

    .line 1060
    invoke-static {v6, v15}, Ljava/lang/Math;->max(II)I

    .line 1061
    .line 1062
    .line 1063
    move-result v6

    .line 1064
    if-eqz v2, :cond_2c

    .line 1065
    .line 1066
    goto :goto_22

    .line 1067
    :cond_2c
    move v3, v15

    .line 1068
    :goto_22
    invoke-static {v11, v3}, Ljava/lang/Math;->max(II)I

    .line 1069
    .line 1070
    .line 1071
    move-result v2

    .line 1072
    if-eqz v25, :cond_2d

    .line 1073
    .line 1074
    iget v3, v9, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 1075
    .line 1076
    const/4 v11, -0x1

    .line 1077
    if-ne v3, v11, :cond_2e

    .line 1078
    .line 1079
    const/4 v3, 0x1

    .line 1080
    goto :goto_23

    .line 1081
    :cond_2d
    const/4 v11, -0x1

    .line 1082
    :cond_2e
    const/4 v3, 0x0

    .line 1083
    :goto_23
    if-eqz v30, :cond_30

    .line 1084
    .line 1085
    invoke-virtual {v14}, Landroid/view/View;->getBaseline()I

    .line 1086
    .line 1087
    .line 1088
    move-result v14

    .line 1089
    if-eq v14, v11, :cond_30

    .line 1090
    .line 1091
    iget v9, v9, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 1092
    .line 1093
    if-gez v9, :cond_2f

    .line 1094
    .line 1095
    iget v9, v0, Landroidx/appcompat/widget/j2;->mGravity:I

    .line 1096
    .line 1097
    :cond_2f
    and-int/lit8 v9, v9, 0x70

    .line 1098
    .line 1099
    shr-int/lit8 v9, v9, 0x4

    .line 1100
    .line 1101
    and-int/lit8 v9, v9, -0x2

    .line 1102
    .line 1103
    shr-int/lit8 v9, v9, 0x1

    .line 1104
    .line 1105
    aget v11, v34, v9

    .line 1106
    .line 1107
    invoke-static {v11, v14}, Ljava/lang/Math;->max(II)I

    .line 1108
    .line 1109
    .line 1110
    move-result v11

    .line 1111
    aput v11, v34, v9

    .line 1112
    .line 1113
    aget v11, v28, v9

    .line 1114
    .line 1115
    sub-int/2addr v15, v14

    .line 1116
    invoke-static {v11, v15}, Ljava/lang/Math;->max(II)I

    .line 1117
    .line 1118
    .line 1119
    move-result v11

    .line 1120
    aput v11, v28, v9

    .line 1121
    .line 1122
    :cond_30
    move v11, v2

    .line 1123
    move/from16 v25, v3

    .line 1124
    .line 1125
    goto :goto_24

    .line 1126
    :cond_31
    const/high16 v22, -0x1000000

    .line 1127
    .line 1128
    goto/16 :goto_19

    .line 1129
    .line 1130
    :goto_24
    add-int/lit8 v12, v12, 0x1

    .line 1131
    .line 1132
    move/from16 v3, v27

    .line 1133
    .line 1134
    move/from16 v2, v33

    .line 1135
    .line 1136
    goto/16 :goto_18

    .line 1137
    .line 1138
    :cond_32
    move/from16 v27, v3

    .line 1139
    .line 1140
    const/high16 v22, -0x1000000

    .line 1141
    .line 1142
    iget v2, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 1143
    .line 1144
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 1145
    .line 1146
    .line 1147
    move-result v3

    .line 1148
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 1149
    .line 1150
    .line 1151
    move-result v5

    .line 1152
    add-int/2addr v5, v3

    .line 1153
    add-int/2addr v5, v2

    .line 1154
    iput v5, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 1155
    .line 1156
    aget v2, v34, v17

    .line 1157
    .line 1158
    const/4 v3, -0x1

    .line 1159
    if-ne v2, v3, :cond_34

    .line 1160
    .line 1161
    const/16 v31, 0x0

    .line 1162
    .line 1163
    aget v5, v34, v31

    .line 1164
    .line 1165
    if-ne v5, v3, :cond_34

    .line 1166
    .line 1167
    aget v5, v34, v16

    .line 1168
    .line 1169
    if-ne v5, v3, :cond_34

    .line 1170
    .line 1171
    aget v5, v34, v21

    .line 1172
    .line 1173
    if-eq v5, v3, :cond_33

    .line 1174
    .line 1175
    goto :goto_25

    .line 1176
    :cond_33
    const/16 v31, 0x0

    .line 1177
    .line 1178
    goto :goto_26

    .line 1179
    :cond_34
    :goto_25
    aget v3, v34, v21

    .line 1180
    .line 1181
    const/16 v31, 0x0

    .line 1182
    .line 1183
    aget v5, v34, v31

    .line 1184
    .line 1185
    aget v8, v34, v16

    .line 1186
    .line 1187
    invoke-static {v2, v8}, Ljava/lang/Math;->max(II)I

    .line 1188
    .line 1189
    .line 1190
    move-result v2

    .line 1191
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    .line 1192
    .line 1193
    .line 1194
    move-result v2

    .line 1195
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 1196
    .line 1197
    .line 1198
    move-result v2

    .line 1199
    aget v3, v28, v21

    .line 1200
    .line 1201
    aget v5, v28, v31

    .line 1202
    .line 1203
    aget v8, v28, v17

    .line 1204
    .line 1205
    aget v9, v28, v16

    .line 1206
    .line 1207
    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    .line 1208
    .line 1209
    .line 1210
    move-result v8

    .line 1211
    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    .line 1212
    .line 1213
    .line 1214
    move-result v5

    .line 1215
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 1216
    .line 1217
    .line 1218
    move-result v3

    .line 1219
    add-int/2addr v3, v2

    .line 1220
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 1221
    .line 1222
    .line 1223
    move-result v2

    .line 1224
    move v6, v2

    .line 1225
    :goto_26
    move v5, v11

    .line 1226
    :goto_27
    if-nez v25, :cond_35

    .line 1227
    .line 1228
    const/high16 v15, 0x40000000    # 2.0f

    .line 1229
    .line 1230
    if-eq v10, v15, :cond_35

    .line 1231
    .line 1232
    goto :goto_28

    .line 1233
    :cond_35
    move v5, v6

    .line 1234
    :goto_28
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 1235
    .line 1236
    .line 1237
    move-result v2

    .line 1238
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 1239
    .line 1240
    .line 1241
    move-result v3

    .line 1242
    add-int/2addr v3, v2

    .line 1243
    add-int/2addr v3, v5

    .line 1244
    invoke-virtual {v0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 1245
    .line 1246
    .line 1247
    move-result v2

    .line 1248
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 1249
    .line 1250
    .line 1251
    move-result v2

    .line 1252
    and-int v3, v13, v22

    .line 1253
    .line 1254
    or-int v3, v27, v3

    .line 1255
    .line 1256
    shl-int/lit8 v5, v13, 0x10

    .line 1257
    .line 1258
    invoke-static {v2, v1, v5}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 1259
    .line 1260
    .line 1261
    move-result v1

    .line 1262
    invoke-virtual {v0, v3, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 1263
    .line 1264
    .line 1265
    if-eqz v26, :cond_38

    .line 1266
    .line 1267
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 1268
    .line 1269
    .line 1270
    move-result v1

    .line 1271
    const/high16 v15, 0x40000000    # 2.0f

    .line 1272
    .line 1273
    invoke-static {v1, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1274
    .line 1275
    .line 1276
    move-result v1

    .line 1277
    const/4 v6, 0x0

    .line 1278
    :goto_29
    if-ge v6, v7, :cond_38

    .line 1279
    .line 1280
    move v4, v1

    .line 1281
    invoke-virtual {v0, v6}, Landroidx/appcompat/widget/j2;->getVirtualChildAt(I)Landroid/view/View;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v1

    .line 1285
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 1286
    .line 1287
    .line 1288
    move-result v2

    .line 1289
    const/16 v9, 0x8

    .line 1290
    .line 1291
    if-eq v2, v9, :cond_36

    .line 1292
    .line 1293
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v2

    .line 1297
    move-object v8, v2

    .line 1298
    check-cast v8, Landroidx/appcompat/widget/i2;

    .line 1299
    .line 1300
    iget v2, v8, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 1301
    .line 1302
    const/4 v13, -0x1

    .line 1303
    if-ne v2, v13, :cond_37

    .line 1304
    .line 1305
    iget v10, v8, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 1306
    .line 1307
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 1308
    .line 1309
    .line 1310
    move-result v2

    .line 1311
    iput v2, v8, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 1312
    .line 1313
    const/4 v3, 0x0

    .line 1314
    const/4 v5, 0x0

    .line 1315
    move/from16 v2, p1

    .line 1316
    .line 1317
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 1318
    .line 1319
    .line 1320
    iput v10, v8, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 1321
    .line 1322
    goto :goto_2a

    .line 1323
    :cond_36
    const/4 v13, -0x1

    .line 1324
    :cond_37
    :goto_2a
    add-int/lit8 v6, v6, 0x1

    .line 1325
    .line 1326
    move-object/from16 v0, p0

    .line 1327
    .line 1328
    move v1, v4

    .line 1329
    move/from16 v4, p1

    .line 1330
    .line 1331
    goto :goto_29

    .line 1332
    :cond_38
    return-void
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
.end method

.method public measureNullChild(I)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public measureVertical(II)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    iput v7, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/appcompat/widget/j2;->getVirtualChildCount()I

    .line 7
    .line 8
    .line 9
    move-result v8

    .line 10
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 11
    .line 12
    .line 13
    move-result v9

    .line 14
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 15
    .line 16
    .line 17
    move-result v10

    .line 18
    iget v11, v0, Landroidx/appcompat/widget/j2;->mBaselineAlignedChildIndex:I

    .line 19
    .line 20
    iget-boolean v12, v0, Landroidx/appcompat/widget/j2;->mUseLargestChild:Z

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v15, 0x0

    .line 29
    const/16 v16, 0x0

    .line 30
    .line 31
    const/16 v17, 0x1

    .line 32
    .line 33
    const/16 v18, 0x0

    .line 34
    .line 35
    const/16 v19, 0x1

    .line 36
    .line 37
    :goto_0
    const/high16 v13, -0x80000000

    .line 38
    .line 39
    const/16 v20, 0x0

    .line 40
    .line 41
    move/from16 v21, v3

    .line 42
    .line 43
    const/16 v3, 0x8

    .line 44
    .line 45
    const/high16 v7, 0x40000000    # 2.0f

    .line 46
    .line 47
    if-ge v2, v8, :cond_10

    .line 48
    .line 49
    move/from16 v22, v1

    .line 50
    .line 51
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/j2;->getVirtualChildAt(I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-nez v1, :cond_0

    .line 56
    .line 57
    iget v1, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/j2;->measureNullChild(I)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    add-int/2addr v3, v1

    .line 64
    iput v3, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 65
    .line 66
    :goto_1
    move/from16 v1, p1

    .line 67
    .line 68
    move/from16 v23, v8

    .line 69
    .line 70
    move/from16 v24, v12

    .line 71
    .line 72
    move/from16 v3, v21

    .line 73
    .line 74
    move/from16 v21, v10

    .line 75
    .line 76
    goto/16 :goto_d

    .line 77
    .line 78
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 79
    .line 80
    .line 81
    move-result v14

    .line 82
    if-ne v14, v3, :cond_1

    .line 83
    .line 84
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/widget/j2;->getChildrenSkipCount(Landroid/view/View;I)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    add-int/2addr v2, v1

    .line 89
    goto :goto_1

    .line 90
    :cond_1
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/j2;->hasDividerBeforeChildAt(I)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_2

    .line 95
    .line 96
    iget v3, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 97
    .line 98
    iget v14, v0, Landroidx/appcompat/widget/j2;->mDividerHeight:I

    .line 99
    .line 100
    add-int/2addr v3, v14

    .line 101
    iput v3, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 102
    .line 103
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    move-object v14, v3

    .line 108
    check-cast v14, Landroidx/appcompat/widget/i2;

    .line 109
    .line 110
    iget v3, v14, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 111
    .line 112
    add-float v22, v22, v3

    .line 113
    .line 114
    if-ne v10, v7, :cond_3

    .line 115
    .line 116
    iget v7, v14, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 117
    .line 118
    if-nez v7, :cond_3

    .line 119
    .line 120
    cmpl-float v7, v3, v20

    .line 121
    .line 122
    if-lez v7, :cond_3

    .line 123
    .line 124
    iget v3, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 125
    .line 126
    iget v7, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 127
    .line 128
    add-int/2addr v7, v3

    .line 129
    iget v13, v14, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 130
    .line 131
    add-int/2addr v7, v13

    .line 132
    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    iput v3, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 137
    .line 138
    move-object v3, v1

    .line 139
    move/from16 v23, v8

    .line 140
    .line 141
    move/from16 v24, v12

    .line 142
    .line 143
    move/from16 v25, v15

    .line 144
    .line 145
    move/from16 v12, v21

    .line 146
    .line 147
    const/16 v16, 0x1

    .line 148
    .line 149
    move/from16 v1, p1

    .line 150
    .line 151
    move v8, v5

    .line 152
    move v15, v6

    .line 153
    move/from16 v21, v10

    .line 154
    .line 155
    goto/16 :goto_5

    .line 156
    .line 157
    :cond_3
    iget v7, v14, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 158
    .line 159
    if-nez v7, :cond_4

    .line 160
    .line 161
    cmpl-float v3, v3, v20

    .line 162
    .line 163
    if-lez v3, :cond_4

    .line 164
    .line 165
    const/4 v3, -0x2

    .line 166
    iput v3, v14, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 167
    .line 168
    const/4 v7, 0x0

    .line 169
    goto :goto_2

    .line 170
    :cond_4
    const/high16 v7, -0x80000000

    .line 171
    .line 172
    :goto_2
    cmpl-float v3, v22, v20

    .line 173
    .line 174
    if-nez v3, :cond_5

    .line 175
    .line 176
    iget v3, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 177
    .line 178
    move/from16 v23, v6

    .line 179
    .line 180
    move v6, v3

    .line 181
    move/from16 v3, v23

    .line 182
    .line 183
    :goto_3
    move/from16 v23, v4

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_5
    move v3, v6

    .line 187
    const/4 v6, 0x0

    .line 188
    goto :goto_3

    .line 189
    :goto_4
    const/4 v4, 0x0

    .line 190
    move/from16 v24, v12

    .line 191
    .line 192
    move/from16 v25, v15

    .line 193
    .line 194
    move/from16 v12, v21

    .line 195
    .line 196
    move v15, v3

    .line 197
    move/from16 v21, v10

    .line 198
    .line 199
    move/from16 v10, v23

    .line 200
    .line 201
    move/from16 v3, p1

    .line 202
    .line 203
    move/from16 v23, v8

    .line 204
    .line 205
    move v8, v5

    .line 206
    move/from16 v5, p2

    .line 207
    .line 208
    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/j2;->measureChildBeforeLayout(Landroid/view/View;IIIII)V

    .line 209
    .line 210
    .line 211
    move/from16 v26, v3

    .line 212
    .line 213
    move-object v3, v1

    .line 214
    move/from16 v1, v26

    .line 215
    .line 216
    if-eq v7, v13, :cond_6

    .line 217
    .line 218
    iput v7, v14, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 219
    .line 220
    :cond_6
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    iget v5, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 225
    .line 226
    add-int v6, v5, v4

    .line 227
    .line 228
    iget v7, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 229
    .line 230
    add-int/2addr v6, v7

    .line 231
    iget v7, v14, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 232
    .line 233
    add-int/2addr v6, v7

    .line 234
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/j2;->getNextLocationOffset(Landroid/view/View;)I

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    add-int/2addr v7, v6

    .line 239
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    iput v5, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 244
    .line 245
    if-eqz v24, :cond_7

    .line 246
    .line 247
    invoke-static {v4, v10}, Ljava/lang/Math;->max(II)I

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    goto :goto_5

    .line 252
    :cond_7
    move v4, v10

    .line 253
    :goto_5
    if-ltz v11, :cond_8

    .line 254
    .line 255
    add-int/lit8 v5, v2, 0x1

    .line 256
    .line 257
    if-ne v11, v5, :cond_8

    .line 258
    .line 259
    iget v5, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 260
    .line 261
    iput v5, v0, Landroidx/appcompat/widget/j2;->mBaselineChildTop:I

    .line 262
    .line 263
    :cond_8
    if-ge v2, v11, :cond_9

    .line 264
    .line 265
    iget v5, v14, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 266
    .line 267
    cmpl-float v5, v5, v20

    .line 268
    .line 269
    if-gtz v5, :cond_a

    .line 270
    .line 271
    :cond_9
    const/high16 v5, 0x40000000    # 2.0f

    .line 272
    .line 273
    goto :goto_6

    .line 274
    :cond_a
    new-instance v1, Ljava/lang/RuntimeException;

    .line 275
    .line 276
    const-string v2, "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.  Either remove the weight, or don\'t set mBaselineAlignedChildIndex."

    .line 277
    .line 278
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    throw v1

    .line 282
    :goto_6
    if-eq v9, v5, :cond_b

    .line 283
    .line 284
    iget v5, v14, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 285
    .line 286
    const/4 v6, -0x1

    .line 287
    if-ne v5, v6, :cond_b

    .line 288
    .line 289
    const/4 v5, 0x1

    .line 290
    const/16 v18, 0x1

    .line 291
    .line 292
    goto :goto_7

    .line 293
    :cond_b
    const/4 v5, 0x0

    .line 294
    :goto_7
    iget v6, v14, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 295
    .line 296
    iget v7, v14, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 297
    .line 298
    add-int/2addr v6, v7

    .line 299
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 300
    .line 301
    .line 302
    move-result v7

    .line 303
    add-int/2addr v7, v6

    .line 304
    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    .line 305
    .line 306
    .line 307
    move-result v8

    .line 308
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredState()I

    .line 309
    .line 310
    .line 311
    move-result v10

    .line 312
    invoke-static {v15, v10}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 313
    .line 314
    .line 315
    move-result v10

    .line 316
    if-eqz v17, :cond_c

    .line 317
    .line 318
    iget v13, v14, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 319
    .line 320
    const/4 v15, -0x1

    .line 321
    if-ne v13, v15, :cond_c

    .line 322
    .line 323
    const/16 v17, 0x1

    .line 324
    .line 325
    goto :goto_8

    .line 326
    :cond_c
    const/16 v17, 0x0

    .line 327
    .line 328
    :goto_8
    iget v13, v14, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 329
    .line 330
    cmpl-float v13, v13, v20

    .line 331
    .line 332
    if-lez v13, :cond_e

    .line 333
    .line 334
    if-eqz v5, :cond_d

    .line 335
    .line 336
    goto :goto_9

    .line 337
    :cond_d
    move v6, v7

    .line 338
    :goto_9
    invoke-static {v12, v6}, Ljava/lang/Math;->max(II)I

    .line 339
    .line 340
    .line 341
    move-result v5

    .line 342
    move/from16 v15, v25

    .line 343
    .line 344
    goto :goto_c

    .line 345
    :cond_e
    if-eqz v5, :cond_f

    .line 346
    .line 347
    :goto_a
    move/from16 v7, v25

    .line 348
    .line 349
    goto :goto_b

    .line 350
    :cond_f
    move v6, v7

    .line 351
    goto :goto_a

    .line 352
    :goto_b
    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    .line 353
    .line 354
    .line 355
    move-result v15

    .line 356
    move v5, v12

    .line 357
    :goto_c
    invoke-virtual {v0, v3, v2}, Landroidx/appcompat/widget/j2;->getChildrenSkipCount(Landroid/view/View;I)I

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    add-int/2addr v2, v3

    .line 362
    move v3, v5

    .line 363
    move v5, v8

    .line 364
    move v6, v10

    .line 365
    :goto_d
    add-int/lit8 v2, v2, 0x1

    .line 366
    .line 367
    move/from16 v10, v21

    .line 368
    .line 369
    move/from16 v1, v22

    .line 370
    .line 371
    move/from16 v8, v23

    .line 372
    .line 373
    move/from16 v12, v24

    .line 374
    .line 375
    const/4 v7, 0x0

    .line 376
    goto/16 :goto_0

    .line 377
    .line 378
    :cond_10
    move/from16 v22, v1

    .line 379
    .line 380
    move/from16 v23, v8

    .line 381
    .line 382
    move/from16 v24, v12

    .line 383
    .line 384
    move v7, v15

    .line 385
    move/from16 v12, v21

    .line 386
    .line 387
    move/from16 v1, p1

    .line 388
    .line 389
    move v8, v5

    .line 390
    move v15, v6

    .line 391
    move/from16 v21, v10

    .line 392
    .line 393
    move v10, v4

    .line 394
    iget v2, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 395
    .line 396
    move/from16 v6, v23

    .line 397
    .line 398
    if-lez v2, :cond_11

    .line 399
    .line 400
    invoke-virtual {v0, v6}, Landroidx/appcompat/widget/j2;->hasDividerBeforeChildAt(I)Z

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    if-eqz v2, :cond_11

    .line 405
    .line 406
    iget v2, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 407
    .line 408
    iget v4, v0, Landroidx/appcompat/widget/j2;->mDividerHeight:I

    .line 409
    .line 410
    add-int/2addr v2, v4

    .line 411
    iput v2, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 412
    .line 413
    :cond_11
    move/from16 v2, v21

    .line 414
    .line 415
    if-eqz v24, :cond_15

    .line 416
    .line 417
    if-eq v2, v13, :cond_12

    .line 418
    .line 419
    if-nez v2, :cond_15

    .line 420
    .line 421
    :cond_12
    const/4 v4, 0x0

    .line 422
    iput v4, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 423
    .line 424
    const/4 v4, 0x0

    .line 425
    :goto_e
    if-ge v4, v6, :cond_15

    .line 426
    .line 427
    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/j2;->getVirtualChildAt(I)Landroid/view/View;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    if-nez v5, :cond_13

    .line 432
    .line 433
    iget v5, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 434
    .line 435
    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/j2;->measureNullChild(I)I

    .line 436
    .line 437
    .line 438
    move-result v11

    .line 439
    add-int/2addr v11, v5

    .line 440
    iput v11, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 441
    .line 442
    goto :goto_f

    .line 443
    :cond_13
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 444
    .line 445
    .line 446
    move-result v11

    .line 447
    if-ne v11, v3, :cond_14

    .line 448
    .line 449
    invoke-virtual {v0, v5, v4}, Landroidx/appcompat/widget/j2;->getChildrenSkipCount(Landroid/view/View;I)I

    .line 450
    .line 451
    .line 452
    move-result v5

    .line 453
    add-int/2addr v4, v5

    .line 454
    goto :goto_f

    .line 455
    :cond_14
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 456
    .line 457
    .line 458
    move-result-object v11

    .line 459
    check-cast v11, Landroidx/appcompat/widget/i2;

    .line 460
    .line 461
    iget v13, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 462
    .line 463
    add-int v14, v13, v10

    .line 464
    .line 465
    iget v3, v11, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 466
    .line 467
    add-int/2addr v14, v3

    .line 468
    iget v3, v11, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 469
    .line 470
    add-int/2addr v14, v3

    .line 471
    invoke-virtual {v0, v5}, Landroidx/appcompat/widget/j2;->getNextLocationOffset(Landroid/view/View;)I

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    add-int/2addr v3, v14

    .line 476
    invoke-static {v13, v3}, Ljava/lang/Math;->max(II)I

    .line 477
    .line 478
    .line 479
    move-result v3

    .line 480
    iput v3, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 481
    .line 482
    :goto_f
    add-int/lit8 v4, v4, 0x1

    .line 483
    .line 484
    const/16 v3, 0x8

    .line 485
    .line 486
    goto :goto_e

    .line 487
    :cond_15
    iget v3, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 488
    .line 489
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 490
    .line 491
    .line 492
    move-result v4

    .line 493
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 494
    .line 495
    .line 496
    move-result v5

    .line 497
    add-int/2addr v5, v4

    .line 498
    add-int/2addr v5, v3

    .line 499
    iput v5, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 500
    .line 501
    invoke-virtual {v0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    .line 506
    .line 507
    .line 508
    move-result v3

    .line 509
    move/from16 v4, p2

    .line 510
    .line 511
    const/4 v5, 0x0

    .line 512
    invoke-static {v3, v4, v5}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 513
    .line 514
    .line 515
    move-result v3

    .line 516
    const v5, 0xffffff

    .line 517
    .line 518
    .line 519
    and-int/2addr v5, v3

    .line 520
    iget v11, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 521
    .line 522
    sub-int/2addr v5, v11

    .line 523
    if-nez v16, :cond_19

    .line 524
    .line 525
    if-eqz v5, :cond_16

    .line 526
    .line 527
    cmpl-float v11, v22, v20

    .line 528
    .line 529
    if-lez v11, :cond_16

    .line 530
    .line 531
    goto :goto_12

    .line 532
    :cond_16
    invoke-static {v7, v12}, Ljava/lang/Math;->max(II)I

    .line 533
    .line 534
    .line 535
    move-result v5

    .line 536
    if-eqz v24, :cond_25

    .line 537
    .line 538
    const/high16 v7, 0x40000000    # 2.0f

    .line 539
    .line 540
    if-eq v2, v7, :cond_25

    .line 541
    .line 542
    const/4 v2, 0x0

    .line 543
    :goto_10
    if-ge v2, v6, :cond_25

    .line 544
    .line 545
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/j2;->getVirtualChildAt(I)Landroid/view/View;

    .line 546
    .line 547
    .line 548
    move-result-object v7

    .line 549
    if-eqz v7, :cond_18

    .line 550
    .line 551
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 552
    .line 553
    .line 554
    move-result v11

    .line 555
    const/16 v12, 0x8

    .line 556
    .line 557
    if-ne v11, v12, :cond_17

    .line 558
    .line 559
    goto :goto_11

    .line 560
    :cond_17
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 561
    .line 562
    .line 563
    move-result-object v11

    .line 564
    check-cast v11, Landroidx/appcompat/widget/i2;

    .line 565
    .line 566
    iget v11, v11, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 567
    .line 568
    cmpl-float v11, v11, v20

    .line 569
    .line 570
    if-lez v11, :cond_18

    .line 571
    .line 572
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    .line 573
    .line 574
    .line 575
    move-result v11

    .line 576
    const/high16 v12, 0x40000000    # 2.0f

    .line 577
    .line 578
    invoke-static {v11, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 579
    .line 580
    .line 581
    move-result v11

    .line 582
    invoke-static {v10, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 583
    .line 584
    .line 585
    move-result v13

    .line 586
    invoke-virtual {v7, v11, v13}, Landroid/view/View;->measure(II)V

    .line 587
    .line 588
    .line 589
    :cond_18
    :goto_11
    add-int/lit8 v2, v2, 0x1

    .line 590
    .line 591
    goto :goto_10

    .line 592
    :cond_19
    :goto_12
    iget v10, v0, Landroidx/appcompat/widget/j2;->mWeightSum:F

    .line 593
    .line 594
    cmpl-float v11, v10, v20

    .line 595
    .line 596
    if-lez v11, :cond_1a

    .line 597
    .line 598
    move/from16 v22, v10

    .line 599
    .line 600
    :cond_1a
    const/4 v10, 0x0

    .line 601
    iput v10, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 602
    .line 603
    move v11, v7

    .line 604
    move v7, v5

    .line 605
    const/4 v5, 0x0

    .line 606
    :goto_13
    if-ge v5, v6, :cond_24

    .line 607
    .line 608
    invoke-virtual {v0, v5}, Landroidx/appcompat/widget/j2;->getVirtualChildAt(I)Landroid/view/View;

    .line 609
    .line 610
    .line 611
    move-result-object v12

    .line 612
    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    .line 613
    .line 614
    .line 615
    move-result v13

    .line 616
    const/16 v14, 0x8

    .line 617
    .line 618
    if-ne v13, v14, :cond_1b

    .line 619
    .line 620
    move/from16 v16, v2

    .line 621
    .line 622
    goto/16 :goto_19

    .line 623
    .line 624
    :cond_1b
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 625
    .line 626
    .line 627
    move-result-object v13

    .line 628
    check-cast v13, Landroidx/appcompat/widget/i2;

    .line 629
    .line 630
    iget v14, v13, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 631
    .line 632
    cmpl-float v16, v14, v20

    .line 633
    .line 634
    if-lez v16, :cond_20

    .line 635
    .line 636
    int-to-float v10, v7

    .line 637
    mul-float v10, v10, v14

    .line 638
    .line 639
    div-float v10, v10, v22

    .line 640
    .line 641
    float-to-int v10, v10

    .line 642
    sub-float v22, v22, v14

    .line 643
    .line 644
    sub-int/2addr v7, v10

    .line 645
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 646
    .line 647
    .line 648
    move-result v14

    .line 649
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 650
    .line 651
    .line 652
    move-result v16

    .line 653
    add-int v16, v16, v14

    .line 654
    .line 655
    iget v14, v13, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 656
    .line 657
    add-int v16, v16, v14

    .line 658
    .line 659
    iget v14, v13, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 660
    .line 661
    add-int v14, v16, v14

    .line 662
    .line 663
    iget v4, v13, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 664
    .line 665
    invoke-static {v1, v14, v4}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 666
    .line 667
    .line 668
    move-result v4

    .line 669
    iget v14, v13, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 670
    .line 671
    if-nez v14, :cond_1e

    .line 672
    .line 673
    const/high16 v14, 0x40000000    # 2.0f

    .line 674
    .line 675
    if-eq v2, v14, :cond_1c

    .line 676
    .line 677
    goto :goto_15

    .line 678
    :cond_1c
    if-lez v10, :cond_1d

    .line 679
    .line 680
    goto :goto_14

    .line 681
    :cond_1d
    const/4 v10, 0x0

    .line 682
    :goto_14
    invoke-static {v10, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 683
    .line 684
    .line 685
    move-result v10

    .line 686
    invoke-virtual {v12, v4, v10}, Landroid/view/View;->measure(II)V

    .line 687
    .line 688
    .line 689
    goto :goto_16

    .line 690
    :cond_1e
    const/high16 v14, 0x40000000    # 2.0f

    .line 691
    .line 692
    :goto_15
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 693
    .line 694
    .line 695
    move-result v16

    .line 696
    add-int v10, v16, v10

    .line 697
    .line 698
    if-gez v10, :cond_1f

    .line 699
    .line 700
    const/4 v10, 0x0

    .line 701
    :cond_1f
    invoke-static {v10, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 702
    .line 703
    .line 704
    move-result v10

    .line 705
    invoke-virtual {v12, v4, v10}, Landroid/view/View;->measure(II)V

    .line 706
    .line 707
    .line 708
    :goto_16
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredState()I

    .line 709
    .line 710
    .line 711
    move-result v4

    .line 712
    and-int/lit16 v4, v4, -0x100

    .line 713
    .line 714
    invoke-static {v15, v4}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 715
    .line 716
    .line 717
    move-result v15

    .line 718
    :cond_20
    iget v4, v13, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 719
    .line 720
    iget v10, v13, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 721
    .line 722
    add-int/2addr v4, v10

    .line 723
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 724
    .line 725
    .line 726
    move-result v10

    .line 727
    add-int/2addr v10, v4

    .line 728
    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    .line 729
    .line 730
    .line 731
    move-result v8

    .line 732
    const/high16 v14, 0x40000000    # 2.0f

    .line 733
    .line 734
    if-eq v9, v14, :cond_21

    .line 735
    .line 736
    iget v14, v13, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 737
    .line 738
    move/from16 v16, v2

    .line 739
    .line 740
    const/4 v2, -0x1

    .line 741
    if-ne v14, v2, :cond_22

    .line 742
    .line 743
    goto :goto_17

    .line 744
    :cond_21
    move/from16 v16, v2

    .line 745
    .line 746
    const/4 v2, -0x1

    .line 747
    :cond_22
    move v4, v10

    .line 748
    :goto_17
    invoke-static {v11, v4}, Ljava/lang/Math;->max(II)I

    .line 749
    .line 750
    .line 751
    move-result v4

    .line 752
    if-eqz v17, :cond_23

    .line 753
    .line 754
    iget v10, v13, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 755
    .line 756
    if-ne v10, v2, :cond_23

    .line 757
    .line 758
    const/4 v2, 0x1

    .line 759
    goto :goto_18

    .line 760
    :cond_23
    const/4 v2, 0x0

    .line 761
    :goto_18
    iget v10, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 762
    .line 763
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 764
    .line 765
    .line 766
    move-result v11

    .line 767
    add-int/2addr v11, v10

    .line 768
    iget v14, v13, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 769
    .line 770
    add-int/2addr v11, v14

    .line 771
    iget v13, v13, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 772
    .line 773
    add-int/2addr v11, v13

    .line 774
    invoke-virtual {v0, v12}, Landroidx/appcompat/widget/j2;->getNextLocationOffset(Landroid/view/View;)I

    .line 775
    .line 776
    .line 777
    move-result v12

    .line 778
    add-int/2addr v12, v11

    .line 779
    invoke-static {v10, v12}, Ljava/lang/Math;->max(II)I

    .line 780
    .line 781
    .line 782
    move-result v10

    .line 783
    iput v10, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 784
    .line 785
    move/from16 v17, v2

    .line 786
    .line 787
    move v11, v4

    .line 788
    :goto_19
    add-int/lit8 v5, v5, 0x1

    .line 789
    .line 790
    move/from16 v4, p2

    .line 791
    .line 792
    move/from16 v2, v16

    .line 793
    .line 794
    const/4 v10, 0x0

    .line 795
    goto/16 :goto_13

    .line 796
    .line 797
    :cond_24
    iget v2, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 798
    .line 799
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 800
    .line 801
    .line 802
    move-result v4

    .line 803
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 804
    .line 805
    .line 806
    move-result v5

    .line 807
    add-int/2addr v5, v4

    .line 808
    add-int/2addr v5, v2

    .line 809
    iput v5, v0, Landroidx/appcompat/widget/j2;->mTotalLength:I

    .line 810
    .line 811
    move v5, v11

    .line 812
    :cond_25
    if-nez v17, :cond_26

    .line 813
    .line 814
    const/high16 v14, 0x40000000    # 2.0f

    .line 815
    .line 816
    if-eq v9, v14, :cond_26

    .line 817
    .line 818
    goto :goto_1a

    .line 819
    :cond_26
    move v5, v8

    .line 820
    :goto_1a
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 821
    .line 822
    .line 823
    move-result v2

    .line 824
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 825
    .line 826
    .line 827
    move-result v4

    .line 828
    add-int/2addr v4, v2

    .line 829
    add-int/2addr v4, v5

    .line 830
    invoke-virtual {v0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 831
    .line 832
    .line 833
    move-result v2

    .line 834
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    .line 835
    .line 836
    .line 837
    move-result v2

    .line 838
    invoke-static {v2, v1, v15}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 839
    .line 840
    .line 841
    move-result v1

    .line 842
    invoke-virtual {v0, v1, v3}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 843
    .line 844
    .line 845
    if-eqz v18, :cond_29

    .line 846
    .line 847
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 848
    .line 849
    .line 850
    move-result v1

    .line 851
    const/high16 v14, 0x40000000    # 2.0f

    .line 852
    .line 853
    invoke-static {v1, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 854
    .line 855
    .line 856
    move-result v2

    .line 857
    const/4 v7, 0x0

    .line 858
    :goto_1b
    if-ge v7, v6, :cond_29

    .line 859
    .line 860
    invoke-virtual {v0, v7}, Landroidx/appcompat/widget/j2;->getVirtualChildAt(I)Landroid/view/View;

    .line 861
    .line 862
    .line 863
    move-result-object v1

    .line 864
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 865
    .line 866
    .line 867
    move-result v3

    .line 868
    const/16 v14, 0x8

    .line 869
    .line 870
    if-eq v3, v14, :cond_28

    .line 871
    .line 872
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 873
    .line 874
    .line 875
    move-result-object v3

    .line 876
    move-object v8, v3

    .line 877
    check-cast v8, Landroidx/appcompat/widget/i2;

    .line 878
    .line 879
    iget v3, v8, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 880
    .line 881
    const/4 v15, -0x1

    .line 882
    if-ne v3, v15, :cond_27

    .line 883
    .line 884
    iget v9, v8, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 885
    .line 886
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 887
    .line 888
    .line 889
    move-result v3

    .line 890
    iput v3, v8, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 891
    .line 892
    const/4 v3, 0x0

    .line 893
    const/4 v5, 0x0

    .line 894
    move/from16 v4, p2

    .line 895
    .line 896
    const/16 v21, 0x8

    .line 897
    .line 898
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 899
    .line 900
    .line 901
    iput v9, v8, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 902
    .line 903
    goto :goto_1d

    .line 904
    :cond_27
    :goto_1c
    const/16 v21, 0x8

    .line 905
    .line 906
    goto :goto_1d

    .line 907
    :cond_28
    const/4 v15, -0x1

    .line 908
    goto :goto_1c

    .line 909
    :goto_1d
    add-int/lit8 v7, v7, 0x1

    .line 910
    .line 911
    move-object/from16 v0, p0

    .line 912
    .line 913
    goto :goto_1b

    .line 914
    :cond_29
    return-void
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/j2;->mDivider:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Landroidx/appcompat/widget/j2;->mOrientation:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/j2;->drawDividersVertical(Landroid/graphics/Canvas;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/j2;->drawDividersHorizontal(Landroid/graphics/Canvas;)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "androidx.appcompat.widget.LinearLayoutCompat"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "androidx.appcompat.widget.LinearLayoutCompat"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onLayout(ZIIII)V
    .locals 1

    .line 1
    iget p1, p0, Landroidx/appcompat/widget/j2;->mOrientation:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, p2, p3, p4, p5}, Landroidx/appcompat/widget/j2;->layoutVertical(IIII)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0, p2, p3, p4, p5}, Landroidx/appcompat/widget/j2;->layoutHorizontal(IIII)V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
.end method

.method public onMeasure(II)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/j2;->mOrientation:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/j2;->measureVertical(II)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/j2;->measureHorizontal(II)V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public setBaselineAligned(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/appcompat/widget/j2;->mBaselineAligned:Z

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setBaselineAlignedChildIndex(I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    iput p1, p0, Landroidx/appcompat/widget/j2;->mBaselineAlignedChildIndex:I

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, "base aligned child index out of range (0, "

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ")"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method

.method public setDividerDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/j2;->mDivider:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-object p1, p0, Landroidx/appcompat/widget/j2;->mDivider:Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput v1, p0, Landroidx/appcompat/widget/j2;->mDividerWidth:I

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput v1, p0, Landroidx/appcompat/widget/j2;->mDividerHeight:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iput v0, p0, Landroidx/appcompat/widget/j2;->mDividerWidth:I

    .line 25
    .line 26
    iput v0, p0, Landroidx/appcompat/widget/j2;->mDividerHeight:I

    .line 27
    .line 28
    :goto_0
    if-nez p1, :cond_2

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    :cond_2
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public setDividerPadding(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/j2;->mDividerPadding:I

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setGravity(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/j2;->mGravity:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    const v0, 0x800007

    .line 6
    .line 7
    .line 8
    and-int/2addr v0, p1

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const v0, 0x800003

    .line 12
    .line 13
    .line 14
    or-int/2addr p1, v0

    .line 15
    :cond_0
    and-int/lit8 v0, p1, 0x70

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    or-int/lit8 p1, p1, 0x30

    .line 20
    .line 21
    :cond_1
    iput p1, p0, Landroidx/appcompat/widget/j2;->mGravity:I

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 24
    .line 25
    .line 26
    :cond_2
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setHorizontalGravity(I)V
    .locals 2

    .line 1
    const v0, 0x800007

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    iget v1, p0, Landroidx/appcompat/widget/j2;->mGravity:I

    .line 6
    .line 7
    and-int/2addr v0, v1

    .line 8
    if-eq v0, p1, :cond_0

    .line 9
    .line 10
    const v0, -0x800008

    .line 11
    .line 12
    .line 13
    and-int/2addr v0, v1

    .line 14
    or-int/2addr p1, v0

    .line 15
    iput p1, p0, Landroidx/appcompat/widget/j2;->mGravity:I

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setMeasureWithLargestChildEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/appcompat/widget/j2;->mUseLargestChild:Z

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setOrientation(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/j2;->mOrientation:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Landroidx/appcompat/widget/j2;->mOrientation:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setShowDividers(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/j2;->mShowDividers:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput p1, p0, Landroidx/appcompat/widget/j2;->mShowDividers:I

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setVerticalGravity(I)V
    .locals 2

    .line 1
    and-int/lit8 p1, p1, 0x70

    .line 2
    .line 3
    iget v0, p0, Landroidx/appcompat/widget/j2;->mGravity:I

    .line 4
    .line 5
    and-int/lit8 v1, v0, 0x70

    .line 6
    .line 7
    if-eq v1, p1, :cond_0

    .line 8
    .line 9
    and-int/lit8 v0, v0, -0x71

    .line 10
    .line 11
    or-int/2addr p1, v0

    .line 12
    iput p1, p0, Landroidx/appcompat/widget/j2;->mGravity:I

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setWeightSum(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    iput p1, p0, Landroidx/appcompat/widget/j2;->mWeightSum:F

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

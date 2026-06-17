.class public final Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ClickableViewAccessibility"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView$LayoutManager;,
        Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView$SavedState;
    }
.end annotation


# instance fields
.field private alwaysHideIconName:Z

.field private animateIcons:Z

.field private final icons:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ldev/jahir/blueprint/data/models/Icon;",
            ">;"
        }
    .end annotation
.end field

.field private final iconsAdapter$delegate:Lp4/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    new-instance p3, Ldev/jahir/blueprint/extensions/b;

    const/4 v0, 0x3

    invoke-direct {p3, v0, p1, p0}, Ldev/jahir/blueprint/extensions/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p3}, Le6/d;->A(Ld5/a;)Lp4/i;

    move-result-object p3

    iput-object p3, p0, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->iconsAdapter$delegate:Lp4/c;

    .line 6
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->icons:Ljava/util/ArrayList;

    const/4 p3, 0x1

    .line 7
    iput-boolean p3, p0, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->animateIcons:Z

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    .line 8
    sget-object v1, Ldev/jahir/blueprint/R$styleable;->IconsPreviewRecyclerView:[I

    const-string v2, "IconsPreviewRecyclerView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1, p2, v1, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 10
    sget v1, Ldev/jahir/blueprint/R$styleable;->IconsPreviewRecyclerView_always_hide_icon_name:I

    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 11
    sget v1, Ldev/jahir/blueprint/R$styleable;->IconsPreviewRecyclerView_always_hide_icon_name:I

    .line 12
    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    .line 13
    iput-boolean v1, p0, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->alwaysHideIconName:Z

    .line 14
    :cond_0
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 15
    :cond_1
    invoke-virtual {p0, p3}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 16
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 17
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 18
    new-instance p2, Landroidx/recyclerview/widget/r;

    invoke-direct {p2}, Landroidx/recyclerview/widget/r;-><init>()V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/k1;)V

    .line 19
    new-instance p2, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView$LayoutManager;

    sget p3, Ldev/jahir/blueprint/R$integer;->icons_columns_count:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, p3, v0, v1, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->integer$default(Landroid/content/Context;IIILjava/lang/Object;)I

    move-result p3

    invoke-direct {p2, p1, p3}, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView$LayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/p1;)V

    .line 20
    new-instance p2, Ldev/jahir/frames/ui/decorations/GridSpacingItemDecoration;

    .line 21
    sget p3, Ldev/jahir/blueprint/R$integer;->icons_columns_count:I

    invoke-static {p1, p3, v0, v1, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->integer$default(Landroid/content/Context;IIILjava/lang/Object;)I

    move-result p3

    .line 22
    sget v3, Ldev/jahir/frames/R$dimen;->grids_spacing:I

    invoke-static {p1, v3, v0, v1, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->dimenPixelSize$default(Landroid/content/Context;IIILjava/lang/Object;)I

    move-result p1

    .line 23
    invoke-direct {p2, p3, p1, v0}, Ldev/jahir/frames/ui/decorations/GridSpacingItemDecoration;-><init>(IIZ)V

    .line 24
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/l1;)V

    .line 25
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->getIconsAdapter()Ldev/jahir/blueprint/ui/adapters/IconsAdapter;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/c1;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final getIconsAdapter()Ldev/jahir/blueprint/ui/adapters/IconsAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->iconsAdapter$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;

    .line 8
    .line 9
    return-object v0
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

.method private static final iconsAdapter_delegate$lambda$0(Landroid/content/Context;Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;)Ldev/jahir/blueprint/ui/adapters/IconsAdapter;
    .locals 6

    .line 1
    new-instance v0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;

    .line 2
    .line 3
    sget v1, Ldev/jahir/blueprint/R$bool;->icon_name_in_grid_list:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    invoke-static {p0, v1, v4, v2, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean$default(Landroid/content/Context;IZILjava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    iget-boolean p0, p1, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->alwaysHideIconName:Z

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v3, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v3, 0x0

    .line 22
    :goto_0
    const/4 v4, 0x3

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v1, 0x0

    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct/range {v0 .. v5}, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;-><init>(ZLd5/p;ZILkotlin/jvm/internal/e;)V

    .line 27
    .line 28
    .line 29
    return-object v0
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

.method public static synthetic s(Landroid/content/Context;Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;)Ldev/jahir/blueprint/ui/adapters/IconsAdapter;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->iconsAdapter_delegate$lambda$0(Landroid/content/Context;Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;)Ldev/jahir/blueprint/ui/adapters/IconsAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static synthetic setOnIconClickListener$library_release$default(Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;Ld5/p;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->setOnIconClickListener$library_release(Ld5/p;)V

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
.end method


# virtual methods
.method public final getAnimateIcons$library_release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->animateIcons:Z

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

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView$SavedState;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p1, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView$SavedState;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object p1, v1

    .line 15
    :goto_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-object v0, v1

    .line 23
    :goto_1
    invoke-super {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    invoke-virtual {p1}, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView$SavedState;->getIcons()Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :cond_2
    if-nez v1, :cond_3

    .line 35
    .line 36
    sget-object v1, Lq4/r;->h:Lq4/r;

    .line 37
    .line 38
    :cond_3
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->setIcons$library_release(Ljava/util/List;)V

    .line 42
    .line 43
    .line 44
    return-void
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

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView$SavedState;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->icons:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView$SavedState;->setIcons(Ljava/util/ArrayList;)V

    .line 13
    .line 14
    .line 15
    return-object v1
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

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
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

.method public performClick()Z
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

.method public final setAnimateIcons$library_release(Z)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->animateIcons:Z

    .line 2
    .line 3
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->getIconsAdapter()Ldev/jahir/blueprint/ui/adapters/IconsAdapter;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->setAnimate(Z)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->getIconsAdapter()Ldev/jahir/blueprint/ui/adapters/IconsAdapter;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

    .line 15
    .line 16
    .line 17
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

.method public final setIcons$library_release(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/blueprint/data/models/Icon;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "newIcons"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "getContext(...)"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sget v1, Ldev/jahir/blueprint/R$integer;->icons_columns_count:I

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-static {v0, v1, v3, v2, v4}, Ldev/jahir/frames/extensions/context/ContextKt;->integer$default(Landroid/content/Context;IIILjava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-gt v1, v0, :cond_1

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    :cond_1
    iget-object v1, p0, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->icons:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->icons:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-interface {p1, v3, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 53
    .line 54
    .line 55
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->getIconsAdapter()Ldev/jahir/blueprint/ui/adapters/IconsAdapter;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object v0, p0, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->icons:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->setIcons(Ljava/util/ArrayList;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->icons:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-nez p1, :cond_2

    .line 71
    .line 72
    const/4 p1, 0x1

    .line 73
    invoke-static {p0, v3, p1, v4}, Ldev/jahir/frames/extensions/views/ViewKt;->visible$default(Landroid/view/View;ZILjava/lang/Object;)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    :cond_2
    :goto_0
    return-void
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

.method public final setOnIconClickListener$library_release(Ld5/p;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld5/p;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->getIconsAdapter()Ldev/jahir/blueprint/ui/adapters/IconsAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->setOnClick(Ld5/p;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/widgets/IconsPreviewRecyclerView;->getIconsAdapter()Ldev/jahir/blueprint/ui/adapters/IconsAdapter;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

    .line 13
    .line 14
    .line 15
    return-void
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

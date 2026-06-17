.class public Landroidx/appcompat/widget/r2;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ll/c0;


# static fields
.field public static final H:Ljava/lang/reflect/Method;

.field public static final I:Ljava/lang/reflect/Method;

.field public static final J:Ljava/lang/reflect/Method;


# instance fields
.field public final A:Landroidx/appcompat/widget/p2;

.field public final B:Landroidx/appcompat/widget/n2;

.field public final C:Landroid/os/Handler;

.field public final D:Landroid/graphics/Rect;

.field public E:Landroid/graphics/Rect;

.field public F:Z

.field public final G:Landroidx/appcompat/widget/h0;

.field public final h:Landroid/content/Context;

.field public i:Landroid/widget/ListAdapter;

.field public j:Landroidx/appcompat/widget/e2;

.field public final k:I

.field public l:I

.field public m:I

.field public n:I

.field public final o:I

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:I

.field public final t:I

.field public u:Landroidx/appcompat/widget/o2;

.field public v:Landroid/view/View;

.field public w:Landroid/widget/AdapterView$OnItemClickListener;

.field public x:Landroid/widget/AdapterView$OnItemSelectedListener;

.field public final y:Landroidx/appcompat/widget/n2;

.field public final z:Landroidx/appcompat/widget/q2;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    const-string v5, "ListPopupWindow"

    .line 10
    .line 11
    const-class v6, Landroid/widget/PopupWindow;

    .line 12
    .line 13
    if-gt v0, v1, :cond_0

    .line 14
    .line 15
    :try_start_0
    const-string v0, "setClipToScreenEnabled"

    .line 16
    .line 17
    new-array v1, v3, [Ljava/lang/Class;

    .line 18
    .line 19
    aput-object v4, v1, v2

    .line 20
    .line 21
    invoke-virtual {v6, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Landroidx/appcompat/widget/r2;->H:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    const-string v0, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well."

    .line 29
    .line 30
    invoke-static {v5, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    :goto_0
    :try_start_1
    const-string v0, "setEpicenterBounds"

    .line 34
    .line 35
    new-array v1, v3, [Ljava/lang/Class;

    .line 36
    .line 37
    const-class v7, Landroid/graphics/Rect;

    .line 38
    .line 39
    aput-object v7, v1, v2

    .line 40
    .line 41
    invoke-virtual {v6, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Landroidx/appcompat/widget/r2;->J:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catch_1
    const-string v0, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well."

    .line 49
    .line 50
    invoke-static {v5, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    :cond_0
    :goto_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 54
    .line 55
    const/16 v1, 0x17

    .line 56
    .line 57
    if-gt v0, v1, :cond_1

    .line 58
    .line 59
    :try_start_2
    const-string v0, "getMaxAvailableHeight"

    .line 60
    .line 61
    const/4 v1, 0x3

    .line 62
    new-array v1, v1, [Ljava/lang/Class;

    .line 63
    .line 64
    const-class v7, Landroid/view/View;

    .line 65
    .line 66
    aput-object v7, v1, v2

    .line 67
    .line 68
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 69
    .line 70
    aput-object v2, v1, v3

    .line 71
    .line 72
    const/4 v2, 0x2

    .line 73
    aput-object v4, v1, v2

    .line 74
    .line 75
    invoke-virtual {v6, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Landroidx/appcompat/widget/r2;->I:Ljava/lang/reflect/Method;
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_2

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catch_2
    const-string v0, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well."

    .line 83
    .line 84
    invoke-static {v5, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    :cond_1
    :goto_2
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p4, -0x2

    .line 5
    iput p4, p0, Landroidx/appcompat/widget/r2;->k:I

    .line 6
    .line 7
    iput p4, p0, Landroidx/appcompat/widget/r2;->l:I

    .line 8
    .line 9
    const/16 p4, 0x3ea

    .line 10
    .line 11
    iput p4, p0, Landroidx/appcompat/widget/r2;->o:I

    .line 12
    .line 13
    const/4 p4, 0x0

    .line 14
    iput p4, p0, Landroidx/appcompat/widget/r2;->s:I

    .line 15
    .line 16
    const v0, 0x7fffffff

    .line 17
    .line 18
    .line 19
    iput v0, p0, Landroidx/appcompat/widget/r2;->t:I

    .line 20
    .line 21
    new-instance v0, Landroidx/appcompat/widget/n2;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-direct {v0, p0, v1}, Landroidx/appcompat/widget/n2;-><init>(Landroidx/appcompat/widget/r2;I)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Landroidx/appcompat/widget/r2;->y:Landroidx/appcompat/widget/n2;

    .line 28
    .line 29
    new-instance v0, Landroidx/appcompat/widget/q2;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Landroidx/appcompat/widget/q2;-><init>(Landroidx/appcompat/widget/r2;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Landroidx/appcompat/widget/r2;->z:Landroidx/appcompat/widget/q2;

    .line 35
    .line 36
    new-instance v0, Landroidx/appcompat/widget/p2;

    .line 37
    .line 38
    invoke-direct {v0, p0}, Landroidx/appcompat/widget/p2;-><init>(Landroidx/appcompat/widget/r2;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Landroidx/appcompat/widget/r2;->A:Landroidx/appcompat/widget/p2;

    .line 42
    .line 43
    new-instance v0, Landroidx/appcompat/widget/n2;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-direct {v0, p0, v1}, Landroidx/appcompat/widget/n2;-><init>(Landroidx/appcompat/widget/r2;I)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Landroidx/appcompat/widget/r2;->B:Landroidx/appcompat/widget/n2;

    .line 50
    .line 51
    new-instance v0, Landroid/graphics/Rect;

    .line 52
    .line 53
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Landroidx/appcompat/widget/r2;->D:Landroid/graphics/Rect;

    .line 57
    .line 58
    iput-object p1, p0, Landroidx/appcompat/widget/r2;->h:Landroid/content/Context;

    .line 59
    .line 60
    new-instance v0, Landroid/os/Handler;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, Landroidx/appcompat/widget/r2;->C:Landroid/os/Handler;

    .line 70
    .line 71
    sget-object v0, Lf/j;->ListPopupWindow:[I

    .line 72
    .line 73
    invoke-virtual {p1, p2, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sget v1, Lf/j;->ListPopupWindow_android_dropDownHorizontalOffset:I

    .line 78
    .line 79
    invoke-virtual {v0, v1, p4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    iput v1, p0, Landroidx/appcompat/widget/r2;->m:I

    .line 84
    .line 85
    sget v1, Lf/j;->ListPopupWindow_android_dropDownVerticalOffset:I

    .line 86
    .line 87
    invoke-virtual {v0, v1, p4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    iput v1, p0, Landroidx/appcompat/widget/r2;->n:I

    .line 92
    .line 93
    const/4 v2, 0x1

    .line 94
    if-eqz v1, :cond_0

    .line 95
    .line 96
    iput-boolean v2, p0, Landroidx/appcompat/widget/r2;->p:Z

    .line 97
    .line 98
    :cond_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 99
    .line 100
    .line 101
    new-instance v0, Landroidx/appcompat/widget/h0;

    .line 102
    .line 103
    invoke-direct {v0, p1, p2, p3, p4}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 104
    .line 105
    .line 106
    sget-object v1, Lf/j;->PopupWindow:[I

    .line 107
    .line 108
    invoke-virtual {p1, p2, v1, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    sget p3, Lf/j;->PopupWindow_overlapAnchor:I

    .line 113
    .line 114
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 115
    .line 116
    .line 117
    move-result p3

    .line 118
    if-eqz p3, :cond_1

    .line 119
    .line 120
    sget p3, Lf/j;->PopupWindow_overlapAnchor:I

    .line 121
    .line 122
    invoke-virtual {p2, p3, p4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 123
    .line 124
    .line 125
    move-result p3

    .line 126
    invoke-static {v0, p3}, Lq3/a;->X(Landroidx/appcompat/widget/h0;Z)V

    .line 127
    .line 128
    .line 129
    :cond_1
    sget p3, Lf/j;->PopupWindow_android_popupBackground:I

    .line 130
    .line 131
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_2

    .line 136
    .line 137
    invoke-virtual {p2, p3, p4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 138
    .line 139
    .line 140
    move-result p4

    .line 141
    if-eqz p4, :cond_2

    .line 142
    .line 143
    invoke-static {p1, p4}, La/a;->D(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    goto :goto_0

    .line 148
    :cond_2
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 156
    .line 157
    .line 158
    iput-object v0, p0, Landroidx/appcompat/widget/r2;->G:Landroidx/appcompat/widget/h0;

    .line 159
    .line 160
    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 161
    .line 162
    .line 163
    return-void
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
.method public final a()V
    .locals 14

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/widget/r2;->h:Landroid/content/Context;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Landroidx/appcompat/widget/r2;->G:Landroidx/appcompat/widget/h0;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, Landroidx/appcompat/widget/r2;->F:Z

    .line 12
    .line 13
    xor-int/2addr v0, v2

    .line 14
    invoke-virtual {p0, v1, v0}, Landroidx/appcompat/widget/r2;->q(Landroid/content/Context;Z)Landroidx/appcompat/widget/e2;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 19
    .line 20
    iget-object v5, p0, Landroidx/appcompat/widget/r2;->i:Landroid/widget/ListAdapter;

    .line 21
    .line 22
    invoke-virtual {v0, v5}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 26
    .line 27
    iget-object v5, p0, Landroidx/appcompat/widget/r2;->w:Landroid/widget/AdapterView$OnItemClickListener;

    .line 28
    .line 29
    invoke-virtual {v0, v5}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 43
    .line 44
    new-instance v5, Landroidx/appcompat/widget/k2;

    .line 45
    .line 46
    invoke-direct {v5, v4, p0}, Landroidx/appcompat/widget/k2;-><init>(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v5}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 53
    .line 54
    iget-object v5, p0, Landroidx/appcompat/widget/r2;->A:Landroidx/appcompat/widget/p2;

    .line 55
    .line 56
    invoke-virtual {v0, v5}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->x:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 60
    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    iget-object v5, p0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 64
    .line 65
    invoke-virtual {v5, v0}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 69
    .line 70
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Landroid/view/ViewGroup;

    .line 79
    .line 80
    :goto_0
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object v5, p0, Landroidx/appcompat/widget/r2;->D:Landroid/graphics/Rect;

    .line 85
    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 89
    .line 90
    .line 91
    iget v0, v5, Landroid/graphics/Rect;->top:I

    .line 92
    .line 93
    iget v6, v5, Landroid/graphics/Rect;->bottom:I

    .line 94
    .line 95
    add-int/2addr v6, v0

    .line 96
    iget-boolean v7, p0, Landroidx/appcompat/widget/r2;->p:Z

    .line 97
    .line 98
    if-nez v7, :cond_3

    .line 99
    .line 100
    neg-int v0, v0

    .line 101
    iput v0, p0, Landroidx/appcompat/widget/r2;->n:I

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    invoke-virtual {v5}, Landroid/graphics/Rect;->setEmpty()V

    .line 105
    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    :cond_3
    :goto_1
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    const/4 v7, 0x2

    .line 113
    if-ne v0, v7, :cond_4

    .line 114
    .line 115
    const/4 v0, 0x1

    .line 116
    goto :goto_2

    .line 117
    :cond_4
    const/4 v0, 0x0

    .line 118
    :goto_2
    iget-object v8, p0, Landroidx/appcompat/widget/r2;->v:Landroid/view/View;

    .line 119
    .line 120
    iget v9, p0, Landroidx/appcompat/widget/r2;->n:I

    .line 121
    .line 122
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 123
    .line 124
    const/16 v11, 0x17

    .line 125
    .line 126
    const-string v12, "ListPopupWindow"

    .line 127
    .line 128
    if-gt v10, v11, :cond_6

    .line 129
    .line 130
    sget-object v10, Landroidx/appcompat/widget/r2;->I:Ljava/lang/reflect/Method;

    .line 131
    .line 132
    if-eqz v10, :cond_5

    .line 133
    .line 134
    :try_start_0
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    const/4 v13, 0x3

    .line 143
    new-array v13, v13, [Ljava/lang/Object;

    .line 144
    .line 145
    aput-object v8, v13, v4

    .line 146
    .line 147
    aput-object v11, v13, v2

    .line 148
    .line 149
    aput-object v0, v13, v7

    .line 150
    .line 151
    invoke-virtual {v10, v3, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, Ljava/lang/Integer;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 158
    .line 159
    .line 160
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    goto :goto_3

    .line 162
    :catch_0
    const-string v0, "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version."

    .line 163
    .line 164
    invoke-static {v12, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    :cond_5
    invoke-virtual {v3, v8, v9}, Landroid/widget/PopupWindow;->getMaxAvailableHeight(Landroid/view/View;I)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    goto :goto_3

    .line 172
    :cond_6
    invoke-static {v3, v8, v9, v0}, Landroidx/appcompat/widget/l2;->a(Landroid/widget/PopupWindow;Landroid/view/View;IZ)I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    :goto_3
    iget v8, p0, Landroidx/appcompat/widget/r2;->k:I

    .line 177
    .line 178
    const/4 v9, -0x2

    .line 179
    const/4 v10, -0x1

    .line 180
    if-ne v8, v10, :cond_7

    .line 181
    .line 182
    add-int/2addr v0, v6

    .line 183
    goto :goto_6

    .line 184
    :cond_7
    iget v11, p0, Landroidx/appcompat/widget/r2;->l:I

    .line 185
    .line 186
    if-eq v11, v9, :cond_9

    .line 187
    .line 188
    const/high16 v13, 0x40000000    # 2.0f

    .line 189
    .line 190
    if-eq v11, v10, :cond_8

    .line 191
    .line 192
    invoke-static {v11, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    goto :goto_4

    .line 197
    :cond_8
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 206
    .line 207
    iget v11, v5, Landroid/graphics/Rect;->left:I

    .line 208
    .line 209
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 210
    .line 211
    add-int/2addr v11, v5

    .line 212
    sub-int/2addr v1, v11

    .line 213
    invoke-static {v1, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    goto :goto_4

    .line 218
    :cond_9
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 227
    .line 228
    iget v11, v5, Landroid/graphics/Rect;->left:I

    .line 229
    .line 230
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 231
    .line 232
    add-int/2addr v11, v5

    .line 233
    sub-int/2addr v1, v11

    .line 234
    const/high16 v5, -0x80000000

    .line 235
    .line 236
    invoke-static {v1, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    :goto_4
    iget-object v5, p0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 241
    .line 242
    invoke-virtual {v5, v1, v0}, Landroidx/appcompat/widget/e2;->a(II)I

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-lez v0, :cond_a

    .line 247
    .line 248
    iget-object v1, p0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 249
    .line 250
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    iget-object v5, p0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 255
    .line 256
    invoke-virtual {v5}, Landroid/view/View;->getPaddingBottom()I

    .line 257
    .line 258
    .line 259
    move-result v5

    .line 260
    add-int/2addr v5, v1

    .line 261
    add-int/2addr v5, v6

    .line 262
    goto :goto_5

    .line 263
    :cond_a
    const/4 v5, 0x0

    .line 264
    :goto_5
    add-int/2addr v0, v5

    .line 265
    :goto_6
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    if-ne v1, v7, :cond_b

    .line 270
    .line 271
    const/4 v1, 0x1

    .line 272
    goto :goto_7

    .line 273
    :cond_b
    const/4 v1, 0x0

    .line 274
    :goto_7
    iget v5, p0, Landroidx/appcompat/widget/r2;->o:I

    .line 275
    .line 276
    invoke-static {v3, v5}, Lq3/a;->Y(Landroid/widget/PopupWindow;I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 280
    .line 281
    .line 282
    move-result v5

    .line 283
    if-eqz v5, :cond_17

    .line 284
    .line 285
    iget-object v5, p0, Landroidx/appcompat/widget/r2;->v:Landroid/view/View;

    .line 286
    .line 287
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    if-nez v5, :cond_c

    .line 292
    .line 293
    goto/16 :goto_11

    .line 294
    .line 295
    :cond_c
    iget v5, p0, Landroidx/appcompat/widget/r2;->l:I

    .line 296
    .line 297
    if-ne v5, v10, :cond_d

    .line 298
    .line 299
    const/4 v5, -0x1

    .line 300
    goto :goto_8

    .line 301
    :cond_d
    if-ne v5, v9, :cond_e

    .line 302
    .line 303
    iget-object v5, p0, Landroidx/appcompat/widget/r2;->v:Landroid/view/View;

    .line 304
    .line 305
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 306
    .line 307
    .line 308
    move-result v5

    .line 309
    :cond_e
    :goto_8
    if-ne v8, v10, :cond_13

    .line 310
    .line 311
    if-eqz v1, :cond_f

    .line 312
    .line 313
    move v8, v0

    .line 314
    goto :goto_9

    .line 315
    :cond_f
    const/4 v8, -0x1

    .line 316
    :goto_9
    if-eqz v1, :cond_11

    .line 317
    .line 318
    iget v0, p0, Landroidx/appcompat/widget/r2;->l:I

    .line 319
    .line 320
    if-ne v0, v10, :cond_10

    .line 321
    .line 322
    const/4 v0, -0x1

    .line 323
    goto :goto_a

    .line 324
    :cond_10
    const/4 v0, 0x0

    .line 325
    :goto_a
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v3, v4}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 329
    .line 330
    .line 331
    goto :goto_b

    .line 332
    :cond_11
    iget v0, p0, Landroidx/appcompat/widget/r2;->l:I

    .line 333
    .line 334
    if-ne v0, v10, :cond_12

    .line 335
    .line 336
    const/4 v4, -0x1

    .line 337
    :cond_12
    invoke-virtual {v3, v4}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v3, v10}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 341
    .line 342
    .line 343
    goto :goto_b

    .line 344
    :cond_13
    if-ne v8, v9, :cond_14

    .line 345
    .line 346
    move v8, v0

    .line 347
    :cond_14
    :goto_b
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 348
    .line 349
    .line 350
    iget-object v4, p0, Landroidx/appcompat/widget/r2;->v:Landroid/view/View;

    .line 351
    .line 352
    move v0, v5

    .line 353
    iget v5, p0, Landroidx/appcompat/widget/r2;->m:I

    .line 354
    .line 355
    iget v6, p0, Landroidx/appcompat/widget/r2;->n:I

    .line 356
    .line 357
    if-gez v0, :cond_15

    .line 358
    .line 359
    const/4 v7, -0x1

    .line 360
    goto :goto_c

    .line 361
    :cond_15
    move v7, v0

    .line 362
    :goto_c
    if-gez v8, :cond_16

    .line 363
    .line 364
    const/4 v8, -0x1

    .line 365
    :cond_16
    invoke-virtual/range {v3 .. v8}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 366
    .line 367
    .line 368
    goto/16 :goto_11

    .line 369
    .line 370
    :cond_17
    iget v1, p0, Landroidx/appcompat/widget/r2;->l:I

    .line 371
    .line 372
    if-ne v1, v10, :cond_18

    .line 373
    .line 374
    const/4 v1, -0x1

    .line 375
    goto :goto_d

    .line 376
    :cond_18
    if-ne v1, v9, :cond_19

    .line 377
    .line 378
    iget-object v1, p0, Landroidx/appcompat/widget/r2;->v:Landroid/view/View;

    .line 379
    .line 380
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    :cond_19
    :goto_d
    if-ne v8, v10, :cond_1a

    .line 385
    .line 386
    const/4 v8, -0x1

    .line 387
    goto :goto_e

    .line 388
    :cond_1a
    if-ne v8, v9, :cond_1b

    .line 389
    .line 390
    move v8, v0

    .line 391
    :cond_1b
    :goto_e
    invoke-virtual {v3, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v3, v8}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 395
    .line 396
    .line 397
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 398
    .line 399
    const/16 v1, 0x1c

    .line 400
    .line 401
    if-gt v0, v1, :cond_1c

    .line 402
    .line 403
    sget-object v0, Landroidx/appcompat/widget/r2;->H:Ljava/lang/reflect/Method;

    .line 404
    .line 405
    if-eqz v0, :cond_1d

    .line 406
    .line 407
    :try_start_1
    new-array v5, v2, [Ljava/lang/Object;

    .line 408
    .line 409
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 410
    .line 411
    aput-object v6, v5, v4

    .line 412
    .line 413
    invoke-virtual {v0, v3, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 414
    .line 415
    .line 416
    goto :goto_f

    .line 417
    :catch_1
    const-string v0, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."

    .line 418
    .line 419
    invoke-static {v12, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 420
    .line 421
    .line 422
    goto :goto_f

    .line 423
    :cond_1c
    invoke-static {v3, v2}, Landroidx/appcompat/widget/m2;->b(Landroid/widget/PopupWindow;Z)V

    .line 424
    .line 425
    .line 426
    :cond_1d
    :goto_f
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 427
    .line 428
    .line 429
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->z:Landroidx/appcompat/widget/q2;

    .line 430
    .line 431
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 432
    .line 433
    .line 434
    iget-boolean v0, p0, Landroidx/appcompat/widget/r2;->r:Z

    .line 435
    .line 436
    if-eqz v0, :cond_1e

    .line 437
    .line 438
    iget-boolean v0, p0, Landroidx/appcompat/widget/r2;->q:Z

    .line 439
    .line 440
    invoke-static {v3, v0}, Lq3/a;->X(Landroidx/appcompat/widget/h0;Z)V

    .line 441
    .line 442
    .line 443
    :cond_1e
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 444
    .line 445
    if-gt v0, v1, :cond_1f

    .line 446
    .line 447
    sget-object v0, Landroidx/appcompat/widget/r2;->J:Ljava/lang/reflect/Method;

    .line 448
    .line 449
    if-eqz v0, :cond_20

    .line 450
    .line 451
    :try_start_2
    iget-object v1, p0, Landroidx/appcompat/widget/r2;->E:Landroid/graphics/Rect;

    .line 452
    .line 453
    new-array v5, v2, [Ljava/lang/Object;

    .line 454
    .line 455
    aput-object v1, v5, v4

    .line 456
    .line 457
    invoke-virtual {v0, v3, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 458
    .line 459
    .line 460
    goto :goto_10

    .line 461
    :catch_2
    move-exception v0

    .line 462
    const-string v1, "Could not invoke setEpicenterBounds on PopupWindow"

    .line 463
    .line 464
    invoke-static {v12, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 465
    .line 466
    .line 467
    goto :goto_10

    .line 468
    :cond_1f
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->E:Landroid/graphics/Rect;

    .line 469
    .line 470
    invoke-static {v3, v0}, Landroidx/appcompat/widget/m2;->a(Landroid/widget/PopupWindow;Landroid/graphics/Rect;)V

    .line 471
    .line 472
    .line 473
    :cond_20
    :goto_10
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->v:Landroid/view/View;

    .line 474
    .line 475
    iget v1, p0, Landroidx/appcompat/widget/r2;->m:I

    .line 476
    .line 477
    iget v4, p0, Landroidx/appcompat/widget/r2;->n:I

    .line 478
    .line 479
    iget v5, p0, Landroidx/appcompat/widget/r2;->s:I

    .line 480
    .line 481
    invoke-virtual {v3, v0, v1, v4, v5}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 482
    .line 483
    .line 484
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 485
    .line 486
    invoke-virtual {v0, v10}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 487
    .line 488
    .line 489
    iget-boolean v0, p0, Landroidx/appcompat/widget/r2;->F:Z

    .line 490
    .line 491
    if-eqz v0, :cond_21

    .line 492
    .line 493
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 494
    .line 495
    invoke-virtual {v0}, Landroidx/appcompat/widget/e2;->isInTouchMode()Z

    .line 496
    .line 497
    .line 498
    move-result v0

    .line 499
    if-eqz v0, :cond_22

    .line 500
    .line 501
    :cond_21
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 502
    .line 503
    if-eqz v0, :cond_22

    .line 504
    .line 505
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/e2;->setListSelectionHidden(Z)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 509
    .line 510
    .line 511
    :cond_22
    iget-boolean v0, p0, Landroidx/appcompat/widget/r2;->F:Z

    .line 512
    .line 513
    if-nez v0, :cond_23

    .line 514
    .line 515
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->C:Landroid/os/Handler;

    .line 516
    .line 517
    iget-object v1, p0, Landroidx/appcompat/widget/r2;->B:Landroidx/appcompat/widget/n2;

    .line 518
    .line 519
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 520
    .line 521
    .line 522
    :cond_23
    :goto_11
    return-void
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
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
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
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->G:Landroidx/appcompat/widget/h0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/r2;->m:I

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

.method public final d()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->G:Landroidx/appcompat/widget/h0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final dismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->G:Landroidx/appcompat/widget/h0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->C:Landroid/os/Handler;

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/appcompat/widget/r2;->y:Landroidx/appcompat/widget/n2;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
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

.method public final e()Landroidx/appcompat/widget/e2;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

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

.method public final g(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->G:Landroidx/appcompat/widget/h0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

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
.end method

.method public final h(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/r2;->n:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Landroidx/appcompat/widget/r2;->p:Z

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
.end method

.method public final j(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/r2;->m:I

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

.method public final m()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/r2;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Landroidx/appcompat/widget/r2;->n:I

    .line 8
    .line 9
    return v0
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

.method public p(Landroid/widget/ListAdapter;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->u:Landroidx/appcompat/widget/o2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/appcompat/widget/o2;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, v1, p0}, Landroidx/appcompat/widget/o2;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroidx/appcompat/widget/r2;->u:Landroidx/appcompat/widget/o2;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, p0, Landroidx/appcompat/widget/r2;->i:Landroid/widget/ListAdapter;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v1, v0}, Landroid/widget/Adapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    iput-object p1, p0, Landroidx/appcompat/widget/r2;->i:Landroid/widget/ListAdapter;

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->u:Landroidx/appcompat/widget/o2;

    .line 26
    .line 27
    invoke-interface {p1, v0}, Landroid/widget/Adapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 28
    .line 29
    .line 30
    :cond_2
    iget-object p1, p0, Landroidx/appcompat/widget/r2;->j:Landroidx/appcompat/widget/e2;

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->i:Landroid/widget/ListAdapter;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 37
    .line 38
    .line 39
    :cond_3
    return-void
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
.end method

.method public q(Landroid/content/Context;Z)Landroidx/appcompat/widget/e2;
    .locals 1

    .line 1
    new-instance v0, Landroidx/appcompat/widget/e2;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroidx/appcompat/widget/e2;-><init>(Landroid/content/Context;Z)V

    .line 4
    .line 5
    .line 6
    return-object v0
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

.method public final r(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/r2;->G:Landroidx/appcompat/widget/h0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/appcompat/widget/r2;->D:Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 12
    .line 13
    .line 14
    iget v0, v1, Landroid/graphics/Rect;->left:I

    .line 15
    .line 16
    iget v1, v1, Landroid/graphics/Rect;->right:I

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    add-int/2addr v0, p1

    .line 20
    iput v0, p0, Landroidx/appcompat/widget/r2;->l:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iput p1, p0, Landroidx/appcompat/widget/r2;->l:I

    .line 24
    .line 25
    return-void
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

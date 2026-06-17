.class public Lcom/ortiz/touchview/TouchImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final synthetic S:I


# instance fields
.field public A:Lc4/h;

.field public B:I

.field public C:Landroid/widget/ImageView$ScaleType;

.field public D:Z

.field public E:Z

.field public F:Lc4/m;

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public K:F

.field public L:F

.field public M:F

.field public N:F

.field public final O:Landroid/view/ScaleGestureDetector;

.field public final P:Landroid/view/GestureDetector;

.field public Q:Landroid/view/GestureDetector$OnDoubleTapListener;

.field public R:Landroid/view/View$OnTouchListener;

.field public h:F

.field public final i:Landroid/graphics/Matrix;

.field public final j:Landroid/graphics/Matrix;

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Lc4/a;

.field public o:Lc4/a;

.field public p:Z

.field public q:Lc4/b;

.field public r:F

.field public s:F

.field public t:Z

.field public u:F

.field public v:F

.field public w:F

.field public x:F

.field public y:[F

.field public z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iput-boolean v1, p0, Lcom/ortiz/touchview/TouchImageView;->l:Z

    .line 12
    .line 13
    sget-object v2, Lc4/a;->h:Lc4/a;

    .line 14
    .line 15
    iput-object v2, p0, Lcom/ortiz/touchview/TouchImageView;->n:Lc4/a;

    .line 16
    .line 17
    iput-object v2, p0, Lcom/ortiz/touchview/TouchImageView;->o:Lc4/a;

    .line 18
    .line 19
    invoke-super {p0, v1}, Landroid/widget/ImageView;->setClickable(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget v2, v2, Landroid/content/res/Configuration;->orientation:I

    .line 31
    .line 32
    iput v2, p0, Lcom/ortiz/touchview/TouchImageView;->B:I

    .line 33
    .line 34
    new-instance v2, Landroid/view/ScaleGestureDetector;

    .line 35
    .line 36
    new-instance v3, Lc4/k;

    .line 37
    .line 38
    invoke-direct {v3, p0}, Lc4/k;-><init>(Lcom/ortiz/touchview/TouchImageView;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v2, p1, v3}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    .line 42
    .line 43
    .line 44
    iput-object v2, p0, Lcom/ortiz/touchview/TouchImageView;->O:Landroid/view/ScaleGestureDetector;

    .line 45
    .line 46
    new-instance v2, Landroid/view/GestureDetector;

    .line 47
    .line 48
    new-instance v3, Lc4/i;

    .line 49
    .line 50
    invoke-direct {v3, p0}, Lc4/i;-><init>(Lcom/ortiz/touchview/TouchImageView;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v2, p1, v3}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, Lcom/ortiz/touchview/TouchImageView;->P:Landroid/view/GestureDetector;

    .line 57
    .line 58
    new-instance v2, Landroid/graphics/Matrix;

    .line 59
    .line 60
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v2, p0, Lcom/ortiz/touchview/TouchImageView;->i:Landroid/graphics/Matrix;

    .line 64
    .line 65
    new-instance v3, Landroid/graphics/Matrix;

    .line 66
    .line 67
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v3, p0, Lcom/ortiz/touchview/TouchImageView;->j:Landroid/graphics/Matrix;

    .line 71
    .line 72
    const/16 v3, 0x9

    .line 73
    .line 74
    new-array v3, v3, [F

    .line 75
    .line 76
    iput-object v3, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 77
    .line 78
    const/high16 v3, 0x3f800000    # 1.0f

    .line 79
    .line 80
    iput v3, p0, Lcom/ortiz/touchview/TouchImageView;->h:F

    .line 81
    .line 82
    iget-object v4, p0, Lcom/ortiz/touchview/TouchImageView;->C:Landroid/widget/ImageView$ScaleType;

    .line 83
    .line 84
    if-nez v4, :cond_0

    .line 85
    .line 86
    sget-object v4, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 87
    .line 88
    iput-object v4, p0, Lcom/ortiz/touchview/TouchImageView;->C:Landroid/widget/ImageView$ScaleType;

    .line 89
    .line 90
    :cond_0
    iput v3, p0, Lcom/ortiz/touchview/TouchImageView;->s:F

    .line 91
    .line 92
    const/high16 v3, 0x40400000    # 3.0f

    .line 93
    .line 94
    iput v3, p0, Lcom/ortiz/touchview/TouchImageView;->v:F

    .line 95
    .line 96
    const/high16 v3, 0x3f400000    # 0.75f

    .line 97
    .line 98
    iput v3, p0, Lcom/ortiz/touchview/TouchImageView;->w:F

    .line 99
    .line 100
    const/high16 v3, 0x40700000    # 3.75f

    .line 101
    .line 102
    iput v3, p0, Lcom/ortiz/touchview/TouchImageView;->x:F

    .line 103
    .line 104
    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 105
    .line 106
    .line 107
    sget-object v2, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    .line 108
    .line 109
    invoke-virtual {p0, v2}, Lcom/ortiz/touchview/TouchImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 110
    .line 111
    .line 112
    sget-object v2, Lc4/b;->h:Lc4/b;

    .line 113
    .line 114
    invoke-direct {p0, v2}, Lcom/ortiz/touchview/TouchImageView;->setState(Lc4/b;)V

    .line 115
    .line 116
    .line 117
    iput-boolean v0, p0, Lcom/ortiz/touchview/TouchImageView;->E:Z

    .line 118
    .line 119
    new-instance v2, Lc4/j;

    .line 120
    .line 121
    invoke-direct {v2, p0}, Lc4/j;-><init>(Lcom/ortiz/touchview/TouchImageView;)V

    .line 122
    .line 123
    .line 124
    invoke-super {p0, v2}, Landroid/widget/ImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    sget-object v2, Lc4/e;->TouchImageView:[I

    .line 132
    .line 133
    invoke-virtual {p1, p2, v2, v0, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    const-string p2, "obtainStyledAttributes(...)"

    .line 138
    .line 139
    invoke-static {p1, p2}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    if-nez p2, :cond_1

    .line 147
    .line 148
    sget p2, Lc4/e;->TouchImageView_zoom_enabled:I

    .line 149
    .line 150
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    iput-boolean p2, p0, Lcom/ortiz/touchview/TouchImageView;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :catchall_0
    move-exception p2

    .line 158
    goto :goto_1

    .line 159
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 164
    .line 165
    .line 166
    throw p2
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
.end method

.method public static final synthetic b(Lcom/ortiz/touchview/TouchImageView;)F
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageHeight()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static final synthetic d(Lcom/ortiz/touchview/TouchImageView;)F
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageWidth()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static final synthetic e(Lcom/ortiz/touchview/TouchImageView;Lc4/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/ortiz/touchview/TouchImageView;->setState(Lc4/b;)V

    .line 2
    .line 3
    .line 4
    return-void
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

.method private final getImageHeight()F
    .locals 2

    .line 1
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->L:F

    .line 2
    .line 3
    iget v1, p0, Lcom/ortiz/touchview/TouchImageView;->h:F

    .line 4
    .line 5
    mul-float v0, v0, v1

    .line 6
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

.method private final getImageWidth()F
    .locals 2

    .line 1
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->K:F

    .line 2
    .line 3
    iget v1, p0, Lcom/ortiz/touchview/TouchImageView;->h:F

    .line 4
    .line 5
    mul-float v0, v0, v1

    .line 6
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

.method public static k(FFFF)F
    .locals 2

    .line 1
    cmpg-float v0, p2, p1

    .line 2
    .line 3
    if-gtz v0, :cond_0

    .line 4
    .line 5
    add-float/2addr p1, p3

    .line 6
    sub-float/2addr p1, p2

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    add-float/2addr p1, p3

    .line 9
    sub-float/2addr p1, p2

    .line 10
    move v1, p3

    .line 11
    move p3, p1

    .line 12
    move p1, v1

    .line 13
    :goto_0
    cmpg-float p2, p0, p3

    .line 14
    .line 15
    if-gez p2, :cond_1

    .line 16
    .line 17
    neg-float p0, p0

    .line 18
    add-float/2addr p0, p3

    .line 19
    return p0

    .line 20
    :cond_1
    cmpl-float p2, p0, p1

    .line 21
    .line 22
    if-lez p2, :cond_2

    .line 23
    .line 24
    neg-float p0, p0

    .line 25
    add-float/2addr p0, p1

    .line 26
    return p0

    .line 27
    :cond_2
    const/4 p0, 0x0

    .line 28
    return p0
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

.method private final setState(Lc4/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ortiz/touchview/TouchImageView;->q:Lc4/b;

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


# virtual methods
.method public final canScrollHorizontally(I)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->i:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    aget v0, v0, v1

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageWidth()F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget v2, p0, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 18
    .line 19
    int-to-float v2, v2

    .line 20
    const/4 v3, 0x0

    .line 21
    cmpg-float v1, v1, v2

    .line 22
    .line 23
    if-gez v1, :cond_0

    .line 24
    .line 25
    return v3

    .line 26
    :cond_0
    const/high16 v1, -0x40800000    # -1.0f

    .line 27
    .line 28
    cmpl-float v1, v0, v1

    .line 29
    .line 30
    if-ltz v1, :cond_1

    .line 31
    .line 32
    if-gez p1, :cond_1

    .line 33
    .line 34
    return v3

    .line 35
    :cond_1
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget v1, p0, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 40
    .line 41
    int-to-float v1, v1

    .line 42
    add-float/2addr v0, v1

    .line 43
    const/4 v1, 0x1

    .line 44
    int-to-float v2, v1

    .line 45
    add-float/2addr v0, v2

    .line 46
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageWidth()F

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    cmpg-float v0, v0, v2

    .line 51
    .line 52
    if-ltz v0, :cond_3

    .line 53
    .line 54
    if-gtz p1, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    return v3

    .line 58
    :cond_3
    :goto_0
    return v1
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

.method public final canScrollVertically(I)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->i:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    aget v0, v0, v1

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageHeight()F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget v2, p0, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 18
    .line 19
    int-to-float v2, v2

    .line 20
    const/4 v3, 0x0

    .line 21
    cmpg-float v1, v1, v2

    .line 22
    .line 23
    if-gez v1, :cond_0

    .line 24
    .line 25
    return v3

    .line 26
    :cond_0
    const/high16 v1, -0x40800000    # -1.0f

    .line 27
    .line 28
    cmpl-float v1, v0, v1

    .line 29
    .line 30
    if-ltz v1, :cond_1

    .line 31
    .line 32
    if-gez p1, :cond_1

    .line 33
    .line 34
    return v3

    .line 35
    :cond_1
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget v1, p0, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 40
    .line 41
    int-to-float v1, v1

    .line 42
    add-float/2addr v0, v1

    .line 43
    const/4 v1, 0x1

    .line 44
    int-to-float v2, v1

    .line 45
    add-float/2addr v0, v2

    .line 46
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageHeight()F

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    cmpg-float v0, v0, v2

    .line 51
    .line 52
    if-ltz v0, :cond_3

    .line 53
    .line 54
    if-gtz p1, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    return v3

    .line 58
    :cond_3
    :goto_0
    return v1
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

.method public final f()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/ortiz/touchview/TouchImageView;->p:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v0, Lcom/ortiz/touchview/TouchImageView;->n:Lc4/a;

    .line 8
    .line 9
    :goto_0
    move-object v7, v1

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    iget-object v1, v0, Lcom/ortiz/touchview/TouchImageView;->o:Lc4/a;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :goto_1
    const/4 v1, 0x0

    .line 15
    iput-boolean v1, v0, Lcom/ortiz/touchview/TouchImageView;->p:Z

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_c

    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_c

    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    goto/16 :goto_b

    .line 36
    .line 37
    :cond_1
    iget-object v8, v0, Lcom/ortiz/touchview/TouchImageView;->i:Landroid/graphics/Matrix;

    .line 38
    .line 39
    if-eqz v8, :cond_c

    .line 40
    .line 41
    iget-object v3, v0, Lcom/ortiz/touchview/TouchImageView;->j:Landroid/graphics/Matrix;

    .line 42
    .line 43
    if-nez v3, :cond_2

    .line 44
    .line 45
    goto/16 :goto_b

    .line 46
    .line 47
    :cond_2
    iget v4, v0, Lcom/ortiz/touchview/TouchImageView;->r:F

    .line 48
    .line 49
    const/high16 v5, -0x40800000    # -1.0f

    .line 50
    .line 51
    cmpg-float v4, v4, v5

    .line 52
    .line 53
    if-nez v4, :cond_3

    .line 54
    .line 55
    invoke-virtual {v0, v5}, Lcom/ortiz/touchview/TouchImageView;->setMinZoom(F)V

    .line 56
    .line 57
    .line 58
    iget v4, v0, Lcom/ortiz/touchview/TouchImageView;->h:F

    .line 59
    .line 60
    iget v5, v0, Lcom/ortiz/touchview/TouchImageView;->s:F

    .line 61
    .line 62
    cmpg-float v4, v4, v5

    .line 63
    .line 64
    if-gez v4, :cond_3

    .line 65
    .line 66
    iput v5, v0, Lcom/ortiz/touchview/TouchImageView;->h:F

    .line 67
    .line 68
    :cond_3
    invoke-virtual {v0, v2}, Lcom/ortiz/touchview/TouchImageView;->j(Landroid/graphics/drawable/Drawable;)I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    invoke-virtual {v0, v2}, Lcom/ortiz/touchview/TouchImageView;->i(Landroid/graphics/drawable/Drawable;)I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    iget v4, v0, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 77
    .line 78
    int-to-float v4, v4

    .line 79
    int-to-float v5, v6

    .line 80
    div-float/2addr v4, v5

    .line 81
    iget v10, v0, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 82
    .line 83
    int-to-float v10, v10

    .line 84
    int-to-float v11, v9

    .line 85
    div-float/2addr v10, v11

    .line 86
    iget-object v12, v0, Lcom/ortiz/touchview/TouchImageView;->C:Landroid/widget/ImageView$ScaleType;

    .line 87
    .line 88
    if-nez v12, :cond_4

    .line 89
    .line 90
    const/4 v12, -0x1

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    sget-object v14, Lc4/l;->a:[I

    .line 93
    .line 94
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 95
    .line 96
    .line 97
    move-result v12

    .line 98
    aget v12, v14, v12

    .line 99
    .line 100
    :goto_2
    const/high16 v14, 0x3f800000    # 1.0f

    .line 101
    .line 102
    packed-switch v12, :pswitch_data_0

    .line 103
    .line 104
    .line 105
    goto :goto_4

    .line 106
    :pswitch_0
    invoke-static {v4, v10}, Ljava/lang/Math;->min(FF)F

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    :goto_3
    move v10, v4

    .line 111
    goto :goto_4

    .line 112
    :pswitch_1
    invoke-static {v4, v10}, Ljava/lang/Math;->min(FF)F

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    invoke-static {v14, v4}, Ljava/lang/Math;->min(FF)F

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    invoke-static {v4, v4}, Ljava/lang/Math;->min(FF)F

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    goto :goto_3

    .line 125
    :pswitch_2
    invoke-static {v4, v10}, Ljava/lang/Math;->max(FF)F

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    goto :goto_3

    .line 130
    :pswitch_3
    const/high16 v4, 0x3f800000    # 1.0f

    .line 131
    .line 132
    const/high16 v10, 0x3f800000    # 1.0f

    .line 133
    .line 134
    :goto_4
    iget v12, v0, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 135
    .line 136
    int-to-float v12, v12

    .line 137
    mul-float v15, v4, v5

    .line 138
    .line 139
    sub-float v15, v12, v15

    .line 140
    .line 141
    const/16 v16, 0x0

    .line 142
    .line 143
    iget v1, v0, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 144
    .line 145
    int-to-float v1, v1

    .line 146
    mul-float v17, v10, v11

    .line 147
    .line 148
    sub-float v13, v1, v17

    .line 149
    .line 150
    sub-float/2addr v12, v15

    .line 151
    iput v12, v0, Lcom/ortiz/touchview/TouchImageView;->K:F

    .line 152
    .line 153
    sub-float/2addr v1, v13

    .line 154
    iput v1, v0, Lcom/ortiz/touchview/TouchImageView;->L:F

    .line 155
    .line 156
    iget v1, v0, Lcom/ortiz/touchview/TouchImageView;->h:F

    .line 157
    .line 158
    const/high16 v17, 0x3f800000    # 1.0f

    .line 159
    .line 160
    const/4 v14, 0x5

    .line 161
    const/4 v12, 0x0

    .line 162
    cmpg-float v1, v1, v17

    .line 163
    .line 164
    if-nez v1, :cond_9

    .line 165
    .line 166
    iget-boolean v1, v0, Lcom/ortiz/touchview/TouchImageView;->D:Z

    .line 167
    .line 168
    if-nez v1, :cond_9

    .line 169
    .line 170
    iget-boolean v1, v0, Lcom/ortiz/touchview/TouchImageView;->m:Z

    .line 171
    .line 172
    if-eqz v1, :cond_5

    .line 173
    .line 174
    invoke-virtual {v0, v2}, Lcom/ortiz/touchview/TouchImageView;->m(Landroid/graphics/drawable/Drawable;)Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_5

    .line 179
    .line 180
    const/high16 v1, 0x42b40000    # 90.0f

    .line 181
    .line 182
    invoke-virtual {v8, v1}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v8, v5, v12}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 186
    .line 187
    .line 188
    invoke-virtual {v8, v4, v10}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 189
    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_5
    invoke-virtual {v8, v4, v10}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 193
    .line 194
    .line 195
    :goto_5
    iget-object v1, v0, Lcom/ortiz/touchview/TouchImageView;->C:Landroid/widget/ImageView$ScaleType;

    .line 196
    .line 197
    if-nez v1, :cond_6

    .line 198
    .line 199
    const/4 v1, -0x1

    .line 200
    goto :goto_6

    .line 201
    :cond_6
    sget-object v2, Lc4/l;->a:[I

    .line 202
    .line 203
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    aget v1, v2, v1

    .line 208
    .line 209
    :goto_6
    if-eq v1, v14, :cond_8

    .line 210
    .line 211
    const/4 v2, 0x6

    .line 212
    if-eq v1, v2, :cond_7

    .line 213
    .line 214
    const/4 v1, 0x2

    .line 215
    int-to-float v1, v1

    .line 216
    div-float/2addr v15, v1

    .line 217
    div-float/2addr v13, v1

    .line 218
    invoke-virtual {v8, v15, v13}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 219
    .line 220
    .line 221
    :goto_7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 222
    .line 223
    goto :goto_8

    .line 224
    :cond_7
    invoke-virtual {v8, v15, v13}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 225
    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_8
    invoke-virtual {v8, v12, v12}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 229
    .line 230
    .line 231
    goto :goto_7

    .line 232
    :goto_8
    iput v1, v0, Lcom/ortiz/touchview/TouchImageView;->h:F

    .line 233
    .line 234
    goto :goto_a

    .line 235
    :cond_9
    iget v1, v0, Lcom/ortiz/touchview/TouchImageView;->M:F

    .line 236
    .line 237
    cmpg-float v1, v1, v12

    .line 238
    .line 239
    if-nez v1, :cond_a

    .line 240
    .line 241
    goto :goto_9

    .line 242
    :cond_a
    iget v1, v0, Lcom/ortiz/touchview/TouchImageView;->N:F

    .line 243
    .line 244
    cmpg-float v1, v1, v12

    .line 245
    .line 246
    if-nez v1, :cond_b

    .line 247
    .line 248
    :goto_9
    invoke-virtual {v0}, Lcom/ortiz/touchview/TouchImageView;->n()V

    .line 249
    .line 250
    .line 251
    :cond_b
    iget-object v1, v0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 252
    .line 253
    invoke-virtual {v3, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 254
    .line 255
    .line 256
    iget-object v1, v0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 257
    .line 258
    iget v2, v0, Lcom/ortiz/touchview/TouchImageView;->K:F

    .line 259
    .line 260
    div-float/2addr v2, v5

    .line 261
    iget v3, v0, Lcom/ortiz/touchview/TouchImageView;->h:F

    .line 262
    .line 263
    mul-float v2, v2, v3

    .line 264
    .line 265
    aput v2, v1, v16

    .line 266
    .line 267
    iget v2, v0, Lcom/ortiz/touchview/TouchImageView;->L:F

    .line 268
    .line 269
    div-float/2addr v2, v11

    .line 270
    mul-float v2, v2, v3

    .line 271
    .line 272
    const/4 v4, 0x4

    .line 273
    aput v2, v1, v4

    .line 274
    .line 275
    move-object v2, v1

    .line 276
    const/16 v18, 0x2

    .line 277
    .line 278
    aget v1, v2, v18

    .line 279
    .line 280
    aget v10, v2, v14

    .line 281
    .line 282
    iget v2, v0, Lcom/ortiz/touchview/TouchImageView;->M:F

    .line 283
    .line 284
    mul-float v2, v2, v3

    .line 285
    .line 286
    invoke-direct {v0}, Lcom/ortiz/touchview/TouchImageView;->getImageWidth()F

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    iget-object v11, v0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 291
    .line 292
    iget v4, v0, Lcom/ortiz/touchview/TouchImageView;->I:I

    .line 293
    .line 294
    iget v5, v0, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 295
    .line 296
    invoke-virtual/range {v0 .. v7}, Lcom/ortiz/touchview/TouchImageView;->l(FFFIIILc4/a;)F

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    aput v1, v11, v18

    .line 301
    .line 302
    iget v1, v0, Lcom/ortiz/touchview/TouchImageView;->N:F

    .line 303
    .line 304
    iget v2, v0, Lcom/ortiz/touchview/TouchImageView;->h:F

    .line 305
    .line 306
    mul-float v2, v2, v1

    .line 307
    .line 308
    invoke-direct {v0}, Lcom/ortiz/touchview/TouchImageView;->getImageHeight()F

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    iget-object v11, v0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 313
    .line 314
    iget v4, v0, Lcom/ortiz/touchview/TouchImageView;->J:I

    .line 315
    .line 316
    iget v5, v0, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 317
    .line 318
    move v6, v9

    .line 319
    move v1, v10

    .line 320
    invoke-virtual/range {v0 .. v7}, Lcom/ortiz/touchview/TouchImageView;->l(FFFIIILc4/a;)F

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    aput v1, v11, v14

    .line 325
    .line 326
    iget-object v1, v0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 327
    .line 328
    invoke-virtual {v8, v1}, Landroid/graphics/Matrix;->setValues([F)V

    .line 329
    .line 330
    .line 331
    :goto_a
    invoke-virtual {v0}, Lcom/ortiz/touchview/TouchImageView;->h()V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 335
    .line 336
    .line 337
    :cond_c
    :goto_b
    return-void

    .line 338
    nop

    .line 339
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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

.method public final g()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/ortiz/touchview/TouchImageView;->h()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 5
    .line 6
    iget-object v1, p0, Lcom/ortiz/touchview/TouchImageView;->i:Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->getValues([F)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageWidth()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget v2, p0, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 16
    .line 17
    int-to-float v3, v2

    .line 18
    const/4 v4, 0x2

    .line 19
    cmpg-float v0, v0, v3

    .line 20
    .line 21
    if-gez v0, :cond_1

    .line 22
    .line 23
    int-to-float v0, v2

    .line 24
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageWidth()F

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    sub-float/2addr v0, v2

    .line 29
    int-to-float v2, v4

    .line 30
    div-float/2addr v0, v2

    .line 31
    iget-boolean v2, p0, Lcom/ortiz/touchview/TouchImageView;->m:Z

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p0, v2}, Lcom/ortiz/touchview/TouchImageView;->m(Landroid/graphics/drawable/Drawable;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageWidth()F

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    add-float/2addr v0, v2

    .line 50
    :cond_0
    iget-object v2, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 51
    .line 52
    aput v0, v2, v4

    .line 53
    .line 54
    :cond_1
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageHeight()F

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget v2, p0, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 59
    .line 60
    int-to-float v3, v2

    .line 61
    cmpg-float v0, v0, v3

    .line 62
    .line 63
    if-gez v0, :cond_2

    .line 64
    .line 65
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 66
    .line 67
    int-to-float v2, v2

    .line 68
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageHeight()F

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    sub-float/2addr v2, v3

    .line 73
    int-to-float v3, v4

    .line 74
    div-float/2addr v2, v3

    .line 75
    const/4 v3, 0x5

    .line 76
    aput v2, v0, v3

    .line 77
    .line 78
    :cond_2
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->setValues([F)V

    .line 81
    .line 82
    .line 83
    return-void
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
.end method

.method public final getCurrentZoom()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->h:F

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

.method public final getDoubleTapScale()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->z:F

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

.method public final getMaxZoom()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->v:F

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

.method public final getMinZoom()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->s:F

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

.method public final getOrientationChangeFixedPixel()Lc4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->n:Lc4/a;

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

.method public getScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->C:Landroid/widget/ImageView$ScaleType;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

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
.end method

.method public final getScrollPosition()Landroid/graphics/PointF;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/PointF;

    .line 8
    .line 9
    const/high16 v1, 0x3f000000    # 0.5f

    .line 10
    .line 11
    invoke-direct {v0, v1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    invoke-virtual {p0, v0}, Lcom/ortiz/touchview/TouchImageView;->j(Landroid/graphics/drawable/Drawable;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p0, v0}, Lcom/ortiz/touchview/TouchImageView;->i(Landroid/graphics/drawable/Drawable;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget v2, p0, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 24
    .line 25
    int-to-float v2, v2

    .line 26
    const/high16 v3, 0x40000000    # 2.0f

    .line 27
    .line 28
    div-float/2addr v2, v3

    .line 29
    iget v4, p0, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 30
    .line 31
    int-to-float v4, v4

    .line 32
    div-float/2addr v4, v3

    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-virtual {p0, v2, v4, v3}, Lcom/ortiz/touchview/TouchImageView;->r(FFZ)Landroid/graphics/PointF;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 39
    .line 40
    int-to-float v1, v1

    .line 41
    div-float/2addr v3, v1

    .line 42
    iput v3, v2, Landroid/graphics/PointF;->x:F

    .line 43
    .line 44
    iget v1, v2, Landroid/graphics/PointF;->y:F

    .line 45
    .line 46
    int-to-float v0, v0

    .line 47
    div-float/2addr v1, v0

    .line 48
    iput v1, v2, Landroid/graphics/PointF;->y:F

    .line 49
    .line 50
    return-object v2
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
.end method

.method public final getViewSizeChangeFixedPixel()Lc4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->o:Lc4/a;

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

.method public final getZoomedRect()Landroid/graphics/RectF;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->C:Landroid/widget/ImageView$ScaleType;

    .line 2
    .line 3
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {p0, v0, v0, v1}, Lcom/ortiz/touchview/TouchImageView;->r(FFZ)Landroid/graphics/PointF;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v2, p0, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 14
    .line 15
    int-to-float v2, v2

    .line 16
    iget v3, p0, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 17
    .line 18
    int-to-float v3, v3

    .line 19
    invoke-virtual {p0, v2, v3, v1}, Lcom/ortiz/touchview/TouchImageView;->r(FFZ)Landroid/graphics/PointF;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p0, v2}, Lcom/ortiz/touchview/TouchImageView;->j(Landroid/graphics/drawable/Drawable;)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    int-to-float v2, v2

    .line 32
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {p0, v3}, Lcom/ortiz/touchview/TouchImageView;->i(Landroid/graphics/drawable/Drawable;)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    int-to-float v3, v3

    .line 41
    new-instance v4, Landroid/graphics/RectF;

    .line 42
    .line 43
    iget v5, v0, Landroid/graphics/PointF;->x:F

    .line 44
    .line 45
    div-float/2addr v5, v2

    .line 46
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 47
    .line 48
    div-float/2addr v0, v3

    .line 49
    iget v6, v1, Landroid/graphics/PointF;->x:F

    .line 50
    .line 51
    div-float/2addr v6, v2

    .line 52
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 53
    .line 54
    div-float/2addr v1, v3

    .line 55
    invoke-direct {v4, v5, v0, v6, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 56
    .line 57
    .line 58
    return-object v4

    .line 59
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 60
    .line 61
    const-string v1, "getZoomedRect() not supported with FIT_XY"

    .line 62
    .line 63
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v0
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
.end method

.method public final h()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 2
    .line 3
    iget-object v1, p0, Lcom/ortiz/touchview/TouchImageView;->i:Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->getValues([F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    aget v2, v0, v2

    .line 12
    .line 13
    const/4 v3, 0x5

    .line 14
    aget v0, v0, v3

    .line 15
    .line 16
    iget-boolean v3, p0, Lcom/ortiz/touchview/TouchImageView;->m:Z

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {p0, v3}, Lcom/ortiz/touchview/TouchImageView;->m(Landroid/graphics/drawable/Drawable;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageWidth()F

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v3, 0x0

    .line 37
    :goto_0
    iget v5, p0, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 38
    .line 39
    int-to-float v5, v5

    .line 40
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageWidth()F

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    invoke-static {v2, v5, v6, v3}, Lcom/ortiz/touchview/TouchImageView;->k(FFFF)F

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    iget v3, p0, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 49
    .line 50
    int-to-float v3, v3

    .line 51
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageHeight()F

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    invoke-static {v0, v3, v5, v4}, Lcom/ortiz/touchview/TouchImageView;->k(FFFF)F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-virtual {v1, v2, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 60
    .line 61
    .line 62
    return-void
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
.end method

.method public final i(Landroid/graphics/drawable/Drawable;)I
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/ortiz/touchview/TouchImageView;->m(Landroid/graphics/drawable/Drawable;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/ortiz/touchview/TouchImageView;->m:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
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

.method public final j(Landroid/graphics/drawable/Drawable;)I
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/ortiz/touchview/TouchImageView;->m(Landroid/graphics/drawable/Drawable;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/ortiz/touchview/TouchImageView;->m:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
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

.method public final l(FFFIIILc4/a;)F
    .locals 2

    .line 1
    int-to-float p5, p5

    .line 2
    const/high16 v0, 0x3f000000    # 0.5f

    .line 3
    .line 4
    cmpg-float v1, p3, p5

    .line 5
    .line 6
    if-gez v1, :cond_0

    .line 7
    .line 8
    int-to-float p1, p6

    .line 9
    iget-object p2, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    aget p2, p2, p3

    .line 13
    .line 14
    mul-float p1, p1, p2

    .line 15
    .line 16
    sub-float/2addr p5, p1

    .line 17
    mul-float p5, p5, v0

    .line 18
    .line 19
    return p5

    .line 20
    :cond_0
    const/4 p6, 0x0

    .line 21
    cmpl-float v1, p1, p6

    .line 22
    .line 23
    if-lez v1, :cond_1

    .line 24
    .line 25
    sub-float/2addr p3, p5

    .line 26
    mul-float p3, p3, v0

    .line 27
    .line 28
    neg-float p1, p3

    .line 29
    return p1

    .line 30
    :cond_1
    sget-object v1, Lc4/a;->j:Lc4/a;

    .line 31
    .line 32
    if-ne p7, v1, :cond_2

    .line 33
    .line 34
    const/high16 v0, 0x3f800000    # 1.0f

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    sget-object v1, Lc4/a;->i:Lc4/a;

    .line 38
    .line 39
    if-ne p7, v1, :cond_3

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    :cond_3
    :goto_0
    neg-float p1, p1

    .line 43
    int-to-float p4, p4

    .line 44
    mul-float p4, p4, v0

    .line 45
    .line 46
    add-float/2addr p4, p1

    .line 47
    div-float/2addr p4, p2

    .line 48
    mul-float p4, p4, p3

    .line 49
    .line 50
    mul-float p5, p5, v0

    .line 51
    .line 52
    sub-float/2addr p4, p5

    .line 53
    neg-float p1, p4

    .line 54
    return p1
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
.end method

.method public final m(Landroid/graphics/drawable/Drawable;)Z
    .locals 4

    .line 1
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 2
    .line 3
    iget v1, p0, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-le v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-static {p1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-le v1, p1, :cond_1

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    :goto_1
    if-eq v0, p1, :cond_2

    .line 29
    .line 30
    return v3

    .line 31
    :cond_2
    return v2
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final n()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->i:Landroid/graphics/Matrix;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->j:Landroid/graphics/Matrix;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->setValues([F)V

    .line 21
    .line 22
    .line 23
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->L:F

    .line 24
    .line 25
    iput v0, p0, Lcom/ortiz/touchview/TouchImageView;->N:F

    .line 26
    .line 27
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->K:F

    .line 28
    .line 29
    iput v0, p0, Lcom/ortiz/touchview/TouchImageView;->M:F

    .line 30
    .line 31
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 32
    .line 33
    iput v0, p0, Lcom/ortiz/touchview/TouchImageView;->J:I

    .line 34
    .line 35
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 36
    .line 37
    iput v0, p0, Lcom/ortiz/touchview/TouchImageView;->I:I

    .line 38
    .line 39
    :cond_0
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

.method public final o(DFFZ)V
    .locals 4

    .line 1
    if-eqz p5, :cond_0

    .line 2
    .line 3
    iget p5, p0, Lcom/ortiz/touchview/TouchImageView;->w:F

    .line 4
    .line 5
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->x:F

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget p5, p0, Lcom/ortiz/touchview/TouchImageView;->s:F

    .line 9
    .line 10
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->v:F

    .line 11
    .line 12
    :goto_0
    iget v1, p0, Lcom/ortiz/touchview/TouchImageView;->h:F

    .line 13
    .line 14
    double-to-float v2, p1

    .line 15
    mul-float v2, v2, v1

    .line 16
    .line 17
    iput v2, p0, Lcom/ortiz/touchview/TouchImageView;->h:F

    .line 18
    .line 19
    cmpl-float v3, v2, v0

    .line 20
    .line 21
    if-lez v3, :cond_1

    .line 22
    .line 23
    iput v0, p0, Lcom/ortiz/touchview/TouchImageView;->h:F

    .line 24
    .line 25
    float-to-double p1, v0

    .line 26
    :goto_1
    float-to-double v0, v1

    .line 27
    div-double/2addr p1, v0

    .line 28
    goto :goto_2

    .line 29
    :cond_1
    cmpg-float v0, v2, p5

    .line 30
    .line 31
    if-gez v0, :cond_2

    .line 32
    .line 33
    iput p5, p0, Lcom/ortiz/touchview/TouchImageView;->h:F

    .line 34
    .line 35
    float-to-double p1, p5

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    :goto_2
    iget-object p5, p0, Lcom/ortiz/touchview/TouchImageView;->i:Landroid/graphics/Matrix;

    .line 38
    .line 39
    double-to-float p1, p1

    .line 40
    invoke-virtual {p5, p1, p1, p3, p4}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/ortiz/touchview/TouchImageView;->g()V

    .line 44
    .line 45
    .line 46
    return-void
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

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    const-string v0, "newConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    .line 18
    .line 19
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->B:I

    .line 20
    .line 21
    if-eq p1, v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Lcom/ortiz/touchview/TouchImageView;->p:Z

    .line 25
    .line 26
    iput p1, p0, Lcom/ortiz/touchview/TouchImageView;->B:I

    .line 27
    .line 28
    :cond_0
    invoke-virtual {p0}, Lcom/ortiz/touchview/TouchImageView;->n()V

    .line 29
    .line 30
    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/ortiz/touchview/TouchImageView;->E:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/ortiz/touchview/TouchImageView;->D:Z

    .line 10
    .line 11
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->F:Lc4/m;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget v0, v0, Lc4/m;->a:F

    .line 19
    .line 20
    iget-object v1, p0, Lcom/ortiz/touchview/TouchImageView;->F:Lc4/m;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget v1, v1, Lc4/m;->b:F

    .line 26
    .line 27
    iget-object v2, p0, Lcom/ortiz/touchview/TouchImageView;->F:Lc4/m;

    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget v2, v2, Lc4/m;->c:F

    .line 33
    .line 34
    iget-object v3, p0, Lcom/ortiz/touchview/TouchImageView;->F:Lc4/m;

    .line 35
    .line 36
    invoke-static {v3}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v3, v3, Lc4/m;->d:Landroid/widget/ImageView$ScaleType;

    .line 40
    .line 41
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ortiz/touchview/TouchImageView;->p(FFFLandroid/widget/ImageView$ScaleType;)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->F:Lc4/m;

    .line 46
    .line 47
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 48
    .line 49
    .line 50
    return-void
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

.method public final onMeasure(II)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_6

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    invoke-virtual {p0, v0}, Lcom/ortiz/touchview/TouchImageView;->j(Landroid/graphics/drawable/Drawable;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p0, v0}, Lcom/ortiz/touchview/TouchImageView;->i(Landroid/graphics/drawable/Drawable;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    const/high16 v4, -0x80000000

    .line 45
    .line 46
    if-eq p1, v4, :cond_1

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    move v1, v2

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    :cond_2
    :goto_0
    if-eq p2, v4, :cond_3

    .line 57
    .line 58
    if-eqz p2, :cond_4

    .line 59
    .line 60
    move v0, v3

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    :cond_4
    :goto_1
    iget-boolean p1, p0, Lcom/ortiz/touchview/TouchImageView;->p:Z

    .line 67
    .line 68
    if-nez p1, :cond_5

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/ortiz/touchview/TouchImageView;->n()V

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_6
    :goto_2
    const/4 p1, 0x0

    .line 78
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 79
    .line 80
    .line 81
    return-void
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
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 6

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Landroid/os/Bundle;

    .line 7
    .line 8
    if-eqz v0, :cond_5

    .line 9
    .line 10
    check-cast p1, Landroid/os/Bundle;

    .line 11
    .line 12
    const-string v0, "parent"

    .line 13
    .line 14
    const-class v1, Landroid/os/Parcelable;

    .line 15
    .line 16
    invoke-static {p1, v0, v1}, Le6/d;->q(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/os/Parcelable;

    .line 21
    .line 22
    invoke-super {p0, v0}, Landroid/widget/ImageView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 23
    .line 24
    .line 25
    const-string v0, "saveScale"

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iput v0, p0, Lcom/ortiz/touchview/TouchImageView;->h:F

    .line 32
    .line 33
    const-string v0, "matrix"

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloatArray(Ljava/lang/String;)[F

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 43
    .line 44
    iget-object v1, p0, Lcom/ortiz/touchview/TouchImageView;->j:Landroid/graphics/Matrix;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->setValues([F)V

    .line 47
    .line 48
    .line 49
    const-string v0, "matchViewHeight"

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iput v0, p0, Lcom/ortiz/touchview/TouchImageView;->N:F

    .line 56
    .line 57
    const-string v0, "matchViewWidth"

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iput v0, p0, Lcom/ortiz/touchview/TouchImageView;->M:F

    .line 64
    .line 65
    const-string v0, "viewHeight"

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iput v0, p0, Lcom/ortiz/touchview/TouchImageView;->J:I

    .line 72
    .line 73
    const-string v0, "viewWidth"

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    iput v0, p0, Lcom/ortiz/touchview/TouchImageView;->I:I

    .line 80
    .line 81
    const-string v0, "imageRendered"

    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iput-boolean v0, p0, Lcom/ortiz/touchview/TouchImageView;->D:Z

    .line 88
    .line 89
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 90
    .line 91
    const/4 v1, 0x0

    .line 92
    const/16 v2, 0x22

    .line 93
    .line 94
    const-class v3, Lc4/a;

    .line 95
    .line 96
    const-string v4, "viewSizeChangeFixedPixel"

    .line 97
    .line 98
    if-lt v0, v2, :cond_0

    .line 99
    .line 100
    invoke-static {p1, v4, v3}, Li0/d;->d(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    goto :goto_0

    .line 105
    :cond_0
    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-virtual {v3, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_1
    move-object v4, v1

    .line 117
    :goto_0
    check-cast v4, Lc4/a;

    .line 118
    .line 119
    iput-object v4, p0, Lcom/ortiz/touchview/TouchImageView;->o:Lc4/a;

    .line 120
    .line 121
    const-string v4, "orientationChangeFixedPixel"

    .line 122
    .line 123
    if-lt v0, v2, :cond_2

    .line 124
    .line 125
    invoke-static {p1, v4, v3}, Li0/d;->d(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    goto :goto_1

    .line 130
    :cond_2
    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v3, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-eqz v2, :cond_3

    .line 139
    .line 140
    move-object v1, v0

    .line 141
    :cond_3
    :goto_1
    check-cast v1, Lc4/a;

    .line 142
    .line 143
    iput-object v1, p0, Lcom/ortiz/touchview/TouchImageView;->n:Lc4/a;

    .line 144
    .line 145
    const-string v0, "orientation"

    .line 146
    .line 147
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->B:I

    .line 152
    .line 153
    if-eq v0, p1, :cond_4

    .line 154
    .line 155
    const/4 p1, 0x1

    .line 156
    iput-boolean p1, p0, Lcom/ortiz/touchview/TouchImageView;->p:Z

    .line 157
    .line 158
    :cond_4
    return-void

    .line 159
    :cond_5
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 160
    .line 161
    .line 162
    return-void
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
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->i:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Landroid/widget/ImageView;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lp4/f;

    .line 13
    .line 14
    const-string v2, "parent"

    .line 15
    .line 16
    invoke-direct {v1, v2, v0}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->B:I

    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v2, Lp4/f;

    .line 26
    .line 27
    const-string v3, "orientation"

    .line 28
    .line 29
    invoke-direct {v2, v3, v0}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->h:F

    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v3, Lp4/f;

    .line 39
    .line 40
    const-string v4, "saveScale"

    .line 41
    .line 42
    invoke-direct {v3, v4, v0}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->L:F

    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-instance v4, Lp4/f;

    .line 52
    .line 53
    const-string v5, "matchViewHeight"

    .line 54
    .line 55
    invoke-direct {v4, v5, v0}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->K:F

    .line 59
    .line 60
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    new-instance v5, Lp4/f;

    .line 65
    .line 66
    const-string v6, "matchViewWidth"

    .line 67
    .line 68
    invoke-direct {v5, v6, v0}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 72
    .line 73
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    new-instance v6, Lp4/f;

    .line 78
    .line 79
    const-string v7, "viewWidth"

    .line 80
    .line 81
    invoke-direct {v6, v7, v0}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 85
    .line 86
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v7, Lp4/f;

    .line 91
    .line 92
    const-string v8, "viewHeight"

    .line 93
    .line 94
    invoke-direct {v7, v8, v0}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 98
    .line 99
    new-instance v8, Lp4/f;

    .line 100
    .line 101
    const-string v9, "matrix"

    .line 102
    .line 103
    invoke-direct {v8, v9, v0}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-boolean v0, p0, Lcom/ortiz/touchview/TouchImageView;->D:Z

    .line 107
    .line 108
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    new-instance v9, Lp4/f;

    .line 113
    .line 114
    const-string v10, "imageRendered"

    .line 115
    .line 116
    invoke-direct {v9, v10, v0}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->o:Lc4/a;

    .line 120
    .line 121
    new-instance v10, Lp4/f;

    .line 122
    .line 123
    const-string v11, "viewSizeChangeFixedPixel"

    .line 124
    .line 125
    invoke-direct {v10, v11, v0}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->n:Lc4/a;

    .line 129
    .line 130
    new-instance v11, Lp4/f;

    .line 131
    .line 132
    const-string v12, "orientationChangeFixedPixel"

    .line 133
    .line 134
    invoke-direct {v11, v12, v0}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    const/16 v0, 0xb

    .line 138
    .line 139
    new-array v0, v0, [Lp4/f;

    .line 140
    .line 141
    const/4 v12, 0x0

    .line 142
    aput-object v1, v0, v12

    .line 143
    .line 144
    const/4 v1, 0x1

    .line 145
    aput-object v2, v0, v1

    .line 146
    .line 147
    const/4 v1, 0x2

    .line 148
    aput-object v3, v0, v1

    .line 149
    .line 150
    const/4 v1, 0x3

    .line 151
    aput-object v4, v0, v1

    .line 152
    .line 153
    const/4 v1, 0x4

    .line 154
    aput-object v5, v0, v1

    .line 155
    .line 156
    const/4 v1, 0x5

    .line 157
    aput-object v6, v0, v1

    .line 158
    .line 159
    const/4 v1, 0x6

    .line 160
    aput-object v7, v0, v1

    .line 161
    .line 162
    const/4 v1, 0x7

    .line 163
    aput-object v8, v0, v1

    .line 164
    .line 165
    const/16 v1, 0x8

    .line 166
    .line 167
    aput-object v9, v0, v1

    .line 168
    .line 169
    const/16 v1, 0x9

    .line 170
    .line 171
    aput-object v10, v0, v1

    .line 172
    .line 173
    const/16 v1, 0xa

    .line 174
    .line 175
    aput-object v11, v0, v1

    .line 176
    .line 177
    invoke-static {v0}, Le6/l;->e([Lp4/f;)Landroid/os/Bundle;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    return-object v0
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

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 5
    .line 6
    .line 7
    move-result p3

    .line 8
    sub-int/2addr p1, p3

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    sub-int/2addr p1, p3

    .line 14
    iput p1, p0, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    sub-int/2addr p2, p1

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    sub-int/2addr p2, p1

    .line 26
    iput p2, p0, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/ortiz/touchview/TouchImageView;->f()V

    .line 29
    .line 30
    .line 31
    return-void
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

.method public final p(FFFLandroid/widget/ImageView$ScaleType;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/ortiz/touchview/TouchImageView;->E:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lc4/m;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput p1, v0, Lc4/m;->a:F

    .line 11
    .line 12
    iput p2, v0, Lc4/m;->b:F

    .line 13
    .line 14
    iput p3, v0, Lc4/m;->c:F

    .line 15
    .line 16
    iput-object p4, v0, Lc4/m;->d:Landroid/widget/ImageView$ScaleType;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->F:Lc4/m;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->r:F

    .line 22
    .line 23
    const/high16 v1, -0x40800000    # -1.0f

    .line 24
    .line 25
    cmpg-float v0, v0, v1

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lcom/ortiz/touchview/TouchImageView;->setMinZoom(F)V

    .line 30
    .line 31
    .line 32
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->h:F

    .line 33
    .line 34
    iget v1, p0, Lcom/ortiz/touchview/TouchImageView;->s:F

    .line 35
    .line 36
    cmpg-float v0, v0, v1

    .line 37
    .line 38
    if-gez v0, :cond_1

    .line 39
    .line 40
    iput v1, p0, Lcom/ortiz/touchview/TouchImageView;->h:F

    .line 41
    .line 42
    :cond_1
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->C:Landroid/widget/ImageView$ScaleType;

    .line 43
    .line 44
    if-eq p4, v0, :cond_2

    .line 45
    .line 46
    invoke-static {p4}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p4}, Lcom/ortiz/touchview/TouchImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    const/high16 p4, 0x3f800000    # 1.0f

    .line 53
    .line 54
    iput p4, p0, Lcom/ortiz/touchview/TouchImageView;->h:F

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/ortiz/touchview/TouchImageView;->f()V

    .line 57
    .line 58
    .line 59
    float-to-double v1, p1

    .line 60
    iget p1, p0, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 61
    .line 62
    int-to-float p1, p1

    .line 63
    const/high16 p4, 0x40000000    # 2.0f

    .line 64
    .line 65
    div-float v3, p1, p4

    .line 66
    .line 67
    iget p1, p0, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 68
    .line 69
    int-to-float p1, p1

    .line 70
    div-float v4, p1, p4

    .line 71
    .line 72
    iget-boolean v5, p0, Lcom/ortiz/touchview/TouchImageView;->l:Z

    .line 73
    .line 74
    move-object v0, p0

    .line 75
    invoke-virtual/range {v0 .. v5}, Lcom/ortiz/touchview/TouchImageView;->o(DFFZ)V

    .line 76
    .line 77
    .line 78
    iget-object p1, v0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 79
    .line 80
    iget-object p4, v0, Lcom/ortiz/touchview/TouchImageView;->i:Landroid/graphics/Matrix;

    .line 81
    .line 82
    invoke-virtual {p4, p1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 83
    .line 84
    .line 85
    iget-object p1, v0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 86
    .line 87
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageWidth()F

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    mul-float p2, p2, v1

    .line 92
    .line 93
    iget v1, v0, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 94
    .line 95
    int-to-float v1, v1

    .line 96
    const/high16 v2, 0x3f000000    # 0.5f

    .line 97
    .line 98
    mul-float v1, v1, v2

    .line 99
    .line 100
    sub-float/2addr p2, v1

    .line 101
    neg-float p2, p2

    .line 102
    const/4 v1, 0x2

    .line 103
    aput p2, p1, v1

    .line 104
    .line 105
    iget-object p1, v0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 106
    .line 107
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageHeight()F

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    mul-float p3, p3, p2

    .line 112
    .line 113
    iget p2, v0, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 114
    .line 115
    int-to-float p2, p2

    .line 116
    mul-float p2, p2, v2

    .line 117
    .line 118
    sub-float/2addr p3, p2

    .line 119
    neg-float p2, p3

    .line 120
    const/4 p3, 0x5

    .line 121
    aput p2, p1, p3

    .line 122
    .line 123
    iget-object p1, v0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 124
    .line 125
    invoke-virtual {p4, p1}, Landroid/graphics/Matrix;->setValues([F)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lcom/ortiz/touchview/TouchImageView;->h()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Lcom/ortiz/touchview/TouchImageView;->n()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, p4}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 135
    .line 136
    .line 137
    return-void
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

.method public final q(FF)Landroid/graphics/PointF;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->i:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    int-to-float v0, v0

    .line 17
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    int-to-float v1, v1

    .line 26
    div-float/2addr p1, v0

    .line 27
    div-float/2addr p2, v1

    .line 28
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    aget v0, v0, v1

    .line 32
    .line 33
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageWidth()F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    mul-float v1, v1, p1

    .line 38
    .line 39
    add-float/2addr v1, v0

    .line 40
    iget-object p1, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 41
    .line 42
    const/4 v0, 0x5

    .line 43
    aget p1, p1, v0

    .line 44
    .line 45
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageHeight()F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    mul-float v0, v0, p2

    .line 50
    .line 51
    add-float/2addr v0, p1

    .line 52
    new-instance p1, Landroid/graphics/PointF;

    .line 53
    .line 54
    invoke-direct {p1, v1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 55
    .line 56
    .line 57
    return-object p1
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

.method public final r(FFZ)Landroid/graphics/PointF;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ortiz/touchview/TouchImageView;->i:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    int-to-float v0, v0

    .line 17
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    int-to-float v1, v1

    .line 26
    iget-object v2, p0, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    aget v3, v2, v3

    .line 30
    .line 31
    const/4 v4, 0x5

    .line 32
    aget v2, v2, v4

    .line 33
    .line 34
    sub-float/2addr p1, v3

    .line 35
    mul-float p1, p1, v0

    .line 36
    .line 37
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageWidth()F

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    div-float/2addr p1, v3

    .line 42
    sub-float/2addr p2, v2

    .line 43
    mul-float p2, p2, v1

    .line 44
    .line 45
    invoke-direct {p0}, Lcom/ortiz/touchview/TouchImageView;->getImageHeight()F

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    div-float/2addr p2, v2

    .line 50
    if-eqz p3, :cond_0

    .line 51
    .line 52
    const/4 p3, 0x0

    .line 53
    invoke-static {p1, p3}, Ljava/lang/Math;->max(FF)F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-static {p2, p3}, Ljava/lang/Math;->max(FF)F

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    invoke-static {p2, v1}, Ljava/lang/Math;->min(FF)F

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    :cond_0
    new-instance p3, Landroid/graphics/PointF;

    .line 70
    .line 71
    invoke-direct {p3, p1, p2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 72
    .line 73
    .line 74
    return-object p3
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
.end method

.method public final setDoubleTapScale(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ortiz/touchview/TouchImageView;->z:F

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

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/ortiz/touchview/TouchImageView;->D:Z

    .line 3
    .line 4
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/ortiz/touchview/TouchImageView;->n()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/ortiz/touchview/TouchImageView;->f()V

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
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/ortiz/touchview/TouchImageView;->D:Z

    .line 3
    .line 4
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/ortiz/touchview/TouchImageView;->n()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/ortiz/touchview/TouchImageView;->f()V

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
.end method

.method public setImageResource(I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/ortiz/touchview/TouchImageView;->D:Z

    .line 3
    .line 4
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/ortiz/touchview/TouchImageView;->n()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/ortiz/touchview/TouchImageView;->f()V

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
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/ortiz/touchview/TouchImageView;->D:Z

    .line 3
    .line 4
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageURI(Landroid/net/Uri;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/ortiz/touchview/TouchImageView;->n()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/ortiz/touchview/TouchImageView;->f()V

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
.end method

.method public final setMaxZoom(F)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/ortiz/touchview/TouchImageView;->v:F

    .line 2
    .line 3
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 4
    .line 5
    mul-float p1, p1, v0

    .line 6
    .line 7
    iput p1, p0, Lcom/ortiz/touchview/TouchImageView;->x:F

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lcom/ortiz/touchview/TouchImageView;->t:Z

    .line 11
    .line 12
    return-void
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

.method public final setMaxZoomRatio(F)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/ortiz/touchview/TouchImageView;->u:F

    .line 2
    .line 3
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->s:F

    .line 4
    .line 5
    mul-float v0, v0, p1

    .line 6
    .line 7
    iput v0, p0, Lcom/ortiz/touchview/TouchImageView;->v:F

    .line 8
    .line 9
    const/high16 p1, 0x3fa00000    # 1.25f

    .line 10
    .line 11
    mul-float v0, v0, p1

    .line 12
    .line 13
    iput v0, p0, Lcom/ortiz/touchview/TouchImageView;->x:F

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lcom/ortiz/touchview/TouchImageView;->t:Z

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

.method public final setMinZoom(F)V
    .locals 3

    .line 1
    iput p1, p0, Lcom/ortiz/touchview/TouchImageView;->r:F

    .line 2
    .line 3
    const/high16 v0, -0x40800000    # -1.0f

    .line 4
    .line 5
    cmpg-float v0, p1, v0

    .line 6
    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iget-object p1, p0, Lcom/ortiz/touchview/TouchImageView;->C:Landroid/widget/ImageView$ScaleType;

    .line 10
    .line 11
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    .line 12
    .line 13
    if-eq p1, v0, :cond_1

    .line 14
    .line 15
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 16
    .line 17
    if-ne p1, v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    .line 21
    .line 22
    iput p1, p0, Lcom/ortiz/touchview/TouchImageView;->s:F

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0, p1}, Lcom/ortiz/touchview/TouchImageView;->j(Landroid/graphics/drawable/Drawable;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {p0, p1}, Lcom/ortiz/touchview/TouchImageView;->i(Landroid/graphics/drawable/Drawable;)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-lez v1, :cond_4

    .line 38
    .line 39
    if-lez p1, :cond_4

    .line 40
    .line 41
    iget v2, p0, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 42
    .line 43
    int-to-float v2, v2

    .line 44
    int-to-float v1, v1

    .line 45
    div-float/2addr v2, v1

    .line 46
    iget v1, p0, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 47
    .line 48
    int-to-float v1, v1

    .line 49
    int-to-float p1, p1

    .line 50
    div-float/2addr v1, p1

    .line 51
    iget-object p1, p0, Lcom/ortiz/touchview/TouchImageView;->C:Landroid/widget/ImageView$ScaleType;

    .line 52
    .line 53
    if-ne p1, v0, :cond_2

    .line 54
    .line 55
    invoke-static {v2, v1}, Ljava/lang/Math;->min(FF)F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-static {v2, v1}, Ljava/lang/Math;->min(FF)F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    div-float/2addr p1, v0

    .line 69
    :goto_1
    iput p1, p0, Lcom/ortiz/touchview/TouchImageView;->s:F

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    iput p1, p0, Lcom/ortiz/touchview/TouchImageView;->s:F

    .line 73
    .line 74
    :cond_4
    :goto_2
    iget-boolean p1, p0, Lcom/ortiz/touchview/TouchImageView;->t:Z

    .line 75
    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    iget p1, p0, Lcom/ortiz/touchview/TouchImageView;->u:F

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Lcom/ortiz/touchview/TouchImageView;->setMaxZoomRatio(F)V

    .line 81
    .line 82
    .line 83
    :cond_5
    const/high16 p1, 0x3f400000    # 0.75f

    .line 84
    .line 85
    iget v0, p0, Lcom/ortiz/touchview/TouchImageView;->s:F

    .line 86
    .line 87
    mul-float v0, v0, p1

    .line 88
    .line 89
    iput v0, p0, Lcom/ortiz/touchview/TouchImageView;->w:F

    .line 90
    .line 91
    return-void
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

.method public final setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V
    .locals 1

    .line 1
    const-string v0, "onDoubleTapListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/ortiz/touchview/TouchImageView;->Q:Landroid/view/GestureDetector$OnDoubleTapListener;

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

.method public final setOnTouchCoordinatesListener(Lc4/c;)V
    .locals 1

    .line 1
    const-string v0, "onTouchCoordinatesListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public final setOnTouchImageViewListener(Lc4/d;)V
    .locals 1

    .line 1
    const-string v0, "onTouchImageViewListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public setOnTouchListener(Landroid/view/View$OnTouchListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ortiz/touchview/TouchImageView;->R:Landroid/view/View$OnTouchListener;

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

.method public final setOrientationChangeFixedPixel(Lc4/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ortiz/touchview/TouchImageView;->n:Lc4/a;

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

.method public final setRotateImageToFitScreen(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ortiz/touchview/TouchImageView;->m:Z

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

.method public setScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    invoke-super {p0, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iput-object p1, p0, Lcom/ortiz/touchview/TouchImageView;->C:Landroid/widget/ImageView$ScaleType;

    .line 15
    .line 16
    iget-boolean p1, p0, Lcom/ortiz/touchview/TouchImageView;->E:Z

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, p0}, Lcom/ortiz/touchview/TouchImageView;->setZoom(Lcom/ortiz/touchview/TouchImageView;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
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

.method public final setSuperZoomEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ortiz/touchview/TouchImageView;->l:Z

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

.method public final setViewSizeChangeFixedPixel(Lc4/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ortiz/touchview/TouchImageView;->o:Lc4/a;

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

.method public final setZoom(F)V
    .locals 2

    const/high16 v0, 0x3f000000    # 0.5f

    .line 1
    iget-object v1, p0, Lcom/ortiz/touchview/TouchImageView;->C:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, p1, v0, v0, v1}, Lcom/ortiz/touchview/TouchImageView;->p(FFFLandroid/widget/ImageView$ScaleType;)V

    return-void
.end method

.method public final setZoom(Lcom/ortiz/touchview/TouchImageView;)V
    .locals 3

    const-string v0, "imageSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/ortiz/touchview/TouchImageView;->getScrollPosition()Landroid/graphics/PointF;

    move-result-object v0

    .line 3
    iget v1, p1, Lcom/ortiz/touchview/TouchImageView;->h:F

    iget v2, v0, Landroid/graphics/PointF;->x:F

    iget v0, v0, Landroid/graphics/PointF;->y:F

    invoke-virtual {p1}, Lcom/ortiz/touchview/TouchImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object p1

    invoke-virtual {p0, v1, v2, v0, p1}, Lcom/ortiz/touchview/TouchImageView;->p(FFFLandroid/widget/ImageView$ScaleType;)V

    return-void
.end method

.method public final setZoomEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ortiz/touchview/TouchImageView;->k:Z

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

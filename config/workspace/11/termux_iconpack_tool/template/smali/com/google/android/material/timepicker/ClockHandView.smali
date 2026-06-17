.class Lcom/google/android/material/timepicker/ClockHandView;
.super Landroid/view/View;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/timepicker/ClockHandView$OnActionUpListener;,
        Lcom/google/android/material/timepicker/ClockHandView$OnRotateListener;
    }
.end annotation


# static fields
.field public static final synthetic C:I


# instance fields
.field public A:I

.field public B:I

.field public final h:I

.field public final i:Landroid/animation/TimeInterpolator;

.field public final j:Landroid/animation/ValueAnimator;

.field public k:Z

.field public l:F

.field public m:F

.field public n:Z

.field public final o:I

.field public p:Z

.field public final q:Ljava/util/ArrayList;

.field public final r:I

.field public final s:F

.field public final t:Landroid/graphics/Paint;

.field public final u:Landroid/graphics/RectF;

.field public final v:I

.field public w:F

.field public x:Z

.field public y:Lcom/google/android/material/timepicker/ClockHandView$OnActionUpListener;

.field public z:D


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    sget v0, Lcom/google/android/material/R$attr;->materialClockStyle:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/animation/ValueAnimator;

    .line 7
    .line 8
    invoke-direct {v1}, Landroid/animation/ValueAnimator;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Lcom/google/android/material/timepicker/ClockHandView;->j:Landroid/animation/ValueAnimator;

    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lcom/google/android/material/timepicker/ClockHandView;->q:Ljava/util/ArrayList;

    .line 19
    .line 20
    new-instance v1, Landroid/graphics/Paint;

    .line 21
    .line 22
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lcom/google/android/material/timepicker/ClockHandView;->t:Landroid/graphics/Paint;

    .line 26
    .line 27
    new-instance v2, Landroid/graphics/RectF;

    .line 28
    .line 29
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v2, p0, Lcom/google/android/material/timepicker/ClockHandView;->u:Landroid/graphics/RectF;

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    iput v2, p0, Lcom/google/android/material/timepicker/ClockHandView;->B:I

    .line 36
    .line 37
    sget-object v3, Lcom/google/android/material/R$styleable;->ClockHandView:[I

    .line 38
    .line 39
    sget v4, Lcom/google/android/material/R$style;->Widget_MaterialComponents_TimePicker_Clock:I

    .line 40
    .line 41
    invoke-virtual {p1, p2, v3, v0, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    sget v0, Lcom/google/android/material/R$attr;->motionDurationLong2:I

    .line 46
    .line 47
    const/16 v3, 0xc8

    .line 48
    .line 49
    invoke-static {p1, v0, v3}, Lcom/google/android/material/motion/MotionUtils;->c(Landroid/content/Context;II)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iput v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->h:I

    .line 54
    .line 55
    sget v0, Lcom/google/android/material/R$attr;->motionEasingEmphasizedInterpolator:I

    .line 56
    .line 57
    sget-object v3, Lcom/google/android/material/animation/AnimationUtils;->b:Lg1/b;

    .line 58
    .line 59
    invoke-static {p1, v0, v3}, Lcom/google/android/material/motion/MotionUtils;->d(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->i:Landroid/animation/TimeInterpolator;

    .line 64
    .line 65
    sget v0, Lcom/google/android/material/R$styleable;->ClockHandView_materialCircleRadius:I

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    invoke-virtual {p2, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iput v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->A:I

    .line 73
    .line 74
    sget v0, Lcom/google/android/material/R$styleable;->ClockHandView_selectorSize:I

    .line 75
    .line 76
    invoke-virtual {p2, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iput v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->r:I

    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sget v4, Lcom/google/android/material/R$dimen;->material_clock_hand_stroke_width:I

    .line 87
    .line 88
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    iput v4, p0, Lcom/google/android/material/timepicker/ClockHandView;->v:I

    .line 93
    .line 94
    sget v4, Lcom/google/android/material/R$dimen;->material_clock_hand_center_dot_radius:I

    .line 95
    .line 96
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    int-to-float v0, v0

    .line 101
    iput v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->s:F

    .line 102
    .line 103
    sget v0, Lcom/google/android/material/R$styleable;->ClockHandView_clockHandColor:I

    .line 104
    .line 105
    invoke-virtual {p2, v0, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 113
    .line 114
    .line 115
    const/4 v0, 0x0

    .line 116
    invoke-virtual {p0, v0, v3}, Lcom/google/android/material/timepicker/ClockHandView;->c(FZ)V

    .line 117
    .line 118
    .line 119
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    iput p1, p0, Lcom/google/android/material/timepicker/ClockHandView;->o:I

    .line 128
    .line 129
    sget-object p1, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 130
    .line 131
    const/4 p1, 0x2

    .line 132
    invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 136
    .line 137
    .line 138
    return-void
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


# virtual methods
.method public final a(FF)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    div-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    div-int/lit8 v1, v1, 0x2

    .line 12
    .line 13
    int-to-float v0, v0

    .line 14
    sub-float/2addr p1, v0

    .line 15
    float-to-double v2, p1

    .line 16
    int-to-float p1, v1

    .line 17
    sub-float/2addr p2, p1

    .line 18
    float-to-double p1, p2

    .line 19
    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    double-to-int p1, p1

    .line 28
    add-int/lit8 p2, p1, 0x5a

    .line 29
    .line 30
    if-gez p2, :cond_0

    .line 31
    .line 32
    add-int/lit16 p1, p1, 0x1c2

    .line 33
    .line 34
    return p1

    .line 35
    :cond_0
    return p2
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

.method public final b(I)I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    iget p1, p0, Lcom/google/android/material/timepicker/ClockHandView;->A:I

    .line 5
    .line 6
    int-to-float p1, p1

    .line 7
    const v0, 0x3f28f5c3    # 0.66f

    .line 8
    .line 9
    .line 10
    mul-float p1, p1, v0

    .line 11
    .line 12
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :cond_0
    iget p1, p0, Lcom/google/android/material/timepicker/ClockHandView;->A:I

    .line 18
    .line 19
    return p1
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

.method public final c(FZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->j:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    if-nez p2, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, p1, v1}, Lcom/google/android/material/timepicker/ClockHandView;->d(FZ)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    iget p2, p0, Lcom/google/android/material/timepicker/ClockHandView;->w:F

    .line 16
    .line 17
    sub-float v2, p2, p1

    .line 18
    .line 19
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/high16 v3, 0x43340000    # 180.0f

    .line 24
    .line 25
    cmpl-float v2, v2, v3

    .line 26
    .line 27
    if-lez v2, :cond_3

    .line 28
    .line 29
    const/high16 v2, 0x43b40000    # 360.0f

    .line 30
    .line 31
    cmpl-float v4, p2, v3

    .line 32
    .line 33
    if-lez v4, :cond_2

    .line 34
    .line 35
    cmpg-float v4, p1, v3

    .line 36
    .line 37
    if-gez v4, :cond_2

    .line 38
    .line 39
    add-float/2addr p1, v2

    .line 40
    :cond_2
    cmpg-float v4, p2, v3

    .line 41
    .line 42
    if-gez v4, :cond_3

    .line 43
    .line 44
    cmpl-float v3, p1, v3

    .line 45
    .line 46
    if-lez v3, :cond_3

    .line 47
    .line 48
    add-float/2addr p2, v2

    .line 49
    :cond_3
    new-instance v2, Landroid/util/Pair;

    .line 50
    .line 51
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-direct {v2, p2, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Ljava/lang/Float;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    iget-object p2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p2, Ljava/lang/Float;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    const/4 v2, 0x2

    .line 79
    new-array v2, v2, [F

    .line 80
    .line 81
    aput p1, v2, v1

    .line 82
    .line 83
    const/4 p1, 0x1

    .line 84
    aput p2, v2, p1

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 87
    .line 88
    .line 89
    iget p1, p0, Lcom/google/android/material/timepicker/ClockHandView;->h:I

    .line 90
    .line 91
    int-to-long p1, p1

    .line 92
    invoke-virtual {v0, p1, p2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lcom/google/android/material/timepicker/ClockHandView;->i:Landroid/animation/TimeInterpolator;

    .line 96
    .line 97
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 98
    .line 99
    .line 100
    new-instance p1, Lcom/google/android/material/timepicker/a;

    .line 101
    .line 102
    invoke-direct {p1, p0}, Lcom/google/android/material/timepicker/a;-><init>(Lcom/google/android/material/timepicker/ClockHandView;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 106
    .line 107
    .line 108
    new-instance p1, Lcom/google/android/material/timepicker/ClockHandView$1;

    .line 109
    .line 110
    invoke-direct {p1}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 117
    .line 118
    .line 119
    return-void
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

.method public final d(FZ)V
    .locals 6

    .line 1
    const/high16 v0, 0x43b40000    # 360.0f

    .line 2
    .line 3
    rem-float/2addr p1, v0

    .line 4
    iput p1, p0, Lcom/google/android/material/timepicker/ClockHandView;->w:F

    .line 5
    .line 6
    const/high16 v0, 0x42b40000    # 90.0f

    .line 7
    .line 8
    sub-float v0, p1, v0

    .line 9
    .line 10
    float-to-double v0, v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->z:D

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    div-int/lit8 v0, v0, 0x2

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    div-int/lit8 v1, v1, 0x2

    .line 28
    .line 29
    iget v2, p0, Lcom/google/android/material/timepicker/ClockHandView;->B:I

    .line 30
    .line 31
    invoke-virtual {p0, v2}, Lcom/google/android/material/timepicker/ClockHandView;->b(I)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    int-to-float v1, v1

    .line 36
    int-to-float v2, v2

    .line 37
    iget-wide v3, p0, Lcom/google/android/material/timepicker/ClockHandView;->z:D

    .line 38
    .line 39
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    double-to-float v3, v3

    .line 44
    mul-float v3, v3, v2

    .line 45
    .line 46
    add-float/2addr v3, v1

    .line 47
    int-to-float v0, v0

    .line 48
    iget-wide v4, p0, Lcom/google/android/material/timepicker/ClockHandView;->z:D

    .line 49
    .line 50
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 51
    .line 52
    .line 53
    move-result-wide v4

    .line 54
    double-to-float v1, v4

    .line 55
    mul-float v2, v2, v1

    .line 56
    .line 57
    add-float/2addr v2, v0

    .line 58
    iget v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->r:I

    .line 59
    .line 60
    int-to-float v0, v0

    .line 61
    sub-float v1, v3, v0

    .line 62
    .line 63
    sub-float v4, v2, v0

    .line 64
    .line 65
    add-float/2addr v3, v0

    .line 66
    add-float/2addr v2, v0

    .line 67
    iget-object v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->u:Landroid/graphics/RectF;

    .line 68
    .line 69
    invoke-virtual {v0, v1, v4, v3, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->q:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    const/4 v2, 0x0

    .line 79
    :goto_0
    if-ge v2, v1, :cond_0

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    add-int/lit8 v2, v2, 0x1

    .line 86
    .line 87
    check-cast v3, Lcom/google/android/material/timepicker/ClockHandView$OnRotateListener;

    .line 88
    .line 89
    invoke-interface {v3, p1, p2}, Lcom/google/android/material/timepicker/ClockHandView$OnRotateListener;->b(FZ)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 94
    .line 95
    .line 96
    return-void
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

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    div-int/lit8 v0, v0, 0x2

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    div-int/lit8 v1, v1, 0x2

    .line 15
    .line 16
    iget v2, p0, Lcom/google/android/material/timepicker/ClockHandView;->B:I

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Lcom/google/android/material/timepicker/ClockHandView;->b(I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    int-to-float v4, v1

    .line 23
    int-to-float v3, v2

    .line 24
    iget-wide v5, p0, Lcom/google/android/material/timepicker/ClockHandView;->z:D

    .line 25
    .line 26
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    double-to-float v5, v5

    .line 31
    mul-float v5, v5, v3

    .line 32
    .line 33
    add-float/2addr v5, v4

    .line 34
    move v6, v5

    .line 35
    int-to-float v5, v0

    .line 36
    iget-wide v7, p0, Lcom/google/android/material/timepicker/ClockHandView;->z:D

    .line 37
    .line 38
    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    .line 39
    .line 40
    .line 41
    move-result-wide v7

    .line 42
    double-to-float v7, v7

    .line 43
    mul-float v3, v3, v7

    .line 44
    .line 45
    add-float/2addr v3, v5

    .line 46
    const/4 v7, 0x0

    .line 47
    iget-object v8, p0, Lcom/google/android/material/timepicker/ClockHandView;->t:Landroid/graphics/Paint;

    .line 48
    .line 49
    invoke-virtual {v8, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 50
    .line 51
    .line 52
    iget v7, p0, Lcom/google/android/material/timepicker/ClockHandView;->r:I

    .line 53
    .line 54
    int-to-float v9, v7

    .line 55
    invoke-virtual {p1, v6, v3, v9, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 56
    .line 57
    .line 58
    iget-wide v9, p0, Lcom/google/android/material/timepicker/ClockHandView;->z:D

    .line 59
    .line 60
    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    .line 61
    .line 62
    .line 63
    move-result-wide v9

    .line 64
    iget-wide v11, p0, Lcom/google/android/material/timepicker/ClockHandView;->z:D

    .line 65
    .line 66
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    .line 67
    .line 68
    .line 69
    move-result-wide v11

    .line 70
    sub-int/2addr v2, v7

    .line 71
    int-to-float v2, v2

    .line 72
    float-to-double v2, v2

    .line 73
    mul-double v11, v11, v2

    .line 74
    .line 75
    double-to-int v6, v11

    .line 76
    add-int/2addr v1, v6

    .line 77
    int-to-float v6, v1

    .line 78
    mul-double v2, v2, v9

    .line 79
    .line 80
    double-to-int v1, v2

    .line 81
    add-int/2addr v0, v1

    .line 82
    int-to-float v7, v0

    .line 83
    iget v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->v:I

    .line 84
    .line 85
    int-to-float v0, v0

    .line 86
    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 87
    .line 88
    .line 89
    move-object v3, p1

    .line 90
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 91
    .line 92
    .line 93
    iget p1, p0, Lcom/google/android/material/timepicker/ClockHandView;->s:F

    .line 94
    .line 95
    invoke-virtual {v3, v4, v5, p1, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 96
    .line 97
    .line 98
    return-void
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

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget-object p2, p1, Lcom/google/android/material/timepicker/ClockHandView;->j:Landroid/animation/ValueAnimator;

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    iget p2, p1, Lcom/google/android/material/timepicker/ClockHandView;->w:F

    .line 14
    .line 15
    const/4 p3, 0x0

    .line 16
    invoke-virtual {p0, p2, p3}, Lcom/google/android/material/timepicker/ClockHandView;->c(FZ)V

    .line 17
    .line 18
    .line 19
    :cond_0
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

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 11

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/16 v2, 0xc

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    const/4 v4, 0x0

    .line 17
    if-eqz v0, :cond_5

    .line 18
    .line 19
    const/4 v5, 0x2

    .line 20
    if-eq v0, v3, :cond_0

    .line 21
    .line 22
    if-eq v0, v5, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    :goto_0
    const/4 v6, 0x0

    .line 27
    goto :goto_4

    .line 28
    :cond_0
    iget v6, p0, Lcom/google/android/material/timepicker/ClockHandView;->l:F

    .line 29
    .line 30
    sub-float v6, v1, v6

    .line 31
    .line 32
    float-to-int v6, v6

    .line 33
    iget v7, p0, Lcom/google/android/material/timepicker/ClockHandView;->m:F

    .line 34
    .line 35
    sub-float v7, p1, v7

    .line 36
    .line 37
    float-to-int v7, v7

    .line 38
    mul-int v6, v6, v6

    .line 39
    .line 40
    mul-int v7, v7, v7

    .line 41
    .line 42
    add-int/2addr v7, v6

    .line 43
    iget v6, p0, Lcom/google/android/material/timepicker/ClockHandView;->o:I

    .line 44
    .line 45
    if-le v7, v6, :cond_1

    .line 46
    .line 47
    const/4 v6, 0x1

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const/4 v6, 0x0

    .line 50
    :goto_1
    iput-boolean v6, p0, Lcom/google/android/material/timepicker/ClockHandView;->n:Z

    .line 51
    .line 52
    iget-boolean v6, p0, Lcom/google/android/material/timepicker/ClockHandView;->x:Z

    .line 53
    .line 54
    if-ne v0, v3, :cond_2

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    const/4 v0, 0x0

    .line 59
    :goto_2
    iget-boolean v7, p0, Lcom/google/android/material/timepicker/ClockHandView;->p:Z

    .line 60
    .line 61
    if-eqz v7, :cond_4

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    div-int/2addr v7, v5

    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    div-int/2addr v8, v5

    .line 73
    int-to-float v7, v7

    .line 74
    int-to-float v8, v8

    .line 75
    sub-float v7, v1, v7

    .line 76
    .line 77
    sub-float v8, p1, v8

    .line 78
    .line 79
    float-to-double v9, v7

    .line 80
    float-to-double v7, v8

    .line 81
    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->hypot(DD)D

    .line 82
    .line 83
    .line 84
    move-result-wide v7

    .line 85
    double-to-float v7, v7

    .line 86
    invoke-virtual {p0, v5}, Lcom/google/android/material/timepicker/ClockHandView;->b(I)I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    invoke-static {v9, v2}, Lcom/google/android/material/internal/ViewUtils;->b(Landroid/content/Context;I)F

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    int-to-float v8, v8

    .line 99
    add-float/2addr v8, v9

    .line 100
    cmpg-float v7, v7, v8

    .line 101
    .line 102
    if-gtz v7, :cond_3

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_3
    const/4 v5, 0x1

    .line 106
    :goto_3
    iput v5, p0, Lcom/google/android/material/timepicker/ClockHandView;->B:I

    .line 107
    .line 108
    :cond_4
    const/4 v5, 0x0

    .line 109
    goto :goto_4

    .line 110
    :cond_5
    iput v1, p0, Lcom/google/android/material/timepicker/ClockHandView;->l:F

    .line 111
    .line 112
    iput p1, p0, Lcom/google/android/material/timepicker/ClockHandView;->m:F

    .line 113
    .line 114
    iput-boolean v3, p0, Lcom/google/android/material/timepicker/ClockHandView;->n:Z

    .line 115
    .line 116
    iput-boolean v4, p0, Lcom/google/android/material/timepicker/ClockHandView;->x:Z

    .line 117
    .line 118
    const/4 v0, 0x0

    .line 119
    const/4 v5, 0x1

    .line 120
    goto :goto_0

    .line 121
    :goto_4
    iget-boolean v7, p0, Lcom/google/android/material/timepicker/ClockHandView;->x:Z

    .line 122
    .line 123
    invoke-virtual {p0, v1, p1}, Lcom/google/android/material/timepicker/ClockHandView;->a(FF)I

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    iget v9, p0, Lcom/google/android/material/timepicker/ClockHandView;->w:F

    .line 128
    .line 129
    int-to-float v8, v8

    .line 130
    cmpl-float v9, v9, v8

    .line 131
    .line 132
    if-eqz v9, :cond_6

    .line 133
    .line 134
    const/4 v9, 0x1

    .line 135
    goto :goto_5

    .line 136
    :cond_6
    const/4 v9, 0x0

    .line 137
    :goto_5
    if-eqz v5, :cond_7

    .line 138
    .line 139
    if-eqz v9, :cond_7

    .line 140
    .line 141
    :goto_6
    const/4 v5, 0x1

    .line 142
    goto :goto_9

    .line 143
    :cond_7
    if-nez v9, :cond_9

    .line 144
    .line 145
    if-eqz v6, :cond_8

    .line 146
    .line 147
    goto :goto_7

    .line 148
    :cond_8
    const/4 v5, 0x0

    .line 149
    goto :goto_9

    .line 150
    :cond_9
    :goto_7
    if-eqz v0, :cond_a

    .line 151
    .line 152
    iget-boolean v5, p0, Lcom/google/android/material/timepicker/ClockHandView;->k:Z

    .line 153
    .line 154
    if-eqz v5, :cond_a

    .line 155
    .line 156
    const/4 v5, 0x1

    .line 157
    goto :goto_8

    .line 158
    :cond_a
    const/4 v5, 0x0

    .line 159
    :goto_8
    invoke-virtual {p0, v8, v5}, Lcom/google/android/material/timepicker/ClockHandView;->c(FZ)V

    .line 160
    .line 161
    .line 162
    goto :goto_6

    .line 163
    :goto_9
    or-int/2addr v5, v7

    .line 164
    iput-boolean v5, p0, Lcom/google/android/material/timepicker/ClockHandView;->x:Z

    .line 165
    .line 166
    if-eqz v5, :cond_f

    .line 167
    .line 168
    if-eqz v0, :cond_f

    .line 169
    .line 170
    iget-object v0, p0, Lcom/google/android/material/timepicker/ClockHandView;->y:Lcom/google/android/material/timepicker/ClockHandView$OnActionUpListener;

    .line 171
    .line 172
    if-eqz v0, :cond_f

    .line 173
    .line 174
    invoke-virtual {p0, v1, p1}, Lcom/google/android/material/timepicker/ClockHandView;->a(FF)I

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    int-to-float p1, p1

    .line 179
    iget-boolean v1, p0, Lcom/google/android/material/timepicker/ClockHandView;->n:Z

    .line 180
    .line 181
    check-cast v0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;

    .line 182
    .line 183
    iget-object v5, v0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->h:Lcom/google/android/material/timepicker/TimePickerView;

    .line 184
    .line 185
    iput-boolean v3, v0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->l:Z

    .line 186
    .line 187
    iget-object v6, v0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->i:Lcom/google/android/material/timepicker/TimeModel;

    .line 188
    .line 189
    iget v7, v6, Lcom/google/android/material/timepicker/TimeModel;->l:I

    .line 190
    .line 191
    iget v8, v6, Lcom/google/android/material/timepicker/TimeModel;->k:I

    .line 192
    .line 193
    iget v9, v6, Lcom/google/android/material/timepicker/TimeModel;->m:I

    .line 194
    .line 195
    const/16 v10, 0xa

    .line 196
    .line 197
    if-ne v9, v10, :cond_c

    .line 198
    .line 199
    iget p1, v0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->k:F

    .line 200
    .line 201
    iget-object v1, v5, Lcom/google/android/material/timepicker/TimePickerView;->y:Lcom/google/android/material/timepicker/ClockHandView;

    .line 202
    .line 203
    invoke-virtual {v1, p1, v4}, Lcom/google/android/material/timepicker/ClockHandView;->c(FZ)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    const-class v1, Landroid/view/accessibility/AccessibilityManager;

    .line 211
    .line 212
    invoke-static {p1, v1}, Lq3/a;->J(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    .line 217
    .line 218
    if-eqz p1, :cond_b

    .line 219
    .line 220
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    if-eqz p1, :cond_b

    .line 225
    .line 226
    goto :goto_a

    .line 227
    :cond_b
    invoke-virtual {v0, v2, v3}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->d(IZ)V

    .line 228
    .line 229
    .line 230
    goto :goto_a

    .line 231
    :cond_c
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    if-nez v1, :cond_d

    .line 236
    .line 237
    add-int/lit8 p1, p1, 0xf

    .line 238
    .line 239
    div-int/lit8 p1, p1, 0x1e

    .line 240
    .line 241
    mul-int/lit8 p1, p1, 0x5

    .line 242
    .line 243
    rem-int/lit8 p1, p1, 0x3c

    .line 244
    .line 245
    iput p1, v6, Lcom/google/android/material/timepicker/TimeModel;->l:I

    .line 246
    .line 247
    mul-int/lit8 p1, p1, 0x6

    .line 248
    .line 249
    int-to-float p1, p1

    .line 250
    iput p1, v0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->j:F

    .line 251
    .line 252
    :cond_d
    iget p1, v0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->j:F

    .line 253
    .line 254
    iget-object v2, v5, Lcom/google/android/material/timepicker/TimePickerView;->y:Lcom/google/android/material/timepicker/ClockHandView;

    .line 255
    .line 256
    invoke-virtual {v2, p1, v1}, Lcom/google/android/material/timepicker/ClockHandView;->c(FZ)V

    .line 257
    .line 258
    .line 259
    :goto_a
    iput-boolean v4, v0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->l:Z

    .line 260
    .line 261
    invoke-virtual {v0}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->e()V

    .line 262
    .line 263
    .line 264
    iget p1, v6, Lcom/google/android/material/timepicker/TimeModel;->l:I

    .line 265
    .line 266
    if-ne p1, v7, :cond_e

    .line 267
    .line 268
    iget p1, v6, Lcom/google/android/material/timepicker/TimeModel;->k:I

    .line 269
    .line 270
    if-eq p1, v8, :cond_f

    .line 271
    .line 272
    :cond_e
    const/4 p1, 0x4

    .line 273
    invoke-virtual {v5, p1}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 274
    .line 275
    .line 276
    :cond_f
    return v3
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

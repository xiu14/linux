.class public Lcom/google/android/material/appbar/AppBarLayout;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lz/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/appbar/AppBarLayout$CompressChildScrollEffect;,
        Lcom/google/android/material/appbar/AppBarLayout$ChildScrollEffect;,
        Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;,
        Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;,
        Lcom/google/android/material/appbar/AppBarLayout$Behavior;,
        Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;,
        Lcom/google/android/material/appbar/AppBarLayout$LiftOnScrollListener;,
        Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;,
        Lcom/google/android/material/appbar/AppBarLayout$BaseOnOffsetChangedListener;
    }
.end annotation


# static fields
.field public static final G:I


# instance fields
.field public final A:Landroid/animation/TimeInterpolator;

.field public B:[I

.field public C:Landroid/graphics/drawable/Drawable;

.field public D:Ljava/lang/Integer;

.field public final E:F

.field public F:Lcom/google/android/material/appbar/AppBarLayout$Behavior;

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:Z

.field public m:I

.field public n:Lm0/c2;

.field public o:Ljava/util/ArrayList;

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:I

.field public u:Ljava/lang/ref/WeakReference;

.field public final v:Z

.field public w:Landroid/animation/ValueAnimator;

.field public final x:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

.field public final y:Ljava/util/ArrayList;

.field public final z:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Lcom/google/android/material/R$style;->Widget_Design_AppBarLayout:I

    .line 2
    .line 3
    sput v0, Lcom/google/android/material/appbar/AppBarLayout;->G:I

    .line 4
    .line 5
    return-void
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

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 12

    .line 1
    sget v5, Lcom/google/android/material/R$attr;->appBarLayoutStyle:I

    .line 2
    .line 3
    sget v6, Lcom/google/android/material/appbar/AppBarLayout;->G:I

    .line 4
    .line 5
    invoke-static {p1, p2, v5, v6}, Lcom/google/android/material/theme/overlay/MaterialThemeOverlay;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {p0, v0, p2, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 10
    .line 11
    .line 12
    const/4 v8, -0x1

    .line 13
    iput v8, p0, Lcom/google/android/material/appbar/AppBarLayout;->i:I

    .line 14
    .line 15
    iput v8, p0, Lcom/google/android/material/appbar/AppBarLayout;->j:I

    .line 16
    .line 17
    iput v8, p0, Lcom/google/android/material/appbar/AppBarLayout;->k:I

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    iput v9, p0, Lcom/google/android/material/appbar/AppBarLayout;->m:I

    .line 21
    .line 22
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->y:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v10, 0x1

    .line 34
    invoke-virtual {p0, v10}, Lcom/google/android/material/appbar/AppBarLayout;->setOrientation(I)V

    .line 35
    .line 36
    .line 37
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getOutlineProvider()Landroid/view/ViewOutlineProvider;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    sget-object v4, Landroid/view/ViewOutlineProvider;->BACKGROUND:Landroid/view/ViewOutlineProvider;

    .line 44
    .line 45
    if-ne v2, v4, :cond_0

    .line 46
    .line 47
    sget-object v2, Landroid/view/ViewOutlineProvider;->BOUNDS:Landroid/view/ViewOutlineProvider;

    .line 48
    .line 49
    invoke-virtual {p0, v2}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    sget-object v4, Lcom/google/android/material/appbar/ViewUtilsLollipop;->a:[I

    .line 57
    .line 58
    new-array v7, v9, [I

    .line 59
    .line 60
    move-object v3, p2

    .line 61
    invoke-static/range {v2 .. v7}, Lcom/google/android/material/internal/ThemeEnforcement;->d(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    :try_start_0
    invoke-virtual {v4, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_1

    .line 70
    .line 71
    invoke-virtual {v4, v9, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-static {v2, v3}, Landroid/animation/AnimatorInflater;->loadStateListAnimator(Landroid/content/Context;I)Landroid/animation/StateListAnimator;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {p0, v2}, Landroid/view/View;->setStateListAnimator(Landroid/animation/StateListAnimator;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception v0

    .line 84
    goto/16 :goto_6

    .line 85
    .line 86
    :cond_1
    :goto_0
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 87
    .line 88
    .line 89
    sget-object v4, Lcom/google/android/material/R$styleable;->AppBarLayout:[I

    .line 90
    .line 91
    new-array v7, v9, [I

    .line 92
    .line 93
    move-object v3, p2

    .line 94
    move-object v2, v0

    .line 95
    invoke-static/range {v2 .. v7}, Lcom/google/android/material/internal/ThemeEnforcement;->d(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    move-object v7, v2

    .line 100
    sget v0, Lcom/google/android/material/R$styleable;->AppBarLayout_android_background:I

    .line 101
    .line 102
    invoke-virtual {v6, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    sget-object v2, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 107
    .line 108
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 109
    .line 110
    .line 111
    sget v0, Lcom/google/android/material/R$styleable;->AppBarLayout_liftOnScrollColor:I

    .line 112
    .line 113
    invoke-static {v7, v6, v0}, Lcom/google/android/material/resources/MaterialResources;->b(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    if-eqz v3, :cond_2

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    const/4 v10, 0x0

    .line 121
    :goto_1
    iput-boolean v10, p0, Lcom/google/android/material/appbar/AppBarLayout;->v:Z

    .line 122
    .line 123
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v0}, Lcom/google/android/material/drawable/DrawableUtils;->d(Landroid/graphics/drawable/Drawable;)Landroid/content/res/ColorStateList;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    if-eqz v2, :cond_6

    .line 132
    .line 133
    new-instance v4, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 134
    .line 135
    invoke-direct {v4}, Lcom/google/android/material/shape/MaterialShapeDrawable;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4, v2}, Lcom/google/android/material/shape/MaterialShapeDrawable;->l(Landroid/content/res/ColorStateList;)V

    .line 139
    .line 140
    .line 141
    if-eqz v3, :cond_5

    .line 142
    .line 143
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    sget v5, Lcom/google/android/material/R$attr;->colorSurface:I

    .line 148
    .line 149
    invoke-static {v0, v5}, Lcom/google/android/material/resources/MaterialAttributes;->a(Landroid/content/Context;I)Landroid/util/TypedValue;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    if-eqz v5, :cond_4

    .line 154
    .line 155
    iget v10, v5, Landroid/util/TypedValue;->resourceId:I

    .line 156
    .line 157
    if-eqz v10, :cond_3

    .line 158
    .line 159
    invoke-static {v0, v10}, Lq3/a;->D(Landroid/content/Context;I)I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    goto :goto_2

    .line 164
    :cond_3
    iget v0, v5, Landroid/util/TypedValue;->data:I

    .line 165
    .line 166
    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    :goto_3
    move-object v5, v0

    .line 171
    goto :goto_4

    .line 172
    :cond_4
    const/4 v0, 0x0

    .line 173
    goto :goto_3

    .line 174
    :goto_4
    new-instance v0, Lcom/google/android/material/appbar/a;

    .line 175
    .line 176
    move-object v1, p0

    .line 177
    invoke-direct/range {v0 .. v5}, Lcom/google/android/material/appbar/a;-><init>(Lcom/google/android/material/appbar/AppBarLayout;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Lcom/google/android/material/shape/MaterialShapeDrawable;Ljava/lang/Integer;)V

    .line 178
    .line 179
    .line 180
    iput-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->x:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    .line 181
    .line 182
    invoke-virtual {p0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 183
    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_5
    invoke-virtual {v4, v7}, Lcom/google/android/material/shape/MaterialShapeDrawable;->j(Landroid/content/Context;)V

    .line 187
    .line 188
    .line 189
    new-instance v0, Lcom/google/android/material/appbar/b;

    .line 190
    .line 191
    invoke-direct {v0, v9, p0, v4}, Lcom/google/android/material/appbar/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    iput-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->x:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    .line 195
    .line 196
    invoke-virtual {p0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 197
    .line 198
    .line 199
    :cond_6
    :goto_5
    sget v0, Lcom/google/android/material/R$attr;->motionDurationMedium2:I

    .line 200
    .line 201
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    sget v3, Lcom/google/android/material/R$integer;->app_bar_elevation_anim_duration:I

    .line 206
    .line 207
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getInteger(I)I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    invoke-static {v7, v0, v2}, Lcom/google/android/material/motion/MotionUtils;->c(Landroid/content/Context;II)I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    int-to-long v2, v0

    .line 216
    iput-wide v2, p0, Lcom/google/android/material/appbar/AppBarLayout;->z:J

    .line 217
    .line 218
    sget v0, Lcom/google/android/material/R$attr;->motionEasingStandardInterpolator:I

    .line 219
    .line 220
    sget-object v2, Lcom/google/android/material/animation/AnimationUtils;->a:Landroid/view/animation/LinearInterpolator;

    .line 221
    .line 222
    invoke-static {v7, v0, v2}, Lcom/google/android/material/motion/MotionUtils;->d(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    iput-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->A:Landroid/animation/TimeInterpolator;

    .line 227
    .line 228
    sget v0, Lcom/google/android/material/R$styleable;->AppBarLayout_expanded:I

    .line 229
    .line 230
    invoke-virtual {v6, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_7

    .line 235
    .line 236
    sget v0, Lcom/google/android/material/R$styleable;->AppBarLayout_expanded:I

    .line 237
    .line 238
    invoke-virtual {v6, v0, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    invoke-virtual {p0, v0, v9, v9}, Lcom/google/android/material/appbar/AppBarLayout;->e(ZZZ)V

    .line 243
    .line 244
    .line 245
    :cond_7
    sget v0, Lcom/google/android/material/R$styleable;->AppBarLayout_elevation:I

    .line 246
    .line 247
    invoke-virtual {v6, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-eqz v0, :cond_8

    .line 252
    .line 253
    sget v0, Lcom/google/android/material/R$styleable;->AppBarLayout_elevation:I

    .line 254
    .line 255
    invoke-virtual {v6, v0, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    int-to-float v0, v0

    .line 260
    invoke-static {p0, v0}, Lcom/google/android/material/appbar/ViewUtilsLollipop;->a(Lcom/google/android/material/appbar/AppBarLayout;F)V

    .line 261
    .line 262
    .line 263
    :cond_8
    const/16 v0, 0x1a

    .line 264
    .line 265
    if-lt v11, v0, :cond_a

    .line 266
    .line 267
    sget v0, Lcom/google/android/material/R$styleable;->AppBarLayout_android_keyboardNavigationCluster:I

    .line 268
    .line 269
    invoke-virtual {v6, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_9

    .line 274
    .line 275
    sget v0, Lcom/google/android/material/R$styleable;->AppBarLayout_android_keyboardNavigationCluster:I

    .line 276
    .line 277
    invoke-virtual {v6, v0, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    invoke-static {p0, v0}, La3/b;->x(Lcom/google/android/material/appbar/AppBarLayout;Z)V

    .line 282
    .line 283
    .line 284
    :cond_9
    sget v0, Lcom/google/android/material/R$styleable;->AppBarLayout_android_touchscreenBlocksFocus:I

    .line 285
    .line 286
    invoke-virtual {v6, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    if-eqz v0, :cond_a

    .line 291
    .line 292
    sget v0, Lcom/google/android/material/R$styleable;->AppBarLayout_android_touchscreenBlocksFocus:I

    .line 293
    .line 294
    invoke-virtual {v6, v0, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setTouchscreenBlocksFocus(Z)V

    .line 299
    .line 300
    .line 301
    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    sget v2, Lcom/google/android/material/R$dimen;->design_appbar_elevation:I

    .line 306
    .line 307
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->E:F

    .line 312
    .line 313
    sget v0, Lcom/google/android/material/R$styleable;->AppBarLayout_liftOnScroll:I

    .line 314
    .line 315
    invoke-virtual {v6, v0, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    iput-boolean v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->s:Z

    .line 320
    .line 321
    sget v0, Lcom/google/android/material/R$styleable;->AppBarLayout_liftOnScrollTargetViewId:I

    .line 322
    .line 323
    invoke-virtual {v6, v0, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->t:I

    .line 328
    .line 329
    sget v0, Lcom/google/android/material/R$styleable;->AppBarLayout_statusBarForeground:I

    .line 330
    .line 331
    invoke-virtual {v6, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-virtual {p0, v0}, Lcom/google/android/material/appbar/AppBarLayout;->setStatusBarForeground(Landroid/graphics/drawable/Drawable;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 339
    .line 340
    .line 341
    new-instance v0, Lcom/google/android/material/appbar/AppBarLayout$1;

    .line 342
    .line 343
    invoke-direct {v0, p0}, Lcom/google/android/material/appbar/AppBarLayout$1;-><init>(Lcom/google/android/material/appbar/AppBarLayout;)V

    .line 344
    .line 345
    .line 346
    invoke-static {p0, v0}, Lm0/k0;->u(Landroid/view/View;Lm0/w;)V

    .line 347
    .line 348
    .line 349
    return-void

    .line 350
    :goto_6
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 351
    .line 352
    .line 353
    throw v0
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

.method public static b(Landroid/view/ViewGroup$LayoutParams;)Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;
    .locals 2

    .line 1
    instance-of v0, p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;

    .line 7
    .line 8
    check-cast p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/widget/LinearLayout$LayoutParams;)V

    .line 11
    .line 12
    .line 13
    iput v1, v0, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;->a:I

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;

    .line 21
    .line 22
    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 25
    .line 26
    .line 27
    iput v1, v0, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;->a:I

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_1
    new-instance v0, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;

    .line 31
    .line 32
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 33
    .line 34
    .line 35
    iput v1, v0, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;->a:I

    .line 36
    .line 37
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/util/AttributeSet;)Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    iput v2, v0, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;->a:I

    .line 12
    .line 13
    sget-object v3, Lcom/google/android/material/R$styleable;->AppBarLayout_Layout:[I

    .line 14
    .line 15
    invoke-virtual {v1, p1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget v3, Lcom/google/android/material/R$styleable;->AppBarLayout_Layout_layout_scrollFlags:I

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    iput v3, v0, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;->a:I

    .line 27
    .line 28
    sget v3, Lcom/google/android/material/R$styleable;->AppBarLayout_Layout_layout_scrollEffect:I

    .line 29
    .line 30
    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eq v3, v2, :cond_0

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v2, Lcom/google/android/material/appbar/AppBarLayout$CompressChildScrollEffect;

    .line 39
    .line 40
    invoke-direct {v2}, Lcom/google/android/material/appbar/AppBarLayout$CompressChildScrollEffect;-><init>()V

    .line 41
    .line 42
    .line 43
    :goto_0
    iput-object v2, v0, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;->b:Lcom/google/android/material/appbar/AppBarLayout$CompressChildScrollEffect;

    .line 44
    .line 45
    sget v2, Lcom/google/android/material/R$styleable;->AppBarLayout_Layout_layout_scrollInterpolator:I

    .line 46
    .line 47
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    sget v2, Lcom/google/android/material/R$styleable;->AppBarLayout_Layout_layout_scrollInterpolator:I

    .line 54
    .line 55
    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iput-object v1, v0, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;->c:Landroid/view/animation/Interpolator;

    .line 64
    .line 65
    :cond_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 66
    .line 67
    .line 68
    return-object v0
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

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->F:Lcom/google/android/material/appbar/AppBarLayout$Behavior;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget v2, p0, Lcom/google/android/material/appbar/AppBarLayout;->i:I

    .line 7
    .line 8
    if-eq v2, v1, :cond_1

    .line 9
    .line 10
    iget v2, p0, Lcom/google/android/material/appbar/AppBarLayout;->m:I

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v2, Lv0/b;->i:Lv0/a;

    .line 16
    .line 17
    invoke-virtual {v0, v2, p0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->M(Landroid/os/Parcelable;Lcom/google/android/material/appbar/AppBarLayout;)Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$SavedState;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 23
    :goto_1
    iput v1, p0, Lcom/google/android/material/appbar/AppBarLayout;->i:I

    .line 24
    .line 25
    iput v1, p0, Lcom/google/android/material/appbar/AppBarLayout;->j:I

    .line 26
    .line 27
    iput v1, p0, Lcom/google/android/material/appbar/AppBarLayout;->k:I

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    iget-object v1, p0, Lcom/google/android/material/appbar/AppBarLayout;->F:Lcom/google/android/material/appbar/AppBarLayout$Behavior;

    .line 32
    .line 33
    iget-object v2, v1, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->t:Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$SavedState;

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    iput-object v0, v1, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->t:Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$SavedState;

    .line 39
    .line 40
    :cond_3
    :goto_2
    return-void
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

.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;

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

.method public final d(I)V
    .locals 3

    .line 1
    iput p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->h:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->willNotDraw()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->o:Ljava/util/ArrayList;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-ge v1, v0, :cond_2

    .line 24
    .line 25
    iget-object v2, p0, Lcom/google/android/material/appbar/AppBarLayout;->o:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lcom/google/android/material/appbar/AppBarLayout$BaseOnOffsetChangedListener;

    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-interface {v2, p1}, Lcom/google/android/material/appbar/AppBarLayout$BaseOnOffsetChangedListener;->a(I)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    throw p1

    .line 43
    :cond_2
    return-void
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

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->draw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->C:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-lez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget v1, p0, Lcom/google/android/material/appbar/AppBarLayout;->h:I

    .line 19
    .line 20
    neg-int v1, v1

    .line 21
    int-to-float v1, v1

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {p1, v2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/google/android/material/appbar/AppBarLayout;->C:Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
    .line 35
    .line 36
    .line 37
.end method

.method public final drawableStateChanged()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/widget/LinearLayout;->drawableStateChanged()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/google/android/material/appbar/AppBarLayout;->C:Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Landroid/view/View;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final e(ZZZ)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 p1, 0x2

    .line 6
    :goto_0
    const/4 v0, 0x0

    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    const/4 p2, 0x4

    .line 10
    goto :goto_1

    .line 11
    :cond_1
    const/4 p2, 0x0

    .line 12
    :goto_1
    or-int/2addr p1, p2

    .line 13
    if-eqz p3, :cond_2

    .line 14
    .line 15
    const/16 v0, 0x8

    .line 16
    .line 17
    :cond_2
    or-int/2addr p1, v0

    .line 18
    iput p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->m:I

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 21
    .line 22
    .line 23
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
.end method

.method public final f(Z)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->r:Z

    .line 6
    .line 7
    if-eq v0, p1, :cond_6

    .line 8
    .line 9
    iput-boolean p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->r:Z

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    instance-of v0, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 19
    .line 20
    if-eqz v0, :cond_5

    .line 21
    .line 22
    iget-boolean v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->v:Z

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    const/high16 v0, 0x3f800000    # 1.0f

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/high16 v2, 0x3f800000    # 1.0f

    .line 34
    .line 35
    :goto_0
    if-eqz p1, :cond_1

    .line 36
    .line 37
    const/high16 v1, 0x3f800000    # 1.0f

    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0, v2, v1}, Lcom/google/android/material/appbar/AppBarLayout;->h(FF)V

    .line 40
    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    iget-boolean v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->s:Z

    .line 44
    .line 45
    if-eqz v0, :cond_5

    .line 46
    .line 47
    iget v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->E:F

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move v2, v0

    .line 54
    :goto_1
    if-eqz p1, :cond_4

    .line 55
    .line 56
    move v1, v0

    .line 57
    :cond_4
    invoke-virtual {p0, v2, v1}, Lcom/google/android/material/appbar/AppBarLayout;->h(FF)V

    .line 58
    .line 59
    .line 60
    :cond_5
    :goto_2
    const/4 p1, 0x1

    .line 61
    return p1

    .line 62
    :cond_6
    const/4 p1, 0x0

    .line 63
    return p1
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

.method public final g(Landroid/view/View;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->u:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->t:I

    .line 8
    .line 9
    if-eq v0, v1, :cond_2

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v2

    .line 19
    :goto_0
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    instance-of v3, v3, Landroid/view/ViewGroup;

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/view/ViewGroup;

    .line 34
    .line 35
    iget v3, p0, Lcom/google/android/material/appbar/AppBarLayout;->t:I

    .line 36
    .line 37
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_1
    if-eqz v0, :cond_2

    .line 42
    .line 43
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 44
    .line 45
    invoke-direct {v3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput-object v3, p0, Lcom/google/android/material/appbar/AppBarLayout;->u:Ljava/lang/ref/WeakReference;

    .line 49
    .line 50
    :cond_2
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->u:Ljava/lang/ref/WeakReference;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    move-object v2, v0

    .line 59
    check-cast v2, Landroid/view/View;

    .line 60
    .line 61
    :cond_3
    if-nez v2, :cond_4

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    move-object p1, v2

    .line 65
    :goto_1
    if-eqz p1, :cond_6

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_5

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-lez p1, :cond_6

    .line 78
    .line 79
    :cond_5
    const/4 p1, 0x1

    .line 80
    return p1

    .line 81
    :cond_6
    const/4 p1, 0x0

    .line 82
    return p1
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

.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    .line 2
    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v1, 0x1

    .line 3
    iput v1, v0, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;->a:I

    return-object v0
.end method

.method public final generateDefaultLayoutParams()Landroid/widget/LinearLayout$LayoutParams;
    .locals 3

    .line 4
    new-instance v0, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    .line 5
    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v1, 0x1

    .line 6
    iput v1, v0, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;->a:I

    return-object v0
.end method

.method public final bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/AppBarLayout;->a(Landroid/util/AttributeSet;)Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 2
    invoke-static {p1}, Lcom/google/android/material/appbar/AppBarLayout;->b(Landroid/view/ViewGroup$LayoutParams;)Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/widget/LinearLayout$LayoutParams;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/AppBarLayout;->a(Landroid/util/AttributeSet;)Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/widget/LinearLayout$LayoutParams;
    .locals 0

    .line 4
    invoke-static {p1}, Lcom/google/android/material/appbar/AppBarLayout;->b(Landroid/view/ViewGroup$LayoutParams;)Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;

    move-result-object p1

    return-object p1
.end method

.method public getBehavior()Lz/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lz/b;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/material/appbar/AppBarLayout$Behavior;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/material/appbar/AppBarLayout$Behavior;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->F:Lcom/google/android/material/appbar/AppBarLayout$Behavior;

    .line 7
    .line 8
    return-object v0
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

.method public getDownNestedPreScrollRange()I
    .locals 9

    .line 1
    iget v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->j:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ltz v0, :cond_7

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/16 v5, 0x8

    .line 26
    .line 27
    if-ne v4, v5, :cond_1

    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_1
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;

    .line 35
    .line 36
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    iget v6, v4, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;->a:I

    .line 41
    .line 42
    and-int/lit8 v7, v6, 0x5

    .line 43
    .line 44
    const/4 v8, 0x5

    .line 45
    if-ne v7, v8, :cond_5

    .line 46
    .line 47
    iget v7, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 48
    .line 49
    iget v4, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 50
    .line 51
    add-int/2addr v7, v4

    .line 52
    and-int/lit8 v4, v6, 0x8

    .line 53
    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    sget-object v4, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 57
    .line 58
    invoke-virtual {v3}, Landroid/view/View;->getMinimumHeight()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    :goto_1
    add-int/2addr v4, v7

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    and-int/lit8 v4, v6, 0x2

    .line 65
    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    sget-object v4, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 69
    .line 70
    invoke-virtual {v3}, Landroid/view/View;->getMinimumHeight()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    sub-int v4, v5, v4

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    add-int v4, v7, v5

    .line 78
    .line 79
    :goto_2
    if-nez v0, :cond_4

    .line 80
    .line 81
    sget-object v6, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 82
    .line 83
    invoke-virtual {v3}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_4

    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    sub-int/2addr v5, v3

    .line 94
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    :cond_4
    add-int/2addr v2, v4

    .line 99
    goto :goto_3

    .line 100
    :cond_5
    if-lez v2, :cond_6

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_6
    :goto_3
    add-int/lit8 v0, v0, -0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_7
    :goto_4
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->j:I

    .line 111
    .line 112
    return v0
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

.method public getDownNestedScrollRange()I
    .locals 9

    .line 1
    iget v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->k:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    if-ge v2, v0, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    const/16 v6, 0x8

    .line 25
    .line 26
    if-ne v5, v6, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    check-cast v5, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;

    .line 34
    .line 35
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    iget v7, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 40
    .line 41
    iget v8, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 42
    .line 43
    add-int/2addr v7, v8

    .line 44
    add-int/2addr v7, v6

    .line 45
    iget v5, v5, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;->a:I

    .line 46
    .line 47
    and-int/lit8 v6, v5, 0x1

    .line 48
    .line 49
    if-eqz v6, :cond_3

    .line 50
    .line 51
    add-int/2addr v3, v7

    .line 52
    and-int/lit8 v5, v5, 0x2

    .line 53
    .line 54
    if-eqz v5, :cond_2

    .line 55
    .line 56
    sget-object v0, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 57
    .line 58
    invoke-virtual {v4}, Landroid/view/View;->getMinimumHeight()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    sub-int/2addr v3, v0

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    :goto_2
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->k:I

    .line 72
    .line 73
    return v0
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

.method public getLiftOnScrollTargetViewId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->t:I

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

.method public getMaterialShapeBackground()Lcom/google/android/material/shape/MaterialShapeDrawable;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
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

.method public final getMinimumHeightForVisibleOverlappingContent()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getMinimumHeight()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    :goto_0
    mul-int/lit8 v1, v1, 0x2

    .line 14
    .line 15
    add-int/2addr v1, v0

    .line 16
    return v1

    .line 17
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x1

    .line 22
    if-lt v1, v2, :cond_1

    .line 23
    .line 24
    sub-int/2addr v1, v2

    .line 25
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Landroid/view/View;->getMinimumHeight()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/4 v1, 0x0

    .line 35
    :goto_1
    if-eqz v1, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    div-int/lit8 v0, v0, 0x3

    .line 43
    .line 44
    return v0
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

.method public getPendingAction()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->m:I

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

.method public getStatusBarForeground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->C:Landroid/graphics/drawable/Drawable;

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

.method public getTargetElevation()F
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

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

.method public final getTopInset()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->n:Lm0/c2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lm0/c2;->d()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
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

.method public final getTotalScrollRange()I
    .locals 9

    .line 1
    iget v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->i:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    if-ge v2, v0, :cond_4

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    const/16 v6, 0x8

    .line 25
    .line 26
    if-ne v5, v6, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    check-cast v5, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;

    .line 34
    .line 35
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    iget v7, v5, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;->a:I

    .line 40
    .line 41
    and-int/lit8 v8, v7, 0x1

    .line 42
    .line 43
    if-eqz v8, :cond_4

    .line 44
    .line 45
    iget v8, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 46
    .line 47
    add-int/2addr v6, v8

    .line 48
    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 49
    .line 50
    add-int/2addr v6, v5

    .line 51
    add-int/2addr v6, v3

    .line 52
    if-nez v2, :cond_2

    .line 53
    .line 54
    sget-object v3, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 55
    .line 56
    invoke-virtual {v4}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    sub-int/2addr v6, v3

    .line 67
    :cond_2
    move v3, v6

    .line 68
    and-int/lit8 v5, v7, 0x2

    .line 69
    .line 70
    if-eqz v5, :cond_3

    .line 71
    .line 72
    sget-object v0, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 73
    .line 74
    invoke-virtual {v4}, Landroid/view/View;->getMinimumHeight()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    sub-int/2addr v3, v0

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    :goto_2
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->i:I

    .line 88
    .line 89
    return v0
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

.method public getUpNestedPreScrollRange()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I

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

.method public final h(FF)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->w:Landroid/animation/ValueAnimator;

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
    const/4 v0, 0x2

    .line 9
    new-array v0, v0, [F

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    aput p1, v0, v1

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    aput p2, v0, p1

    .line 16
    .line 17
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->w:Landroid/animation/ValueAnimator;

    .line 22
    .line 23
    iget-wide v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->z:J

    .line 24
    .line 25
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->w:Landroid/animation/ValueAnimator;

    .line 29
    .line 30
    iget-object p2, p0, Lcom/google/android/material/appbar/AppBarLayout;->A:Landroid/animation/TimeInterpolator;

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->x:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-object p2, p0, Lcom/google/android/material/appbar/AppBarLayout;->w:Landroid/animation/ValueAnimator;

    .line 40
    .line 41
    invoke-virtual {p2, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->w:Landroid/animation/ValueAnimator;

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 47
    .line 48
    .line 49
    return-void
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

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/LinearLayout;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lcom/google/android/material/shape/MaterialShapeUtils;->d(Landroid/view/ViewGroup;)V

    .line 5
    .line 6
    .line 7
    return-void
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

.method public final onCreateDrawableState(I)[I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->B:[I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x4

    .line 6
    new-array v0, v0, [I

    .line 7
    .line 8
    iput-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->B:[I

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->B:[I

    .line 11
    .line 12
    array-length v1, v0

    .line 13
    add-int/2addr p1, v1

    .line 14
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onCreateDrawableState(I)[I

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-boolean v1, p0, Lcom/google/android/material/appbar/AppBarLayout;->q:Z

    .line 19
    .line 20
    sget v2, Lcom/google/android/material/R$attr;->state_liftable:I

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    neg-int v2, v2

    .line 26
    :goto_0
    const/4 v3, 0x0

    .line 27
    aput v2, v0, v3

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget-boolean v2, p0, Lcom/google/android/material/appbar/AppBarLayout;->r:Z

    .line 32
    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    sget v2, Lcom/google/android/material/R$attr;->state_lifted:I

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    sget v2, Lcom/google/android/material/R$attr;->state_lifted:I

    .line 39
    .line 40
    neg-int v2, v2

    .line 41
    :goto_1
    const/4 v3, 0x1

    .line 42
    aput v2, v0, v3

    .line 43
    .line 44
    sget v2, Lcom/google/android/material/R$attr;->state_collapsible:I

    .line 45
    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_3
    neg-int v2, v2

    .line 50
    :goto_2
    const/4 v3, 0x2

    .line 51
    aput v2, v0, v3

    .line 52
    .line 53
    if-eqz v1, :cond_4

    .line 54
    .line 55
    iget-boolean v1, p0, Lcom/google/android/material/appbar/AppBarLayout;->r:Z

    .line 56
    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    sget v1, Lcom/google/android/material/R$attr;->state_collapsed:I

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_4
    sget v1, Lcom/google/android/material/R$attr;->state_collapsed:I

    .line 63
    .line 64
    neg-int v1, v1

    .line 65
    :goto_3
    const/4 v2, 0x3

    .line 66
    aput v1, v0, v2

    .line 67
    .line 68
    invoke-static {p1, v0}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1
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

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/LinearLayout;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->u:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V

    .line 9
    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->u:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    return-void
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

.method public final onLayout(ZIIII)V
    .locals 2

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    sget-object p2, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    const/4 p3, 0x1

    .line 12
    const/4 p4, 0x0

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-lez p2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 26
    .line 27
    .line 28
    move-result p5

    .line 29
    const/16 v0, 0x8

    .line 30
    .line 31
    if-eq p5, v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p2}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-nez p2, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 44
    .line 45
    .line 46
    move-result p5

    .line 47
    sub-int/2addr p5, p3

    .line 48
    :goto_0
    if-ltz p5, :cond_0

    .line 49
    .line 50
    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0, p2}, Lm0/w0;->l(Landroid/view/View;I)V

    .line 55
    .line 56
    .line 57
    add-int/lit8 p5, p5, -0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->c()V

    .line 61
    .line 62
    .line 63
    iput-boolean p4, p1, Lcom/google/android/material/appbar/AppBarLayout;->l:Z

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    const/4 p5, 0x0

    .line 70
    :goto_1
    if-ge p5, p2, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;

    .line 81
    .line 82
    iget-object v0, v0, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;->c:Landroid/view/animation/Interpolator;

    .line 83
    .line 84
    if-eqz v0, :cond_1

    .line 85
    .line 86
    iput-boolean p3, p1, Lcom/google/android/material/appbar/AppBarLayout;->l:Z

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_1
    add-int/lit8 p5, p5, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    :goto_2
    iget-object p2, p1, Lcom/google/android/material/appbar/AppBarLayout;->C:Landroid/graphics/drawable/Drawable;

    .line 93
    .line 94
    if-eqz p2, :cond_3

    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 97
    .line 98
    .line 99
    move-result p5

    .line 100
    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-virtual {p2, p4, p4, p5, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 105
    .line 106
    .line 107
    :cond_3
    iget-boolean p2, p1, Lcom/google/android/material/appbar/AppBarLayout;->p:Z

    .line 108
    .line 109
    if-nez p2, :cond_7

    .line 110
    .line 111
    iget-boolean p2, p1, Lcom/google/android/material/appbar/AppBarLayout;->s:Z

    .line 112
    .line 113
    if-nez p2, :cond_6

    .line 114
    .line 115
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    const/4 p5, 0x0

    .line 120
    :goto_3
    if-ge p5, p2, :cond_5

    .line 121
    .line 122
    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;

    .line 131
    .line 132
    iget v0, v0, Lcom/google/android/material/appbar/AppBarLayout$LayoutParams;->a:I

    .line 133
    .line 134
    and-int/lit8 v1, v0, 0x1

    .line 135
    .line 136
    if-ne v1, p3, :cond_4

    .line 137
    .line 138
    and-int/lit8 v0, v0, 0xa

    .line 139
    .line 140
    if-eqz v0, :cond_4

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_4
    add-int/lit8 p5, p5, 0x1

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_5
    const/4 p3, 0x0

    .line 147
    :cond_6
    :goto_4
    iget-boolean p2, p1, Lcom/google/android/material/appbar/AppBarLayout;->q:Z

    .line 148
    .line 149
    if-eq p2, p3, :cond_7

    .line 150
    .line 151
    iput-boolean p3, p1, Lcom/google/android/material/appbar/AppBarLayout;->q:Z

    .line 152
    .line 153
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 154
    .line 155
    .line 156
    :cond_7
    return-void
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

.method public final onMeasure(II)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/high16 v0, 0x40000000    # 2.0f

    .line 9
    .line 10
    if-eq p1, v0, :cond_2

    .line 11
    .line 12
    sget-object v0, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-lez v0, :cond_2

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const/16 v3, 0x8

    .line 36
    .line 37
    if-eq v2, v3, :cond_2

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/high16 v2, -0x80000000

    .line 50
    .line 51
    if-eq p1, v2, :cond_1

    .line 52
    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    add-int/2addr v1, p1

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    add-int/2addr v1, p1

    .line 71
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-static {v1, v0, p1}, La/a;->m(III)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-virtual {p0, p1, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 84
    .line 85
    .line 86
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->c()V

    .line 87
    .line 88
    .line 89
    return-void
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

.method public setElevation(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setElevation(F)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Lcom/google/android/material/shape/MaterialShapeUtils;->b(Landroid/view/ViewGroup;F)V

    .line 5
    .line 6
    .line 7
    return-void
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

.method public setExpanded(Z)V
    .locals 2

    .line 1
    sget-object v0, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/material/appbar/AppBarLayout;->e(ZZZ)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public setLiftOnScroll(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->s:Z

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

.method public setLiftOnScrollTargetView(Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->t:I

    .line 3
    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->u:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->clear()V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    iput-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->u:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->u:Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    return-void
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

.method public setLiftOnScrollTargetViewId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->t:I

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->u:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->clear()V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->u:Ljava/lang/ref/WeakReference;

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

.method public setLiftableOverrideEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->p:Z

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
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string v0, "AppBarLayout is always vertical and does not support horizontal orientation"

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1
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

.method public setStatusBarForeground(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->C:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eq v0, p1, :cond_8

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move-object p1, v1

    .line 19
    :goto_0
    iput-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->C:Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    instance-of v0, p1, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    check-cast p1, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 26
    .line 27
    iget p1, p1, Lcom/google/android/material/shape/MaterialShapeDrawable;->B:I

    .line 28
    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    invoke-static {p1}, Lcom/google/android/material/drawable/DrawableUtils;->d(Landroid/graphics/drawable/Drawable;)Landroid/content/res/ColorStateList;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-eqz p1, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :cond_3
    :goto_1
    iput-object v1, p0, Lcom/google/android/material/appbar/AppBarLayout;->D:Ljava/lang/Integer;

    .line 49
    .line 50
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->C:Landroid/graphics/drawable/Drawable;

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    const/4 v1, 0x0

    .line 54
    if-eqz p1, :cond_6

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->C:Landroid/graphics/drawable/Drawable;

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 69
    .line 70
    .line 71
    :cond_4
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->C:Landroid/graphics/drawable/Drawable;

    .line 72
    .line 73
    sget-object v2, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-static {p1, v2}, Le6/d;->Q(Landroid/graphics/drawable/Drawable;I)Z

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->C:Landroid/graphics/drawable/Drawable;

    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-nez v2, :cond_5

    .line 89
    .line 90
    const/4 v2, 0x1

    .line 91
    goto :goto_2

    .line 92
    :cond_5
    const/4 v2, 0x0

    .line 93
    :goto_2
    invoke-virtual {p1, v2, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->C:Landroid/graphics/drawable/Drawable;

    .line 97
    .line 98
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 99
    .line 100
    .line 101
    :cond_6
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->C:Landroid/graphics/drawable/Drawable;

    .line 102
    .line 103
    if-eqz p1, :cond_7

    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-lez p1, :cond_7

    .line 110
    .line 111
    const/4 v1, 0x1

    .line 112
    :cond_7
    xor-int/lit8 p1, v1, 0x1

    .line 113
    .line 114
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 115
    .line 116
    .line 117
    sget-object p1, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 118
    .line 119
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 120
    .line 121
    .line 122
    :cond_8
    return-void
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

.method public setStatusBarForegroundColor(I)V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/google/android/material/appbar/AppBarLayout;->setStatusBarForeground(Landroid/graphics/drawable/Drawable;)V

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

.method public setStatusBarForegroundResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, La/a;->D(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/AppBarLayout;->setStatusBarForeground(Landroid/graphics/drawable/Drawable;)V

    .line 10
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

.method public setTargetElevation(F)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lcom/google/android/material/appbar/ViewUtilsLollipop;->a(Lcom/google/android/material/appbar/AppBarLayout;F)V

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
.end method

.method public setVisibility(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    :goto_0
    iget-object v1, p0, Lcom/google/android/material/appbar/AppBarLayout;->C:Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 15
    .line 16
    .line 17
    :cond_1
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

.method public final verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->C:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 15
    return p1
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

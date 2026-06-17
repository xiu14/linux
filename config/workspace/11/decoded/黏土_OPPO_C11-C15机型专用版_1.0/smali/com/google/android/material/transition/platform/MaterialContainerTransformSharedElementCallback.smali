.class public Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback;
.super Landroid/app/SharedElementCallback;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback$ShapeableViewShapeProvider;,
        Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback$ShapeProvider;
    }
.end annotation


# static fields
.field public static e:Ljava/lang/ref/WeakReference;


# instance fields
.field public a:Z

.field public final b:Z

.field public c:Landroid/graphics/Rect;

.field public final d:Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback$ShapeableViewShapeProvider;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/SharedElementCallback;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback;->a:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback;->b:Z

    .line 8
    .line 9
    new-instance v0, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback$ShapeableViewShapeProvider;

    .line 10
    .line 11
    invoke-direct {v0}, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback$ShapeableViewShapeProvider;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback;->d:Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback$ShapeableViewShapeProvider;

    .line 15
    .line 16
    return-void
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

.method public static a(Landroid/view/Window;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v1, 0x1d

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    if-lt v0, v1, :cond_1

    .line 23
    .line 24
    sget-object v0, Le0/b;->h:Le0/b;

    .line 25
    .line 26
    invoke-static {v0}, Le0/c;->a(Le0/b;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-static {v2, v0}, Le0/a;->a(ILjava/lang/Object;)Landroid/graphics/ColorFilter;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    new-instance v3, Landroid/graphics/PorterDuffColorFilter;

    .line 42
    .line 43
    invoke-direct {v3, v2, v0}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_0
    invoke-virtual {p0, v3}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

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


# virtual methods
.method public final onCaptureSharedElementSnapshot(Landroid/view/View;Landroid/graphics/Matrix;Landroid/graphics/RectF;)Landroid/os/Parcelable;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback;->e:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    invoke-super {p0, p1, p2, p3}, Landroid/app/SharedElementCallback;->onCaptureSharedElementSnapshot(Landroid/view/View;Landroid/graphics/Matrix;Landroid/graphics/RectF;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
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
.end method

.method public final onCreateSnapshotView(Landroid/content/Context;Landroid/os/Parcelable;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/SharedElementCallback;->onCreateSnapshotView(Landroid/content/Context;Landroid/os/Parcelable;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    sget-object p2, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback;->e:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback;->d:Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback$ShapeableViewShapeProvider;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Landroid/view/View;

    .line 20
    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    instance-of v0, p2, Lcom/google/android/material/shape/Shapeable;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    check-cast p2, Lcom/google/android/material/shape/Shapeable;

    .line 28
    .line 29
    invoke-interface {p2}, Lcom/google/android/material/shape/Shapeable;->getShapeAppearanceModel()Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p2, 0x0

    .line 35
    :goto_0
    if-eqz p2, :cond_1

    .line 36
    .line 37
    sget v0, Lcom/google/android/material/R$id;->mtrl_motion_snapshot_view:I

    .line 38
    .line 39
    invoke-virtual {p1, v0, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-object p1
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

.method public final onMapSharedElements(Ljava/util/List;Ljava/util/Map;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Landroid/view/View;

    .line 23
    .line 24
    if-eqz p1, :cond_3

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Lcom/google/android/material/internal/ContextUtils;->a(Landroid/content/Context;)Landroid/app/Activity;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    iget-boolean v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback;->a:Z

    .line 41
    .line 42
    const-wide/16 v1, 0x0

    .line 43
    .line 44
    iget-boolean v3, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback;->b:Z

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {p2}, Landroid/view/Window;->getSharedElementEnterTransition()Landroid/transition/Transition;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    instance-of v0, p1, Lcom/google/android/material/transition/platform/MaterialContainerTransform;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    check-cast p1, Lcom/google/android/material/transition/platform/MaterialContainerTransform;

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-virtual {p2, v0}, Landroid/view/Window;->setSharedElementReenterTransition(Landroid/transition/Transition;)V

    .line 60
    .line 61
    .line 62
    if-eqz v3, :cond_3

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/transition/Transition;->getDuration()J

    .line 65
    .line 66
    .line 67
    move-result-wide v3

    .line 68
    cmp-long v0, v3, v1

    .line 69
    .line 70
    if-ltz v0, :cond_0

    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/transition/Transition;->getDuration()J

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    invoke-virtual {p2, v0, v1}, Landroid/view/Window;->setTransitionBackgroundFadeDuration(J)V

    .line 77
    .line 78
    .line 79
    :cond_0
    new-instance v0, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback$1;

    .line 80
    .line 81
    invoke-direct {v0, p2}, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback$1;-><init>(Landroid/view/Window;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroid/transition/Transition;->addListener(Landroid/transition/Transition$TransitionListener;)Landroid/transition/Transition;

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_1
    invoke-virtual {p2}, Landroid/view/Window;->getSharedElementReturnTransition()Landroid/transition/Transition;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    instance-of v4, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;

    .line 93
    .line 94
    if-eqz v4, :cond_3

    .line 95
    .line 96
    check-cast v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;

    .line 97
    .line 98
    const/4 v4, 0x1

    .line 99
    iput-boolean v4, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->h:Z

    .line 100
    .line 101
    new-instance v4, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback$2;

    .line 102
    .line 103
    invoke-direct {v4, p1}, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback$2;-><init>(Landroid/app/Activity;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v4}, Landroid/transition/Transition;->addListener(Landroid/transition/Transition$TransitionListener;)Landroid/transition/Transition;

    .line 107
    .line 108
    .line 109
    if-eqz v3, :cond_3

    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/transition/Transition;->getDuration()J

    .line 112
    .line 113
    .line 114
    move-result-wide v3

    .line 115
    cmp-long p1, v3, v1

    .line 116
    .line 117
    if-ltz p1, :cond_2

    .line 118
    .line 119
    invoke-virtual {v0}, Landroid/transition/Transition;->getDuration()J

    .line 120
    .line 121
    .line 122
    move-result-wide v1

    .line 123
    invoke-virtual {p2, v1, v2}, Landroid/view/Window;->setTransitionBackgroundFadeDuration(J)V

    .line 124
    .line 125
    .line 126
    :cond_2
    new-instance p1, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback$3;

    .line 127
    .line 128
    invoke-direct {p1, p2}, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback$3;-><init>(Landroid/view/Window;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, p1}, Landroid/transition/Transition;->addListener(Landroid/transition/Transition$TransitionListener;)Landroid/transition/Transition;

    .line 132
    .line 133
    .line 134
    :cond_3
    return-void
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

.method public final onSharedElementEnd(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p3, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Landroid/view/View;

    .line 13
    .line 14
    sget v0, Lcom/google/android/material/R$id;->mtrl_motion_snapshot_view:I

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    instance-of p1, p1, Landroid/view/View;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Landroid/view/View;

    .line 29
    .line 30
    sget v0, Lcom/google/android/material/R$id;->mtrl_motion_snapshot_view:I

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-boolean p1, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback;->a:Z

    .line 37
    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Landroid/view/View;

    .line 51
    .line 52
    sget-object p2, Lcom/google/android/material/transition/platform/TransitionUtils;->a:Landroid/graphics/RectF;

    .line 53
    .line 54
    new-instance p2, Landroid/graphics/Rect;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    invoke-direct {p2, v0, v1, v2, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 73
    .line 74
    .line 75
    iput-object p2, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback;->c:Landroid/graphics/Rect;

    .line 76
    .line 77
    :cond_1
    iput-boolean p3, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback;->a:Z

    .line 78
    .line 79
    return-void
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

.method public final onSharedElementStart(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Landroid/view/View;

    .line 19
    .line 20
    sget v1, Lcom/google/android/material/R$id;->mtrl_motion_snapshot_view:I

    .line 21
    .line 22
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-virtual {p1, v1, p3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-boolean p1, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback;->a:Z

    .line 30
    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    iget-object p1, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback;->c:Landroid/graphics/Rect;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Landroid/view/View;

    .line 48
    .line 49
    iget-object p2, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback;->c:Landroid/graphics/Rect;

    .line 50
    .line 51
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    const/high16 p3, 0x40000000    # 2.0f

    .line 56
    .line 57
    invoke-static {p2, p3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    iget-object v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback;->c:Landroid/graphics/Rect;

    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-static {v0, p3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    .line 72
    .line 73
    .line 74
    iget-object p2, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransformSharedElementCallback;->c:Landroid/graphics/Rect;

    .line 75
    .line 76
    iget p3, p2, Landroid/graphics/Rect;->left:I

    .line 77
    .line 78
    iget v0, p2, Landroid/graphics/Rect;->top:I

    .line 79
    .line 80
    iget v1, p2, Landroid/graphics/Rect;->right:I

    .line 81
    .line 82
    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    .line 83
    .line 84
    invoke-virtual {p1, p3, v0, v1, p2}, Landroid/view/View;->layout(IIII)V

    .line 85
    .line 86
    .line 87
    :cond_1
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
.end method

.class public final Lm0/j1;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public final a:Lm0/h1;

.field public b:Lm0/c2;


# direct methods
.method public constructor <init>(Landroid/view/View;Lm0/h1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lm0/j1;->a:Lm0/h1;

    .line 5
    .line 6
    invoke-static {p1}, Lm0/w0;->i(Landroid/view/View;)Lm0/c2;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v0, 0x1e

    .line 15
    .line 16
    if-lt p2, v0, :cond_0

    .line 17
    .line 18
    new-instance p2, Lm0/t1;

    .line 19
    .line 20
    invoke-direct {p2, p1}, Lm0/t1;-><init>(Lm0/c2;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/16 v0, 0x1d

    .line 25
    .line 26
    if-lt p2, v0, :cond_1

    .line 27
    .line 28
    new-instance p2, Lm0/s1;

    .line 29
    .line 30
    invoke-direct {p2, p1}, Lm0/s1;-><init>(Lm0/c2;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-instance p2, Lm0/q1;

    .line 35
    .line 36
    invoke-direct {p2, p1}, Lm0/q1;-><init>(Lm0/c2;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-virtual {p2}, Lm0/u1;->b()Lm0/c2;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    const/4 p1, 0x0

    .line 45
    :goto_1
    iput-object p1, p0, Lm0/j1;->b:Lm0/c2;

    .line 46
    .line 47
    return-void
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


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    invoke-virtual {v6}, Landroid/view/View;->isLaidOut()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static/range {p1 .. p2}, Lm0/c2;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lm0/c2;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput-object v1, v0, Lm0/j1;->b:Lm0/c2;

    .line 18
    .line 19
    invoke-static/range {p1 .. p2}, Lm0/k1;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    return-object v1

    .line 24
    :cond_0
    invoke-static/range {p1 .. p2}, Lm0/c2;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lm0/c2;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iget-object v1, v3, Lm0/c2;->a:Lm0/a2;

    .line 29
    .line 30
    iget-object v2, v0, Lm0/j1;->b:Lm0/c2;

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    invoke-static {v6}, Lm0/w0;->i(Landroid/view/View;)Lm0/c2;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iput-object v2, v0, Lm0/j1;->b:Lm0/c2;

    .line 39
    .line 40
    :cond_1
    iget-object v2, v0, Lm0/j1;->b:Lm0/c2;

    .line 41
    .line 42
    if-nez v2, :cond_2

    .line 43
    .line 44
    iput-object v3, v0, Lm0/j1;->b:Lm0/c2;

    .line 45
    .line 46
    invoke-static/range {p1 .. p2}, Lm0/k1;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    return-object v1

    .line 51
    :cond_2
    invoke-static {v6}, Lm0/k1;->j(Landroid/view/View;)Lm0/h1;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    iget-object v2, v2, Lm0/h1;->a:Landroid/view/WindowInsets;

    .line 58
    .line 59
    invoke-static {v2, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    invoke-static/range {p1 .. p2}, Lm0/k1;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    return-object v1

    .line 70
    :cond_3
    iget-object v2, v0, Lm0/j1;->b:Lm0/c2;

    .line 71
    .line 72
    const/4 v5, 0x1

    .line 73
    const/4 v8, 0x0

    .line 74
    :goto_0
    const/16 v9, 0x100

    .line 75
    .line 76
    if-gt v5, v9, :cond_5

    .line 77
    .line 78
    invoke-virtual {v1, v5}, Lm0/a2;->f(I)Le0/f;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    iget-object v10, v2, Lm0/c2;->a:Lm0/a2;

    .line 83
    .line 84
    invoke-virtual {v10, v5}, Lm0/a2;->f(I)Le0/f;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    invoke-virtual {v9, v10}, Le0/f;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    if-nez v9, :cond_4

    .line 93
    .line 94
    or-int/2addr v8, v5

    .line 95
    :cond_4
    shl-int/lit8 v5, v5, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_5
    if-nez v8, :cond_6

    .line 99
    .line 100
    invoke-static/range {p1 .. p2}, Lm0/k1;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    return-object v1

    .line 105
    :cond_6
    iget-object v2, v0, Lm0/j1;->b:Lm0/c2;

    .line 106
    .line 107
    and-int/lit8 v5, v8, 0x8

    .line 108
    .line 109
    if-eqz v5, :cond_8

    .line 110
    .line 111
    const/16 v5, 0x8

    .line 112
    .line 113
    invoke-virtual {v1, v5}, Lm0/a2;->f(I)Le0/f;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    iget v9, v9, Le0/f;->d:I

    .line 118
    .line 119
    iget-object v10, v2, Lm0/c2;->a:Lm0/a2;

    .line 120
    .line 121
    invoke-virtual {v10, v5}, Lm0/a2;->f(I)Le0/f;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    iget v5, v5, Le0/f;->d:I

    .line 126
    .line 127
    if-le v9, v5, :cond_7

    .line 128
    .line 129
    sget-object v5, Lm0/k1;->e:Landroid/view/animation/PathInterpolator;

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_7
    sget-object v5, Lm0/k1;->f:Lg1/a;

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_8
    sget-object v5, Lm0/k1;->g:Landroid/view/animation/DecelerateInterpolator;

    .line 136
    .line 137
    :goto_1
    new-instance v9, Lm0/o1;

    .line 138
    .line 139
    const-wide/16 v10, 0xa0

    .line 140
    .line 141
    invoke-direct {v9, v8, v5, v10, v11}, Lm0/o1;-><init>(ILandroid/view/animation/Interpolator;J)V

    .line 142
    .line 143
    .line 144
    iget-object v5, v9, Lm0/o1;->a:Lm0/n1;

    .line 145
    .line 146
    const/4 v10, 0x0

    .line 147
    invoke-virtual {v5, v10}, Lm0/n1;->d(F)V

    .line 148
    .line 149
    .line 150
    const/4 v5, 0x2

    .line 151
    new-array v5, v5, [F

    .line 152
    .line 153
    fill-array-data v5, :array_0

    .line 154
    .line 155
    .line 156
    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    iget-object v10, v9, Lm0/o1;->a:Lm0/n1;

    .line 161
    .line 162
    invoke-virtual {v10}, Lm0/n1;->a()J

    .line 163
    .line 164
    .line 165
    move-result-wide v10

    .line 166
    invoke-virtual {v5, v10, v11}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    invoke-virtual {v1, v8}, Lm0/a2;->f(I)Le0/f;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    iget-object v5, v2, Lm0/c2;->a:Lm0/a2;

    .line 175
    .line 176
    invoke-virtual {v5, v8}, Lm0/a2;->f(I)Le0/f;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    iget v11, v1, Le0/f;->a:I

    .line 181
    .line 182
    iget v12, v5, Le0/f;->a:I

    .line 183
    .line 184
    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    .line 185
    .line 186
    .line 187
    move-result v11

    .line 188
    iget v12, v1, Le0/f;->b:I

    .line 189
    .line 190
    iget v13, v5, Le0/f;->b:I

    .line 191
    .line 192
    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    .line 193
    .line 194
    .line 195
    move-result v14

    .line 196
    iget v15, v1, Le0/f;->c:I

    .line 197
    .line 198
    iget v4, v5, Le0/f;->c:I

    .line 199
    .line 200
    move-object/from16 v16, v2

    .line 201
    .line 202
    invoke-static {v15, v4}, Ljava/lang/Math;->min(II)I

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    move-object/from16 v17, v3

    .line 207
    .line 208
    iget v3, v1, Le0/f;->d:I

    .line 209
    .line 210
    move/from16 v18, v8

    .line 211
    .line 212
    iget v8, v5, Le0/f;->d:I

    .line 213
    .line 214
    invoke-static {v3, v8}, Ljava/lang/Math;->min(II)I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    invoke-static {v11, v14, v2, v0}, Le0/f;->b(IIII)Le0/f;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    iget v1, v1, Le0/f;->a:I

    .line 223
    .line 224
    iget v2, v5, Le0/f;->a:I

    .line 225
    .line 226
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    invoke-static {v15, v4}, Ljava/lang/Math;->max(II)I

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    invoke-static {v3, v8}, Ljava/lang/Math;->max(II)I

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    invoke-static {v1, v2, v4, v3}, Le0/f;->b(IIII)Le0/f;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    new-instance v8, Lu2/e;

    .line 247
    .line 248
    const/4 v2, 0x6

    .line 249
    invoke-direct {v8, v2, v0, v1}, Lu2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    const/4 v0, 0x0

    .line 253
    invoke-static {v6, v9, v7, v0}, Lm0/k1;->f(Landroid/view/View;Lm0/o1;Landroid/view/WindowInsets;Z)V

    .line 254
    .line 255
    .line 256
    new-instance v1, Lm0/i1;

    .line 257
    .line 258
    move-object v2, v9

    .line 259
    move-object/from16 v4, v16

    .line 260
    .line 261
    move-object/from16 v3, v17

    .line 262
    .line 263
    move/from16 v5, v18

    .line 264
    .line 265
    invoke-direct/range {v1 .. v6}, Lm0/i1;-><init>(Lm0/o1;Lm0/c2;Lm0/c2;ILandroid/view/View;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v10, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 269
    .line 270
    .line 271
    new-instance v0, Lg2/r;

    .line 272
    .line 273
    invoke-direct {v0, v6, v2}, Lg2/r;-><init>(Landroid/view/View;Lm0/o1;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v10, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 277
    .line 278
    .line 279
    new-instance v0, Ll/e;

    .line 280
    .line 281
    invoke-direct {v0, v6, v2, v8, v10}, Ll/e;-><init>(Landroid/view/View;Lm0/o1;Lu2/e;Landroid/animation/ValueAnimator;)V

    .line 282
    .line 283
    .line 284
    invoke-static {v6, v0}, Lm0/z;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 285
    .line 286
    .line 287
    move-object/from16 v0, p0

    .line 288
    .line 289
    iput-object v3, v0, Lm0/j1;->b:Lm0/c2;

    .line 290
    .line 291
    invoke-static/range {p1 .. p2}, Lm0/k1;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    return-object v1

    .line 296
    nop

    .line 297
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
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

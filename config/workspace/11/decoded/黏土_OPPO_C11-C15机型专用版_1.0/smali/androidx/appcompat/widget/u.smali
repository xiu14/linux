.class public final Landroidx/appcompat/widget/u;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Landroidx/appcompat/widget/b0;

.field public c:I

.field public d:Landroidx/appcompat/widget/z3;

.field public e:Landroidx/appcompat/widget/z3;

.field public f:Landroidx/appcompat/widget/z3;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Landroidx/appcompat/widget/u;->c:I

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/appcompat/widget/u;->a:Landroid/view/View;

    .line 8
    .line 9
    invoke-static {}, Landroidx/appcompat/widget/b0;->a()Landroidx/appcompat/widget/b0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Landroidx/appcompat/widget/u;->b:Landroidx/appcompat/widget/b0;

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


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/u;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_7

    .line 8
    .line 9
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v3, 0x15

    .line 12
    .line 13
    if-le v2, v3, :cond_0

    .line 14
    .line 15
    iget-object v2, p0, Landroidx/appcompat/widget/u;->d:Landroidx/appcompat/widget/z3;

    .line 16
    .line 17
    if-eqz v2, :cond_5

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-ne v2, v3, :cond_5

    .line 21
    .line 22
    :goto_0
    iget-object v2, p0, Landroidx/appcompat/widget/u;->f:Landroidx/appcompat/widget/z3;

    .line 23
    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    new-instance v2, Landroidx/appcompat/widget/z3;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v2, p0, Landroidx/appcompat/widget/u;->f:Landroidx/appcompat/widget/z3;

    .line 32
    .line 33
    :cond_1
    iget-object v2, p0, Landroidx/appcompat/widget/u;->f:Landroidx/appcompat/widget/z3;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    iput-object v3, v2, Landroidx/appcompat/widget/z3;->c:Ljava/lang/Object;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    iput-boolean v4, v2, Landroidx/appcompat/widget/z3;->b:Z

    .line 40
    .line 41
    iput-object v3, v2, Landroidx/appcompat/widget/z3;->d:Ljava/io/Serializable;

    .line 42
    .line 43
    iput-boolean v4, v2, Landroidx/appcompat/widget/z3;->a:Z

    .line 44
    .line 45
    sget-object v3, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 46
    .line 47
    invoke-static {v0}, Lm0/k0;->g(Landroid/view/View;)Landroid/content/res/ColorStateList;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    const/4 v4, 0x1

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    iput-boolean v4, v2, Landroidx/appcompat/widget/z3;->b:Z

    .line 55
    .line 56
    iput-object v3, v2, Landroidx/appcompat/widget/z3;->c:Ljava/lang/Object;

    .line 57
    .line 58
    :cond_2
    invoke-static {v0}, Lm0/k0;->h(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    if-eqz v3, :cond_3

    .line 63
    .line 64
    iput-boolean v4, v2, Landroidx/appcompat/widget/z3;->a:Z

    .line 65
    .line 66
    iput-object v3, v2, Landroidx/appcompat/widget/z3;->d:Ljava/io/Serializable;

    .line 67
    .line 68
    :cond_3
    iget-boolean v3, v2, Landroidx/appcompat/widget/z3;->b:Z

    .line 69
    .line 70
    if-nez v3, :cond_4

    .line 71
    .line 72
    iget-boolean v3, v2, Landroidx/appcompat/widget/z3;->a:Z

    .line 73
    .line 74
    if-eqz v3, :cond_5

    .line 75
    .line 76
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v1, v2, v0}, Landroidx/appcompat/widget/b0;->e(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/z3;[I)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_5
    iget-object v2, p0, Landroidx/appcompat/widget/u;->e:Landroidx/appcompat/widget/z3;

    .line 85
    .line 86
    if-eqz v2, :cond_6

    .line 87
    .line 88
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v1, v2, v0}, Landroidx/appcompat/widget/b0;->e(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/z3;[I)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_6
    iget-object v2, p0, Landroidx/appcompat/widget/u;->d:Landroidx/appcompat/widget/z3;

    .line 97
    .line 98
    if-eqz v2, :cond_7

    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v1, v2, v0}, Landroidx/appcompat/widget/b0;->e(Landroid/graphics/drawable/Drawable;Landroidx/appcompat/widget/z3;[I)V

    .line 105
    .line 106
    .line 107
    :cond_7
    return-void
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

.method public final b()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/u;->e:Landroidx/appcompat/widget/z3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/appcompat/widget/z3;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
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

.method public final c()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/u;->e:Landroidx/appcompat/widget/z3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/appcompat/widget/z3;->d:Ljava/io/Serializable;

    .line 6
    .line 7
    check-cast v0, Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
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

.method public final d(Landroid/util/AttributeSet;I)V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/u;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lf/j;->ViewBackgroundHelper:[I

    .line 8
    .line 9
    invoke-static {v1, p1, v2, p2}, La1/w;->A(Landroid/content/Context;Landroid/util/AttributeSet;[II)La1/w;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, v1, La1/w;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Landroid/content/res/TypedArray;

    .line 16
    .line 17
    iget-object v3, p0, Landroidx/appcompat/widget/u;->a:Landroid/view/View;

    .line 18
    .line 19
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    sget-object v5, Lf/j;->ViewBackgroundHelper:[I

    .line 24
    .line 25
    iget-object v6, v1, La1/w;->i:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v7, v6

    .line 28
    check-cast v7, Landroid/content/res/TypedArray;

    .line 29
    .line 30
    move-object v6, p1

    .line 31
    move v8, p2

    .line 32
    invoke-static/range {v3 .. v8}, Lm0/w0;->p(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 33
    .line 34
    .line 35
    :try_start_0
    sget p1, Lf/j;->ViewBackgroundHelper_android_background:I

    .line 36
    .line 37
    invoke-virtual {v2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    const/4 p2, -0x1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    sget p1, Lf/j;->ViewBackgroundHelper_android_background:I

    .line 45
    .line 46
    invoke-virtual {v2, p1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, Landroidx/appcompat/widget/u;->c:I

    .line 51
    .line 52
    iget-object p1, p0, Landroidx/appcompat/widget/u;->b:Landroidx/appcompat/widget/b0;

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iget v4, p0, Landroidx/appcompat/widget/u;->c:I

    .line 59
    .line 60
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    :try_start_1
    iget-object v5, p1, Landroidx/appcompat/widget/b0;->a:Landroidx/appcompat/widget/z2;

    .line 62
    .line 63
    invoke-virtual {v5, v3, v4}, Landroidx/appcompat/widget/z2;->i(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 64
    .line 65
    .line 66
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 67
    :try_start_2
    monitor-exit p1

    .line 68
    if-eqz v3, :cond_0

    .line 69
    .line 70
    invoke-virtual {p0, v3}, Landroidx/appcompat/widget/u;->g(Landroid/content/res/ColorStateList;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    move-object p1, v0

    .line 76
    goto :goto_3

    .line 77
    :catchall_1
    move-exception v0

    .line 78
    move-object p2, v0

    .line 79
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 80
    :try_start_4
    throw p2

    .line 81
    :cond_0
    :goto_0
    sget p1, Lf/j;->ViewBackgroundHelper_backgroundTint:I

    .line 82
    .line 83
    invoke-virtual {v2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_1

    .line 88
    .line 89
    sget p1, Lf/j;->ViewBackgroundHelper_backgroundTint:I

    .line 90
    .line 91
    invoke-virtual {v1, p1}, La1/w;->s(I)Landroid/content/res/ColorStateList;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {v0, p1}, Lm0/w0;->s(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 96
    .line 97
    .line 98
    :cond_1
    sget p1, Lf/j;->ViewBackgroundHelper_backgroundTintMode:I

    .line 99
    .line 100
    invoke-virtual {v2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_5

    .line 105
    .line 106
    sget p1, Lf/j;->ViewBackgroundHelper_backgroundTintMode:I

    .line 107
    .line 108
    invoke-virtual {v2, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    const/4 p2, 0x0

    .line 113
    invoke-static {p1, p2}, Landroidx/appcompat/widget/x1;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 118
    .line 119
    invoke-static {v0, p1}, Lm0/k0;->r(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V

    .line 120
    .line 121
    .line 122
    const/16 p1, 0x15

    .line 123
    .line 124
    if-ne p2, p1, :cond_5

    .line 125
    .line 126
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-static {v0}, Lm0/k0;->g(Landroid/view/View;)Landroid/content/res/ColorStateList;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    if-nez p2, :cond_3

    .line 135
    .line 136
    invoke-static {v0}, Lm0/k0;->h(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    if-eqz p2, :cond_2

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_2
    const/4 p2, 0x0

    .line 144
    goto :goto_2

    .line 145
    :cond_3
    :goto_1
    const/4 p2, 0x1

    .line 146
    :goto_2
    if-eqz p1, :cond_5

    .line 147
    .line 148
    if-eqz p2, :cond_5

    .line 149
    .line 150
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    if-eqz p2, :cond_4

    .line 155
    .line 156
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 161
    .line 162
    .line 163
    :cond_4
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 164
    .line 165
    .line 166
    :cond_5
    invoke-virtual {v1}, La1/w;->E()V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :goto_3
    invoke-virtual {v1}, La1/w;->E()V

    .line 171
    .line 172
    .line 173
    throw p1
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

.method public final e()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Landroidx/appcompat/widget/u;->c:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/u;->g(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/appcompat/widget/u;->a()V

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
.end method

.method public final f(I)V
    .locals 3

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/u;->c:I

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/appcompat/widget/u;->b:Landroidx/appcompat/widget/b0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/appcompat/widget/u;->a:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget-object v2, v0, Landroidx/appcompat/widget/b0;->a:Landroidx/appcompat/widget/z2;

    .line 15
    .line 16
    invoke-virtual {v2, v1, p1}, Landroidx/appcompat/widget/z2;->i(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    monitor-exit v0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw p1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    :goto_0
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/u;->g(Landroid/content/res/ColorStateList;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/appcompat/widget/u;->a()V

    .line 30
    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final g(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/appcompat/widget/u;->d:Landroidx/appcompat/widget/z3;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroidx/appcompat/widget/z3;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Landroidx/appcompat/widget/u;->d:Landroidx/appcompat/widget/z3;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/u;->d:Landroidx/appcompat/widget/z3;

    .line 15
    .line 16
    iput-object p1, v0, Landroidx/appcompat/widget/z3;->c:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, v0, Landroidx/appcompat/widget/z3;->b:Z

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    iput-object p1, p0, Landroidx/appcompat/widget/u;->d:Landroidx/appcompat/widget/z3;

    .line 24
    .line 25
    :goto_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/u;->a()V

    .line 26
    .line 27
    .line 28
    return-void
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

.method public final h(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/u;->e:Landroidx/appcompat/widget/z3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/appcompat/widget/z3;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/appcompat/widget/u;->e:Landroidx/appcompat/widget/z3;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/u;->e:Landroidx/appcompat/widget/z3;

    .line 13
    .line 14
    iput-object p1, v0, Landroidx/appcompat/widget/z3;->c:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, v0, Landroidx/appcompat/widget/z3;->b:Z

    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/appcompat/widget/u;->a()V

    .line 20
    .line 21
    .line 22
    return-void
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

.method public final i(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/u;->e:Landroidx/appcompat/widget/z3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/appcompat/widget/z3;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/appcompat/widget/u;->e:Landroidx/appcompat/widget/z3;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/u;->e:Landroidx/appcompat/widget/z3;

    .line 13
    .line 14
    iput-object p1, v0, Landroidx/appcompat/widget/z3;->d:Ljava/io/Serializable;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, v0, Landroidx/appcompat/widget/z3;->a:Z

    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/appcompat/widget/u;->a()V

    .line 20
    .line 21
    .line 22
    return-void
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

.class public final Ls3/c;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final c:Ljava/lang/ThreadLocal;


# instance fields
.field public a:[F

.field public b:Ls3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ls3/c;->c:Ljava/lang/ThreadLocal;

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
.end method

.method public static a(II)I
    .locals 12

    .line 1
    sget-object v0, Ls3/c;->c:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, [D

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    new-array v1, v1, [D

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {p0, v1}, Le0/d;->i(I[D)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    aget-wide v2, v1, p0

    .line 22
    .line 23
    int-to-double v4, p1

    .line 24
    add-double/2addr v2, v4

    .line 25
    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    .line 26
    .line 27
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(DD)D

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    const-wide/16 v4, 0x0

    .line 32
    .line 33
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(DD)D

    .line 34
    .line 35
    .line 36
    move-result-wide v6

    .line 37
    aput-wide v6, v1, p0

    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    aget-wide v8, v1, p0

    .line 41
    .line 42
    const/4 p0, 0x2

    .line 43
    aget-wide v10, v1, p0

    .line 44
    .line 45
    invoke-static/range {v6 .. v11}, Le0/d;->a(DDD)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0
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

.method public static b(II)I
    .locals 18

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p0 .. p1}, Le0/d;->f(II)D

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    const-wide/high16 v3, 0x4012000000000000L    # 4.5

    .line 8
    .line 9
    cmpl-double v5, v1, v3

    .line 10
    .line 11
    if-ltz v5, :cond_0

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v1, 0x3

    .line 15
    new-array v1, v1, [D

    .line 16
    .line 17
    invoke-static {v0, v1}, Le0/d;->i(I[D)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    aget-wide v5, v1, v0

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    aget-wide v9, v1, v2

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    aget-wide v11, v1, v2

    .line 28
    .line 29
    const-wide/16 v1, 0x0

    .line 30
    .line 31
    :goto_0
    const/16 v7, 0xf

    .line 32
    .line 33
    if-ge v0, v7, :cond_2

    .line 34
    .line 35
    sub-double v7, v5, v1

    .line 36
    .line 37
    const-wide v13, 0x3ee4f8b588e368f1L    # 1.0E-5

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    cmpl-double v15, v7, v13

    .line 43
    .line 44
    if-lez v15, :cond_2

    .line 45
    .line 46
    add-double v7, v1, v5

    .line 47
    .line 48
    const-wide/high16 v13, 0x4000000000000000L    # 2.0

    .line 49
    .line 50
    div-double/2addr v7, v13

    .line 51
    invoke-static/range {v7 .. v12}, Le0/d;->a(DDD)I

    .line 52
    .line 53
    .line 54
    move-result v13

    .line 55
    move-wide v14, v7

    .line 56
    move/from16 v7, p1

    .line 57
    .line 58
    invoke-static {v13, v7}, Le0/d;->f(II)D

    .line 59
    .line 60
    .line 61
    move-result-wide v16

    .line 62
    cmpl-double v8, v16, v3

    .line 63
    .line 64
    if-lez v8, :cond_1

    .line 65
    .line 66
    move-wide v1, v14

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    move-wide v5, v14

    .line 69
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    move-wide v7, v1

    .line 73
    invoke-static/range {v7 .. v12}, Le0/d;->a(DDD)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    return v0
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
.end method

.method public static c(II)I
    .locals 14

    .line 1
    invoke-static {p0, p1}, Le0/d;->f(II)D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/high16 v2, 0x4012000000000000L    # 4.5

    .line 6
    .line 7
    cmpl-double v4, v0, v2

    .line 8
    .line 9
    if-ltz v4, :cond_0

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    const/4 v0, 0x3

    .line 13
    new-array v0, v0, [F

    .line 14
    .line 15
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-static {v1, v4, v5, v0}, Le0/d;->b(III[F)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    aget v4, v0, v1

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    const/high16 v6, 0x3f800000    # 1.0f

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    const/high16 v8, 0x3f800000    # 1.0f

    .line 38
    .line 39
    :goto_0
    const/16 v9, 0xf

    .line 40
    .line 41
    if-ge v7, v9, :cond_2

    .line 42
    .line 43
    sub-float v9, v8, v4

    .line 44
    .line 45
    float-to-double v9, v9

    .line 46
    const-wide v11, 0x3ee4f8b588e368f1L    # 1.0E-5

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    cmpl-double v13, v9, v11

    .line 52
    .line 53
    if-lez v13, :cond_2

    .line 54
    .line 55
    add-float p0, v4, v8

    .line 56
    .line 57
    const/high16 v9, 0x40000000    # 2.0f

    .line 58
    .line 59
    div-float/2addr p0, v9

    .line 60
    aput p0, v0, v1

    .line 61
    .line 62
    aget v10, v0, v5

    .line 63
    .line 64
    const/4 v11, 0x1

    .line 65
    aget v11, v0, v11

    .line 66
    .line 67
    mul-float v12, p0, v9

    .line 68
    .line 69
    sub-float/2addr v12, v6

    .line 70
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    .line 71
    .line 72
    .line 73
    move-result v12

    .line 74
    sub-float v12, v6, v12

    .line 75
    .line 76
    mul-float v12, v12, v11

    .line 77
    .line 78
    const/high16 v11, 0x3f000000    # 0.5f

    .line 79
    .line 80
    mul-float v11, v11, v12

    .line 81
    .line 82
    sub-float v11, p0, v11

    .line 83
    .line 84
    const/high16 v13, 0x42700000    # 60.0f

    .line 85
    .line 86
    div-float v13, v10, v13

    .line 87
    .line 88
    rem-float/2addr v13, v9

    .line 89
    sub-float/2addr v13, v6

    .line 90
    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    sub-float v9, v6, v9

    .line 95
    .line 96
    mul-float v9, v9, v12

    .line 97
    .line 98
    float-to-int v10, v10

    .line 99
    div-int/lit8 v10, v10, 0x3c

    .line 100
    .line 101
    const/high16 v13, 0x437f0000    # 255.0f

    .line 102
    .line 103
    packed-switch v10, :pswitch_data_0

    .line 104
    .line 105
    .line 106
    const/4 v9, 0x0

    .line 107
    const/4 v10, 0x0

    .line 108
    const/4 v12, 0x0

    .line 109
    goto/16 :goto_2

    .line 110
    .line 111
    :pswitch_0
    add-float/2addr v12, v11

    .line 112
    mul-float v12, v12, v13

    .line 113
    .line 114
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    mul-float v12, v11, v13

    .line 119
    .line 120
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 121
    .line 122
    .line 123
    move-result v12

    .line 124
    add-float/2addr v9, v11

    .line 125
    mul-float v9, v9, v13

    .line 126
    .line 127
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    goto :goto_2

    .line 132
    :pswitch_1
    add-float/2addr v9, v11

    .line 133
    mul-float v9, v9, v13

    .line 134
    .line 135
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 136
    .line 137
    .line 138
    move-result v10

    .line 139
    mul-float v9, v11, v13

    .line 140
    .line 141
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 142
    .line 143
    .line 144
    move-result v9

    .line 145
    add-float/2addr v12, v11

    .line 146
    mul-float v12, v12, v13

    .line 147
    .line 148
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 149
    .line 150
    .line 151
    move-result v11

    .line 152
    :goto_1
    move v12, v9

    .line 153
    move v9, v11

    .line 154
    goto :goto_2

    .line 155
    :pswitch_2
    mul-float v10, v11, v13

    .line 156
    .line 157
    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    add-float/2addr v9, v11

    .line 162
    mul-float v9, v9, v13

    .line 163
    .line 164
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    add-float/2addr v12, v11

    .line 169
    mul-float v12, v12, v13

    .line 170
    .line 171
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 172
    .line 173
    .line 174
    move-result v11

    .line 175
    goto :goto_1

    .line 176
    :pswitch_3
    mul-float v10, v11, v13

    .line 177
    .line 178
    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    .line 179
    .line 180
    .line 181
    move-result v10

    .line 182
    add-float/2addr v12, v11

    .line 183
    mul-float v12, v12, v13

    .line 184
    .line 185
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 186
    .line 187
    .line 188
    move-result v12

    .line 189
    add-float/2addr v9, v11

    .line 190
    mul-float v9, v9, v13

    .line 191
    .line 192
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    goto :goto_2

    .line 197
    :pswitch_4
    add-float/2addr v9, v11

    .line 198
    mul-float v9, v9, v13

    .line 199
    .line 200
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 201
    .line 202
    .line 203
    move-result v10

    .line 204
    add-float/2addr v12, v11

    .line 205
    mul-float v12, v12, v13

    .line 206
    .line 207
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 208
    .line 209
    .line 210
    move-result v12

    .line 211
    mul-float v11, v11, v13

    .line 212
    .line 213
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    goto :goto_2

    .line 218
    :pswitch_5
    add-float/2addr v12, v11

    .line 219
    mul-float v12, v12, v13

    .line 220
    .line 221
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    add-float/2addr v9, v11

    .line 226
    mul-float v9, v9, v13

    .line 227
    .line 228
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 229
    .line 230
    .line 231
    move-result v12

    .line 232
    mul-float v11, v11, v13

    .line 233
    .line 234
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    .line 235
    .line 236
    .line 237
    move-result v9

    .line 238
    :goto_2
    invoke-static {v10}, Le0/d;->l(I)I

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    invoke-static {v12}, Le0/d;->l(I)I

    .line 243
    .line 244
    .line 245
    move-result v11

    .line 246
    invoke-static {v9}, Le0/d;->l(I)I

    .line 247
    .line 248
    .line 249
    move-result v9

    .line 250
    invoke-static {v10, v11, v9}, Landroid/graphics/Color;->rgb(III)I

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    invoke-static {v9, p1}, Le0/d;->f(II)D

    .line 255
    .line 256
    .line 257
    move-result-wide v10

    .line 258
    cmpl-double v12, v10, v2

    .line 259
    .line 260
    if-lez v12, :cond_1

    .line 261
    .line 262
    move v8, p0

    .line 263
    goto :goto_3

    .line 264
    :cond_1
    move v4, p0

    .line 265
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 266
    .line 267
    move p0, v9

    .line 268
    goto/16 :goto_0

    .line 269
    .line 270
    :cond_2
    return p0

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
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

.method public static d(Ln1/g;)Z
    .locals 4

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget p0, p0, Ln1/g;->e:I

    .line 4
    .line 5
    int-to-float p0, p0

    .line 6
    const v0, 0x46afc800    # 22500.0f

    .line 7
    .line 8
    .line 9
    div-float/2addr p0, v0

    .line 10
    float-to-double v0, p0

    .line 11
    const-wide v2, 0x3f60624dd2f1a9fcL    # 0.002

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmpl-double p0, v0, v2

    .line 17
    .line 18
    if-lez p0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
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

.method public static e([F)Z
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    aget p0, p0, v0

    .line 3
    .line 4
    const v0, 0x3da3d70a    # 0.08f

    .line 5
    .line 6
    .line 7
    cmpg-float v0, p0, v0

    .line 8
    .line 9
    if-gtz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const v0, 0x3f666666    # 0.9f

    .line 13
    .line 14
    .line 15
    cmpl-float p0, p0, v0

    .line 16
    .line 17
    if-ltz p0, :cond_1

    .line 18
    .line 19
    :goto_0
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_1
    const/4 p0, 0x0

    .line 22
    return p0
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

.method public static f(Ln1/g;Ln1/g;Ln1/g;Ln1/g;Ln1/g;I)I
    .locals 3

    .line 1
    invoke-static {p0}, Ls3/c;->d(Ln1/g;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Ls3/c;->d(Ln1/g;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget v0, p0, Ln1/g;->e:I

    .line 15
    .line 16
    iget v1, p1, Ln1/g;->e:I

    .line 17
    .line 18
    int-to-float v0, v0

    .line 19
    int-to-float v1, v1

    .line 20
    div-float/2addr v0, v1

    .line 21
    const/high16 v1, 0x3f800000    # 1.0f

    .line 22
    .line 23
    cmpg-float v0, v0, v1

    .line 24
    .line 25
    if-gez v0, :cond_3

    .line 26
    .line 27
    :goto_0
    move-object p0, p1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    if-eqz v0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    if-eqz v1, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    move-object p0, v2

    .line 36
    :cond_3
    :goto_1
    const/4 p1, 0x1

    .line 37
    if-nez p0, :cond_8

    .line 38
    .line 39
    invoke-static {p3}, Ls3/c;->d(Ln1/g;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-static {p2}, Ls3/c;->d(Ln1/g;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz p0, :cond_4

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    invoke-virtual {p3}, Ln1/g;->b()[F

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    aget p0, p0, p1

    .line 56
    .line 57
    invoke-virtual {p2}, Ln1/g;->b()[F

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    aget v0, v0, p1

    .line 62
    .line 63
    iget v1, p3, Ln1/g;->e:I

    .line 64
    .line 65
    int-to-float v1, v1

    .line 66
    iget v2, p2, Ln1/g;->e:I

    .line 67
    .line 68
    int-to-float v2, v2

    .line 69
    div-float/2addr v1, v2

    .line 70
    mul-float v1, v1, p0

    .line 71
    .line 72
    cmpl-float p0, v1, v0

    .line 73
    .line 74
    if-lez p0, :cond_7

    .line 75
    .line 76
    :goto_2
    move-object p2, p3

    .line 77
    goto :goto_3

    .line 78
    :cond_4
    if-eqz p0, :cond_5

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    if-eqz v0, :cond_6

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_6
    move-object p2, v2

    .line 85
    :cond_7
    :goto_3
    move-object p0, p2

    .line 86
    :cond_8
    if-eqz p0, :cond_b

    .line 87
    .line 88
    iget p2, p0, Ln1/g;->d:I

    .line 89
    .line 90
    if-ne p4, p0, :cond_9

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_9
    iget p0, p0, Ln1/g;->e:I

    .line 94
    .line 95
    int-to-float p0, p0

    .line 96
    iget p3, p4, Ln1/g;->e:I

    .line 97
    .line 98
    int-to-float p3, p3

    .line 99
    div-float/2addr p0, p3

    .line 100
    const p3, 0x3c23d70a    # 0.01f

    .line 101
    .line 102
    .line 103
    cmpg-float p0, p0, p3

    .line 104
    .line 105
    if-gez p0, :cond_a

    .line 106
    .line 107
    invoke-virtual {p4}, Ln1/g;->b()[F

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    aget p0, p0, p1

    .line 112
    .line 113
    const p1, 0x3e428f5c    # 0.19f

    .line 114
    .line 115
    .line 116
    cmpl-float p0, p0, p1

    .line 117
    .line 118
    if-lez p0, :cond_a

    .line 119
    .line 120
    iget p0, p4, Ln1/g;->d:I

    .line 121
    .line 122
    return p0

    .line 123
    :cond_a
    :goto_4
    return p2

    .line 124
    :cond_b
    invoke-static {p4}, Ls3/c;->d(Ln1/g;)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-eqz p0, :cond_c

    .line 129
    .line 130
    iget p0, p4, Ln1/g;->d:I

    .line 131
    .line 132
    return p0

    .line 133
    :cond_c
    return p5
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

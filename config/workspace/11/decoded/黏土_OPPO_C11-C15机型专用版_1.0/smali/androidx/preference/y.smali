.class public Landroidx/preference/y;
.super Landroidx/recyclerview/widget/c1;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field private final mHandler:Landroid/os/Handler;

.field private final mPreferenceGroup:Landroidx/preference/PreferenceGroup;

.field private final mPreferenceResourceDescriptors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/preference/x;",
            ">;"
        }
    .end annotation
.end field

.field private mPreferences:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/preference/Preference;",
            ">;"
        }
    .end annotation
.end field

.field private final mSyncRunnable:Ljava/lang/Runnable;

.field private mVisiblePreferences:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/preference/Preference;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/preference/PreferenceScreen;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/c1;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/preference/r;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {v0, v1, p0}, Landroidx/preference/r;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/preference/y;->mSyncRunnable:Ljava/lang/Runnable;

    .line 11
    .line 12
    iput-object p1, p0, Landroidx/preference/y;->mPreferenceGroup:Landroidx/preference/PreferenceGroup;

    .line 13
    .line 14
    new-instance v0, Landroid/os/Handler;

    .line 15
    .line 16
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/preference/y;->mHandler:Landroid/os/Handler;

    .line 24
    .line 25
    iput-object p0, p1, Landroidx/preference/Preference;->N:Landroidx/preference/y;

    .line 26
    .line 27
    new-instance v0, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Landroidx/preference/y;->mPreferences:Ljava/util/List;

    .line 33
    .line 34
    new-instance v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Landroidx/preference/y;->mVisiblePreferences:Ljava/util/List;

    .line 40
    .line 41
    new-instance v0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Landroidx/preference/y;->mPreferenceResourceDescriptors:Ljava/util/List;

    .line 47
    .line 48
    iget-boolean p1, p1, Landroidx/preference/PreferenceScreen;->c0:Z

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/c1;->setHasStableIds(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/preference/y;->updatePreferences()V

    .line 54
    .line 55
    .line 56
    return-void
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
.method public final a(Landroidx/preference/PreferenceGroup;)Ljava/util/ArrayList;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    new-instance v2, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v3, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v4, v1, Landroidx/preference/PreferenceGroup;->W:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    :goto_0
    const v8, 0x7fffffff

    .line 25
    .line 26
    .line 27
    if-ge v6, v4, :cond_a

    .line 28
    .line 29
    invoke-virtual {v1, v6}, Landroidx/preference/PreferenceGroup;->D(I)Landroidx/preference/Preference;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    iget-boolean v10, v9, Landroidx/preference/Preference;->D:Z

    .line 34
    .line 35
    if-nez v10, :cond_0

    .line 36
    .line 37
    goto :goto_7

    .line 38
    :cond_0
    iget v10, v1, Landroidx/preference/PreferenceGroup;->a0:I

    .line 39
    .line 40
    if-eq v10, v8, :cond_2

    .line 41
    .line 42
    if-ge v7, v10, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    :goto_1
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    :goto_2
    instance-of v10, v9, Landroidx/preference/PreferenceGroup;

    .line 53
    .line 54
    if-nez v10, :cond_3

    .line 55
    .line 56
    add-int/lit8 v7, v7, 0x1

    .line 57
    .line 58
    goto :goto_7

    .line 59
    :cond_3
    check-cast v9, Landroidx/preference/PreferenceGroup;

    .line 60
    .line 61
    instance-of v10, v9, Landroidx/preference/PreferenceScreen;

    .line 62
    .line 63
    if-eqz v10, :cond_4

    .line 64
    .line 65
    goto :goto_7

    .line 66
    :cond_4
    iget v10, v1, Landroidx/preference/PreferenceGroup;->a0:I

    .line 67
    .line 68
    if-eq v10, v8, :cond_6

    .line 69
    .line 70
    iget v10, v9, Landroidx/preference/PreferenceGroup;->a0:I

    .line 71
    .line 72
    if-ne v10, v8, :cond_5

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    const-string v2, "Nesting an expandable group inside of another expandable group is not supported!"

    .line 78
    .line 79
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :cond_6
    :goto_3
    invoke-virtual {v0, v9}, Landroidx/preference/y;->a(Landroidx/preference/PreferenceGroup;)Ljava/util/ArrayList;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    const/4 v11, 0x0

    .line 92
    :goto_4
    if-ge v11, v10, :cond_9

    .line 93
    .line 94
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v12

    .line 98
    add-int/lit8 v11, v11, 0x1

    .line 99
    .line 100
    check-cast v12, Landroidx/preference/Preference;

    .line 101
    .line 102
    iget v13, v1, Landroidx/preference/PreferenceGroup;->a0:I

    .line 103
    .line 104
    if-eq v13, v8, :cond_8

    .line 105
    .line 106
    if-ge v7, v13, :cond_7

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_7
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_6

    .line 113
    :cond_8
    :goto_5
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    :goto_6
    add-int/lit8 v7, v7, 0x1

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_9
    :goto_7
    add-int/lit8 v6, v6, 0x1

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_a
    iget v4, v1, Landroidx/preference/PreferenceGroup;->a0:I

    .line 123
    .line 124
    if-eq v4, v8, :cond_13

    .line 125
    .line 126
    if-le v7, v4, :cond_13

    .line 127
    .line 128
    new-instance v4, Landroidx/preference/e;

    .line 129
    .line 130
    iget-object v6, v1, Landroidx/preference/Preference;->h:Landroid/content/Context;

    .line 131
    .line 132
    iget-wide v7, v1, Landroidx/preference/Preference;->j:J

    .line 133
    .line 134
    invoke-direct {v4, v6}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;)V

    .line 135
    .line 136
    .line 137
    sget v6, Landroidx/preference/h0;->expand_button:I

    .line 138
    .line 139
    iput v6, v4, Landroidx/preference/Preference;->L:I

    .line 140
    .line 141
    sget v6, Landroidx/preference/f0;->ic_arrow_down_24dp:I

    .line 142
    .line 143
    iget-object v9, v4, Landroidx/preference/Preference;->h:Landroid/content/Context;

    .line 144
    .line 145
    invoke-static {v9, v6}, La/a;->D(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    iget-object v11, v4, Landroidx/preference/Preference;->r:Landroid/graphics/drawable/Drawable;

    .line 150
    .line 151
    if-eq v11, v10, :cond_b

    .line 152
    .line 153
    iput-object v10, v4, Landroidx/preference/Preference;->r:Landroid/graphics/drawable/Drawable;

    .line 154
    .line 155
    iput v5, v4, Landroidx/preference/Preference;->q:I

    .line 156
    .line 157
    invoke-virtual {v4}, Landroidx/preference/Preference;->k()V

    .line 158
    .line 159
    .line 160
    :cond_b
    iput v6, v4, Landroidx/preference/Preference;->q:I

    .line 161
    .line 162
    sget v6, Landroidx/preference/i0;->expand_button_title:I

    .line 163
    .line 164
    invoke-virtual {v9, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    iget-object v10, v4, Landroidx/preference/Preference;->o:Ljava/lang/CharSequence;

    .line 169
    .line 170
    invoke-static {v6, v10}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    if-nez v10, :cond_c

    .line 175
    .line 176
    iput-object v6, v4, Landroidx/preference/Preference;->o:Ljava/lang/CharSequence;

    .line 177
    .line 178
    invoke-virtual {v4}, Landroidx/preference/Preference;->k()V

    .line 179
    .line 180
    .line 181
    :cond_c
    iget v6, v4, Landroidx/preference/Preference;->n:I

    .line 182
    .line 183
    const/16 v10, 0x3e7

    .line 184
    .line 185
    if-eq v10, v6, :cond_d

    .line 186
    .line 187
    iput v10, v4, Landroidx/preference/Preference;->n:I

    .line 188
    .line 189
    iget-object v6, v4, Landroidx/preference/Preference;->N:Landroidx/preference/y;

    .line 190
    .line 191
    if-eqz v6, :cond_d

    .line 192
    .line 193
    invoke-virtual {v6, v4}, Landroidx/preference/y;->onPreferenceHierarchyChange(Landroidx/preference/Preference;)V

    .line 194
    .line 195
    .line 196
    :cond_d
    new-instance v6, Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    const/4 v11, 0x0

    .line 206
    const/4 v12, 0x0

    .line 207
    :goto_8
    if-ge v12, v10, :cond_12

    .line 208
    .line 209
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v13

    .line 213
    add-int/lit8 v12, v12, 0x1

    .line 214
    .line 215
    check-cast v13, Landroidx/preference/Preference;

    .line 216
    .line 217
    iget-object v14, v13, Landroidx/preference/Preference;->o:Ljava/lang/CharSequence;

    .line 218
    .line 219
    instance-of v15, v13, Landroidx/preference/PreferenceGroup;

    .line 220
    .line 221
    if-eqz v15, :cond_e

    .line 222
    .line 223
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 224
    .line 225
    .line 226
    move-result v16

    .line 227
    if-nez v16, :cond_e

    .line 228
    .line 229
    const/16 v16, 0x0

    .line 230
    .line 231
    move-object v5, v13

    .line 232
    check-cast v5, Landroidx/preference/PreferenceGroup;

    .line 233
    .line 234
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_e
    const/16 v16, 0x0

    .line 239
    .line 240
    :goto_9
    iget-object v5, v13, Landroidx/preference/Preference;->P:Landroidx/preference/PreferenceGroup;

    .line 241
    .line 242
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v5

    .line 246
    if-eqz v5, :cond_10

    .line 247
    .line 248
    if-eqz v15, :cond_f

    .line 249
    .line 250
    check-cast v13, Landroidx/preference/PreferenceGroup;

    .line 251
    .line 252
    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    :cond_f
    :goto_a
    const/4 v5, 0x0

    .line 256
    goto :goto_8

    .line 257
    :cond_10
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    if-nez v5, :cond_f

    .line 262
    .line 263
    if-nez v11, :cond_11

    .line 264
    .line 265
    move-object v11, v14

    .line 266
    goto :goto_a

    .line 267
    :cond_11
    sget v5, Landroidx/preference/i0;->summary_collapsed_preference_list:I

    .line 268
    .line 269
    const/4 v13, 0x2

    .line 270
    new-array v13, v13, [Ljava/lang/Object;

    .line 271
    .line 272
    aput-object v11, v13, v16

    .line 273
    .line 274
    const/4 v11, 0x1

    .line 275
    aput-object v14, v13, v11

    .line 276
    .line 277
    invoke-virtual {v9, v5, v13}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    move-object v11, v5

    .line 282
    goto :goto_a

    .line 283
    :cond_12
    const/16 v16, 0x0

    .line 284
    .line 285
    invoke-virtual {v4, v11}, Landroidx/preference/Preference;->y(Ljava/lang/CharSequence;)V

    .line 286
    .line 287
    .line 288
    const-wide/32 v5, 0xf4240

    .line 289
    .line 290
    .line 291
    add-long/2addr v7, v5

    .line 292
    iput-wide v7, v4, Landroidx/preference/e;->U:J

    .line 293
    .line 294
    new-instance v3, Lu2/c;

    .line 295
    .line 296
    const/4 v5, 0x0

    .line 297
    invoke-direct {v3, v0, v1, v5}, Lu2/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 298
    .line 299
    .line 300
    iput-object v3, v4, Landroidx/preference/Preference;->m:Landroidx/preference/n;

    .line 301
    .line 302
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    :cond_13
    return-object v2
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

.method public final b(Ljava/util/ArrayList;Landroidx/preference/PreferenceGroup;)V
    .locals 5

    .line 1
    monitor-enter p2

    .line 2
    :try_start_0
    iget-object v0, p2, Landroidx/preference/PreferenceGroup;->W:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 5
    .line 6
    .line 7
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    iget-object v0, p2, Landroidx/preference/PreferenceGroup;->W:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p2, v1}, Landroidx/preference/PreferenceGroup;->D(I)Landroidx/preference/Preference;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    new-instance v3, Landroidx/preference/x;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Landroidx/preference/x;-><init>(Landroidx/preference/Preference;)V

    .line 27
    .line 28
    .line 29
    iget-object v4, p0, Landroidx/preference/y;->mPreferenceResourceDescriptors:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_0

    .line 36
    .line 37
    iget-object v4, p0, Landroidx/preference/y;->mPreferenceResourceDescriptors:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :cond_0
    instance-of v3, v2, Landroidx/preference/PreferenceGroup;

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    move-object v3, v2

    .line 47
    check-cast v3, Landroidx/preference/PreferenceGroup;

    .line 48
    .line 49
    instance-of v4, v3, Landroidx/preference/PreferenceScreen;

    .line 50
    .line 51
    if-nez v4, :cond_1

    .line 52
    .line 53
    invoke-virtual {p0, p1, v3}, Landroidx/preference/y;->b(Ljava/util/ArrayList;Landroidx/preference/PreferenceGroup;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    iput-object p0, v2, Landroidx/preference/Preference;->N:Landroidx/preference/y;

    .line 57
    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return-void

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    throw p1
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public getItem(I)Landroidx/preference/Preference;
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/preference/y;->getItemCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lt p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/preference/y;->mVisiblePreferences:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Landroidx/preference/Preference;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 20
    return-object p1
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

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/preference/y;->mVisiblePreferences:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

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

.method public getItemId(I)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->hasStableIds()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide/16 v0, -0x1

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/preference/y;->getItem(I)Landroidx/preference/Preference;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Landroidx/preference/Preference;->g()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    return-wide v0
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

.method public getItemViewType(I)I
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/preference/y;->getItem(I)Landroidx/preference/Preference;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Landroidx/preference/x;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Landroidx/preference/x;-><init>(Landroidx/preference/Preference;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Landroidx/preference/y;->mPreferenceResourceDescriptors:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {p1, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v1, -0x1

    .line 17
    if-eq p1, v1, :cond_0

    .line 18
    .line 19
    return p1

    .line 20
    :cond_0
    iget-object p1, p0, Landroidx/preference/y;->mPreferenceResourceDescriptors:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iget-object v1, p0, Landroidx/preference/y;->mPreferenceResourceDescriptors:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    return p1
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public getPreferenceAdapterPosition(Landroidx/preference/Preference;)I
    .locals 3

    .line 5
    iget-object v0, p0, Landroidx/preference/y;->mVisiblePreferences:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    iget-object v2, p0, Landroidx/preference/y;->mVisiblePreferences:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/preference/Preference;

    if-eqz v2, :cond_0

    .line 7
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public getPreferenceAdapterPosition(Ljava/lang/String;)I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/preference/y;->mVisiblePreferences:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 2
    iget-object v2, p0, Landroidx/preference/y;->mVisiblePreferences:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/preference/Preference;

    .line 3
    iget-object v2, v2, Landroidx/preference/Preference;->s:Ljava/lang/String;

    .line 4
    invoke-static {p1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public onBindViewHolder(Landroidx/preference/d0;I)V
    .locals 4

    .line 2
    invoke-virtual {p0, p2}, Landroidx/preference/y;->getItem(I)Landroidx/preference/Preference;

    move-result-object p2

    .line 3
    iget-object v0, p1, Landroidx/preference/d0;->b:Landroid/content/res/ColorStateList;

    .line 4
    iget-object v1, p1, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p1, Landroidx/preference/d0;->a:Landroid/graphics/drawable/Drawable;

    if-eq v1, v2, :cond_0

    .line 5
    iget-object v1, p1, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    sget-object v3, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 6
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    const v1, 0x1020016

    .line 7
    invoke-virtual {p1, v1}, Landroidx/preference/d0;->a(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 8
    invoke-virtual {v1}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 9
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 10
    :cond_1
    invoke-virtual {p2, p1}, Landroidx/preference/Preference;->o(Landroidx/preference/d0;)V

    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/i2;I)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/preference/d0;

    invoke-virtual {p0, p1, p2}, Landroidx/preference/y;->onBindViewHolder(Landroidx/preference/d0;I)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/preference/d0;
    .locals 4

    .line 2
    iget-object v0, p0, Landroidx/preference/y;->mPreferenceResourceDescriptors:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/preference/x;

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    sget-object v3, Landroidx/preference/k0;->BackgroundStyle:[I

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 5
    sget v2, Landroidx/preference/k0;->BackgroundStyle_android_selectableItemBackground:I

    .line 6
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_0

    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x1080062

    invoke-static {v2, v3}, La/a;->D(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 8
    :cond_0
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 9
    iget v1, p2, Landroidx/preference/x;->a:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_1

    .line 11
    sget-object v1, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 12
    invoke-virtual {p1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    const v1, 0x1020018

    .line 13
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_3

    .line 14
    iget p2, p2, Landroidx/preference/x;->b:I

    if-eqz p2, :cond_2

    .line 15
    invoke-virtual {v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    goto :goto_0

    :cond_2
    const/16 p2, 0x8

    .line 16
    invoke-virtual {v1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 17
    :cond_3
    :goto_0
    new-instance p2, Landroidx/preference/d0;

    invoke-direct {p2, p1}, Landroidx/preference/d0;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/i2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/preference/y;->onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/preference/d0;

    move-result-object p1

    return-object p1
.end method

.method public onPreferenceChange(Landroidx/preference/Preference;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/preference/y;->mVisiblePreferences:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/c1;->notifyItemChanged(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :cond_0
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

.method public onPreferenceHierarchyChange(Landroidx/preference/Preference;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/preference/y;->mHandler:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/preference/y;->mSyncRunnable:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Landroidx/preference/y;->mHandler:Landroid/os/Handler;

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/preference/y;->mSyncRunnable:Ljava/lang/Runnable;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

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

.method public onPreferenceVisibilityChange(Landroidx/preference/Preference;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/preference/y;->onPreferenceHierarchyChange(Landroidx/preference/Preference;)V

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

.method public updatePreferences()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/preference/y;->mPreferences:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroidx/preference/Preference;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    iput-object v2, v1, Landroidx/preference/Preference;->N:Landroidx/preference/y;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Landroidx/preference/y;->mPreferences:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Landroidx/preference/y;->mPreferences:Ljava/util/List;

    .line 35
    .line 36
    iget-object v0, p0, Landroidx/preference/y;->mPreferenceGroup:Landroidx/preference/PreferenceGroup;

    .line 37
    .line 38
    invoke-virtual {p0, v1, v0}, Landroidx/preference/y;->b(Ljava/util/ArrayList;Landroidx/preference/PreferenceGroup;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Landroidx/preference/y;->mPreferenceGroup:Landroidx/preference/PreferenceGroup;

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Landroidx/preference/y;->a(Landroidx/preference/PreferenceGroup;)Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Landroidx/preference/y;->mVisiblePreferences:Ljava/util/List;

    .line 48
    .line 49
    iget-object v0, p0, Landroidx/preference/y;->mPreferenceGroup:Landroidx/preference/PreferenceGroup;

    .line 50
    .line 51
    iget-object v0, v0, Landroidx/preference/Preference;->i:Landroidx/preference/a0;

    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Landroidx/preference/y;->mPreferences:Ljava/util/List;

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Landroidx/preference/Preference;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    return-void
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

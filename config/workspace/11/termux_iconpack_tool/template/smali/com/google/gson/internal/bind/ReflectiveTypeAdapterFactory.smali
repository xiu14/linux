.class public final Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/google/gson/TypeAdapterFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$RecordAdapter;,
        Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldReflectionAdapter;,
        Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;,
        Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;,
        Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;
    }
.end annotation


# instance fields
.field public final h:Lcom/google/gson/internal/ConstructorConstructor;

.field public final i:Lcom/google/gson/FieldNamingStrategy;

.field public final j:Lcom/google/gson/internal/Excluder;

.field public final k:Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

.field public final l:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/google/gson/internal/ConstructorConstructor;Lcom/google/gson/FieldNamingStrategy;Lcom/google/gson/internal/Excluder;Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->h:Lcom/google/gson/internal/ConstructorConstructor;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->i:Lcom/google/gson/FieldNamingStrategy;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->j:Lcom/google/gson/internal/Excluder;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->k:Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->l:Ljava/util/List;

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

.method public static b(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V
    .locals 1

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Ljava/lang/reflect/Member;

    .line 3
    .line 4
    invoke-interface {v0}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    :cond_0
    invoke-static {p0, p1}, Lcom/google/gson/internal/ReflectionAccessFilterHelper;->a(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    const/4 p0, 0x1

    .line 23
    invoke-static {p1, p0}, Lcom/google/gson/internal/reflect/ReflectionHelper;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    new-instance p1, Lcom/google/gson/JsonIOException;

    .line 28
    .line 29
    const-string v0, " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."

    .line 30
    .line 31
    invoke-static {p0, v0}, Landroidx/appcompat/app/b;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1
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

.method public static c(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Class "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, " declares multiple JSON fields named \'"

    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p0, "\'; conflict is caused by fields "

    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-static {p2}, Lcom/google/gson/internal/reflect/ReflectionHelper;->c(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, " and "

    .line 38
    .line 39
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-static {p3}, Lcom/google/gson/internal/reflect/ReflectionHelper;->c(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p0, "\nSee "

    .line 50
    .line 51
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p0, "duplicate-fields"

    .line 55
    .line 56
    const-string p1, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 57
    .line 58
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0
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
.method public final a(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
    .locals 7

    .line 1
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    const-class v0, Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return-object p1

    .line 15
    :cond_0
    sget-object v0, Lcom/google/gson/internal/reflect/ReflectionHelper;->a:Lcom/google/gson/internal/reflect/ReflectionHelper$RecordHelper;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Class;->getModifiers()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Class;->isLocalClass()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    :cond_1
    new-instance p1, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;

    .line 40
    .line 41
    invoke-direct {p1}, Lcom/google/gson/TypeAdapter;-><init>()V

    .line 42
    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_2
    iget-object v0, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->l:Ljava/util/List;

    .line 46
    .line 47
    invoke-static {v3, v0}, Lcom/google/gson/internal/ReflectionAccessFilterHelper;->b(Ljava/lang/Class;Ljava/util/List;)Lcom/google/gson/ReflectionAccessFilter$FilterResult;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sget-object v1, Lcom/google/gson/ReflectionAccessFilter$FilterResult;->k:Lcom/google/gson/ReflectionAccessFilter$FilterResult;

    .line 52
    .line 53
    if-eq v0, v1, :cond_5

    .line 54
    .line 55
    sget-object v1, Lcom/google/gson/ReflectionAccessFilter$FilterResult;->j:Lcom/google/gson/ReflectionAccessFilter$FilterResult;

    .line 56
    .line 57
    const/4 v2, 0x1

    .line 58
    if-ne v0, v1, :cond_3

    .line 59
    .line 60
    const/4 v4, 0x1

    .line 61
    goto :goto_0

    .line 62
    :cond_3
    const/4 v0, 0x0

    .line 63
    const/4 v4, 0x0

    .line 64
    :goto_0
    invoke-static {v3}, Lcom/google/gson/internal/reflect/ReflectionHelper;->i(Ljava/lang/Class;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    new-instance v6, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$RecordAdapter;

    .line 71
    .line 72
    const/4 v5, 0x1

    .line 73
    move-object v0, p0

    .line 74
    move-object v1, p1

    .line 75
    move-object v2, p2

    .line 76
    invoke-virtual/range {v0 .. v5}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->d(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;Ljava/lang/Class;ZZ)Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-direct {v6, v3, p1, v4}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$RecordAdapter;-><init>(Ljava/lang/Class;Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;Z)V

    .line 81
    .line 82
    .line 83
    return-object v6

    .line 84
    :cond_4
    move-object v0, p0

    .line 85
    move-object v1, p1

    .line 86
    move-object v2, p2

    .line 87
    const/4 p1, 0x1

    .line 88
    iget-object p2, v0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->h:Lcom/google/gson/internal/ConstructorConstructor;

    .line 89
    .line 90
    invoke-virtual {p2, v2, p1}, Lcom/google/gson/internal/ConstructorConstructor;->b(Lcom/google/gson/reflect/TypeToken;Z)Lcom/google/gson/internal/ObjectConstructor;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    new-instance p2, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldReflectionAdapter;

    .line 95
    .line 96
    const/4 v5, 0x0

    .line 97
    invoke-virtual/range {v0 .. v5}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->d(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;Ljava/lang/Class;ZZ)Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-direct {p2, p1, v1}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldReflectionAdapter;-><init>(Lcom/google/gson/internal/ObjectConstructor;Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;)V

    .line 102
    .line 103
    .line 104
    return-object p2

    .line 105
    :cond_5
    new-instance p1, Lcom/google/gson/JsonIOException;

    .line 106
    .line 107
    new-instance p2, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string v0, "ReflectionAccessFilter does not permit using reflection for "

    .line 110
    .line 111
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v0, ". Register a TypeAdapter for this type or adjust the access filter."

    .line 118
    .line 119
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p1
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

.method public final d(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;Ljava/lang/Class;ZZ)Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p3

    .line 4
    .line 5
    invoke-virtual {v7}, Ljava/lang/Class;->isInterface()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v1, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;->c:Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    move-object/from16 v10, p2

    .line 25
    .line 26
    move/from16 v1, p4

    .line 27
    .line 28
    move-object v11, v7

    .line 29
    :goto_0
    const-class v2, Ljava/lang/Object;

    .line 30
    .line 31
    if-eq v11, v2, :cond_19

    .line 32
    .line 33
    invoke-virtual {v11}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 34
    .line 35
    .line 36
    move-result-object v12

    .line 37
    const/4 v13, 0x1

    .line 38
    const/4 v14, 0x0

    .line 39
    if-eq v11, v7, :cond_2

    .line 40
    .line 41
    array-length v2, v12

    .line 42
    if-lez v2, :cond_2

    .line 43
    .line 44
    iget-object v1, v0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->l:Ljava/util/List;

    .line 45
    .line 46
    invoke-static {v11, v1}, Lcom/google/gson/internal/ReflectionAccessFilterHelper;->b(Ljava/lang/Class;Ljava/util/List;)Lcom/google/gson/ReflectionAccessFilter$FilterResult;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    sget-object v2, Lcom/google/gson/ReflectionAccessFilter$FilterResult;->k:Lcom/google/gson/ReflectionAccessFilter$FilterResult;

    .line 51
    .line 52
    if-eq v1, v2, :cond_3

    .line 53
    .line 54
    sget-object v2, Lcom/google/gson/ReflectionAccessFilter$FilterResult;->j:Lcom/google/gson/ReflectionAccessFilter$FilterResult;

    .line 55
    .line 56
    if-ne v1, v2, :cond_1

    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const/4 v1, 0x0

    .line 61
    :cond_2
    :goto_1
    move/from16 v18, v1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    new-instance v1, Lcom/google/gson/JsonIOException;

    .line 65
    .line 66
    new-instance v2, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v3, "ReflectionAccessFilter does not permit using reflection for "

    .line 69
    .line 70
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v3, " (supertype of "

    .line 77
    .line 78
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v3, "). Register a TypeAdapter for this type or adjust the access filter."

    .line 85
    .line 86
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v1

    .line 97
    :goto_2
    array-length v15, v12

    .line 98
    const/4 v1, 0x0

    .line 99
    :goto_3
    if-ge v1, v15, :cond_18

    .line 100
    .line 101
    aget-object v2, v12, v1

    .line 102
    .line 103
    invoke-virtual {v0, v2, v13}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->e(Ljava/lang/reflect/Field;Z)Z

    .line 104
    .line 105
    .line 106
    move-result v24

    .line 107
    invoke-virtual {v0, v2, v14}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->e(Ljava/lang/reflect/Field;Z)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-nez v24, :cond_4

    .line 112
    .line 113
    if-nez v3, :cond_4

    .line 114
    .line 115
    move-object/from16 v3, p1

    .line 116
    .line 117
    move/from16 v27, v1

    .line 118
    .line 119
    move v2, v15

    .line 120
    const/16 p2, 0x1

    .line 121
    .line 122
    goto/16 :goto_10

    .line 123
    .line 124
    :cond_4
    const-class v4, Lcom/google/gson/annotations/SerializedName;

    .line 125
    .line 126
    const/16 v25, 0x0

    .line 127
    .line 128
    if-eqz p5, :cond_9

    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-eqz v5, :cond_5

    .line 139
    .line 140
    move-object/from16 v19, v25

    .line 141
    .line 142
    const/16 v26, 0x0

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_5
    invoke-static {v11, v2}, Lcom/google/gson/internal/reflect/ReflectionHelper;->e(Ljava/lang/Class;Ljava/lang/reflect/Field;)Ljava/lang/reflect/Method;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    if-nez v18, :cond_6

    .line 150
    .line 151
    invoke-static {v5}, Lcom/google/gson/internal/reflect/ReflectionHelper;->j(Ljava/lang/reflect/AccessibleObject;)V

    .line 152
    .line 153
    .line 154
    :cond_6
    invoke-virtual {v5, v4}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    if-eqz v6, :cond_8

    .line 159
    .line 160
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    if-eqz v6, :cond_7

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_7
    invoke-static {v5, v14}, Lcom/google/gson/internal/reflect/ReflectionHelper;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    new-instance v2, Lcom/google/gson/JsonIOException;

    .line 172
    .line 173
    const-string v3, "@SerializedName on "

    .line 174
    .line 175
    const-string v4, " is not supported"

    .line 176
    .line 177
    invoke-static {v3, v1, v4}, Landroidx/appcompat/app/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v2

    .line 185
    :cond_8
    :goto_4
    move/from16 v26, v3

    .line 186
    .line 187
    move-object/from16 v19, v5

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_9
    move/from16 v26, v3

    .line 191
    .line 192
    move-object/from16 v19, v25

    .line 193
    .line 194
    :goto_5
    if-nez v18, :cond_a

    .line 195
    .line 196
    if-nez v19, :cond_a

    .line 197
    .line 198
    invoke-static {v2}, Lcom/google/gson/internal/reflect/ReflectionHelper;->j(Ljava/lang/reflect/AccessibleObject;)V

    .line 199
    .line 200
    .line 201
    :cond_a
    invoke-virtual {v10}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    new-instance v6, Ljava/util/HashMap;

    .line 210
    .line 211
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-static {v3, v11, v5, v6}, Lcom/google/gson/internal/GsonTypes;->h(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    check-cast v4, Lcom/google/gson/annotations/SerializedName;

    .line 223
    .line 224
    if-nez v4, :cond_b

    .line 225
    .line 226
    iget-object v4, v0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->i:Lcom/google/gson/FieldNamingStrategy;

    .line 227
    .line 228
    invoke-interface {v4, v2}, Lcom/google/gson/FieldNamingStrategy;->a(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    invoke-interface {v4}, Lcom/google/gson/FieldNamingStrategy;->e()V

    .line 233
    .line 234
    .line 235
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_b
    invoke-interface {v4}, Lcom/google/gson/annotations/SerializedName;->value()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    invoke-interface {v4}, Lcom/google/gson/annotations/SerializedName;->alternate()[Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    :goto_6
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    if-eqz v6, :cond_c

    .line 255
    .line 256
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    move-object v13, v4

    .line 261
    const/16 p2, 0x1

    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_c
    new-instance v6, Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 267
    .line 268
    .line 269
    move-result v16

    .line 270
    const/16 p2, 0x1

    .line 271
    .line 272
    add-int/lit8 v13, v16, 0x1

    .line 273
    .line 274
    invoke-direct {v6, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 281
    .line 282
    .line 283
    move-object v13, v6

    .line 284
    :goto_7
    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    move-object/from16 v16, v4

    .line 289
    .line 290
    check-cast v16, Ljava/lang/String;

    .line 291
    .line 292
    invoke-static {v3}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    invoke-virtual {v4}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    if-eqz v3, :cond_d

    .line 301
    .line 302
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    if-eqz v3, :cond_d

    .line 307
    .line 308
    const/16 v22, 0x1

    .line 309
    .line 310
    goto :goto_8

    .line 311
    :cond_d
    const/16 v22, 0x0

    .line 312
    .line 313
    :goto_8
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    if-eqz v5, :cond_e

    .line 322
    .line 323
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    if-eqz v3, :cond_e

    .line 328
    .line 329
    const/16 v23, 0x1

    .line 330
    .line 331
    goto :goto_9

    .line 332
    :cond_e
    const/16 v23, 0x0

    .line 333
    .line 334
    :goto_9
    const-class v3, Lcom/google/gson/annotations/JsonAdapter;

    .line 335
    .line 336
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    move-object v5, v3

    .line 341
    check-cast v5, Lcom/google/gson/annotations/JsonAdapter;

    .line 342
    .line 343
    if-eqz v5, :cond_f

    .line 344
    .line 345
    move-object/from16 v17, v2

    .line 346
    .line 347
    iget-object v2, v0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->h:Lcom/google/gson/internal/ConstructorConstructor;

    .line 348
    .line 349
    const/4 v6, 0x0

    .line 350
    move v3, v1

    .line 351
    iget-object v1, v0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->k:Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

    .line 352
    .line 353
    move/from16 v27, v3

    .line 354
    .line 355
    move-object/from16 v3, p1

    .line 356
    .line 357
    invoke-virtual/range {v1 .. v6}, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->b(Lcom/google/gson/internal/ConstructorConstructor;Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;Lcom/google/gson/annotations/JsonAdapter;Z)Lcom/google/gson/TypeAdapter;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    goto :goto_a

    .line 362
    :cond_f
    move-object/from16 v3, p1

    .line 363
    .line 364
    move/from16 v27, v1

    .line 365
    .line 366
    move-object/from16 v17, v2

    .line 367
    .line 368
    move-object/from16 v1, v25

    .line 369
    .line 370
    :goto_a
    if-eqz v1, :cond_10

    .line 371
    .line 372
    const/4 v2, 0x1

    .line 373
    goto :goto_b

    .line 374
    :cond_10
    const/4 v2, 0x0

    .line 375
    :goto_b
    if-nez v1, :cond_11

    .line 376
    .line 377
    invoke-virtual {v3, v4}, Lcom/google/gson/Gson;->c(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    :cond_11
    if-eqz v24, :cond_13

    .line 382
    .line 383
    if-eqz v2, :cond_12

    .line 384
    .line 385
    move-object v2, v1

    .line 386
    goto :goto_c

    .line 387
    :cond_12
    new-instance v2, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;

    .line 388
    .line 389
    invoke-virtual {v4}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    invoke-direct {v2, v3, v1, v4}, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;-><init>(Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;Ljava/lang/reflect/Type;)V

    .line 394
    .line 395
    .line 396
    :goto_c
    move-object/from16 v20, v2

    .line 397
    .line 398
    :goto_d
    move v2, v15

    .line 399
    goto :goto_e

    .line 400
    :cond_13
    move-object/from16 v20, v1

    .line 401
    .line 402
    goto :goto_d

    .line 403
    :goto_e
    new-instance v15, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$2;

    .line 404
    .line 405
    move-object/from16 v21, v1

    .line 406
    .line 407
    invoke-direct/range {v15 .. v23}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$2;-><init>(Ljava/lang/String;Ljava/lang/reflect/Field;ZLjava/lang/reflect/Method;Lcom/google/gson/TypeAdapter;Lcom/google/gson/TypeAdapter;ZZ)V

    .line 408
    .line 409
    .line 410
    move-object/from16 v4, v16

    .line 411
    .line 412
    move-object/from16 v1, v17

    .line 413
    .line 414
    if-eqz v26, :cond_15

    .line 415
    .line 416
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 417
    .line 418
    .line 419
    move-result-object v5

    .line 420
    :goto_f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 421
    .line 422
    .line 423
    move-result v6

    .line 424
    if-eqz v6, :cond_15

    .line 425
    .line 426
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v6

    .line 430
    check-cast v6, Ljava/lang/String;

    .line 431
    .line 432
    invoke-interface {v8, v6, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v13

    .line 436
    check-cast v13, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;

    .line 437
    .line 438
    if-nez v13, :cond_14

    .line 439
    .line 440
    goto :goto_f

    .line 441
    :cond_14
    iget-object v2, v13, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;->b:Ljava/lang/reflect/Field;

    .line 442
    .line 443
    invoke-static {v7, v6, v2, v1}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->c(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 444
    .line 445
    .line 446
    throw v25

    .line 447
    :cond_15
    if-eqz v24, :cond_17

    .line 448
    .line 449
    invoke-interface {v9, v4, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v5

    .line 453
    check-cast v5, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;

    .line 454
    .line 455
    if-nez v5, :cond_16

    .line 456
    .line 457
    goto :goto_10

    .line 458
    :cond_16
    iget-object v2, v5, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;->b:Ljava/lang/reflect/Field;

    .line 459
    .line 460
    invoke-static {v7, v4, v2, v1}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->c(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 461
    .line 462
    .line 463
    throw v25

    .line 464
    :cond_17
    :goto_10
    add-int/lit8 v1, v27, 0x1

    .line 465
    .line 466
    move v15, v2

    .line 467
    const/4 v13, 0x1

    .line 468
    goto/16 :goto_3

    .line 469
    .line 470
    :cond_18
    move-object/from16 v3, p1

    .line 471
    .line 472
    invoke-virtual {v10}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    invoke-virtual {v11}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    new-instance v4, Ljava/util/HashMap;

    .line 481
    .line 482
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 483
    .line 484
    .line 485
    invoke-static {v1, v11, v2, v4}, Lcom/google/gson/internal/GsonTypes;->h(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    invoke-static {v1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 490
    .line 491
    .line 492
    move-result-object v10

    .line 493
    invoke-virtual {v10}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    move-result-object v11

    .line 497
    move/from16 v1, v18

    .line 498
    .line 499
    goto/16 :goto_0

    .line 500
    .line 501
    :cond_19
    new-instance v1, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;

    .line 502
    .line 503
    new-instance v2, Ljava/util/ArrayList;

    .line 504
    .line 505
    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 506
    .line 507
    .line 508
    move-result-object v3

    .line 509
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 510
    .line 511
    .line 512
    invoke-direct {v1, v2, v8}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;-><init>(Ljava/util/List;Ljava/util/Map;)V

    .line 513
    .line 514
    .line 515
    return-object v1
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

.method public final e(Ljava/lang/reflect/Field;Z)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->j:Lcom/google/gson/internal/Excluder;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x88

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    and-int/2addr v1, v2

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    :goto_0
    const/4 p1, 0x1

    .line 17
    goto :goto_2

    .line 18
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->isSynthetic()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1, p2}, Lcom/google/gson/internal/Excluder;->c(Ljava/lang/Class;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    if-eqz p2, :cond_3

    .line 37
    .line 38
    iget-object p2, v0, Lcom/google/gson/internal/Excluder;->h:Ljava/util/List;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    iget-object p2, v0, Lcom/google/gson/internal/Excluder;->i:Ljava/util/List;

    .line 42
    .line 43
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_5

    .line 48
    .line 49
    new-instance v0, Lcom/google/gson/FieldAttributes;

    .line 50
    .line 51
    invoke-direct {v0, p1}, Lcom/google/gson/FieldAttributes;-><init>(Ljava/lang/reflect/Field;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eqz p2, :cond_5

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    check-cast p2, Lcom/google/gson/ExclusionStrategy;

    .line 69
    .line 70
    invoke-interface {p2}, Lcom/google/gson/ExclusionStrategy;->b()Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-eqz p2, :cond_4

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_5
    const/4 p1, 0x0

    .line 78
    :goto_2
    xor-int/2addr p1, v2

    .line 79
    return p1
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

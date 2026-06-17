.class public final Landroidx/appcompat/widget/n;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/n;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ls0/k;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, v0, Ls0/k;->h:I

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    new-instance v0, Landroidx/versionedparcelable/ParcelImpl;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 38
    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    :goto_0
    if-ge v3, v1, :cond_0

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-static {v4}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-static {v5}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    add-int/lit8 v3, v3, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    new-instance p1, Lh3/b;

    .line 64
    .line 65
    invoke-direct {p1, v0, v2}, Lh3/b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 66
    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_2
    new-instance v0, Le2/k;

    .line 70
    .line 71
    invoke-direct {v0, p1}, Le2/k;-><init>(Landroid/os/Parcel;)V

    .line 72
    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_3
    const-string v0, "inParcel"

    .line 76
    .line 77
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    new-instance v0, Ld/j;

    .line 81
    .line 82
    const-class v1, Landroid/content/IntentSender;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    check-cast v1, Landroid/content/IntentSender;

    .line 96
    .line 97
    const-class v2, Landroid/content/Intent;

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, Landroid/content/Intent;

    .line 108
    .line 109
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    invoke-direct {v0, v1, v2, v3, p1}, Ld/j;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 118
    .line 119
    .line 120
    return-object v0

    .line 121
    :pswitch_4
    const-string v0, "parcel"

    .line 122
    .line 123
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    new-instance v0, Ld/a;

    .line 127
    .line 128
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-nez v2, :cond_1

    .line 137
    .line 138
    const/4 p1, 0x0

    .line 139
    goto :goto_1

    .line 140
    :cond_1
    sget-object v2, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 141
    .line 142
    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    check-cast p1, Landroid/content/Intent;

    .line 147
    .line 148
    :goto_1
    invoke-direct {v0, p1, v1}, Ld/a;-><init>(Landroid/content/Intent;I)V

    .line 149
    .line 150
    .line 151
    return-object v0

    .line 152
    :pswitch_5
    new-instance v0, Landroidx/recyclerview/widget/q2;

    .line 153
    .line 154
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    iput v1, v0, Landroidx/recyclerview/widget/q2;->h:I

    .line 162
    .line 163
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    iput v1, v0, Landroidx/recyclerview/widget/q2;->i:I

    .line 168
    .line 169
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    iput v1, v0, Landroidx/recyclerview/widget/q2;->j:I

    .line 174
    .line 175
    if-lez v1, :cond_2

    .line 176
    .line 177
    new-array v1, v1, [I

    .line 178
    .line 179
    iput-object v1, v0, Landroidx/recyclerview/widget/q2;->k:[I

    .line 180
    .line 181
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 182
    .line 183
    .line 184
    :cond_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    iput v1, v0, Landroidx/recyclerview/widget/q2;->l:I

    .line 189
    .line 190
    if-lez v1, :cond_3

    .line 191
    .line 192
    new-array v1, v1, [I

    .line 193
    .line 194
    iput-object v1, v0, Landroidx/recyclerview/widget/q2;->m:[I

    .line 195
    .line 196
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 197
    .line 198
    .line 199
    :cond_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    const/4 v2, 0x0

    .line 204
    const/4 v3, 0x1

    .line 205
    if-ne v1, v3, :cond_4

    .line 206
    .line 207
    const/4 v1, 0x1

    .line 208
    goto :goto_2

    .line 209
    :cond_4
    const/4 v1, 0x0

    .line 210
    :goto_2
    iput-boolean v1, v0, Landroidx/recyclerview/widget/q2;->o:Z

    .line 211
    .line 212
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-ne v1, v3, :cond_5

    .line 217
    .line 218
    const/4 v1, 0x1

    .line 219
    goto :goto_3

    .line 220
    :cond_5
    const/4 v1, 0x0

    .line 221
    :goto_3
    iput-boolean v1, v0, Landroidx/recyclerview/widget/q2;->p:Z

    .line 222
    .line 223
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    if-ne v1, v3, :cond_6

    .line 228
    .line 229
    const/4 v2, 0x1

    .line 230
    :cond_6
    iput-boolean v2, v0, Landroidx/recyclerview/widget/q2;->q:Z

    .line 231
    .line 232
    const-class v1, Landroidx/recyclerview/widget/p2;

    .line 233
    .line 234
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    iput-object p1, v0, Landroidx/recyclerview/widget/q2;->n:Ljava/util/ArrayList;

    .line 243
    .line 244
    return-object v0

    .line 245
    :pswitch_6
    new-instance v0, Landroidx/recyclerview/widget/p2;

    .line 246
    .line 247
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    iput v1, v0, Landroidx/recyclerview/widget/p2;->h:I

    .line 255
    .line 256
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    iput v1, v0, Landroidx/recyclerview/widget/p2;->i:I

    .line 261
    .line 262
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    const/4 v2, 0x1

    .line 267
    if-ne v1, v2, :cond_7

    .line 268
    .line 269
    goto :goto_4

    .line 270
    :cond_7
    const/4 v2, 0x0

    .line 271
    :goto_4
    iput-boolean v2, v0, Landroidx/recyclerview/widget/p2;->k:Z

    .line 272
    .line 273
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    if-lez v1, :cond_8

    .line 278
    .line 279
    new-array v1, v1, [I

    .line 280
    .line 281
    iput-object v1, v0, Landroidx/recyclerview/widget/p2;->j:[I

    .line 282
    .line 283
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 284
    .line 285
    .line 286
    :cond_8
    return-object v0

    .line 287
    :pswitch_7
    new-instance v0, Landroidx/recyclerview/widget/p0;

    .line 288
    .line 289
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    iput v1, v0, Landroidx/recyclerview/widget/p0;->h:I

    .line 297
    .line 298
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    iput v1, v0, Landroidx/recyclerview/widget/p0;->i:I

    .line 303
    .line 304
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 305
    .line 306
    .line 307
    move-result p1

    .line 308
    const/4 v1, 0x1

    .line 309
    if-ne p1, v1, :cond_9

    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_9
    const/4 v1, 0x0

    .line 313
    :goto_5
    iput-boolean v1, v0, Landroidx/recyclerview/widget/p0;->j:Z

    .line 314
    .line 315
    return-object v0

    .line 316
    :pswitch_8
    new-instance v0, Landroidx/preference/o0;

    .line 317
    .line 318
    invoke-direct {v0, p1}, Landroidx/preference/o0;-><init>(Landroid/os/Parcel;)V

    .line 319
    .line 320
    .line 321
    return-object v0

    .line 322
    :pswitch_9
    new-instance v0, Landroidx/preference/n0;

    .line 323
    .line 324
    invoke-direct {v0, p1}, Landroidx/preference/n0;-><init>(Landroid/os/Parcel;)V

    .line 325
    .line 326
    .line 327
    return-object v0

    .line 328
    :pswitch_a
    new-instance v0, Landroidx/preference/w;

    .line 329
    .line 330
    invoke-direct {v0, p1}, Landroidx/preference/w;-><init>(Landroid/os/Parcel;)V

    .line 331
    .line 332
    .line 333
    return-object v0

    .line 334
    :pswitch_b
    new-instance v0, Landroidx/preference/m;

    .line 335
    .line 336
    invoke-direct {v0, p1}, Landroidx/preference/m;-><init>(Landroid/os/Parcel;)V

    .line 337
    .line 338
    .line 339
    return-object v0

    .line 340
    :pswitch_c
    new-instance v0, Landroidx/preference/i;

    .line 341
    .line 342
    invoke-direct {v0, p1}, Landroidx/preference/i;-><init>(Landroid/os/Parcel;)V

    .line 343
    .line 344
    .line 345
    return-object v0

    .line 346
    :pswitch_d
    new-instance v0, Landroidx/preference/f;

    .line 347
    .line 348
    invoke-direct {v0, p1}, Landroidx/preference/f;-><init>(Landroid/os/Parcel;)V

    .line 349
    .line 350
    .line 351
    return-object v0

    .line 352
    :pswitch_e
    new-instance v0, Landroidx/preference/c;

    .line 353
    .line 354
    invoke-direct {v0, p1}, Landroidx/preference/c;-><init>(Landroid/os/Parcel;)V

    .line 355
    .line 356
    .line 357
    return-object v0

    .line 358
    :pswitch_f
    new-instance v0, Landroidx/fragment/app/p1;

    .line 359
    .line 360
    invoke-direct {v0, p1}, Landroidx/fragment/app/p1;-><init>(Landroid/os/Parcel;)V

    .line 361
    .line 362
    .line 363
    return-object v0

    .line 364
    :pswitch_10
    new-instance v0, Landroidx/fragment/app/l1;

    .line 365
    .line 366
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 367
    .line 368
    .line 369
    const/4 v1, 0x0

    .line 370
    iput-object v1, v0, Landroidx/fragment/app/l1;->l:Ljava/lang/String;

    .line 371
    .line 372
    new-instance v1, Ljava/util/ArrayList;

    .line 373
    .line 374
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 375
    .line 376
    .line 377
    iput-object v1, v0, Landroidx/fragment/app/l1;->m:Ljava/util/ArrayList;

    .line 378
    .line 379
    new-instance v1, Ljava/util/ArrayList;

    .line 380
    .line 381
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 382
    .line 383
    .line 384
    iput-object v1, v0, Landroidx/fragment/app/l1;->n:Ljava/util/ArrayList;

    .line 385
    .line 386
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    iput-object v1, v0, Landroidx/fragment/app/l1;->h:Ljava/util/ArrayList;

    .line 391
    .line 392
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    iput-object v1, v0, Landroidx/fragment/app/l1;->i:Ljava/util/ArrayList;

    .line 397
    .line 398
    sget-object v1, Landroidx/fragment/app/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 399
    .line 400
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    check-cast v1, [Landroidx/fragment/app/b;

    .line 405
    .line 406
    iput-object v1, v0, Landroidx/fragment/app/l1;->j:[Landroidx/fragment/app/b;

    .line 407
    .line 408
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    iput v1, v0, Landroidx/fragment/app/l1;->k:I

    .line 413
    .line 414
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    iput-object v1, v0, Landroidx/fragment/app/l1;->l:Ljava/lang/String;

    .line 419
    .line 420
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    iput-object v1, v0, Landroidx/fragment/app/l1;->m:Ljava/util/ArrayList;

    .line 425
    .line 426
    sget-object v1, Landroidx/fragment/app/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 427
    .line 428
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    iput-object v1, v0, Landroidx/fragment/app/l1;->n:Ljava/util/ArrayList;

    .line 433
    .line 434
    sget-object v1, Landroidx/fragment/app/f1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 435
    .line 436
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 437
    .line 438
    .line 439
    move-result-object p1

    .line 440
    iput-object p1, v0, Landroidx/fragment/app/l1;->o:Ljava/util/ArrayList;

    .line 441
    .line 442
    return-object v0

    .line 443
    :pswitch_11
    new-instance v0, Landroidx/fragment/app/f1;

    .line 444
    .line 445
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 446
    .line 447
    .line 448
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    iput-object v1, v0, Landroidx/fragment/app/f1;->h:Ljava/lang/String;

    .line 453
    .line 454
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 455
    .line 456
    .line 457
    move-result p1

    .line 458
    iput p1, v0, Landroidx/fragment/app/f1;->i:I

    .line 459
    .line 460
    return-object v0

    .line 461
    :pswitch_12
    new-instance v0, Landroidx/fragment/app/c;

    .line 462
    .line 463
    invoke-direct {v0, p1}, Landroidx/fragment/app/c;-><init>(Landroid/os/Parcel;)V

    .line 464
    .line 465
    .line 466
    return-object v0

    .line 467
    :pswitch_13
    new-instance v0, Landroidx/fragment/app/b;

    .line 468
    .line 469
    invoke-direct {v0, p1}, Landroidx/fragment/app/b;-><init>(Landroid/os/Parcel;)V

    .line 470
    .line 471
    .line 472
    return-object v0

    .line 473
    :pswitch_14
    new-instance v0, Landroidx/appcompat/widget/y0;

    .line 474
    .line 475
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 479
    .line 480
    .line 481
    move-result p1

    .line 482
    if-eqz p1, :cond_a

    .line 483
    .line 484
    const/4 p1, 0x1

    .line 485
    goto :goto_6

    .line 486
    :cond_a
    const/4 p1, 0x0

    .line 487
    :goto_6
    iput-boolean p1, v0, Landroidx/appcompat/widget/y0;->h:Z

    .line 488
    .line 489
    return-object v0

    .line 490
    :pswitch_15
    new-instance v0, Landroidx/appcompat/widget/o;

    .line 491
    .line 492
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 493
    .line 494
    .line 495
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 496
    .line 497
    .line 498
    move-result p1

    .line 499
    iput p1, v0, Landroidx/appcompat/widget/o;->h:I

    .line 500
    .line 501
    return-object v0

    .line 502
    nop

    .line 503
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Ls0/k;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Landroidx/versionedparcelable/ParcelImpl;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Lh3/b;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Le2/k;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Ld/j;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Ld/a;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Landroidx/recyclerview/widget/q2;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Landroidx/recyclerview/widget/p2;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [Landroidx/recyclerview/widget/p0;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Landroidx/preference/o0;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [Landroidx/preference/n0;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [Landroidx/preference/w;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [Landroidx/preference/m;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [Landroidx/preference/i;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Landroidx/preference/f;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [Landroidx/preference/c;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [Landroidx/fragment/app/p1;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [Landroidx/fragment/app/l1;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [Landroidx/fragment/app/f1;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [Landroidx/fragment/app/c;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [Landroidx/fragment/app/b;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [Landroidx/appcompat/widget/y0;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [Landroidx/appcompat/widget/o;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
